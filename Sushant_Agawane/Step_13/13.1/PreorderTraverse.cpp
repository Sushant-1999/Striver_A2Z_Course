struct node {
  int data;
  struct node * left, * right;
};

void preOrderTrav(node * curr, vector < int > & preOrder) {
  if (curr == NULL)
    return;

  preOrder.push_back(curr -> data);
  preOrderTrav(curr -> left, preOrder);
  preOrderTrav(curr -> right, preOrder);
}