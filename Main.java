package test;

public class Main {

    public static void main(String[] args) {
       class Solution {
            int sum  = 0;
            int maxdeep = 0;

            public int deepestLeavesSum(TreeNode root) {
                int current = 1;
                maxdeep = maxDepth(root);
                sumofleaves(root, current);
                return sum;
            }

            public void sumofleaves(TreeNode node, int current) {
                if(node != null) {
                    if(current == maxdeep) sum+=node.val;
                    sumofleaves(node.left, current+1);
                    sumofleaves(node.right, current+1);
                }
            }

            public int maxDepth(TreeNode node)
            {
                if (node == null) return 0;
                else
                {
                    int leftDepth = maxDepth(node.left);
                    int rightDepth = maxDepth(node.right);
                    if (leftDepth > rightDepth) return (leftDepth + 1);
                    else return (rightDepth + 1);
                }
            }

        }
    }
}
