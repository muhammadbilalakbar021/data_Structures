public class replace_Insert_Delete
{
    public  static void main(String[] args)
    {
        int[] fahad = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};


        for(int i=2; i<fahad.length-1; i++)
        {
            fahad[i] = fahad[i+1];
        }

        for(int j=0; j<fahad.length;j++)
            System.out.printf("%d ", fahad[j]);
    }

}
