struct node {
  int data;
  struct node * left, * right;
};

void postOrderTrav(node * curr, vector < int > & postOrder) {
  if (curr == NULL)
    return;

  postOrderTrav(curr -> left, postOrder);
  postOrderTrav(curr -> right, postOrder);
  postOrder.push_back(curr -> data);
}
