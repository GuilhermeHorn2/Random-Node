package misc;

import java.util.ArrayList;
import java.util.LinkedList;

import misc.Graph_1.Node;

public class Binary_tree {

	   public static class Node{
	    	public int _id;
	    	public ArrayList<Node> adj;
	    	public int marked = 0;
	    	public int value;
	    	
	    	public Node(int id,int val) {
	    		_id = id;
	    		value = val;
	    		adj = new ArrayList<>();
	    		adj.add(0,null);
	    		adj.add(1,null);
	    		adj.add(2,null);
	    	
	    	}
	    	
	    	/*public String toString() {
	    		return "{id:" + _id + " / value:" + value + "}";
	    	}*/
	    	
	    	public String toString() {
	    		return ""+value;
	    	}
	    	
	    	public void set_value(int v) {
	    		value = v;
	    	}
	    	
		    public Node left() {
		    	if(this.adj.get(0) != null) {
		    		return this.adj.get(0);
		    	}
		    	return null;
		    }
		    public Node right() {
		    	if(this.adj.get(1) != null) {
		    		return this.adj.get(1);
		    	}
		    	return null;
		    }
		    
		    public Node get_parent(){
		    	if(this.adj.get(2) != null){
		    		return this.adj.get(2);
		    	}
		    	return null;
		    }
		    
	    	
	    }
	    
	    public ArrayList<Node> nodes;
	    
	    //
	    private static int count = 10;  
	    
	    
	    
	    public Binary_tree() {
	    	nodes = new ArrayList<>();
	    }
	    
	    public void add(int i,int val) {
	    	Node novo = new Node(i,val);
	    	nodes.add(novo);
	    	
	    	//
	    	count++;
	    }
	    
	    public void link_left(int id1,int id2){
	    	Node n = nodes.get(id1);
	    	n.adj.remove(0);
	    	n.adj.add(0, nodes.get(id2));
	        Node r = nodes.get(id2);
	        if(r.adj.get(2) == null) {
	        	r.adj.remove(2);
	        	r.adj.add(2,n);
	        }
	        
	        //
	        count++;
	    }
	    
	    public void link_right(int id1,int id2) {
	    	Node n = nodes.get(id1);
	    	n.adj.remove(1);
	    	n.adj.add(1,nodes.get(id2));
	    	Node r = nodes.get(id2);
	    	if(r.adj.get(2) == null) {
	    		r.adj.remove(2);
	    		r.adj.add(2,n);
	    	}
	    	
	    	//
	    	count++;
	    }
	    
	    
	    public Node get_node(int i) {
	    	return nodes.get(i);
	    	
	    }
	    

	    public ArrayList<Node> get_nodes(){
	    	return nodes;
	    }
	    
	    /*Find node*/ 	
	    
	    //I have a node n that come from a different tree and i want check if n is on the 2 trees
	    public Node find(Node n){  	 
	    	for(int i = 0;i < nodes.size();i++) {
	    		if(nodes.get(i) == n) {
	    			return nodes.get(i);
	    		}
	    	}
	    	
	    	//
	    	count++;
	    	
	    	return null;
	    }
	    
	    /*Delete node*/
	    
	    //If i delete a node i have to delete its subtree 
	    
	    public void remove_node(Node n){
	    	
	    	
	    	Node parent = n.get_parent();
	    	
	    	if(parent.left() == n) {
	    		parent.adj.set(0, null);
	    	}
	    	else if(parent.right() == n){
	    	    parent.adj.set(1, null);
	    	}
	    	
	    	
	    	nodes.remove(n);
	    	
	    	//
	    	count++;
	    	
	    }
	    
	    public void delete(Node n) {
	    	
   	
	    	if(n.left() == null && n.right() == null){
	    		this.remove_node(n);
	    		return;
	    	}
	    	
	    	else {
	    		if(n.left() != null) {
	    			delete(n.left());
	    			this.remove_node(n);
	    		}
	    		if(n.right() != null) {
	    			delete(n.right());
	    			this.remove_node(n);
	    		}
	    		
	    	}
	    	
	    	//
	    	count++;
	    		    	
	    }
	    
	    /*Get random node*/
	    
	    //If n is divisible by some number > sqrt(n), then is divisible by some number smaller than it
	    public boolean is_prime(int n) {
	    	
	    	for(int i = 2;i*i <= n;i++){
	    		if(n % i == 0) {
	    			return false;
	    		}
	    	}
	    	return true;	
	    }
	    
	    public Node get_random_node() {
	    	
	    	if(count >= 99999) {
	    		count = 1;
	    	}
	    	if(is_prime(count)) {
	    		count++;
	    	}
	    	/*I want the count to start at a "random" value,because i dont now much count++ was done*/
	        int i = 0;
	    	while(!is_prime(count)){
	    		i++;
	    		if(i >= nodes.size()) {
	    			i = 0;
	    		}
	    		count++;  		
	    	}
	    	count++;
	    	return nodes.get(i);
	    	
	    }
	    
	   	
	 
	   
	   }
	    
	    	
	    
	   	

