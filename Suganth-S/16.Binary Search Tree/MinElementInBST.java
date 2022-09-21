class Tree {
    // Function to find the minimum element in the given BST.
    int minValue(Node node) {
        int min = 0;
        if(node==null)
        {
            return -1;
        }
        if(node.left==null && min== 0)
        {
            return node.data;
        }
        if(node.left!=null)
        {
            min = minValue(node.left);
        }
        return min;
    }
}
