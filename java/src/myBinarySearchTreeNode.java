public class myBinarySearchTreeNode {
    int myValue;
    myBinarySearchTreeNode left;
    myBinarySearchTreeNode right;

    myBinarySearchTreeNode(int inValue){
        // created a new node with empty child pointers
        myValue = inValue;
        left = null;
        right = null;
    }

    myBinarySearchTreeNode(int[] A){
        // creates a new Binary Search Tree rooted at the first value in the array
        /// by inserting elements into the tree in the order they are given in A.
        myValue = A[0];
        for(int i = 1; i < A.length; i++){
            insert(A[i]);
        }
    }

    public void insert(int inValue){
        // This method takes a new integer as input and decides
        // if it should be place:
        //    * as the left child,
        //    * as the right child,
        //    * in the left subtree,
        //    * or in the right subtree.
        // If the value already exists in the tree, no action is taken.

        if(inValue > myValue){
            if(right == null){
                right = new myBinarySearchTreeNode(inValue);
            }
            else{
                right.insert(inValue);
            }
        }

        else if(inValue < myValue) {

            if(left == null){
                left = new myBinarySearchTreeNode(inValue);
            }
            else{
              left.insert(inValue);
            }
        }
        else{
            System.out.println("Duplicates are not allowed.");
        }
    }

    public int height(){
        // This method recursively calculates the height of the entire (sub)tree.
        // This method will take O(n) time
        int leftHeight = 0;
        int rightHeight = 0;

        if(left != null){
            leftHeight = left.height();
        }
        if(right != null){
            rightHeight = right.height();
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int depth(int search){
        // This method recursively calculates the depth of a given search value.
        // If the given value is not in the tree, this method returns -1.
        // Note that if the tree is a proper BST, this method should complete in O(log n) time.
        // Additionally, remember that the depth is the number of nodes on the path from a node to the root
        // (i.e. the number of recursive calls).
        int depth = 0;

        if(search < myValue){
            if(left != null){
                if(left.depth(search) == -1){
                    return -1;
                }
                return depth + left.depth(search) +1;
            }
        }
        if(search > myValue) {
            if (right != null) {
                if (right.depth(search) == -1) {
                    return -1;
                }
                return depth + right.depth(search) + 1;
            }
        }
        if(search == myValue){
            return depth;
        }
        return -1;
    }

    public int size(){
        // This method recursively calculates the number of nodes in the (sub)tree.
    int size = 1;

    if(left != null){
        size += left.size();
    }
    if(right != null){
        size += right.size();
    }

    return size;
    }


}
