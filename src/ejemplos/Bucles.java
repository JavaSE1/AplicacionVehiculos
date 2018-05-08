package ejemplos;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;

public class Bucles {

	public static void main(String[] args) {

		System.out.println("for i");
        for (int i = 0; i < 5; i++) {
        	System.out.println(i);
        }

        System.out.println("foreach Arrays.asList");
        for (int i : Arrays.asList(0, 1, 2, 3, 4)) {
        	System.out.println(i);
        }

        System.out.println("foreach lambda");
        Arrays.asList(0, 1, 2, 3, 4).forEach( x -> System.out.println(x) );
        
        System.out.println("for counter");
        for (int i : new Counter(0, 5)) {
        	System.out.println(i);
        }
        
        System.out.println("stream foreach");
		IntStream.range(0, 5).forEach( i -> {
		    System.out.println(i);
		});
		
		System.out.println("foreach iterator");
        Iterator<Integer> it = Arrays.asList(1,2,3).iterator();
        while ( it.hasNext() ) {           
            System.out.println (it.next());
        }   
	
	}
}
class Counter implements Iterable<Integer> {

    private int start;
    private int end;

    public Counter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int i = start;

            public boolean hasNext() {
                return i < end;
            }

            public Integer next() {
                return i++;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
