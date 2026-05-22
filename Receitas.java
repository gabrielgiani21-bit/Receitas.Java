import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class Receitas {
    public static void main(String[] args) throws Exception {
        Scanner symt = new Scanner(System.in);
        ArrayList<String> listaingredientes = new ArrayList<>();
        ArrayList<String> Instruções = new ArrayList<>();


        System.out.println("Qual é a receita a se fazer");
        String receita = symt.nextLine().trim();
        System.out.println("Digite cada ingrediente por vez. Quando terminar, digite 'fim' .\n");


        while (true) {
            System.out.print("Digite um ingrediente:");
            String ingrediente = symt.nextLine().trim();

            if (ingrediente.equalsIgnoreCase("fim")) {
                break;
            }
            if (!ingrediente.isEmpty()) {
                listaingredientes.add(ingrediente);

            }
            

        }
        System.out.println("\n--- Digite as instruções do modo de preparo passo a passo ---");
        System.out.println("Quando terminar as instruções, digite 'fim'.");

        System.out.println("Receita: " + receita);

        while (true) {
            System.out.println("Próximo passo:");
            String passo = symt.nextLine().trim();

            if (passo.equalsIgnoreCase("fim")) {
                break;
            }
            if (!passo.isEmpty()){
                Instruções.add(passo);
            }
            
            
        }
        System.out.println("\n=================================");
        System.out.println("RECEITA: " + receita.toUpperCase());
        System.out.println("=================================");

        System.out.println("\nINGREDIENTES:");
        for (int i = 0; i < listaingredientes.size(); i++) {
            System.out.println("- " + listaingredientes.get(i));
        }

        System.out.println("\nMODO DE PREPARO:");
        for (int i = 0; i < Instruções.size(); i++) {
            int passoNum = i + 1;
            System.out.println("Passo " + passoNum + ": " + Instruções.get(i));
        }
      
        java.io.PrintWriter gravar = new java.io.PrintWriter(receita + ".txt");


        gravar.println("RECEITA: " + receita);
        gravar.println(); // Pula uma linha


        gravar.println("INGREDIENTES:");
        for (int i = 0; i < listaingredientes.size(); i++) {
            int numero = i + 1;
            gravar.println(numero + ". " + listaingredientes.get(i));
            }
        gravar.println(); // Pula uma linha


        gravar.println("MODO DE PREPARO:");
        for (int i = 0; i < Instruções.size(); i++) {
            int passoNum = i + 1;
            gravar.println("Passo " + passoNum + ": " + Instruções.get(i));
            }


        gravar.close();

    }
  
    
}
