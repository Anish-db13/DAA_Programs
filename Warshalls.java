import java.util.Scanner;

public class Warshalls {

	static int n,k,j,i;
	
	public void warshall(int n,int[][] T)
	{
		for(k=0;k<n;k++)
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{ 
					if(T[i][j] || (T[i][k] && T[k][j]))
					T[i][j]=(T[i][j] || (T[i][k] && T[k][j]));
				}
			}
		}
		System.out.println("The distance matrix of the shortest path is : ");
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(T[i][j]+"   ");			
			}
			System.out.println();
		}
	}
	


	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("No. of vertices : ");
		n= sc.nextInt();
		
		int T[][]= new int[n][n];
		
		System.out.println("Enter the Dist : ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				T[i][j] = sc.nextInt();
				
			}
		}
	
		Warshalls war= new Warshalls();
		war.warshall(n, T);
	

	}

}
