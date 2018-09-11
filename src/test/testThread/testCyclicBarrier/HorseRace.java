package test.testThread.testCyclicBarrier;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-10-10-23:13
 */
public class HorseRace {
	static final int FINISH_LINE = 75;
	private List<Horse> horses = new ArrayList<>();
	private ExecutorService exec = Executors.newCachedThreadPool();
	private CyclicBarrier cyclicBarrier;

	public HorseRace(int nHorses, final int pause) {
		cyclicBarrier = new CyclicBarrier(nHorses, new Runnable() {
			@Override
			public void run() {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < FINISH_LINE; i++) {
					sb.append("=");
				}
				System.out.println(sb);
				for (Horse horse : horses) {
					System.out.println(horse.tracks());
				}
				for (Horse horse : horses) {
					if (horse.getStrides() >= FINISH_LINE) {
						System.out.println(horse + "won!");
						exec.shutdownNow();
						return;
					}
				}
				try {
					TimeUnit.MILLISECONDS.sleep(pause);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		for (int i = 0; i < nHorses; i++) {
			Horse horse = new Horse(cyclicBarrier);
			horses.add(horse);
			exec.execute(horse);
		}
	}

	public static void main(String[] args) {
		int nHorses = 7;
		int pause = 200;
		new HorseRace(nHorses, pause);
	}
}
