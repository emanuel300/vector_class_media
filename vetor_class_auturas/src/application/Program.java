package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        double soma, media, percentual, idmenor;

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = ler.nextInt();
        Product[] vetProduto = new Product[n];

       for (int i = 0; i < vetProduto.length; i++){
           ler.nextLine();
           System.out.println("DADOS DA PESSOA " + i);
           System.out.print("Nome: ");
           String nome = ler.nextLine();

           System.out.print("Idade: ");
           int idade = ler.nextInt();

           System.out.print("Altura: ");
           double altura = ler.nextDouble();

           vetProduto[i] = new Product(nome, idade, altura);
       }

       soma = 0;
       media = 0;
        for (int i = 0; i < vetProduto.length; i++){
            soma += vetProduto[i].getAltura();
        }
        media = soma/ vetProduto.length;

        System.out.printf("Media das ALTURAS: %.2f%n",media);


        idmenor = 0;

        for (int i = 0; i < vetProduto.length; i++){
            if (vetProduto[i].getIdade() < 16){
                idmenor++;
            }
        }

        percentual = 0;
        percentual = (idmenor / n) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentual);

        for (int i = 0; i < vetProduto.length; i++){
            if (vetProduto[i].getIdade() < 16){
                System.out.println(vetProduto[i].getNome());

            }
        }


        ler.close();
    }
}
