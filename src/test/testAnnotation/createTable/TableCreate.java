package test.testAnnotation.createTable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-16-23:36
 */
public class TableCreate {
	public static void createTable(Class clazz) {
		DBTable dbTable = (DBTable) clazz.getAnnotation(DBTable.class);
		if (dbTable == null) {
			System.out.println("No DBTable annotation in class" + clazz.getSimpleName());
		}
		String tableName = dbTable.name();
		if (tableName.length() < 1) {
			tableName = clazz.getName().toUpperCase();
		}
		List<String> columnDefs = new ArrayList<>();
		for (Field field : clazz.getDeclaredFields()) {
			String columName = null;
			Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
			if (declaredAnnotations.length < 1) {
				continue;
			}
			if (declaredAnnotations[0] instanceof SQLInteger) {
				SQLInteger sqlInteger = (SQLInteger) declaredAnnotations[0];
				if (sqlInteger.name().length() < 1) {
					columName = field.getName().toUpperCase();
				} else {
					columName = sqlInteger.name();
				}
				columnDefs.add(columName + " INT" + getConstraints(sqlInteger.constraints()));
			}
			if (declaredAnnotations[0] instanceof SQLString) {
				SQLString sqlString = (SQLString) declaredAnnotations[0];
				if (sqlString.name().length() < 1) {
					columName = field.getName().toUpperCase();
				} else {
					columName = sqlString.name();
				}
				columnDefs.add(columName + " VARCHAR(" + sqlString.value() + ")" + getConstraints(sqlString.constraints()));
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append("CREATE TABLE " + tableName + "(" + "\r\n");
		for (String columnDef : columnDefs) {
			sb.append(columnDef + "," + "\r\n");
		}
		String createTableSql = sb.substring(0, sb.length() - 4) + ");";
		System.out.println(createTableSql);
	}

	private static String getConstraints(Constraints constraints) {
		String result = "";
		if (!constraints.allowNull()) {
			result += " NOT NULL";
		}
		if (constraints.primaryKey()) {
			result += " PRIMARY KEY";
		}
		if (constraints.unique()) {
			result += " UNIQUE";
		}
		return result;
	}

	public static void main(String[] args) {
		createTable(Member.class);
	}
}
