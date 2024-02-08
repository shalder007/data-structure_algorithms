class BinaryTree{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    Node root;
public void insert(int data){
    root = insertRec(root, data);

}
public Node insertRec(Node root,int data){
    if(root == null){
        root = new Node(data);
      }else if(data< root.data){
        root.left = insertRec(root.left, data);
      }else if(data> root.data){
        root.right = insertRec(root.right, data);
      }
      return root;
}
public void treetrav(){
    System.out.println("InOrder travrsal of the tree : ");
    inorderRec(root);
    System.out.println(" ");
    System.out.println("PreOrder travrsal of the tree : ");
    preorderRec(root);
    System.out.println(" ");
    System.out.println("PostOrder travrsal of the tree : ");
    postorderRec(root);    
}
public void inorderRec(Node root){
    if(root!= null){
    inorderRec(root.left);
    System.out.print(root.data + " ");
    inorderRec(root.right);
    }
    }
    public void preorderRec(Node root){
        if(root!= null){
        System.out.print(root.data + " ");
        preorderRec(root.left);
        preorderRec(root.right);
        }
        
        }
public void postorderRec(Node root){
    if(root!= null){
postorderRec(root.left);
postorderRec(root.right);
System.out.print(root.data + " ");
}
}
}

public class BinarySearchTree {
    public static void main(String[] args){
        BinaryTree mytree1 = new BinaryTree();
        mytree1.insert(8);
        mytree1.insert(7);
        mytree1.insert(12);
        mytree1.insert(15);
        mytree1.insert(2);
        mytree1.insert(5);
        mytree1.treetrav();

    }
}
