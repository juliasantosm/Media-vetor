import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        double [] vect = new double[n];

        for(int i = 0; i<n; i++){
            System.out.print("Digite o "+ (i+1)+ "o numero: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for(int i= 0; i<n; i++){

                soma += vect[i];

        }
        double media = soma/n;

        System.out.printf("Media do vetor %.3f%n ",media);
        System.out.println("Elementos abaixo da média: ");
        for(int i= 0; i<n; i++){
            if(vect[i] <= 10){
                System.out.println(vect[i]);
            }
        }



        sc.close();
    }
}