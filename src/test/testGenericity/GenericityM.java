package test.testGenericity;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-0:17
 */
public interface GenericityM<K, V> {
	void f(List<K> k);

//	void f(List<V> v);

	void f(K k);

//	void f(V v);
}
