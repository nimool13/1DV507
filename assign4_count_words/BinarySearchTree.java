// https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/

package count_words;


public class BinarySearchTree {

    class Node { 
        Word word; 
        Node left, right; 
  
        public Node(Word w) { 
            word = w; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    Node root; 
  
    // Constructor 
    BinarySearchTree() {  
        root = null;  
    } 
  
    // This method mainly calls insertRec() 
    void insert(Word word) { 
       root = insertRec(root, word);
    } 
      
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, Word word) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(word); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (word.compareTo(root.word) < 0) 
            root.left = insertRec(root.left, word); 
        else if (word.compareTo(root.word) > 0) 
            root.right = insertRec(root.right, word); 
  
        /* return the (unchanged) node pointer */
        return root; 
    }    
    
    
    public boolean Contains(Node root, Word word) 
    {  // Base Cases: root is null or key is present at root
    	if(root == null)
    		return false;

        if (root.word.equals(word)) 
            return true; 
      
        // val is greater than root's key 
        if (root.word.compareTo(word) > 0) 
            return Contains(root.left, word); 
      
        // val is less than root's key 
        return Contains(root.right, word); 
    }
}