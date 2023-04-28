package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import misc.Binary_tree.Node;



public class main_misc {
    
	
	public static void main(String[] args) {
	  
	
	  Binary_tree b = new Binary_tree();
	  b.add(0,8);
	  b.add(1,4);
	  b.add(2,2);
	  b.add(3,12);
	  b.add(4,1);
	  b.add(5,3);
	  b.add(6,10);
	  b.add(7,10);
	  b.add(8,20);
	  
	  b.link_left(0,1);
	  b.link_right(0, 7);
	  
	  b.link_left(1, 2);
	  b.link_right(1, 3);
	  
	  b.link_left(2, 4);
	  b.link_right(2, 5);
	  
	  b.link_right(3, 6);
	  
	  b.link_right(7, 8);
	  
	
	  System.out.println(b.get_random_node());
	  System.out.println(b.get_random_node());
	  System.out.println(b.get_random_node());
	  System.out.println(b.get_random_node());
	 
	}
	
	
		
	
	}
	
	
