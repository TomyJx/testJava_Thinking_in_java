package test.testAnnotation.createTable;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-16-23:28
 */
@DBTable(name = "MEMBER")
public class Member {
	@SQLString(30) String firstName;
	@SQLString(value = 50, name = "last")
	String lastName;
	@SQLInteger
	int age;
	@SQLInteger(name = "gra")
	int grade;
	@SQLString(name = "primary", constraints = @Constraints(primaryKey = true))
	String primaryKey;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}
}
