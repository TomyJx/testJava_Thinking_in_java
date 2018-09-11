package test.testInner;

import test.testInit.TestInner;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-05-0:39
 */
public class OutClass {
    private OutClass() {

    }

    private class Inner {
        public OutClass outClass = OutClass.this;
    }

    

}
