package gerenciaBanco;

import java.util.Scanner;

import entities.SituacaoBancaria;
import entities.Usuario;

public class Main {
	
	public static void main(String[] args) {
		iniciarAplicacao();
	}
	
	public static void iniciarAplicacao() {
		Usuario usuario = new Usuario();
		usuario.setSituacao(new SituacaoBancaria());
		Scanner ler = new Scanner(System.in);
		
		popularAtributosUsuario(usuario, ler);
		startarAplicacao(usuario, ler);
	}
	  
	public static void popularAtributosUsuario(Usuario usuario, Scanner ler) {
		// cadastro
		System.out.println("Olá bem vindo ao banco DevBank\n\n");
		System.out.println("Insira seu nome: ");
		
		usuario.setNome(ler.nextLine());
		System.out.println("Insira o sobrenome: ");
		usuario.setSobrenome(ler.nextLine());
		System.out.println("Insira o CPF: ");
		usuario.setCpf(ler.nextLine());
		System.out.println("Obrigado pelo cadastro "+ usuario.getNome());
	}
	  
	public static void startarAplicacao(Usuario usuario, Scanner ler) {
		int indicador = 0;
		
		System.out.println("Ola "+ usuario.getNome());
		System.out.println("Escolha uma das opções:\n1 - Saldo\n2 - Deposito\n3 - Saque\n4 - Sair");
	    
	    while (indicador != 4) {
	        indicador = ler.nextInt();
	        
	        switch (indicador){
	        case 1:
	          System.out.println("Seu saldo é de R$ "+ usuario.getSituacao().getSaldo());
	          break;
	        case 2:
	          System.out.println("Insira um valor de depósito: R$ ");
	          usuario.getSituacao().setSaldo(ler.nextFloat() + usuario.getSituacao().getSaldo());
	          System.out.println("Seu saldo agora é R$ "+ usuario.getSituacao().getSaldo());
	          break;
	        case 3:
	          float saque;
	          System.out.println("Insira o valor do Saque: ");
	          saque = ler.nextFloat();
	          if (usuario.getSituacao().getSaldo() >= saque){
	        	  usuario.getSituacao().setSaldo(usuario.getSituacao().getSaldo() - saque);
	            System.out.println("Seu saldo atual é R$ "+ usuario.getSituacao().getSaldo());
	          } else {
	            System.out.println("Saldo Insuficiente");
	          }
	            break;
	        case 4:
	        	System.out.println("Volte sempre!"); 
	        	break;
	      }
	    }
	  }
}
