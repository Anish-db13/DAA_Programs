import java.util.Random;
import java.util.Scanner;

public class MergeSort 
{
	

	public static void main(String[] args) 
	{
		int n,a[],i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		n=sc.nextInt();
		a= new int[n];
		Random rn = new Random();
		//System.out.println("Array elements are : ");
		
		for(i=0;i<n;i++)
		{
			a[i]= rn.nextInt(200000000);
			//System.out.println(a[i]);
		}
		Long sr = System.nanoTime();
		MergeSort m = new MergeSort();
		
		m.split(a,0,n-1);
		Long sp = System.nanoTime();
		Long t=sp-sr;
		//System.out.println("\nThe sorted elements are : ");
		
		//for(i=0;i<n;i++)
			//System.out.println(a[i]);
		System.out.println("Time taken to sort the given array :"+t);
		
	
	}


public static void split(int a[],int low, int high)
{
	int mid;
	if (low < high)
	{
		mid = (low+high)/2;
		split(a,low,mid);
		split(a,mid+1,high);
		merge(a,low,mid,high);
		
	}
}

public static void merge(int a[],int low,int mid, int high)
{
	int k = low, j= mid+1, i=low;
	int b[] = new int[high+1];
	
	while((i<=mid) && (j<= high))
	{
		if(a[i]<=a[j])
		{
			b[k] = a[i];
			i=i+1;
			k=k+1;
		}
		else
		{
			b[k] = a[j];
			j=j+1;
			k=k+1;
		}
	}
	
	while(i<=mid)
	{
		b[k] = a[i];
		k=k+1;
		i=i+1;
	}
	
	while(j<=high)
	{
		b[k] = a[j];
		k=k+1;
		j=j+1;
	}
	
	for(i=low;i<=high;i++)
		a[i] = b[i];
}
	
}