import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

/**
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 */
public class Question104 {


    public static void main(String[] args) {
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        TreeNode tree = new TreeNode(left, right, 0);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        System.out.println("二叉树的深度是：" + maxDepth(tree));
    }

    public static int maxDepth(TreeNode root) {
        if (root != null) {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return left > right ? left + 1 : right + 1;
        } else {
            return 0;
        }
    }
}

class TreeNode {
    TreeNode right;
    TreeNode left;
    int value;

    TreeNode() {
    }

    TreeNode(int value) {
        this.value = value;
    }

    TreeNode(TreeNode left, TreeNode right, int value) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

}