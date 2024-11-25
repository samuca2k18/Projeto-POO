import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int a = -1;

     while(a != 0){
         System.out.println("Digite uma da opções");
         System.out.println("[1] para alguma coisa");
         System.out.println("[2] para alguma coisa");
         System.out.println("[3] para outra coisa");
         System.out.println("[4] para mais uma outra coisa");
         System.out.println("[0] para sair");
         Scanner prompt = new Scanner(System.in);

         a = prompt.nextInt();

         if(a == 1){
             System.out.println("voce entrou no 1");

         }
         if(a == 2){
             System.out.println("voce entrou no 2");

         }
         if(a == 3){
             System.out.println("voce entrou no 3");

         }
         if(a == 4){
             System.out.println("voce entrou no 4");

         }

     }
    }
}