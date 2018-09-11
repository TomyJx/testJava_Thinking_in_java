package test.testInit;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-16-23:50
 */
public class Test {
    private static int num;

    private static String name;

    public class inner{

        private int numm = num;

        public void show() {
            System.out.println(name);
        }

        public Test getTest() {
            return Test.this;
        }
        /*private static int num;

        private static void hell() {

        }

        public static class inner2{

        }*/
    }

    public static void main(String[] args) {
//        new Sub(11);
//        StringBuffer sb = new StringBuffer();
//        sb.append("123,456,");
//        String s = sb.toString();
//        System.out.println(s.substring(0,s.length() - 1));
//        Parent.staticMethod1();
//        Son.staticMethod1();
//        Parent[] parents = new Parent[10];
//        parents[0].staticMethod1();
        System.out.println(Parent.class.getClassLoader().getClass().getName());;
//        new Parent() {
//            public void hello() {
//                System.out.println("hello sub");
//            }
//        }.staticMethod1();
//        new Test().new inner();
    }

}

class Super {

    protected Super getSuper() {
        return new Super();
    }

    void init() {
        System.out.println("Super init");
    }

    public Super() {
        System.out.println("befor Super init");
        init();
        System.out.println("after Super init");
    }
}

class Sub extends Super {

    // 子类方法覆盖了父类中的getSuper方法，这里返回类型可以是父类方法返回类型的导出类(子类)-----协变返回类型
    @Override
    public Sub getSuper() {
        return new Sub(11);
    }

    private int stat = 1;
    void init() {
        System.out.println("Sub init stat = " + stat);
    }

    public Sub(int stat) {
        this.stat = stat;
        System.out.println("Sub stat = " + stat);
    }
}
