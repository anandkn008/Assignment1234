import java.util.Scanner;

public class Assignment2a {

	public static void main(String[] args) {
		int[] array= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elemetns of array");
		for( int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		System.out.print("Duplicates elements are - ");
		        for (int i = 0; i < array.length; i++) {
		            for (int j = i + 1; j < array.length; j++) {
		                if (array[i] == array[j]) {
		                    System.out.print(array[i] + " ");
		                    break;
		                }
		            }
		        }
		    }
		

	}



