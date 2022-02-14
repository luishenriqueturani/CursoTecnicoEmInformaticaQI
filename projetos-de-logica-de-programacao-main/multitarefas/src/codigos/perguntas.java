package codigos;

/**
 *
 * @author Luís Henrique
 * @since 14/12/17
 */
import java.util.*;
public class perguntas {
    public void perguntas(){
    Scanner leia=new Scanner(System.in);
        
        //variáveis
        String login; 
        String resposta, gabarito;
        int senha;
        int acertos=0;
        int erros=0;
        int contsenha=1;
        int contid=1;
        
        //ID e Senha
        System.out.print("Digite seu id: ");
        login =leia.next();
        while(!(login.equals("Luis"))){
            switch(contid){    
                case 1:
                    System.out.print("Id errado!\nTente denovo: ");
                    login =leia.next();
                    contid++;
                    break;    
                case 2:
                    System.out.print("Novamente está errado!\nTente denovo: ");
                    login =leia.next();
                    contid++;
                    break;    
                case 3:
                    System.out.print("Esquecer-se do próprio Id é foda!\nTente denovo: ");
                    login =leia.next();
                    contid++;
                    break;    
                case 4:
                    System.out.print("Quer ajuda de Universitário?!\nTente denovo: ");
                    login =leia.next();
                    contid++;
                    break;    
                case 5:
                    System.out.println("Id Inválido!");
                    System.exit(0);
            }
        }
        System.out.print("Digite sua senha: ");
        senha=leia.nextInt();
        while(senha!=12345){
            switch(contsenha){
                case 1:    
                    System.out.print("Senha errada!\nTente denovo: ");
                    senha=leia.nextInt();
                    contsenha++;
                    break;    
                case 2:
                    System.out.print("Novamente está errado!\nTente denovo: ");
                    senha=leia.nextInt();
                    contsenha++;
                    break;    
                case 3:
                    System.out.print("Você se esqueceu?!\nTente denovo: ");
                    senha=leia.nextInt();
                    contsenha++;
                    break;    
                case 4:
                    System.out.print("Minha vó erra menos que isso!\nTente denovo: ");
                    senha=leia.nextInt();
                    contsenha++;
                    break;    
                case 5:
                    System.out.println("Senha inválida.");
                    System.exit(0);
                
            }
        }
        System.out.println("\n\n");
        //Questão 1
        System.out.println("Questão 1\nNormalmente, quantos litros de sangue uma pessoa tem?\nEm média, quantos são retirados numa doação de sangue? ");
        System.out.println("a) Tem entre 2 a 4 litros. São retirados 450 mililitros");
        System.out.println("b) Tem entre 4 a 6 litros. São retirados 450 mililitros");
        System.out.println("c) Tem 10 litros. São retirados 2 litros");
        System.out.println("d) Tem 7 litros. São retirados 1,5 litros");
        System.out.println("e) Tem 0,5 litros. São retirados 0,5 litros");
        System.out.print("Resposta? ");
        resposta=leia.next();
        if((resposta.equals("b"))||(resposta.equals("B"))){
            System.out.println("Está correto");
            acertos++;
        }//questão 1
        else{
            System.out.println("Você errou, a resposta certa é a B, Tem entre 4 a 6 litros. São retirados 450 mililitros.");
            erros++;
        }//questão 1
        
        System.out.println("\n\n");
        
        //Questão 2
        System.out.println("Questão 2 (UFPR-2009)\nNa década de 80 do século passado, foi inaugurado o primeiro cabo submarino feito de fibra ótica.\nAtualmente todos os continentes da Terra já estão conectados por cabos submarinos feitos dessa fibra.\nNa comunicação por fibra ótica, o sinal se propaga obedecendo a um importante fenômeno da ótica geométrica, qual é esse fenômeno?  ");
        System.out.println("a) Refração");
        System.out.println("b) Reflexão interna total ");
        System.out.println("c) Dispersão");
        System.out.println("d) Reflexão difusa");
        System.out.println("e) Absorção");
        System.out.print("Resposta? ");
        resposta=leia.next();
        if((resposta.equals("b"))||(resposta.equals("B"))){
            System.out.println("Está correto");
            acertos++;
        }//questão 2
        else{
            System.out.println("Você errou, a resposta certa é B, Reflexão interna total.");
            erros++;
        }//questão 2
        
        System.out.println("\n\n");
        
        //Questão 3
        System.out.println("Questão 3 (UFPR-2009)\nUma determinada região apresentou, nos últimos cinco meses, os seguintes valores (fornecidos em mm) para a precipitação pluviométrica média:\nJunho 32, julho 34, agosto 27, setembro 29, outubro 28. \nA média, a mediana e a variância do conjunto de valores acima são, respectivamente: ");
        System.out.println("a)	30, 27 e 6,8");
        System.out.println("b)	27, 30 e 2,4");
        System.out.println("c)	30, 29 e 6,8");
        System.out.println("d)	29, 30 e 7,0");
        System.out.println("e)	30, 29 e 7,0");
        System.out.print("Resposta? ");
        resposta=leia.next();
        if((resposta.equals("c"))||(resposta.equals("C"))){
            System.out.println("Está correto");
            acertos++;
        }//questão 3
        else{
            System.out.println("Você errou, a resposta certa é C, 30, 29 e 6,8.");
            erros++;
        }//questão 3
        
        System.out.println("\n\n");
        
        //Questão 4
        System.out.println("Questão 4(PUC-RIO 2010)\nEm uma turma de Ciências da Computação formada de 40 rapazes e 40 moças, tem-se a seguinte estatística:\n20% dos rapazes são fumantes; 30% das moças são fumantes.\nLogo, a porcentagem dos que não fumam na turma é de:  ");
        System.out.println("a)	25%");
        System.out.println("b)	50%");
        System.out.println("c)	60%");
        System.out.println("d)	65%");
        System.out.println("e)	75%");
        System.out.print("Resposta? ");
        resposta=leia.next();
        if((resposta.equals("e"))||(resposta.equals("E"))){
            System.out.println("Está correto");
            acertos++;
        }//questão 4
        else{
            System.out.println("Você errou, a resposta certa é E, 75%.");
            erros++;
        }//questão 4
        
        System.out.println("\n\n");
        
        //Questão 5
        System.out.println("Questão 5(PUC-RIO 2009)\nEm um viveiro há várias araras.\n60% das araras são azuis,\n40% das araras são vermelhas,\n40% das araras azuis têm bico branco,\n30% das araras vermelhas têm bico branco.\nQue porcentagem das araras do viveiro tem bico branco? ");
        System.out.println("a)	10%");
        System.out.println("b)	12%");
        System.out.println("c)	24%");
        System.out.println("d)	36%");
        System.out.println("e)	40%");
        System.out.print("Resposta? ");
        resposta=leia.next();
        if((resposta.equals("d"))||(resposta.equals("D"))){
            System.out.println("Está correto");
            acertos++;
        }//questão 5
        else{
            System.out.println("Você errou, a resposta certa é D, 36%.");
            erros++;
        }//questão 5
        
        System.out.println("\n\n");
        
        //Questão 6
        System.out.println("Questão 6(PUC-RIO 2009)\nJoão recebeu um aumento de 10% e com isso seu salário chegou a R$1.320,00.\nO salário de João antes do aumento era igual a?  ");
        System.out.println("a)	R$1.188,00");
        System.out.println("b)	R$1.200,00");
        System.out.println("c)	R$1.220,00");
        System.out.println("d)	R$1.310,00");
        System.out.println("e)	R$1.452,00");
        System.out.print("Resposta? ");
        resposta=leia.next();
        if((resposta.equals("b"))||(resposta.equals("B"))){
            System.out.println("Está correto");
            acertos++;
        }//questão 6
        else{
            System.out.println("Você errou, a resposta certa é B, R$1.200,00.");
            erros++;
        }//questão 6
        
        System.out.println("\n\n");
        
        //Questão 7
        System.out.println("Questão 7(PUC-SP 2010)\nUm aluno prestou vestibular em apenas duas Universidades.\nSuponha que, em uma delas, a probabilidade de que ele seja aprovado é de 30%, enquanto na outra, pelo fato de a prova ter sido mais fácil, a probabilidade de sua aprovação sobe para 40%. \nNessas condições, a probabilidade de que esse aluno seja aprovado em pelo menos uma dessas Universidades é de:  ");
        System.out.println("a)	70%");
        System.out.println("b)	68%");
        System.out.println("c)	60%");
        System.out.println("d)	58%");
        System.out.println("e)	52%");
        System.out.print("Resposta? ");
        resposta=leia.next();
        if((resposta.equals("d"))||(resposta.equals("D"))){
            System.out.println("Está correto");
            acertos++;
        }//questão 7
        else{
            System.out.println("Você errou, a resposta certa é D, 58%.");
            erros++;
        }//questão 7
        
        System.out.println("\n\n");
        
        //Questão 8
        System.out.println("Questão 8(PUC-RIO 2010)\nQuatro moedas são lançadas simultaneamente.\nQual é a probabilidade de ocorrer coroa em uma só moeda? ");
        System.out.println("a)	1/8");
        System.out.println("b)	2/9");
        System.out.println("c)	1/4");
        System.out.println("d)	1/3");
        System.out.println("e)	3/8");
        System.out.print("Resposta? ");
        resposta=leia.next();
        if((resposta.equals("c"))||(resposta.equals("C"))){
            System.out.println("Está correto");
            acertos++;
        }//questão 8
        else{
            System.out.println("Você errou, a resposta certa é C, 1/4.");
            erros++;
        }//questão 8
        
        System.out.println("\n\n");
        
        //Questão 9
        System.out.println("Questão 9(PUC-RIO 2009)\nJogamos dois dados comuns. \nQual a probabilidade de que o total de pontos seja igual a 10? ");
        System.out.println("a)	1/12");
        System.out.println("b)	1/11");
        System.out.println("c)	1/10");
        System.out.println("d)	2/23");
        System.out.println("e)	1/6");
        System.out.print("Resposta? ");
        resposta=leia.next();
        if((resposta.equals("a"))||(resposta.equals("A"))){
            System.out.println("Está correto");
            acertos++;
        }//questão 9
        else{
            System.out.println("Você errou, a resposta certa é A, 1/12.");
            erros++;
        }//questão 9
        
        System.out.println("\n\n");
        
        //Questão 10
        System.out.println("Questão 10(Enem 2010)\nEm uma reserva florestal existem 263 espécies de peixes,\n122 espécies de mamíferos, 93 espécies de répteis,\n1 132 espécies de borboletas e 656 espécies de aves.\nSe uma espécie animal for capturada ao acaso, qual a probabilidade de ser uma borboleta? ");
        System.out.println("a)	63,31%");
        System.out.println("b)	60,18%");
        System.out.println("c)	56,52%");
        System.out.println("d)	49,96%");
        System.out.println("e)	43,27%");
        System.out.print("Resposta? ");
        resposta=leia.next();
        if((resposta.equals("d"))||(resposta.equals("D"))){
            System.out.println("Está correto");
            acertos++;
        }//questão 10
        else{
            System.out.println("Você errou, a resposta certa é D, 49,96%.");
            erros++;
        }//questão 10
        
        System.out.println("\n\n");
        
        System.out.println("Você acertou "+acertos+" vezes e errou "+erros+" vezes.");
        
        switch(acertos){
            case 0:
                System.out.println("Você errou todas, precisa melhorar muito, por isso foi reprovado.");
                break;
            case 1:
                System.out.println("Você acertou apenas uma, está lonje de ser aprovado.");
                break;
            case 2:
                System.out.println("Você acertou 2, é um péssimo resultado e está reprovado.");
                break;
            case 3:
                System.out.println("Você foi muito mal acertando apenas 3. Reprovado.");
                break;
            case 4:
                System.out.println("É um resultado bem ruim esse, 4 acertos, po isso foi reprovado.");
                break;
            case 5:
                System.out.println("Foi quase, 5 acertos, porém o quase não basta para ser aprovado.");
                break;
            case 6:
                System.out.println("Você acertou 6 questões e foi aprovado, mas foi no limite.");
                break;
            case 7:
                System.out.println("Você foi bem, acertou 7, parabéns, aprovado.");
                break;
            case 8:
                System.out.println("Você foi muito bem, 8 acertos, parabéns pelo excelente trabalho.");
                break;
            case 9:
                System.out.println("Por causa de um você não acertou todas, parabéns.");
                break;
            case 10:
                System.out.println("Perfeito, você acertou tudo e está aprovado!");
                break;
        }//switch
        
        System.out.print("Deseja ver o gabarito? ");
        gabarito=leia.next();
        if((gabarito.equals("sim"))||(gabarito.equals("Sim"))){
            System.out.println("Questão 1: B, Tem entre 4 a 6 litros. São retirados 450 mililitros.\nQuestão 2: B, Reflexão interna total.\nQuestão 3: C, 30, 29 e 6,8  ");
            System.out.println("Questão 4: E, 75%.\nQuestão 5: D, 36%.\nQuestão 6: B, R$ 1.200,00.\nQuestão 7: D, 58%.\nQuestão 8: C, 1/4.\nQuestão 9: A, 1/12.\nQuestão 10: D, 49,96%.");
        }
    }
}
