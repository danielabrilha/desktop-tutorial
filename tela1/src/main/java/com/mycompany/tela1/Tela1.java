/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tela1;
import java.util.Scanner;
/**
 *
 * @author 975938
 */
public class Tela1 {

    public static void main (String args[]){  
   
        short operacao;
        double num1, num2;    
        Scanner input = new Scanner(System.in);
       
        do {
             System.out.println("Digite a operacao desejada:");
             System.out.println("  1. Soma");      
             System.out.println("  2. Subtracao");      
             System.out.println("  3. Multiplicacao");      
             System.out.println("  4. Divisao");      
             System.out.println("  0. Sair");
             System.out.print("Operacao: ");
             operacao = input.nextShort();
             
             if (operacao == 0) {
                 System.out.println("Bye bye!");
                 break;
             }
             
             if (!OperacaoExiste(operacao)) {
                 continue;
             }
             
             System.out.print("Digite o primeiro valor: ");
             num1 = input.nextDouble();
             
             System.out.print("Digite o segundo valor: ");
             num2 = input.nextDouble();
             
             if (!ValidaDadosDeEntrada(operacao, num1, num2)) {
                 continue;
             }
       
             System.out.println("RESULTADO: O resultado da operacao " + getNomeOperacao(operacao) + " eh " + Calcular(operacao, num1, num2) + "\n");
        } while (operacao != 0);
    }
   
    static double Calcular (short operacao, double num1, double num2) {
        double resultado = 0;
        switch (operacao) {
            case 1: //soma
                resultado = num1 + num2;
                break;
            case 2: //substração
                resultado = num1 - num2;
                break;
            case 3: //multiplicação
                resultado = num1 * num2;
                break;
            case 4: //divisão
                resultado = num1 / num2;
                break;
        }
        return resultado;
    }
   
    static boolean OperacaoExiste (short operacao) {
        boolean retorno = true;
        if (operacao > 4) {
            System.out.println("ERRO: Operacao escolhida eh invalida.\n");
            retorno = false;
        }
        return retorno;
    }
   
    static boolean ValidaDadosDeEntrada (short operacao, double num1, double num2) {
        boolean retorno = true;
        if (operacao == 4 & num2 == 0) {
             System.out.println("ERRO: Divisor nao pode ser zero.\n");
             retorno = false;
        }
        return retorno;
    }
   
    static String getNomeOperacao (short operacao) {
       
        switch (operacao) {
        case 1:
            return "soma";
        case 2:
            return "subtracao";
        case 3:
            return "multiplicacao";
        case 4:
            return "divisao";
        default:
            return "undefined";
        }
       
    }
}
        
        
    }
    
}