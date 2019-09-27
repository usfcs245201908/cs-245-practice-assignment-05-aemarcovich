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