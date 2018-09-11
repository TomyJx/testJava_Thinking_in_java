package test.testArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-17-23:16
 */
public class Test {
    public <T> T[] make() {
        return (T[])new Object[15];
    }

    public static void main(String[] args) {
        /*int[] ints = {1, 2, 3, 4, 5, 67, 8, 9};
        int[] inst = {1, 2, 5};
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(inst));
        System.arraycopy(ints, 2, inst, 1, 3);
        int[] ints1 = Arrays.copyOf(ints, 5);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));
        System.out.println("1111".concat("2222"));*/
//        "1111".concat("2222");
        /*int[][] ins = {{1, 2, 3}, {4, 5}};
        System.out.println(Arrays.toString(ins));
        System.out.println(Arrays.deepToString(ins));*/
//        int[] a = {1, 3, 2, 5, 6};
//        System.out.println(Arrays.toString(a));
////        Arrays.fill(a, 1);
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
        ComPType[] a = new ComPType[]{
            new ComPType(10, 5), new ComPType(5, 6), new ComPType(8, 11), new ComPType(18, 2), new ComPType(1, 2)};
        System.out.println(Arrays.toString(a));
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
//        Arrays.sort(a, Collections.reverseOrder());
//        System.out.println(Arrays.toString(a));
        Arrays.sort(a, new Comparator<ComPType>() {
            @Override
            public int compare(ComPType o1, ComPType o2) {
                return o1.i > o2.i ? 1 : (o1.i == o2.i ? 0 : -1);
            }
        });
        System.out.println(Arrays.toString(a));
    }

    public class A{

    }

    public static class B {
    }

    public class C {
    }

}
