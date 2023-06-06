import java.util.Scanner;

public class Assignment2b {

	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for(int i=0;i<array.length;i++)
		array[i]=sc.nextInt();

		        quickSort(array, 0, array.length - 1);

		        System.out.print("Sorted array: ");
		        for (int element : array) {
		            System.out.print(element + " ");
		        }
		    }

		    public static void quickSort(int[] array, int low, int high) {
		        if (low < high) {
		            int partitionIndex = partition(array, low, high);

		            quickSort(array, low, partitionIndex - 1);
		            quickSort(array, partitionIndex + 1, high);
		        }
		    }

		    public static int partition(int[] array, int low, int high) {
		        int pivot = array[high];
		        int i = low - 1;

		        for (int j = low; j < high; j++) {
		            if (array[j] <= pivot) {
		                i++;
		                int temp = array[i];
		                array[i] = array[j];
		                array[j] = temp;
		            }
		        }

		        int temp = array[i + 1];
		        array[i + 1] = array[high];
		        array[high] = temp;

		        return i + 1;
		    }
		}

	


