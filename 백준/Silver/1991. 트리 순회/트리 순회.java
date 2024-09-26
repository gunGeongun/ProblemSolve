import java.io.*;

public class Main {
    static int n;
    static Node root = new Node('A', null, null);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String[] st = br.readLine().split(" ");
            char value = st[0].charAt(0);
            char left = st[1].charAt(0);
            char right = st[2].charAt(0);
            insertNode(root, value, left, right);
        }
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }
    public static void insertNode(Node node, char value, char left, char right){
        if(node.value == value){
            node.left = (left == '.' ? null : new Node(left, null, null));
            node.right = (right == '.' ? null : new Node(right, null, null));
        }
        else{
            if(node.left != null){
                insertNode(node.left, value, left, right);
            }
            if(node.right != null){
                insertNode(node.right, value, left, right);
            }
        }

    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value);
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value);
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value);
    }

}


class Node{
    char value;
    Node left,right;

    Node(char value, Node left, Node right){
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
