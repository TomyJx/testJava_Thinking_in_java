package test.testStaticBindAndDynamicBind;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-08-14-23:15
 */
public class Scissors implements Item {
	@Override
	public Outcome compete(Item item) {
		return this.eval(this);
	}

	@Override
	public Outcome eval(Paper paper) {
		return Outcome.LOSE;
	}

	@Override
	public Outcome eval(Scissors scissors) {
		return Outcome.DRAW;
	}

	@Override
	public Outcome eval(Rock rock) {
		return Outcome.WIN;
	}

	@Override
	public String toString() {
		return "Scissors";
	}
}
