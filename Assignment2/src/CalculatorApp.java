import java.util.Scanner;

public class CalculatorApp {
	public static void main(String []args) {
		CalculateValues operation = new CalculateValues();
		Scanner sc = new Scanner(System.in);
		System.out.printf(" 1. Add \n 2. Substraction \n 3. Division \n 4. Multiplication \n 5. Sqaure of number \n 6. Cube of number \n 7. Reminder");
		System.out.println("Choose any operation from given list :: ");
		int option = sc.nextInt();
		
		switch(option) {
			case 1: {
				System.out.print("Enter value of A = ");
				int A = sc.nextInt();
				System.out.print("Enter value of B = ");
				int B = sc.nextInt();
				operation.add(A, B);
				break;
			}
			case 2: {
				System.out.print("Enter value of A = ");
				int A = sc.nextInt();
				System.out.print("Enter value of B = ");
				int B = sc.nextInt();
				operation.Substraction(A, B);
				break;
			}
			case 3: {
				System.out.print("Enter value of A = ");
				int A = sc.nextInt();
				System.out.print("Enter value of B = ");
				int B = sc.nextInt();
				operation.Division(A, B);
				break;
			}
			case 4: {
				System.out.print("Enter value of A = ");
				int A = sc.nextInt();
				System.out.print("Enter value of B = ");
				int B = sc.nextInt();
				operation.Multiplication(A, B);
				break;
			}
			case 5: {
				System.out.print("Enter any value = ");
				int A = sc.nextInt();
				System.out.printf("Sqaure of %d is %d",A , operation.SquareofNum(A));
				break;
			}
			case 6: {
				System.out.print("Enter any value = ");
				int A = sc.nextInt();
				operation.CubeofNum(A);
				System.out.printf("Sqaure of %d is %d",A , operation.CubeofNum(A));
				break;
			}
			case 7: {
				System.out.println("Enter value of A = ");
				int A = sc.nextInt();
				System.out.println("Enter value of B = ");
				int B = sc.nextInt();
				operation.reminder(A, B);
				break;
			}
			default: {
				System.out.println("Opted opreation is not in the list");
				break;
			}
		}
		
	}
}
