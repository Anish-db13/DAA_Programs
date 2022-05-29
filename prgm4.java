import java.util.Scanner;
	import java.util.Random;
public class prgm4 {
	
	
		
	
		
	public static void main (String[] args) {
		int n,a[],i;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of the array :");
		n=sc.nextInt();
		a= new int[n];
		Random rn = new Random();
		for(i=0;i<n;i++)
			a[i]=rn.nextInt(10000);
		Long sr =0L,sp=0L,t=0L;
		 sr = System.nanoTime();
		prgm4 q = new prgm4();
		q.quicksort(a, 0, n-1);
		 sp = System.nanoTime();// completion of sorting
		 t = sp-sr;
		//for(i=0;i<n;i++)
		// System.out.println(a[i]);
		System.out.println("Time taken to sort the given array:"+t);
		
		
		
	}
	int partition (int a[], int low, int high) {
		int pivot = low ;
		int i = low +1 ;
		int j = high;
		while(low < high) {
		while(a[i]<a[pivot] && i<high)
			i=i+1;
		while(a[j]>a[pivot] && j>=low)
			j=j-1;
			if(i<j) {
				int temp;
				temp = a[i];
				a[i]=a[j];
				a[j]=temp;
		}
			else
		{
			int temp2=a[j];
			a[j]=a[pivot];
			a[pivot]=temp2;
			return j ;
			
		}
			
		}
		return j;
	}
		
	void quicksort(int a[], int low, int high)
	{
		if(low<high)
		{
			int p = partition(a,low,high);
					quicksort(a,low,p-1);
					quicksort(a,p+1,high);
		}
	}
	
	}


