package com.mycompany.loja;

import java.util.Locale;

public class Loja {
    public static void main(String[] args) {
   String produto1 = "Computador";
   String produto2 = "Mesa de Escritório";
   
   String nomePessoa = "Aether";
   int idade = 72;
   int código = 5290;
   char genero = 'M';
   
   double preco1 = 2100;
   double preco2 = 650.50;
   double medidaDaMesa = 53.234567;
    System.out.printf("Produtos:\n%s está custando R$%.2f\n",produto1,preco1);
    
    System.out.printf("%s está custando R$%.2f\n",produto2,preco2);
    
    System.out.printf("Registro de Pessoa: %s, %d anos, código %d, e sexo: %c \n",nomePessoa, idade, código, genero);
    
    System.out.printf("medida da mesa com oito casas decimais %.8f\n",medidaDaMesa);
    System.out.printf("medida da mesa com tres casas decimais %.3f\n",medidaDaMesa);
    Locale.setDefault(Locale.US);
    System.out.printf("medida da mesa com ponto decimal dos EUA %.3f\n",medidaDaMesa);   
        
        
    
    
    
    }
} 