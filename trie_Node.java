package trie_Work;
import java.util.HashMap;

public class trie_Node
{
    char data;
    HashMap<Character , trie_Node> children=new HashMap<Character , trie_Node>();
    boolean isLeaf=false;

    public trie_Node(char c)
    {
        this.data=c;
    }

    public trie_Node() {
    }
}
