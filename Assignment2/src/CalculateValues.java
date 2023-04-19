
public class CalculateValues {
	public int add(int valueA, int valueB) {
		System.out.printf("Addition of %d and %d is %d",valueA, valueB, valueA+valueB);
		return 0;
	}
	public int Multiplication(int valueA, int valueB) {
		System.out.printf("Multiplication of %d and %d is %d",valueA, valueB, valueA*valueB);
		return 0;
	}
	public int Substraction(int valueA, int valueB) {
		System.out.printf("Substraction of %d from %d is %d",valueA, valueB, valueA - valueB);
		return 0;
	}
	public int Division(int valueA, int valueB) {
		System.out.printf("Division of %d and %d is %d",valueA, valueB, valueA/valueB);
		return 0;
	}
	public int SquareofNum(int value) {
		return value * value ;
	}
	public int CubeofNum(int value) {
		return value * value * value ;
	}
	public int reminder(int valueA, int valueB) {
		System.out.printf("Reminder of %d and %d is %d", valueA, valueB, valueA%valueB);
		return 0;
	}
}
