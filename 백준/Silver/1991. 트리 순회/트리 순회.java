

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static class Node {
		String data;
		String lnode;
		String rnode;

		public Node(String data, String lnode, String rnode) {
			this.data = data;
			this.lnode = lnode;
			this.rnode = rnode;

		}
	}

	static class Tree {
		Node node;

		public Tree(Node node) {
			this.node = node;
		}

		@Override
		public String toString() {

			return node.data + node.lnode + node.rnode;
		}

	}

	static int n;
	static Tree[][] trarr;
	static StringBuilder sb = new StringBuilder();
	static StringBuilder sb1 = new StringBuilder();
	static StringBuilder sb2 = new StringBuilder();

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		n = Integer.parseInt(br.readLine());

		trarr = new Tree[n][1];

		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line);
			String m = st.nextToken();
			String a = st.nextToken();
			String b = st.nextToken();

			Node node = new Node(m, a, b);
			Tree tree = new Tree(node);
			trarr[i][0] = tree;
		}

		preorder("A"); // 전위순회
		inorder("A"); // 중위순회
		postorder("A"); // 후위순회

		System.out.println(sb2);
		System.out.println(sb1);
		System.out.println(sb);
		
	}

	private static void postorder(String node) {   // 후위 sb
        if (node.equals(".")) {
            return;
        }

        for (int i = 0; i < n; i++) {
            Tree tree = trarr[i][0];
            Node currNode = tree.node;

            if (currNode.data.equals(node)) {
                postorder(currNode.lnode); // 왼쪽 서브트리 순회
                postorder(currNode.rnode); // 오른쪽 서브트리 순회
                break;
            }
        }

//        System.out.print(node); // 현재 노드 출력
        sb.append(node);
       
    }

    private static void inorder(String node) {
        if (node.equals(".")) {
            return;
        }

        for (int i = 0; i < n; i++) {
            Tree tree = trarr[i][0];
            Node currNode = tree.node;

            if (currNode.data.equals(node)) {
                inorder(currNode.lnode); // 왼쪽 서브트리 순회
//                System.out.print(node); // 현재 노드 출력
                sb1.append(node);
                inorder(currNode.rnode); // 오른쪽 서브트리 순회
                break;
            }
        }
    }

    private static void preorder(String node) {
        if (node.equals(".")) {
            return;
        }

//        System.out.print(node); // 현재 노드 출력
        sb2.append(node);
        
        for (int i = 0; i < n; i++) {
            Tree tree = trarr[i][0];
            Node currNode = tree.node;

            if (currNode.data.equals(node)) {
                preorder(currNode.lnode); // 왼쪽 서브트리 순회
                preorder(currNode.rnode); // 오른쪽 서브트리 순회
                break;
            }
        }
    }
}
	    
