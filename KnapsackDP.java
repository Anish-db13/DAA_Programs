import java.util.Scanner;
public class KnapsackDP {
	
	static int max(int x,int y)
	{
		if(x>y) return x;
		return y;
	}

	public static void main(String[] args) {
		int v[][];
		int n;
		int w;
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Items : ");
		n = sc.nextInt();
		System.out.println("Enter the Capacity of Sack : ");
		w = sc.nextInt();
		int[] p = new int[n+1];
		int[] wt = new int[n+1];
		
		System.out.println("Enter the Profit of each Item : ");
		for(i=1;i<=n;i++)
			p[i]=sc.nextInt();
		System.out.println("Enter the Wt of each Item : ");
		for(i=1;i<=n;i++)
			wt[i]=sc.nextInt();
		
		
		
		v = new int[n+1][w+1];
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=w;j++)
			{
				if(i==0 || j==0)
					v[i][j] = 0;
				else if (wt[i]<=j)
					v[i][j]=max(p[i]+v[i-1][j-wt[i]],v[i-1][j]);
				else
					v[i][j] = v[i-1][j];
			}
		}
		
		for(i=0;i<=n;i++)
		{
			for(j=0;j<=w;j++)
			{ 
				System.out.print(v[i][j]+" ");
			}
			System.out.println();
			}
		
		
		System.out.println("\nThe profit is : "+v[n][w]);
		
		System.out.println("\nThe Items Selected are : ");
		i = n;
		j = w;
		while (i>0)
		{
			if(v[i][j] != v[i-1][j]) 
			{
				System.out.print(i+" ");
				j = j-wt[i];
				i=i-1;
				
				
			}
			else
				i=i-1;
			
				
		}
		
		

	}

}
