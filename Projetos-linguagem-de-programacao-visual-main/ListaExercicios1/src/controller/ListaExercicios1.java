package controller;

import view.Tela;

/**
 *
 * @author Luís Henrique
 */
public class ListaExercicios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objetos
        Exercicio1 e1 = new Exercicio1();
        Exercicio2 e2 = new Exercicio2();
        Exercicio3 e3 = new Exercicio3();
        Exercicio4 e4 = new Exercicio4();
        Exercicio5 e5 = new Exercicio5();
        Exercicio6 e6 = new Exercicio6();
        Exercicio7 e7 = new Exercicio7();
        Exercicio8 e8 = new Exercicio8();
        Tela t = new Tela();
        
        //Atributos globais
        boolean menu = true;
        
        while(menu){
            try {
                //cria o menu principal
                switch(Integer.parseInt(t.criarMenu())){
                    case 1:
                        //exercício 1
                        e1.iniciarExercício();
                        break;
                    case 2:
                        //exercício 2
                        e2.iniciarExercicio2();
                        break;
                    case 3:
                        //exercício 3
                        e3.iniciarExercicio3();
                        break;
                    case 4:
                        //exercício 4
                        e4.iniciarExercicio4();
                        break;
                    case 5:
                        //exercício 5
                        e5.iniciarExercicio5();
                        break;
                    case 6:
                        //exercício 6
                        e6.iniciarExercicio6();
                        break;
                    case 7:
                        //exercício 7
                        e7.iniciarExercicio7();
                        break;
                    case 8:
                        //exercício 8
                        e8.iniciarExercicio8();
                        break;
                    case 0:
                        //fechar
                        if(t.confirmarFechar() == 0){
                            menu = false;
                            t.mostrarMensagem("Fechando o App...", "Fechando", 1);
                        }
                        break;
                    default:
                        // informar valor
                        t.mostrarMensagem("Erro de digitação!!!\nDigite um valor válido.", "Atenção", 2);
                        break;
                }



            } catch (Exception e) {
                t.mostrarMensagem("Erro de digitação, digite apenas números", "Atenção", 2);
            }
        }
        
    }
    
}
