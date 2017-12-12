package _199_Binary_Tree_Right_Side_View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hzhuangyan1 on 2017/12/12.
 */
public class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        travel(root, 0);
        return res;
    }
    public void travel(TreeNode node, int level) {
        if (node == null)
            return;
        if (res.size() <= level){
            res.add(node.val);
        }else {
            res.set(level, node.val);
        }
        travel(node.left, level + 1);
        travel(node.right, level + 1);
    }

    class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }
}
