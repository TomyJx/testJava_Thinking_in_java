package test.testStaticBindAndDynamicBind;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-14-23:15
 */
public class Rock implements Item{
	@Override
	public Outcome compete(Item item) {
		return item.eval(this);
	}

	@Override
	public Outcome eval(Paper paper) {
		return Outcome.WIN;
	}

	@Override
	public Outcome eval(Scissors scissors) {
		return Outcome.LOSE;
	}

	@Override
	public Outcome eval(Rock rock) {
		return Outcome.DRAW;
	}

	@Override
	public String toString() {
		return "Rock";
	}
}
