import java.util.Scanner;
public class Stack {
	
	int stack[];
	int top, maxsize;
	
	public Stack(int s) {
		maxsize=s;
		top=-1;
		stack=new int[maxsize];
	}
	void push(int ele) {
		if(top==maxsize-1) {
			System.out.println("Stack is Full");
		}
		else {
			stack[++top]=ele;
			System.out.println("Element " +ele+ " pushed into the Stack");
		}
	}
	void pop() {
		if(top==-1) {
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println("Element " +stack[top--]+ " Popped from the stack");
		}
	}
	void display() {
		if(top ==-1) {
			System.out.println("Stack is Empty");
		}
		else {
			for(int i=top; i>=0;i--) {
				System.out.println(stack[i]);
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of Elements : ");
		int n=sc.nextInt();
		Stack s= new Stack(n);
		int ch;
		System.out.println("Stack Operations");
		System.out.println("1. PUSH");
		System.out.println("2. POP ");
		System.out.println("3. DISPLAY");
		System.out.println("4. EXIT");
		do {
			
			System.out.println("Enter your choice : ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1 : System.out.println("Enter the Element : ");
					int e=sc.nextInt();
					s.push(e);
					break;
			case 2 : s.pop();
					break;
			case 3 : s.display();
			        break;
			case 4 : System.exit(0);
			
			}
			
			
		}while(ch !=4);
		
		

	}

}
