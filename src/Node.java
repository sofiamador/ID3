/*A class that represent a node in decision tree.
*/

import java.util.*;

public class Node {
	private Node previouseNode;
	private HashSet<String> listOfVariablesToCheck;
	private boolean b_isLeaf;
	private String s_variableName;
	private String s_variableValue;
	
	public Node(Node previouseNode, HashSet<String> listOfVariablesToCheck, String s_variableName,
			String s_variableValue) {

		this.previouseNode = previouseNode;
		this.listOfVariablesToCheck = listOfVariablesToCheck;
		this.s_variableName = s_variableName;
		this.s_variableValue = s_variableValue;
		this.b_isLeaf = false;
	}
	

}
