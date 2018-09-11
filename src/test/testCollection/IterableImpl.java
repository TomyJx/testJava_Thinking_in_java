package test.testCollection;

import java.util.Iterator;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-05-15-22:34
 */
public class IterableImpl implements Iterable<String> {

    private String[] names = {"С��", "С��", "Ц��"};

    /**
     * Returns an iterator over a set of elements of type T.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < names.length;
            }

            @Override
            public String next() {
                return names[index++];
            }

            @Override
            public void remove() {
                System.out.println("ûʵ��");
            }
        };
    }

    public static void main(String[] args) {
        /*for (String s : new IterableImpl()) {
            System.out.println(s);
        }*/
        for (Map.Entry entry : System.getenv().entrySet()
             ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
