//o programa pede para ser inserido o peso e altura do usuário, armazena essas informações, realiza o cálculo do IMC e apresenta a situação do usuário
/*situações
imc <16 = subpeso severo
imc 16 a 19,9 = subpeso
imc 20 a 24,9 = normal
imc 25 a 29,9 = sobrepeso
imc 30 a 39,9 = obeso
imc >40 = obeso mórbido
*/
package calculoimc;

import java.util.Scanner;


public class CalculoIMC {

 
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double peso, altura;
       String situacao = null;
       
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                            Cálculo de IMC"                                                          );
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("Bem vindo ao novo programa para cálculo de IMC da Mandic, queremos que todos os funcionários se mantenham saudáveis!");
        System.out.println("Digite seu peso:");
        peso = entrada.nextDouble();//guardando a informção do peso do usuário
        System.out.println("Digite aqui sua altura separada por vírgula(exemplo: 1,80):");
        altura = entrada.nextDouble();//guardando a informação da altura do usuário
        double imc = peso/Math.pow(altura,2);
        System.out.printf("Seu IMC é igual a: %.2f \n",+imc); 
        
        //definindo as condições para cada situação
        if(imc < 16){
            situacao = "Subpeso severo. Procure assistência médica e tente realizar refeições frequentes ricas em nutrientes e proteínas.";
        }
         if(imc >= 16 && imc < 20){
            situacao = "Subpeso. Procure realizar refeições frequentes e ricas em nutrientes, a prática de exercícios moderados também podem ajudar a desenvolver músculos.";
        }
          if(imc >= 20 && imc < 25){
            situacao = "Normal. Está no seu peso ideal, tente se manter sempre saudável.";
        }
          if(imc >= 25 && imc < 30){
          situacao = "Sobrepeso. Procure consumir menos calorias e se alimentar de forma mais saudável, tente realizar mais exercícios e controlar o peso para reduzir massa corporal.";
        }
          if(imc >= 30 && imc < 40){
          situacao = "Obeso. Tente realizar uma dieta saudável, rica em proteínas e baixas calorias, praticar exercícios para a queima de calorias é muito benéfico.";
        }
          if( imc >= 40){
          situacao = "Obeso Mórbido. Procure assistência médica para realizar reeducação alimentar e uma dieta mais saudável de acordo com seu estado. Não realize dietas por conta própria. A prática de atividades físicas deve ser indicada pelo médico";
        }
          
          System.out.println("Sua situação é: "+situacao);
          System.out.println("Obrigado por participar!");
        
    }
    
}
