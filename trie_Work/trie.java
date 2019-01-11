package trie_Work;

import java.util.HashMap;
import java.util.Map;

public class trie
{
    private trie_Node root;

    public trie()
    {
        root=new trie_Node();
    }

    public void insert(String key)
    {
        HashMap<Character , trie_Node> children=root.children;

        for(int i=0;i<key.length();i++)
        {
            char c=key.charAt(i);
            trie_Node t;
            if(children.containsKey(c))
            {
                t=children.get(c);
            }
            else
            {
                t=new trie_Node(c);
                children.put(c,t);
            }
            children=t.children;

            if(i==key.length()-1)
            {
                t.isLeaf=true;
            }
        }
    }
    public trie_Node search(String word)
    {
        Map<Character , trie_Node> children=root.children;
        trie_Node root=null;
        for (int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if (children.containsKey(c))
            {
                root=children.get(c);
                children=root.children;

            }
            else if (c=='.' || c==',')
            {
                return root;
            }
            else
            {
                System.out.println(word);
                return null;
            }
        }
        return root;

    }



}

