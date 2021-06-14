package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树
 */
public class TwoDirectTree {

    //1. 求二叉树中的节点个数
    public int getNodeCount(TreeNode rootNode){
        if (rootNode == null){
            return 0;
        }
        return getNodeCount(rootNode.left) + getNodeCount(rootNode.right) + 1;
    }

    //2. 求二叉树的最大层数(最大深度)
    public int getMaxDepth(TreeNode rootNode){
        if (rootNode == null){
            return 0;
        }
        return Math.max(getMaxDepth(rootNode.left),getMaxDepth(rootNode.right)) + 1;
    }

    //2.1 二叉树的最小深度
    public int getMinDepth(TreeNode rootNode){
        if (rootNode == null){
            return 0;
        }
        int leftMinDepth = getMinDepth(rootNode.left);
        int rightMinDepth = getMinDepth(rootNode.right);
        return (leftMinDepth == 0 || rightMinDepth == 0) ? leftMinDepth + rightMinDepth + 1 : Math.min(leftMinDepth,rightMinDepth) + 1;
    }

    //3.1 先序遍历/前序遍历 (递归)
    public List<Integer> preOrderRecursive(TreeNode rootNode){
        List<Integer> result = new ArrayList<>();
        add2List(rootNode,result);
        return result;
    }

    public void add2List(TreeNode node, List<Integer> list){
        if (node == null){
            return;
        }
        list.add(node.val);
        add2List(node.left,list);
        add2List(node.right,list);
    }

}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
