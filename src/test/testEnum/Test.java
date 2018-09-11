package test.testEnum;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-04-10-0:23
 */
public class Test {
    public static void main(String[] args) {
        /*TestEnum mil = TestEnum.MIL;
        System.out.println(mil);
        for (TestEnum enumOne:
        TestEnum.values()) {
            System.out.println(enumOne.name() + ":" + enumOne.ordinal());
        }*/
        String str = "11112";
        System.out.println(str);
        str.replace("", "11");
        System.out.println(str);
        System.out.println(str.replace("11", ""));
    }
}
