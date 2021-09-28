package entidades;

import java.util.Scanner;
import entidades.Estudantes;

public class Recepcao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informamos que o hotel possui somente 10 quartos disponiveis!!! ");
        System.out.println("Informe a quantidade de  quartos vão ser ocupados:");
        int n = sc.nextInt();
        
        Estudantes[] vetor = new Estudantes[10];
        
        if(n >= 0 && n<= 10) {
        	
        	for(int i=0; i<n; i++) {
        		sc.nextLine();
        		System.out.println("Informe o nome do estudante:");
        		String nome = sc.nextLine();
        		System.out.println("Informe o email do estudante:");
        		String email = sc.nextLine();
        		System.out.println("Informe o numero do quarto:");
        		int quarto = sc.nextInt();
    
        		vetor[quarto]= new Estudantes(nome, email, quarto);
        		
        	}
        	System.out.println("Relatorio do dia: ");
        	 for(int i =0; i<vetor.length; i++) {
        		 
                 if(vetor[i] != null) {
                	
                    System.out.println("+---------------------------");
                	System.out.println("Rent #");
                  	System.out.println("Name =" +vetor[i].getNome());
                  	System.out.println("Email =" +vetor[i].getEmail());
                  	System.out.println("Quarto =" +vetor[i].getQuarto());
                  	System.out.println("+---------------------------");
                  	System.out.println("");
                  	
                 }
             	
             }
        }else {
        	System.out.println("Numero do quarto INDISPONIVEL!!");
        }
        
       
        sc.close();
        
	}

}
