import java.util.Scanner;
public class Floyds {
	
	static int n,k,j,i;
	
	
	
	public void floyd(int n,int[][] dist)
	{
		for(k=0;k<n;k++)
		{
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{ 
					if(dist[i][k]+ dist[k][j]<dist[i][j] && (i != j))
					dist[i][j]=dist[i][k]+dist[k][j];
				}
			}
		}
		System.out.println("The distance matrix of the shortest path is : ");
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(dist[i][j]+"   ");			
			}
			System.out.println();
		}
	}
	


	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("No. of vertices : ");
		n= sc.nextInt();
		
		int dist[][]= new int[n][n];
		
		System.out.println("Enter the Dist : ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				dist[i][j] = sc.nextInt();
				
			}
		}
	
		Floyds fd= new Floyds();
		fd.floyd(n, dist);
	

	}

}
