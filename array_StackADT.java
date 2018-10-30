public class array_StackADT implements Stack_Interface
{
    int value;
    public array_StackADT(int value)
    {

    }

    int[] stack=new int[value];
    final int stack_Length=stack.length;
    int top=-1;


    @Override
    public void push(int value)
    {
        stack[++top]=value;

    }

    @Override
    public int pop()
    {
        return stack[top--];
    }

    @Override
    public int peek()
    {
        return stack[top];
    }

    public int getTop()
    {
        return top;
    }
}
