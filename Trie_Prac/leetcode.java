package Trie_Prac;

public class leetcode {

    // static class Node {
    //     Node [] children;
    //     boolean eof;

    //     public Node(){
    //         children = new Node[26];

    //         for (int i = 0; i < children.length; i++) {
    //             children[i] = null;
    //         }
    //         eof = false;
    //     }
    // }

    // public WordDictionary() {
    //     Node root = new Node();
    // }

    // public void addWord(String word) {
    //     Node cuur = root;
    // }

    // public boolean search(String word) {

    // }


public class WordDictionary {

    // Trie node class
    static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26];
            isEndOfWord = false;
        }
    }

    private TrieNode root;

    // Initializes the WordDictionary object.
    public WordDictionary() {
        root = new TrieNode();
    }

    // Adds a word to the data structure.
    public void addWord(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
        }
        node.isEndOfWord = true;
    }

    // Returns true if there is any string in the data structure that matches the word.
    public boolean search(String word) {
        return searchInNode(word, 0, root);
    }

    private boolean searchInNode(String word, int index, TrieNode node) {
        if (index == word.length()) {
            return node.isEndOfWord;
        }

        char c = word.charAt(index);
        if (c == '.') {
            for (TrieNode child : node.children) {
                if (child != null && searchInNode(word, index + 1, child)) {
                    return true;
                }
            }
            return false;
        } else {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                return false;
            }
            return searchInNode(word, index + 1, node.children[idx]);
        }
    }

}
}