package ContagemDeCédulas;

import java.io.IOException;
import java.util.Scanner;


public class ContagemDeCédulas {

        public static void main(String[] args) throws IOException {

            Scanner leitor = new Scanner(System.in);
            int notas100, notas50, notas20,notas10, notas5, notas2, notas1;

            //continue a solucao de acordo com as notas do enunciado
            int notasInseridas = leitor.nextInt();
            int atual = notasInseridas;
            if(atual>=100){  notas100 = atual / 100;
                                          atual -= notas100 * 100;} else notas100 = 0;
            if(atual>=50){ notas50 = atual / 50;
                           atual -=  notas50 * 50;}else notas50 = 0;
            if(atual>=20){ notas20 = atual / 20;
                           atual -= notas20 * 20;}else notas20 = 0;
            if(atual>=10){ notas10 = atual / 10;
                           atual -= notas10 * 10;}else notas10 = 0;
            if(atual>=5){ notas5 = atual / 5;
                           atual -= notas5 * 5;}else notas5 = 0;
            if(atual>=2){ notas2 = atual / 2;
                          atual -= notas2 * 2;}else notas2 = 0;
            if(atual>=1){ notas1 = atual; }else notas1 = 0;

            //continue a solucao de acordo com os exemplos de saída
            System.out.println(notasInseridas);
            System.out.println(  notas100 + " nota(s) de R$ 100,00");
            System.out.println(  notas50 + " nota(s) de R$ 50,00");
            System.out.println(  notas20 + " nota(s) de R$ 20,00");
            System.out.println(  notas10 + " nota(s) de R$ 10,00");
            System.out.println(  notas5 + " nota(s) de R$ 5,00");
            System.out.println(  notas2 + " nota(s) de R$ 2,00");
            System.out.println(  notas1 + " nota(s) de R$ 1,00");
        }

    }

