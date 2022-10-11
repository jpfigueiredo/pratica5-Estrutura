import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    
		Scanner scanner = new Scanner(System.in);
    
		String expressao;
		
		if(args.length == 0)

      
		{
      
			System.out.println("Insira a expressão infixa: ");
			expressao = scanner.nextLine().replace(" ", "");
      
		}
      
		else
      
			expressao = args[0];
    
		System.out.println(pfixa.conversao(expressao));

	}

}