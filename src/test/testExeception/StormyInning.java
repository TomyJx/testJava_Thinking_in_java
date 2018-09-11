package test.testExeception;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-19-0:12
 */
public class StormyInning extends Inning implements Storm {

    public StormyInning() throws SuperException, Exception {
    }

    @Override
    public void hell() throws Exception1, Exception1 {
        System.out.println(111);
    }

    @Override
    public void hha() throws SubException, GrandsonException {

    }

    @Override
    public void event() {

    }

    public static void main(String[] args) throws Exception {
        new StormyInning().hell();
    }
}
