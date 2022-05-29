import java.util.Scanner;

public class KnapsackGT {
	

	
	public static void main(String[] args) {
		
		int n;
		int w;
		int i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of Items : ");
		n = sc.nextInt();
		System.out.println("Enter the Capacity of Sack : ");
		w = sc.nextInt();
		int[] p = new int[n];
		int[] wt = new int[n];
		int[] pw = new int[n];
		
		System.out.println("Enter the Profit of each Item : ");
		for(i=0;i<n;i++)
			p[i]=sc.nextInt();
		System.out.println("Enter the Wt of each Item : ");
		for(i=0;i<n;i++)
		{
			wt[i]=sc.nextInt();
			pw[i]=p[i]/wt[i];
		}
		int t = 0;
		
		for(i=0;i<n;i++) 
		{
			for(j=0;j<n-1-i;j++) 
			{
				if (pw[j]<pw[j+1])
				{ 
					
					t=wt[j];
					wt[j]=wt[j+1];
					wt[j+1]=t;
					
					t=p[j];
					p[j]=p[j+1];
					p[j+1]=t;
					
					t=pw[j];
					pw[j]=pw[j+1];
					pw[j+1]=t;
					
				}
			}
		}
		for(i=0;i<n;i++) 
		 System.out.println(wt[i]+" "+p[i]+" "+pw[i]);
		
		float pro = 0;
		
		for(i=0;i<n;i++)
		{
			if(wt[i]<=w)
			{
				pro= pro+p[i];
				w = w-wt[i];
			}
			else 
				break;
		}
		pro = pro + ((float) w/wt[i])*p[i];
		
		System.out.println("The profit is : "+pro);
	}
		

}
