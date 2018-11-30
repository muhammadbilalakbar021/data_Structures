
public class Stack {
    int n;
    int arr[];

    public Stack()
    {
        arr=new int [50];
		n=0;
    }
    public Stack(int n)
    {
        arr=new int [n];
		this.n=0;
    }
    public void push(int data)
	{
		arr[n]=data;
		n++;
	}
	public int pop()
	{
		int temp=arr[n-1];
		n--;
		return temp;
	}
	public boolean isEmpty()
	{
		if(n==0)
			return true;
		return false;
	}
	public int peek()
	{
		return arr[n-1];
	}
	public void print()
	{
		for(int i=0;i<n;i++)
		{
			System.out.printf("%3d",arr[i]);
		}
		System.out.println();
	}
}