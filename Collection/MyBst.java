class MyBst {
    private Node root;
    private class Node {
        private int key ;
        private Node left , right;
            Node(int val){
                key = val;
                left = right=null;
            }
    }

    MyBst(int val){
        root=new Node(val);
    }
    public Node insert(int val){
        return insert(this.root,val);
    }
    private Node insert(Node root,int val){
        if(root==null){
            return new Node(val);
        }
        if(val > root.key){
            root.right = insert(root.right,val); 
        }
        else{
            root.left=insert(root.left,val);
        }
        return root;
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node root){
        if (root!=null) {
            inOrder(root.left);
            System.out.println(root.key);
            inOrder(root.right);
        }
    }
    private Node search (Node root,int val){
        if (root==null||root.key==val) {
            return root;
        } 
        if (val>root.key) {
           return search(root.right,val);
        }else{
           return search(root.left, val);
        }
    }
    public boolean search(int val){
        if (search(root,val)==null) {
            return false;
        }
        return true;
    }


}
