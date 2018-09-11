package test.testInner;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-10-0:33
 */
public class ExtendInner extends SupperOut.SupperInner {
    public ExtendInner(SupperOut supperOut) {
        supperOut.super();
    }

    public static void main(String[] args) {
        SupperOut supperOut = new SupperOut();
        ExtendInner extendInner = new ExtendInner(supperOut);
    }
}

class SupperOut {
    class SupperInner {

    }
}