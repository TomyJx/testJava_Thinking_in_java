package test.testThread.MyTestToast;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-09-25-22:59
 */
public class Toast {
	private static int count = 0;

	private int id = count++;

	private boolean isButter = false;

	private boolean isJam = false;

	public boolean isButter() {
		return isButter;
	}

	public void setButter(boolean butter) {
		isButter = butter;
	}

	public boolean isJam() {
		return isJam;
	}

	public void setJam(boolean jam) {
		isJam = jam;
	}

	@Override
	public String toString() {
		return "Toast{" +
				"isButter=" + isButter +
				", isJam=" + isJam +
				", id=" + id +
				'}';
	}

	public int getId() {
		return id;
	}
}
