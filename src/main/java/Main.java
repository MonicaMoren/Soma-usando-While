import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
Scanner  sc = new Scanner(System.in);
System.out.println("Programa que Soma Numeros Inteiros ");
    // até que entre o número 0
    int x = sc.nextInt();
int soma = 0;
    
    while(x != 0){
      soma = soma + x ; 
x = sc.nextInt();
    }
    System.out.println("Imprime a Soma" + soma);
    sc.close();
  }
}