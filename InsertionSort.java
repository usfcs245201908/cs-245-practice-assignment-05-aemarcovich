/**
*The function takes in an array.
*The items within the array are compared sequentially
*and than arraged at the same time.
*It is bulit one item at a time.
*/
public class InsertionSort implements SortingAlgorithm
{
	public void sort(int [] a)
	{
		int x = a.length;  
        for (int i = 1; i < x; i++)
        {  
            int key = a[i];  
            int y = i-1;  
            while ( (y > -1) && ( a[y] > key ) )
            {  
                a[y+1] = a[y];  
                y--;  
            }  
            a[y+1] = key;  
        }  
	}
}