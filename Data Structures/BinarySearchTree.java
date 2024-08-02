import java.util.*;

class Node{
    int key; // everynode has a key
    Node left, right; // and a left and right node in BST
    public Node(int item){
        key = item; //key is set to item
        left = right = null; //left and right nodes are initalized to null
    }
}

class BinarySearchTreeOp{
    Node root;

    //constructor to initalize root node as null
    BinarySearchTreeOp(){
        root = null;
    }

    Node insert(Node node, int key){
        if(node == null){
            node = new Node(key);
            return node;
        }
        if(key < node.key){
            node.left = insert(node.left, key);
        }
        else if(key > node.key){
            node.right = insert(node.right, key);
        }
        return node;
    }

    Node search(Node root,int key){
        if(root == null || root.key == key){
            return root;
        }
        if(key < root.key){
            return search(root.left, key);
        }
        return search(root.right, key);
    }
}


public class BinarySearchTree
{
	public static void main(String[] args) {
		BinarySearchTreeOp tree = new BinarySearchTreeOp();// tree initalization

		tree.root = tree.insert(tree.root, 12);
		tree.insert(tree.root, 1);
		tree.insert(tree.root, 2);
		tree.insert(tree.root, 3);

		Node foundNode = tree.search(tree.root, 3);
		if(foundNode==null){
		    System.out.print("Node not Found!");
		}
		else{
		    System.out.print("Node found!");
		}
	}
}




