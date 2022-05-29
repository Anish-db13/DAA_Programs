import java.util.Scanner;
public class prgm9_Prims {
	static int mincost=0,n,i,j,e,a=0,b=0,min,u=0,v=0,s;
	
	public void prim(int n, int[][] cost)
	{
		int[] visited = new int[n];
		
		for(i=0;i<n;i++)
			visited[i]=0;
		Scanner pm = new Scanner(System.in);
		System.out.println("Enter the source vertices : ");
		s=pm.nextInt();
		
		
		visited[s]=1;
		e=1;
				while(e<n)
				{	
					min=999;
					for(i=0;i<n;i++)
					{ if (visited[i]==1) {
						
						for(j=0;j<n;j++)
						{
							if (visited[j] ==0 && cost[i][j]<min) 
							{
									min=cost[i][j];
									a=u=i;
									b=v=j;
								}
							}
						}
					}
					
					
						System.out.println("edge "+e+") "+a+" -> "+b+" Cost "+min);
						e=e+1;
						mincost= mincost + min;
						visited[v]=1;
						
					
					cost[a][b]= cost[b][a] = 999;
				}
				
				System.out.println("Total Cost : "+mincost);
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("No. of vertices : ");
		n= sc.nextInt();
		
		int cost[][]= new int[n][n];
		
		System.out.println("Enter the cost of matrix : ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				cost[i][j] = sc.nextInt();
				if(cost[i][j] == 0)
					cost[i][j] = 999;
			}
		}
	
		prgm9_Prims p= new prgm9_Prims();
		p.prim(n, cost);
	

	}

}

