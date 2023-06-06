import java.util.Scanner;

public class Assignment2c {

	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for(int i=0;i<array.length;i++)
		array[i]=sc.nextInt();
		bubbleSort(array);
        System.out.println("Sorted array:");
        DisplayArray(array);
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

	}
        public static void DisplayArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        
    }

}
