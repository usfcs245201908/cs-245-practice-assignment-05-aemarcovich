/**
*Quick Sort works by dividing an array given into two parts.
*It repeats this divide and locate process until it finds
*the right position.
*The pivot function works to use an item of the array as a pivot.
*Putting lower numbers below the given item and larger items after it. 
*/
public class QuickSort implements SortingAlgorithm
{
    private int pivot(int [] a, int start, int end) 
    { 
        int piv = a[end];  
        int i = (start-1);  
        for (int x=start; x<end; x++) 
        {
            if (a[x] < piv) 
            { 
                i++; 
                int temp = a[i]; 
                a[i] = a[x]; 
                a[x] = temp; 
            } 
        }
        int temp =a[i+1];
        a[i+1]=a[end];
        a[end]=temp;
        return i+1;
    }
	public void sort(int [] a)
	{
		sort(a,0,a.length-1);
	}
	private void sort(int a[], int start, int end) 
    {
    	if (start < end) 
        {
        	int pi = pivot(a, start, end);
            sort(a, start, pi-1); 
            sort(a, pi+1, end); 
        } 
    } 

}