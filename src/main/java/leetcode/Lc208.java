package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Lc208 {

    static class Trie {
        private Node root;
        public Trie() {
            root = new Node();
        }

        public void insert(String word) {
            Node node = this.root;
            for (int i = 0; i < word.length(); i++) {
                node = node.childrenNode.computeIfAbsent(word.charAt(i), key -> new Node());
            }
            node.endOfWord = true;
        }

        public boolean search(String word) {
            Node node = this.root;
            for (int i = 0; i < word.length(); i++) {
                node = node.childrenNode.getOrDefault(word.charAt(i), null);
                if(node == null) {
                    return false;
                }
            }
            return node.endOfWord;
        }

        public boolean startsWith(String prefix) {
            Node node = this.root;
            for (int i = 0; i < prefix.length(); i++) {
                node = node.childrenNode.getOrDefault(prefix.charAt(i), null);
                if(node == null) {
                    return false;
                }
            }
            return true;
        }

    }
    static class Node{
        Map<Character, Node> childrenNode;
        boolean endOfWord;

        public Node() {
            childrenNode = new HashMap<Character, Node>();
            endOfWord = false;
        }
    }

}
