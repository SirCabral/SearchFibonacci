import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Insira um numero para verificar se pertence a sequencia Fibonacci: ");
		int numberToSearch = sc.nextInt();
			if (searchFibonacci(numberToSearch)) {
				System.out.println("O Número " + numberToSearch + " pertence ao Fibonacci");
			}
			else {
				System.out.println("O Número " + numberToSearch + " não pertence ao Fibonacci");
			}		
		sc.close();
	    }
	
	//procura o numero informado no calculo de sequencia fibonacci e retorna um boolean
	public static boolean searchFibonacci(Integer number) {
        int num1 = 1, num2 = 0;        
        for(int i = 0; i < 100; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            if (num1 == number) {
            	return true;           	
            }                 
        }
        return false;  
	}

}
