package test.testAnnotation.apt;

import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.apt.AnnotationProcessorFactory;
import com.sun.mirror.declaration.AnnotationTypeDeclaration;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-17-23:41
 */
public class InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory {
	@Override
	public Collection<String> supportedOptions() {
		return Collections.emptySet();
	}

	@Override
	public Collection<String> supportedAnnotationTypes() {
		return Collections.singleton("test.testAnnotation.apt.ExtractInterface");
	}

	@Override
	public AnnotationProcessor getProcessorFor(Set<AnnotationTypeDeclaration> set, AnnotationProcessorEnvironment annotationProcessorEnvironment) {
		return new InterfaceExtractorProcessor(annotationProcessorEnvironment);
	}

	public static void main(String[] args) {

	}
}
