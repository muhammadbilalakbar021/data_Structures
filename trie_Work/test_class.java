package trie_Work;

import java.io.*;

public class test_class
{
    public static void main(String[] args) throws IOException
    {
        File incorrect_File = new File("E:\\intellij_Idea\\data_Structures\\src\\trie_Work/Wrong_Dic.txt");
        File coorect_File = new File("E:\\intellij_Idea\\data_Structures\\src\\trie_Work/correct_dic.txt");
        String corr_Line=null;
        String incorrect_Line=null;

        trie object=new trie();

        BufferedReader incorrect_File_Reader = new BufferedReader(new InputStreamReader(new FileInputStream(incorrect_File)));
        BufferedReader coorect_File_Reader = new BufferedReader(new InputStreamReader(new FileInputStream(coorect_File)));

        while ((corr_Line=coorect_File_Reader.readLine())!=null)
        {
            String[] word=corr_Line.split("\\s+");

            for (int i=0;i<word.length;i++)
            {
                object.insert(word[i]);
            }
        }

        while ((incorrect_Line=incorrect_File_Reader.readLine())!=null)
        {
            String[] word=incorrect_Line.split("\\s+");
            for (int i=0;i<word.length;i++)
            {
                object.search(word[i]);
            }
        }
    }
}
