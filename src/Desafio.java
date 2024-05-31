import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
       
        Scanner leitorDeEntradas = new Scanner(System.in);
        float salario = leitorDeEntradas.nextFloat();
        float beneficio = leitorDeEntradas.nextFloat();

        float imposto = 0;
        if (salario >= 0 && salario <= 1100){
            imposto = 0.05F * salario;
        } else if (salario > 1100 && salario <= 2500) {
          imposto = 0.1F * salario;
        } else
            imposto = 0.15F * salario;

        float saida = (salario - imposto) + beneficio;
        System.out.println(String.format("%.2f", saida));

        leitorDeEntradas.close();
    }
}
