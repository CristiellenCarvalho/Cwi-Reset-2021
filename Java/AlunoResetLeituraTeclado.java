import java.util.Scanner;

public class AlunoResetLeituraTeclado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String nome;
		System.out.println("Digite seu nome : ");
		
		nome = sc.nextLine(); 
		
		System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo " + nome );
		

	}

}
