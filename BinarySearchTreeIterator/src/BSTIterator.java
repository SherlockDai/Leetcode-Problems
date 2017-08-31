import java.util.*;
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    Queue<Integer> BSTQueue;
    Stack<TreeNode> BSTStack;
    public BSTIterator(TreeNode root) {
        BSTStack = new Stack<TreeNode>();
        BSTQueue = new LinkedList<Integer>();
        if (root != null){
            BSTStack.push(root);
            while(!BSTStack.empty()){
                TreeNode CurrentRoot = BSTStack.pop();
                if (CurrentRoot.left == null && CurrentRoot.right == null){
                    BSTQueue.add(CurrentRoot.val);
                    continue;
                }
                TreeNode RightNode = CurrentRoot.right;
                TreeNode LeftNode = CurrentRoot.left;
                CurrentRoot.right = CurrentRoot.left = null;
                if (RightNode != null){
                    BSTStack.push(RightNode);
                }
                BSTStack.push(CurrentRoot);
                if (LeftNode != null){
                    BSTStack.push(LeftNode);
                }
            }
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if (BSTQueue.peek() != null){
            return true;
        }
        return false;
    }

    /** @return the next smallest number */
    public int next() {
        return BSTQueue.poll();
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */