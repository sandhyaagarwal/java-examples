import org.junit.Test;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

/**
 * Created by sagarwal on 31-07-2017.
 */

public class PriorityQueueTest {
    @Test
    public void testNaturalOrdering() {
        Queue<Integer> ages = new PriorityQueue<Integer>();

        ages.add(10);
        ages.add(45);
        ages.add(25);
        ages.add(20);
        ages.add(15);

        assertEquals(new Integer(10), ages.remove());
        assertEquals(new Integer(15), ages.remove());
        assertEquals(new Integer(20), ages.remove());
        assertEquals(new Integer(25), ages.remove());
        assertEquals(new Integer(45), ages.remove());
    }

    @Test
    public void testSpecifiedOrdering() {
        Queue<Integer> ages = new PriorityQueue<Integer>(10, Collections.reverseOrder());

        ages.add(10);
        ages.add(45);
        ages.add(25);
        ages.add(20);
        ages.add(15);

        assertEquals(new Integer(45), ages.remove());
        assertEquals(new Integer(25), ages.remove());
        assertEquals(new Integer(20), ages.remove());
        assertEquals(new Integer(15), ages.remove());
        assertEquals(new Integer(10), ages.remove());
    }

}
