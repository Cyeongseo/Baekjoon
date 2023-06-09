import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node{
    char data;
    Node left;
    Node right;
    Node(char data){
        this.data=data;
    }
}
class Tree {
    Node root;
    public void insertNode(char data,char left,char right){
        if(root==null){
                root=new Node(data);
            if(left!='.'){
                root.left=new Node(left);
            }
            if(right!='.'){
                root.right=new Node(right);
            }
        }
        else{
            searchNode(root,data,left,right);
        }
    }
    public void searchNode(Node root,char data,char left,char right){
        if(root==null){
            return;
        }
        else if(root.data==data){
            if(left!='.'){
                root.left=new Node(left);
            }
            if(right!='.'){
                root.right=new Node(right);
            }
        }
        else{
            searchNode(root.left,data,left,right);
            searchNode(root.right,data,left,right);
        }
    }
    public void preorder(Node root){
        System.out.print(root.data);
        if(root.left!=null)preorder(root.left);
        if(root.right!=null)preorder(root.right);
    }
    public void inorder(Node root){
        if(root.left!=null)inorder(root.left);
        System.out.print(root.data);
        if(root.right!=null)inorder(root.right);
    }
    public void postorder(Node root){
        if(root.left!=null)postorder(root.left);
        if(root.right!=null)postorder(root.right);
        System.out.print(root.data);
    }
}
public class problem1991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        Tree tree=new Tree();
        for(int i=0;i<N;i++){
            char[] data;
            data=br.readLine().replaceAll(" ","").toCharArray();
            tree.insertNode(data[0],data[1],data[2]);
        }
        tree.preorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
        br.close();

    }
}
