import java.util.Scanner;

class Main{
	static int fibonacci(int n){
		if(n<=2){
			return 1;
		}else{
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	public static void main(String[] args){
		Scanner number = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = number.nextInt();
		int fib = fibonacci(n);
		System.out.println(fib);
	}
}
