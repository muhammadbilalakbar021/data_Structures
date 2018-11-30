import java.util.Scanner;

public class StackTest
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		Stack stk=new Stack();
		
		System.out.println("Enter an expression ?");
		String exp1=in.nextLine();
		System.out.println(exp1);
		String[] exp=exp1.split("[ ]");
		System.out.println(exp.length);
		
		int tot=0;
		int num1=0,num2=0;
		
		for(int i=0;i<exp.length;i++)
		{
			if(exp[i].equals("*"))
			{
				num1=stk.pop();
				num2=stk.pop();
				
				stk.push(num1*num2);
			}
			else if(exp[i].equals("+"))
			{
				num1=stk.pop();
				num2=stk.pop();
				
				stk.push(num1+num2);
			}
			else if(exp[i].equals("-"))
			{
				num1=stk.pop();
				num2=stk.pop();
				
				stk.push(num1-num2);
			}
			else if(exp[i].equals("/"))
			{
				num1=stk.pop();
				num2=stk.pop();
				
				stk.push(num1/num2);
			}
			else
			{
				stk.push(Integer.parseInt(exp[i]));
			}
			//System.out.println("Answer is "+Integer.parseInt(exp[i]));;
		}
		
		System.out.println("Answer is "+stk.peek());
	}
}