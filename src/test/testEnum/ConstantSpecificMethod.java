package test.testEnum;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-09-22:53
 */
public enum ConstantSpecificMethod {
	FIRST{
		@Override
		void hello() {
			System.out.println("first hello");
		}

		@Override
		Integer getNum() {
			return 1;
		}

		public void first(){
			System.out.println("first");
		}
	},
	SECOND{
		@Override
		void hello() {
			System.out.println("second hello");
		}

		@Override
		Integer getNum() {
			return 2;
		}

		public void second() {
			System.out.println("second");
		}
	};

	abstract void hello();

	abstract Integer getNum();

	public static void main(String[] args) {
		for (ConstantSpecificMethod method : ConstantSpecificMethod.values()) {
			method.hello();
			System.out.println(method.getNum());
		}
	}
}
