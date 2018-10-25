// Java program for implementation of QuickSort
class quickSort
{
    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted , and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    int partition(int array[], int low, int high)
    {
        int pivot = array[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (array[j] <= pivot)
            {
                i++;

                // swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap array[i+1] and array[high] (or pivot)
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i+1;
    }

    /* The main function that implements QuickSort()
      array[] -->  to be sorted,
      low  --> Starting index,
      high  --> Ending index */

    int[] sort(int array[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, array[pi] is
              now at right place */
            int pi = partition(array, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(array, low, pi-1);
            sort(array, pi+1, high);
        }
        return array;
    }
}

/*This code is contributed by Rajat Mishra */

class insertionSort
{
    // Insertion sort, for each item it will find where in the already-sorted items it should be placed do so.
    public int[] insertion(int[] array) {
        // Loop through the  until sorted.
        for (int i = 1; i < array.length; i++) {
            int index = array[i];
            int j = i;
            // If these aren't the right surrounding numbers, switch the target index up one.
            while ((j > 0) && (array[j - 1] > index)) {
                array[j] = array[j - 1];
                j = j - 1;
            }
            // After the right position has been found, put in the new number.
            array[j] = index;
        }
        return array;
    }
}


//Java program for implementation of Heap Sort
class heapSort
{
    int[] sort(int array[])
    {
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i); 

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
        return array;
    }

     // To heapify a subtree rooted with node i which is
     // an index in array[]. n is size of heap
     void heapify(int array[], int n, int i)
     {
         int largest = i; // Initialize largest as root
         int l = 2*i + 1; // left = 2*i + 1
         int r = 2*i + 2; // right = 2*i + 2

         // If left child is larger than root
         if (l < n && array[l] > array[largest])
             largest = l;

         // If right child is larger than largest so far
         if (r < n && array[r] > array[largest])
             largest = r;

         // If largest is not root
         if (largest != i)
         {
             int swap = array[i];
             array[i] = array[largest];
             array[largest] = swap;

             // Recursively heapify the affected sub-tree
             heapify(array, n, largest);
         }
     }
 }

//Java implementation of Counting Sort
class countingSort
{
	int[] sort(int array[])
	{
	    int n = array.length;

	    // The output character array that will have sorted array
		int output[] = new int[n];
		
		// Create a count array to store count of individual
		// characters and initialize count array as 0
		int count[] = new int[256];
		for (int i=0; i<256; ++i)
		    count[i] = 0;
		
		// store count of each character
		for (int i=0; i<n; ++i)
		    ++count[array[i]];
		
		// Change count[i] so that count[i] now contains actual
		// position of this character in output array
		for (int i=1; i<=255; ++i)
		    count[i] += count[i-1];
		
		// Build the output character array
		// To make it stable we are operating in reverse order.
		for (int i = n-1; i>=0; i--)
		{
		    output[count[array[i]]-1] = array[i];
		    --count[array[i]];
		}
		
		// Copy the output array to array, so that array now
		// contains sorted characters
		    for (int i = 0; i<n; ++i)
		        array[i] = output[i];
		return array;
	}
}
/*This code is contributed by Rajat Mishra */

//Java implementation of ShellSort
class shellSort
{
	/* function to sort array using shellSort */
	int[] sort(int array[])
	{
		int n = array.length;

		// Start with a big gap, then reduce the gap
		for (int gap = n/2; gap > 0; gap /= 2)
		{
			// Do a gaped insertion sort for this gap size.
			// The first gap elements a[0..gap-1] are already
			// in gaped order keep adding one more element
			// until the entire array is gap sorted
			for (int i = gap; i < n; i += 1)
			{
				// add a[i] to the elements that have been gap
				// sorted save a[i] in temporary array and make a hole at
				// position i
				int temp = array[i];

				// shift earlier gap-sorted elements up until
				// the correct location for a[i] is found
				int j;
				for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
					array[j] = array[j - gap];

				// put temporary array (the original a[i]) in its correct
				// location
				array[j] = temp;
			}
		}
		return array;
	}
}