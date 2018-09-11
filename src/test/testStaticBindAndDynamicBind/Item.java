package test.testStaticBindAndDynamicBind;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-14-23:13
 */
public interface Item {
	Outcome compete(Item item);

	Outcome eval(Paper paper);

	Outcome eval(Scissors scissors);

	Outcome eval(Rock rock);
}
