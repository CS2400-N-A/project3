import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JUnitBinaryTreeTest {

    @Test
    public void testPostorder(){
        BinaryTree<String> tree = new BinaryTree<>();
        DriverBT.createTree2(tree);
        assertEquals("B F D G H E C A", tree.getPostorderTraverse(tree.getRootNode()));
    }

    @Test
    public void testPostorderBin(){
        BinaryTree<String> tree = new BinaryTree<>();
        DriverBT.createTree2(tree);
        assertEquals("B F D G H E C A", tree.getRootNode().getPostorderTraverse_binaryNodeMethod());
    
    }

    @Test
    public void testTreeHeight(){
        BinaryTree<String> tree = new BinaryTree<>();
        DriverBT.createTree2(tree);
        assertEquals(4, tree.getHeight());
    }

    @Test
    public void testTreeHeightBin(){
        BinaryTree<String> tree = new BinaryTree<>();
        DriverBT.createTree2(tree);
        assertEquals(4, tree.getHeight_callBinaryNodeMethod());
    }

    @Test
    public void testNumOfNodes(){
        BinaryTree<String> tree = new BinaryTree<>();
        DriverBT.createTree2(tree);
        assertEquals(8, tree.getNumberOfNodes());
    }

    @Test
    public void testNumOfNodesBin(){
        BinaryTree<String> tree = new BinaryTree<>();
        DriverBT.createTree2(tree);
        assertEquals(8, tree.getNumberOfNodes_callBinaryNodeMethod());
    }   
}