package test.testCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-11-0:37
 */
public class TestArrayList2 {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Power(), new Crusty(), new Slush());
//        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());// 报错因为等号右边的产生的是List<Power>
        List<Snow> snow3 = Arrays.asList(new Power(), new Crusty(), new Slush(), new Light());
        List<Snow> snow4 = new ArrayList<>();
        Collections.addAll(snow4, new Light(), new Heavy());
        List<Snow> snow5 = Arrays.<Snow>asList(new Light(), new Heavy()); // 必须在调用asList的之前显示的声明该List的泛型
        List<Snow> snow6 = new ArrayList<>();
        Object[] objects = snow6.toArray();
        Snow[] snows = new Snow[20];
        Snow[] snows1 = snow4.toArray(snows);
        System.out.println(Arrays.toString(snows1));
        Snow[] snowA = new Snow[1];
        Snow[] snows11 = snow4.toArray(snowA);
        System.out.println(Arrays.toString(snows11));
    }
}
class Snow{}
class Power extends Snow{}
class Light extends Power{}
class Heavy extends Power{}
class Crusty extends Snow{}
class Slush extends Snow{}