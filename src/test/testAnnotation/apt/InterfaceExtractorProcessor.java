package test.testAnnotation.apt;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.declaration.MethodDeclaration;
import com.sun.mirror.declaration.Modifier;
import com.sun.mirror.declaration.ParameterDeclaration;
import com.sun.mirror.declaration.TypeDeclaration;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-17-22:09
 */
public class InterfaceExtractorProcessor implements AnnotationProcessor{

	private final AnnotationProcessorEnvironment evn;

	private ArrayList<MethodDeclaration> interfaceMethods = new ArrayList<>();

	public InterfaceExtractorProcessor(AnnotationProcessorEnvironment evn) {
		this.evn = evn;
	}

	@Override
	public void process() {
		for (TypeDeclaration typeDeclaration : evn.getSpecifiedTypeDeclarations()) {
			ExtractInterface extractInterface = typeDeclaration.getAnnotation(ExtractInterface.class);
			if (extractInterface == null) {
				break;
			}
			/*for (MethodDeclaration methodDeclaration : typeDeclaration.getMethods()) {
				if (methodDeclaration.getModifiers().contains(Modifier.PUBLIC)
						&& methodDeclaration.getModifiers().contains(Modifier.STATIC)) {
					interfaceMethods.add(methodDeclaration);
				}
			}*/
			for (MethodDeclaration m : typeDeclaration.getMethods()) {
				if (m.getModifiers().toString().contains("public")
						&& !(m.getModifiers().toString().contains("static"))) {
					interfaceMethods.add(m);
				}
			}
			if (interfaceMethods.size() > 0) {
				try {
					PrintWriter writer = evn.getFiler().createSourceFile(extractInterface.value());
					writer.println("package " + typeDeclaration.getPackage().getQualifiedName() + ";");
					writer.println("public interface " + extractInterface.value() + "{");
					for (MethodDeclaration interfaceMethod : interfaceMethods) {
						writer.print("	public	");
						writer.print(interfaceMethod.getReturnType() + " ");
						writer.print(interfaceMethod.getSimpleName() + " (");
						int i = 0;
						for (ParameterDeclaration parameterDeclaration : interfaceMethod.getParameters()) {
							writer.print(parameterDeclaration.getType() + " " + parameterDeclaration.getSimpleName());
							if (++i < interfaceMethod.getParameters().size())
								writer.print(", ");
						}
						writer.println(");");
					}
					writer.println("}");
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}
}
