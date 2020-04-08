#### [101. 对称二叉树](https://leetcode-cn.com/problems/symmetric-tree/)

> Knowledge Point:
>
> - 递归
>
> The number of rview : 1th;当前递归的任务是判断这一层节点值是否相等，返回的是boolean


```java
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSame(root.left,root.right);
    }

    public boolean isSame(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        return (root1.val == root2.val) && isSame(root1.left,root2.right)&&isSame(root1.right,root2.left);
    }
```


