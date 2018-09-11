package test.testGenericity;

/**
 * ${DESCRIPTION}
 *
 * @author jiyx
 * @create 2017-06-14-21:08
 */
public class GenericityQ<T extends GenericityQ<T>> {
	public static void main(String[] args) {

	}
}

class D extends GenericityQ<D> {

}

class E{}

class F extends GenericityQ<F> {
}

class G extends GenericityQ {

}

/*
class H extends GenericityQ<G> {
}*/
