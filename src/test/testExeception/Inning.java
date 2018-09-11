package test.testExeception;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-19-0:09
 */
public abstract class Inning {
    public Inning() throws SuperException {

    }

    public void event() throws SuperException {

    }

    public abstract void hha() throws SubException, GrandsonException;

    public void waitt() {

    }
}
