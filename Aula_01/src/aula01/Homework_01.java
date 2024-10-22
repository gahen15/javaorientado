package aula01;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Homework_01 {

    public static void main(String[] args) {
        // Impressão dos números pares de 0 a 100
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
        
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        
        // Cálculo da soma dos números de 1 a 100
        int count = 0;
        int soma = 0;

        for (soma = 1; soma <= 100; soma++) {
            count += soma;
        }
        System.out.println("A soma de 0 a 100 é: " + count);
        
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        
        // Leitura de pesos
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o peso 1: ");
        double peso1 = sc.nextDouble();
        System.out.print("Digite o peso 2: ");
        double peso2 = sc.nextDouble();
        System.out.print("Digite o peso 3: ");
        double peso3 = sc.nextDouble();
        
        // Comparação dos pesos
        if (peso1 > peso2 && peso1 > peso3) {
            System.out.println(peso1 + " é mais pesado.");
        } else if (peso2 > peso1 && peso2 > peso3) {
            System.out.println(peso2 + " é mais pesado.");
        } else if (peso3 > peso1 && peso3 > peso2) {
            System.out.println(peso3 + " é mais pesado.");
        } else {
            System.out.println("Os três têm o mesmo peso.");
        }
        
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        
        // Impressão de números fora do intervalo 50 a 75
        for (int i = 0; i <= 100; i++) {
            if (i < 50 || i > 75) {
                System.out.println(i);
            }
        }
        
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        
        // Leitura de login e senha
        sc.nextLine(); // Limpar o buffer
        System.out.print("Digite o login: ");
        String login = sc.nextLine();
        
        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();
        
        // Comparação de login e senha
        if (login.equals("administrador") && senha.equals("123")) {
            System.out.println("Logado");
        } else {
            System.out.println("Login ou senha inválidos");
        }
        
        
      
        System.out.println("Digite o valor do produto: ");
        double preco = sc.nextDouble();
        sc.nextLine();
        System.out.println("Insira o cupom de desconto: ");
        String cupom = sc.nextLine();
        
        
        if (preco > 500 || cupom.equals("DESCONTO10")) {
        	preco = preco - (0.1 * preco);
        }
    System.out.println("o valor final é R$ " + preco);
    
        sc.close();
        
        
        
        
        
        String val1 = JOptionPane.showInputDialog("Digite o valor 1: ");
        String val2 = JOptionPane.showInputDialog("Digite o valor 2: ");
        double v1 = Double.parseDouble(val1);
        double v2 = Double.parseDouble(val2);
        double res = v1 +v2;
        JOptionPane.showMessageDialog(null, "Soma: " + res);
}
}