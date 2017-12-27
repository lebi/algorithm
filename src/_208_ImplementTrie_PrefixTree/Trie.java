package _208_ImplementTrie_PrefixTree;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/12/20 0020.
 */
public class Trie {
    class Node{
        char value;
        Node[] child;
        boolean end;
        Node(){
            child = new Node[26];
        }
        Node(char c){
            value = c;
            child = new Node[26];
        }
    }
    Node root = new Node();
    /** Initialize your data structure here. */
    public Trie() {

    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Node it = root;
        for(char c : word.toCharArray()){
            Node n = it.child[c - 'a'];
            if (n == null){
                n = new Node(c);
                it.child[c - 'a'] = n;
            }
            it = n;
        }
        it.end = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Node it = root;
        for(char c : word.toCharArray()){
            Node n = it.child[c - 'a'];
            if (n == null){
                return false;
            }
            it = n;
        }
        return it.end;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Node it = root;
        for(char c : prefix.toCharArray()){
            Node n = it.child[c - 'a'];
            if (n == null){
                return false;
            }
            it = n;
        }
        return true;
    }
}
