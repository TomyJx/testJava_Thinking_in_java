package test.testCollection;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-15-22:06
 */
public class TestCollection {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(Arrays.asList("hello", "world", new String("java"), "c++", new String("java")));
        System.out.println(nameList);
        System.out.println(nameList.size());
        /*Set<String> nameSet = new HashSet<>(nameList);
        System.out.println(nameSet);

        List<Person> perList = new ArrayList<>(Arrays.asList(new Person("СС"), new Person("СС")));
        System.out.println(nameList);
        Set<Person> perSet = new HashSet<>(perList);
        System.out.println(perSet);*/

        /*for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i) + " + i = " + i + " size = " + nameList.size() );
            nameList.remove(nameList.get(i));
            System.out.println(nameList);
        }*/
        for (int i = 0; i < 10; i++) {
            System.out.println(new Random(47).nextInt());
        }
        List<String> lsitg = new LinkedList<>();
        lsitg.listIterator();

        List<String> list = Arrays.asList("ni hao yao ni".split(" "));
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list, new Random(47));
        System.out.println(list);


    }
}
