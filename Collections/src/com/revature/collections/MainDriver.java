package com.revature.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class MainDriver {

	public static void main(String[] args) {
		
		String[] arrayString ; //declaration
		
		arrayString = new String[3];
		
		arrayString [0] = "Hello there";
		
		int[][][][][] arrayInt = new int[3][3][10][3][3];
		
		arrayInt[0][0][0][0][1] = 1;
		
		//System.out.println(arrayString[0]);
		
		arrayString = new String[10];
		
	//	for(String x: arrayString) {
		//	System.out.println(x);
	//	}
		
		for(int[][][][] x: arrayInt) {
			for (int[][][] y: x){
				for(int[][] z:y) {
					
				}
				
			}
		}
	
		
		List<String> stringList = new ArrayList<>();
		stringList.add("Hi there");
		stringList.add("Hi there");
		stringList.add("The end");
		stringList.add("Goodbye");
		stringList.add(2, "number 21");
		
		stringList.listIterator();
		
		List<String> otherList = new LinkedList<>();
		
		otherList.add("apples");
		otherList.add("kiwi");
		otherList.add("banana");
		
	//	System.out.println(otherList.get(2));
		//Collection<String> lisst = new ArrayList<>();
		//lisst.list
		
		
		//System.out.println(stringList);
		//System.out.println(stringList.get(4));
		
		Set<Double> mySet = new HashSet<>();
		mySet.add(100.0);
		mySet.add(200.0);
		mySet.add(300.0);
		mySet.add(400.0);
		mySet.add(500.0);
		mySet.add(60.0);
		
		//System.out.println(mySet.add(100.0));
		//System.out.println(mySet.add(800.0));
		
		//for(Double num: mySet) {
		//	System.out.println(num);
			
		//}
		
		Set<Double> myTreeSet = new TreeSet<>();
		
		myTreeSet.addAll(mySet);
		mySet.add(null);
		
		Set<String> myLinkedSet = new LinkedHashSet<>();
		myLinkedSet.add("dragonfruit");
		myLinkedSet.add("watermelon");
		myLinkedSet.add("coconut");
	//	System.out.println(myLinkedSet);
		
		
		
	//	System.out.println(myTreeSet);
		
	 //  System.out.println(mySet);
		
		
	   Queue<String> myQueue = new LinkedList<>();
	   
	   myQueue.add("mercury");
	   myQueue.add("venus");
	   myQueue.add("earth");
	   myQueue.add("earth");
	   
	   System.out.println(myQueue);
	   
	  // System.out.println(myQueue.poll());
	  // System.out.println(myQueue.poll());
	  // System.out.println(myQueue.peek());
	  // System.out.println(myQueue.poll());
	  // System.out.println(myQueue.poll());
	  
		Queue<String> myDequeQueue = new ArrayDeque<>();
		
		myDequeQueue.add("jupiter");
		myDequeQueue.add("neptune");
		myDequeQueue.add("Mars");
		myDequeQueue.add("Mars");
		
		//myDequeQueue.add(null);
		
	//	for(String s: myQueue) {
	//		myQueue.poll();
	//		System.out.println(s);
	//	}
		
		for(String s: myDequeQueue) {
			myDequeQueue.poll();
			System.out.println(s);
		}
		
		//Queue<String> myPriority = new PriorityQueue<>();
		
	//	myPriority.addAll(myQueue);
		//myPriority.addAll(myDequeQueue);
		//myPriority.addAll(myLinkedSet);
		//
		//System.out.println(myPriority);
		
		
		
	}
}
