
public class TreeNode {
	public TreeNode Left;
	public TreeNode Right;
	public int Value;
	
	public void Add(int value, TreeNode node) throws Exception{
		if(value < node.Value){
			if(node.Left == null){
				node.Left = new TreeNode();
				node.Left.Value = value;
				return;
			}
			else
			{
				Add(value, node.Left);
			}
		}
		
		if(value > node.Value){
			if(node.Right == null){
				node.Right = new TreeNode();
				node.Right.Value = value;
				return;
			}
			else
			{
				Add(value, node.Right);
			}
		}
	}
}
