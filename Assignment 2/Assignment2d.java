import java.util.Scanner;

public class Assignment2d {
	
	    public static void main(String[] args) {
	    	int[] array = new int[10];
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the elements of array");
			for(int i=0;i<array.length;i++)
			array[i]=sc.nextInt();
	        mergeSort(array, 0, array.length - 1);
	        System.out.println("Sorted array:");
	        printArray(array);
	    }

	    public static void mergeSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int mid = (low + high) / 2;

	           
	            mergeSort(arr, low, mid);
	            mergeSort(arr, mid + 1, high);

	          
	            merge(arr, low, mid, high);
	        }
	    }

	    public static void merge(int[] arr, int low, int mid, int high) {
	       
	        int size1 = mid - low + 1;
	        int size2 = high - mid;

	       
	        int[] leftArr = new int[size1];
	        int[] rightArr = new int[size2];

	        
	        for (int i = 0; i < size1; ++i)
	            leftArr[i] = arr[low + i];
	        for (int j = 0; j < size2; ++j)
	            rightArr[j] = arr[mid + 1 + j];

	       

	       
	        int i = 0, j = 0;

	       
	        int k = low;

	        while (i < size1 && j < size2) {
	         
	            if (leftArr[i] <= rightArr[j]) {
	                arr[k] = leftArr[i];
	                i++;
	            } else {
	                arr[k] = rightArr[j];
	                j++;
	            }
	            k++;
	        }

	        
	        while (i < size1) {
	            arr[k] = leftArr[i];
	            i++;
	            k++;
	        }

	      
	        while (j < size2) {
	            arr[k] = rightArr[j];
	            j++;
	            k++;
	        }
	    }

	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}


