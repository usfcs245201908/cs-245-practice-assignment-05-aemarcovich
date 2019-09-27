public class MergeSort implements SortingAlgorithm
{
	public void merge(int [] a,int start,int mid,int end)
	{
		int size1= mid-start+1;
		int size2= end-mid;
		int l[]=new int [size1];
		int r[]=new int [size2];
		for(int i=0;i<size1;++i)
		{
			l[i]=a[start+i];
		} 
		for(int x=0;x<size2;++x)
		{
			r[x]=a[mid+1+x];
		}
		int i=0;
		int x=0;
        int t = start; 
        while (i < size1 && x < size1) 
        { 
            if (l[i] <= r[x]) 
            { 
                a[t] = l[i]; 
                i++; 
            } 
            else
            { 
                a[t] = r[x]; 
                x++; 
            } 
            t++; 
        } 
        while (i < size1) 
        { 
            a[t] = l[i]; 
            i++; 
            t++; 
        }
        while (x < size2) 
        { 
            a[t] = r[x]; 
            x++; 
            t++; 
        }  
	}
	public void sort(int [] a)
	{
		sort(a,0,a.length-1);
	}
	private void sort(int [] a, int start,int end)
	{
		if (start<end)
		{
			int mid = (start+end)/2;
			sort(a,start,end);
			sort(a,mid+1,end);
			merge(a,start,mid,end);
		}

	}

} 