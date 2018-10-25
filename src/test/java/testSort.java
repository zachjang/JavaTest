import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testSort {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testBubble() {
        System.out.println("bubble:");
        Sort sort = new Sort();
        assertArrayEquals(new int[] {1,2,3}, sort.bubble(new int[] {3,1,2}));
        assertArrayEquals(new int[] {1,2,3,4}, sort.bubble(new int[] {3,1,4,2}));
        assertArrayEquals(new int[] {1,2,3,4}, sort.bubble(new int[] {2,3,1,4}));
        assertArrayEquals(new int[] {1,2,3,4,5}, sort.bubble(new int[] {5,3,1,4,2}));
        assertArrayEquals(new int[] {1,2,3,4,5,6}, sort.bubble(new int[] {6,3,1,5,4,2}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7}, sort.bubble(new int[] {3,7,1,6,4,2,5}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, sort.bubble(new int[] {3,7,1,8,6,4,2,5}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, sort.bubble(new int[] {3,7,9,1,8,6,4,2,5}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, sort.bubble(new int[] {3,7,9,1,8,6,4,2,10,5}));
        }

    @Test
    public void testSeleciton() {
        System.out.println("selection:");
        Sort sort = new Sort();
        assertArrayEquals(new int[] {1,2,3}, sort.selection(new int[] {3,1,2}));
        assertArrayEquals(new int[] {1,2,3,4}, sort.selection(new int[] {3,1,4,2}));
        assertArrayEquals(new int[] {1,2,3,4,5}, sort.selection(new int[] {5,3,1,4,2}));
        assertArrayEquals(new int[] {1,2,3,4,5,6}, sort.selection(new int[] {6,3,1,5,4,2}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7}, sort.selection(new int[] {3,7,1,6,4,2,5}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, sort.selection(new int[] {3,7,1,8,6,4,2,5}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, sort.selection(new int[] {3,7,9,1,8,6,4,2,5}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, sort.selection(new int[] {3,7,9,1,8,6,4,2,10,5}));
        }

    @Test
    public void testInserton() {
        System.out.println("selection:");
        Sort sort = new Sort();
        assertArrayEquals(new int[] {1,2,3}, sort.insertion(new int[] {3,1,2}));
        assertArrayEquals(new int[] {1,2,3,4}, sort.insertion(new int[] {3,1,4,2}));
        assertArrayEquals(new int[] {1,2,3,4,5}, sort.insertion(new int[] {5,3,1,4,2}));
        assertArrayEquals(new int[] {1,2,3,4,5,6}, sort.insertion(new int[] {6,3,1,5,4,2}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7}, sort.insertion(new int[] {3,7,1,6,4,2,5}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, sort.insertion(new int[] {3,7,1,8,6,4,2,5}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, sort.insertion(new int[] {3,7,9,1,8,6,4,2,5}));
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, sort.insertion(new int[] {3,7,9,1,8,6,4,2,10,5}));
        }
    
    @Test
    public void testQuick() {
    	System.out.println("quick:");
    	QuickSort ob = new QuickSort();
    	assertArrayEquals(new int[] {1,2,3}, ob.sort(new int[] {3,1,2}, 0, 2));
    	assertArrayEquals(new int[] {1,2,3,4}, ob.sort(new int[] {3,1,4,2}, 0, 3));
    	assertArrayEquals(new int[] {1,2,3,4,5}, ob.sort(new int[] {3,5,1,4,2}, 0, 4));
    	assertArrayEquals(new int[] {1,2,3,4,5,6}, ob.sort(new int[] {6,4,5,3,1,2}, 0, 5));
    	assertArrayEquals(new int[] {1,2,3,4,5,6,7}, ob.sort(new int[] {4,5,7,6,3,1,2}, 0, 6));
    	assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, ob.sort(new int[] {7,8,4,5,6,3,1,2}, 0, 7));
    	assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, ob.sort(new int[] {6,4,9,5,7,8,3,1,2}, 0, 8));
    	assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, ob.sort(new int[] {10,4,5,8,9,6,7,3,1,2}, 0, 9));
    	}

    }