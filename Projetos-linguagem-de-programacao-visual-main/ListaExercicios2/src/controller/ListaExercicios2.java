package controller;

import view.Tela;

/**
 *
 * @author luis_
 */
public class ListaExercicios2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Exercicio1 e1 = new Exercicio1();
        Exercicio2 e2 = new Exercicio2();
        Exercicio3 e3 = new Exercicio3();
        Exercicio4 e4 = new Exercicio4();
        Exercicio5 e5 = new Exercicio5();
        Exercicio6 e6 = new Exercicio6();
        Exercicio7 e7 = new Exercicio7();
        Exercicio8 e8 = new Exercicio8();
        Exercicio9 e9 = new Exercicio9();
        Exercicio10 e10 = new Exercicio10();
        Tela t = new Tela();
        
        //atributos globais
        boolean menu = true;
        
        //enquanto menu for true ficará aberto o menu
        while(menu){
            //captura erros de digitação
            try {
                //cria menu passando já a opção que o usuário digitar
                switch(Integer.parseInt(t.criarMenu())){
                    case 0:
                        //sair
                        if(t.confirmarFechar() == 0){
                            menu = false;
                            t.mostrarMensagem("Fechando o App...\nObrigado por brincar aqui.", "Fechando", 1);
                        }
                        break;
                    case 1: 
                        //exercicio 1
                        e1.iniciarExercicio1();
                        break;
                    case 2: 
                        //exercicio 2
                        e2.iniciarExercicio2();
                        break;
                    case 3: 
                        //exercicio 3
                        e3.iniciarExercicio3();
                        break;
                    case 4: 
                        //exercicio 4
                        e4.iniciarExercicio4();
                        break;
                    case 5: 
                        //exercicio 5
                        e5.iniciarExercicio5();
                        break;
                    case 6: 
                        //exercicio 6
                        e6.iniciarExercicio6();
                        break;
                    case 7: 
                        //exercicio 7
                        e7.iniciarExercicio7();
                        break;
                    case 8: 
                        //exercicio 8
                        e8.iniciarExercicio8();
                        break;
                    case 9: 
                        //exercicio 9
                        e9.iniciarExercicio9();
                        break;
                    case 10: 
                        //exercicio 10
                        e10.iniciarExercicio10();
                        break;
                    default:
                        //erros
                        t.mostrarMensagem("Erro de digitação, escolha uma opção válida!", "Errou", 0);
                        break;
                }
            } catch (Exception e) {
                t.mostrarMensagem("Erro de digitação, digite apenas números", "Errou", 0);
            }
        }
        
        
        
    }
    
}
