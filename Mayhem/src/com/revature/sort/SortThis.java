package com.revature.sort;



public class SortThis {
	
	public static int []loadBadArray(int length){
		
		int[] myArray = new int[length];
		for (int i = length-1; i >= 0; i--) {
			myArray[i]=length-i;
		}
		return myArray;
	}

	
	
	public static void printArray(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
			}
		System.out.println();
		
	}
	

//	
//	//BubbleSort
//	public static int[] bubble(int [] a) {
//		for (int i = 0; i < a.length-1; i++) {
//			for(int j=0; j<a.length-i-1; j++) {
//				if(a[j]> a[j+1]) {  //position or index of the array
//					//swap a[j] and a[j+1]
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1] =temp;
//				}
//			}
//			
//			
//		}
//			return a;
//		}
//	
//	
	
		 void sort(int[] a, int start, int end) {
			int mid = (start + end)/2;
			
			if(start <end) {
				sort(a, start, mid);
				sort(a, mid + 1, end);
				
			}
		}
			
			public static int[] mergeSort(int[] a, int start, int mid, int end) {
			
				int i =0, first=start, last=mid +1;
				int[] temp = new int[end -start +1];
				
				while(first<= mid && last<= end) {
					temp[i++] = a[first] < a[last] ?
							a[first++] : a[last++];
				}
				
				while(first <= mid) {
					temp[i++] = a[first++];
					
				}
				
				i=0;
				while(start<=end) {
					a[start++] = temp[i++];
				}
				return a;
				
			}
			
			
			
			
		
		public static void main(String[] args) {
			
			int[] a=loadBadArray(10);
			//printArray(bubble(loadBadArray(10)));
			printArray(mergeSort(a, 0, a.length-2/2, a.length-1 ));
		}		
	}

