//package sorter;

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
		fail("Not yet implemented");
		System.out.println("bubble:");
		Sort sort = new Sort();
		assertArrayEquals(new int[] {1,2,3}, sort.bubble(new int[] {3,1,2}));
		assertArrayEquals(new int[] {1,2,3,4}, sort.bubble(new int[] {3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5}, sort.bubble(new int[] {5,3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6}, sort.bubble(new int[] {6,3,1,5,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7}, sort.bubble(new int[] {3,7,1,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, sort.bubble(new int[] {3,7,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, sort.bubble(new int[] {3,7,9,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, sort.bubble(new int[] {3,7,9,1,8,6,4,2,10,5}));
		}
	
	@Test
	public void testSeleciton() {
		fail("Not yet implemented");
		System.out.println("selection:");
		Sort sort = new Sort();
		assertArrayEquals(new int[] {1,2,3}, sort.bubble(new int[] {3,1,2}));
		assertArrayEquals(new int[] {1,2,3,4}, sort.bubble(new int[] {3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5}, sort.bubble(new int[] {5,3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6}, sort.bubble(new int[] {6,3,1,5,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7}, sort.bubble(new int[] {3,7,1,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, sort.bubble(new int[] {3,7,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, sort.bubble(new int[] {3,7,9,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, sort.bubble(new int[] {3,7,9,1,8,6,4,2,10,5}));
		}
	
	@Test
	public void testInserton() {
		fail("Not yet implemented");
		System.out.println("selection:");
		Sort sort = new Sort();
		assertArrayEquals(new int[] {1,2,3}, sort.bubble(new int[] {3,1,2}));
		assertArrayEquals(new int[] {1,2,3,4}, sort.bubble(new int[] {3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5}, sort.bubble(new int[] {5,3,1,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6}, sort.bubble(new int[] {6,3,1,5,4,2}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7}, sort.bubble(new int[] {3,7,1,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, sort.bubble(new int[] {3,7,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9}, sort.bubble(new int[] {3,7,9,1,8,6,4,2,5}));
		assertArrayEquals(new int[] {1,2,3,4,5,6,7,8,9,10}, sort.bubble(new int[] {3,7,9,1,8,6,4,2,10,5}));
		}

	
//	@Test
//	public int[] selection(int[] array) {
////		Go through the array once, from last place to first.
//		for (int i = array.length - 1; i > 0; i--) {
////			The highest number in the starting is always the first.
//			int highest = array [i];
//			int index = i;
////			Cycle through all the unsorted numbers, to find the highest.
//			for (int j = 0; j < i; j++) {
////				Is this number higher than the largest number so far?
//				if (array[j] > highest) {
////					Then replace the current record with this number.
//					highest = array[j];
////					... and store which index it's in for later.
//					index = j;
//				}
//			}
////			After the highest unsorted number has been found, switch the highest number with the last unsorted number.
//			int temp = array[i];
//			array[i] = array[index];
//			array[index] = temp;
//		}
//		return array;
//	}

	}

