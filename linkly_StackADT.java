public class linkly_StackADT implements Stack_Interface
{
    Node top=null;

    @Override
    public void push(int value)
    {
        Node stack_Node=new Node(value);
        if(top==null)
        {
            top=stack_Node;
        }
        else
        {
            stack_Node.next=top;
            top=stack_Node;
        }
    }

    @Override
    public int pop()
    {
        int temp=top.data;
        top=top.next;
        return temp;
    }

    @Override
    public int peek()
    {
        return top.data;
    }
}
