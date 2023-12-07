import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BinaryTreeLevelOrderTraversal {

    public static void levelOrderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            TreeNode currentNode = q.remove();
            if(currentNode.left!= null)
            {
                q.add(currentNode.left);
            }
            if(currentNode.right!= null)
            {
                q.add(currentNode.right);
            }
            result.add(currentNode.val);
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Level Order Traversal:");
        levelOrderTraversal(root);
    }
}
