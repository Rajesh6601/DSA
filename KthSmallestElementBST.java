import java.util.ArrayList;
import java.util.Scanner;


public class KthSmallestElementBST {

    public ArrayList<Integer> inOrderTraversal(TreeNode root, ArrayList<Integer> result)
    {
        if(root == null)
            return result;

        inOrderTraversal(root.left, result);
        result.add(root.val);
        inOrderTraversal(root.right,result);

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        KthSmallestElementBST obj = new KthSmallestElementBST();
        ArrayList<Integer> result = obj.inOrderTraversal(root, new ArrayList<>());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Kth position: ");
        int k = sc.nextInt();
        System.out.println("kth smallest Element " + result.get(k-1));
        int n = result.size();
        System.out.println("kth largest Element " + result.get(n-k));

    }
}
