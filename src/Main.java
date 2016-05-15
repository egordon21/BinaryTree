
public class Main {

	public static void main(String[] args) {
		TreeNode node = new TreeNode();
		node.Value = 10;
		try {
			node.Add(20, node);
			node.Add(21, node);
			node.Add(5, node);
			node.Add(2, node);
			node.Add(4, node);
			node.Add(7, node);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
