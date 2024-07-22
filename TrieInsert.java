public class TrieInsert {
    static class Node {
        Node[] children;
        boolean endOfWord;

        public Node() {
            children = new Node[26];

            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            endOfWord = false;
        }
    }

    static Node root = new Node();

    public static void insert(String words) {
        Node curr = root;
        for (int i = 0; i < words.length(); i++) {
            int idx = words.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            if (i == words.length() - 1) {
                curr.children[idx].endOfWord = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean searchPrac(String words) {
        Node curr = root;

        for (int i = 0; i < words.length(); i++) {
            int idx = words.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }

            if (i == words.length() && curr.children[idx].endOfWord == false) {
                return false;
            }

            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String word[] = { "the", "a", "there", "their", "any" };
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        System.out.println(searchPrac("their"));
        System.out.println(searchPrac("thor"));
    }

}
