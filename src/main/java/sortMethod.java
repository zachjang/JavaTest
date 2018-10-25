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

    int[] sort(int array[], int low, int high) // Modified from void to int[].
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