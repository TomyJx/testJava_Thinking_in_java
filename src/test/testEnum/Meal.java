package test.testEnum;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-09-22:06
 */
public enum Meal {
	APPETIZER(Food.Appetizer.class),
	MAINCOURSE(Food.Maincourse.class),
	DESSERT(Food.Dessert.class);
	private Food[] values;

	private Meal(Class<? extends Food> food) {
		values = food.getEnumConstants();
	}

	interface Food{
		enum Appetizer implements Food{
			SALAD,
			SOUP,
			SPRING_ROLLS
		}
		enum Maincourse implements Food{
			LASAGNE,
			BURRITO,
			PAD_THAI
		}
		enum Dessert implements Food{
			TIRAMISU,
			GELATO,
			FRUIT
		}
	}
}
