import java.util.Scanner;

public class BEJOEO {
	public static void main(String[] args) {


		/*System.out.println("Wat ur nam");
		Scanner sc = new Scanner(System.in);
		String name = String.format("Name: %s\n", sc.nextLine());
		System.out.println("wat age");
		String age = String.format("Age: %d\n", sc.nextInt());
		System.out.println("wat email");
		String email = String.format("contact: %s\n", sc.nextLine());
		System.out.println("wat address");
		String address = String.format("Located at: %s\n", sc.nextLine());
		System.out.println(name + age + email + address);
		*/
		/*Scanner number = new Scanner(System.in);
		System.out.println("giv operation(+, *, -, /)");
		String operation = number.nextLine();
		System.out.println("giv number");
		double num1 = number.nextDouble();
		
		System.out.println("giv number again lol");
		double num2 = number.nextDouble();
		
		switch(operation){
			case "+":
				Double result = num1 + num2;
				System.out.println(result);
				break;
			case "-":
				Double result2 = num1 - num2;
				System.out.println(result2);
				break;
			case "*":
				Double result3 = num1 * num2;
				System.out.println(result3);
				break;
			case "/":
				Double result4 = num1 + num2;
				System.out.println(result4);
				break;
			default:
				System.out.println("invalid");
		}*/
		int num1 = 1, num2 = 1, sum;
		for(int x = 1; x <= 10; x++){
			System.out.println(num1);
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;			

		}
		
	}
}
