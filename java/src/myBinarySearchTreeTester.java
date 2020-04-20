import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class myBinarySearchTreeTester {
    /*
  Test case 1 - Height
    This test is to make sure the height method works smoothly.
    Test PASSED :}
   */
    @Test
    public void height1(){
        int[] array = {9,6,10,3,8};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(array);
        assertEquals(3, test.height());
    }

    /*
    Test case 2 - Size
    This test is to ensure that the size method works properly.
    I also included negatives just to spice it up a bit.
    Test PASSED :]
     */
    @Test
    public void size1(){
        int[] array = {1,2,3,4,-1,-2,-3};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(array);
        assertEquals(7, test.size());
    }

    /*
    Test case 3 - Depth
    The third case is testing the depth method,
    just making sure it runs smoothly.
    Test PASSED :o
     */
    @Test
    public void depth1(){
        int[] array = {1,2,3,4,5,6};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(array);
        assertEquals(3,test.depth(4));
    }

    /*
    Test case 4 - Depth
    I created a second test to see if the test would work
     when the search item is not in the array. If it does
     work then it should return a -1.
     Test PASSED :)
     */
    @Test
    public void depth2(){
        int[] array = {2,4,6,8};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(array);
        assertEquals(-1,test.depth(1));
    }

    /*
    Test case 5 - Insert
    I made this test to make sure my insert method works.
    To do this I created an array and inserted two more integers then
    checked the size of that same array to make sure the insertions did happen.
     Test PASSED ^~^
     */
    @Test
    public void insert(){
        int[] array = {1,2,5,6};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(array);
        test.insert(3);
        test.insert(4);
        assertEquals(6, test.size());
    }
}

