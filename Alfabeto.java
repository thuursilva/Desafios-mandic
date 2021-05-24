//o programa pede para ser inserida uma frase, ele vai armazenar essa frase e identificar cada carácter para converter eles de acordo com a tabela do exercício apresentado
/*tabela:
c = 3
f = 6
i = 9
l = 12
o = 15
r = 18
u = 21
x = 24
*/
package alfabeto;

import java.util.Scanner;


public class Alfabeto {


    public static void main(String[] args) {
        int i = 0;
        String frase;
        char[] letras = null;//um array para guardar os caracteres da frase
        Scanner entrada = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("                                               Novo alfabeto                                                    ");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("Bem vindo, esse é o novo alfabeto da Mandic, aqui nós iremos converter sua frase para poder se comunicar conosco");
        System.out.println("Digite uma frase para ser convertida de acordo com nosso novo alfabeto:");
        frase = entrada.nextLine();//guardando a frase      
        letras = frase.toCharArray();//separando a frase por caracteres
        int qtd = letras.length;
        for(i=0;i<qtd;i++){//loop identificando um carácter por vez
             if(letras[i] == 'a' || letras[i] == 'A'){
                System.out.print(letras[i]);
            }
             if(letras[i] == 'b' || letras[i] == 'B'){
                System.out.print(letras[i]);
            }            
            if(letras[i] == 'c' || letras[i] == 'C'){
                letras[i] = '3';//convertendo o carácter para seu número correspondente
                System.out.print(letras[i]);
            }
            if(letras[i] == 'd' || letras[i] == 'D'){
                System.out.print(letras[i]);
            }
            if(letras[i] == 'e' || letras[i] == 'E'){
                System.out.print(letras[i]);
            }            
            if(letras[i] == 'f' || letras[i] == 'F'){
                letras[i] = '6';
                System.out.print(letras[i]);
            }
            if(letras[i] == 'g' || letras[i] == 'G'){
                System.out.print(letras[i]);
            }
            if(letras[i] == 'h' || letras[i] == 'H'){
                System.out.print(letras[i]);
            }           
            if(letras[i] == 'i' || letras[i] == 'I'){
                letras[i] = '9';
                System.out.print(letras[i]);
            }
            if(letras[i] == 'j' || letras[i] == 'J'){
                System.out.print(letras[i]);
            }
            if(letras[i] == 'k' || letras[i] == 'K'){
                System.out.print(letras[i]);
            }            
            if(letras[i] == 'l' || letras[i] == 'L'){
               letras[i] = '1';
               System.out.print(letras[i] + "2");
            }
            if(letras[i] == 'm' || letras[i] == 'M'){
                System.out.print(letras[i]);
            }
            if(letras[i] == 'n' || letras[i] == 'N'){
                System.out.print(letras[i]);
            }            
            if(letras[i] == 'o' || letras[i] == 'O'){
               letras[i] = '1';
               System.out.print(letras[i] + "5");
            }
            if(letras[i] == 'p' || letras[i] == 'P'){
                System.out.print(letras[i]);
            }
            if(letras[i] == 'q' || letras[i] == 'Q'){
                System.out.print(letras[i]);
            }            
            if(letras[i] == 'r' || letras[i] == 'R'){
               letras[i] = '1';
               System.out.print(letras[i] + "8");
            }
            if(letras[i] == 's' || letras[i] == 'S'){
                System.out.print(letras[i]);
            }
            if(letras[i] == 't' || letras[i] == 'T'){
                System.out.print(letras[i]);
            }            
            if(letras[i] == 'u' || letras[i] == 'U'){
               letras[i] = '2';
               System.out.print(letras[i] + "1");
            }
            if(letras[i] == 'v' || letras[i] == 'V'){
                System.out.print(letras[i]);
            }
            if(letras[i] == 'w' || letras[i] == 'W'){
                System.out.print(letras[i]);
            }            
             if(letras[i] == 'x' || letras[i] == 'X'){
              letras[i] = '2';
              System.out.print(letras[i] + "4");
            }
            if(letras[i] == 'y' || letras[i] == 'Y'){
                System.out.print(letras[i]);
            }
            if(letras[i] == 'z' || letras[i] == 'Z'){
                System.out.print(letras[i]);
            }
            if(letras[i] == ' '){
                System.out.print(letras[i]);
            }
            if(letras[i] == ','){
                System.out.print(letras[i]);
            }
            if(letras[i] == '?'){
                System.out.print(letras[i]);
            }
            if(letras[i] == '.'){
                System.out.print(letras[i]);
            }
            if(letras[i] == '!'){
                System.out.print(letras[i]);
            }
        }
        System.out.println();
        System.out.println("Obrigao por utilizar nosso conversor!");
    }
    
}
