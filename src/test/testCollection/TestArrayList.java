package test.testCollection;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-11-0:11
 */
public class TestArrayList {
    public static void main(String[] args) {
//        List<Long,String> longs = new ArrayList<>();
//        Map<Integer, String> maps = new HashMap<>();
        Map<Integer, String> maps = new TreeMap<>();
        maps.put(2, "java2");
        maps.put(3, "java3");
        maps.put(8, "java8");
        maps.put(1, "java1");
        maps.put(5, "java5");
        for (Map.Entry<Integer, String> map: maps.entrySet()) {
            System.out.println(map.getKey() + " : " + map.getValue());
        }
    }
}
