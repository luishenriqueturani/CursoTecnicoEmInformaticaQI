package controller;

/**
 *
 * @author luis_
 */
import java.util.ArrayList;
import java.util.List;
import model.Contato;
import view.Tela;

public class Cadastro {

    Tela t = new Tela();
    Contato c = new Contato();

    //Declaração do ArrayList e List criando uma lista vazia usando da classe contato
    List<Contato> list = new ArrayList<>();

    //Atributos globais
    private String id = "luis", senha = "1234";
    private String nome = "", marca = "", placa = "", modelo = "", cor = "", aux, rg = "", telefone = "";
    private int hora = 0, numAux;
    private double valor;
    private boolean vaga, controle = true;

    //inicia a aplicação
    public void iniciarApp() {
        //atributos locais
        int op;
        boolean menu = false;

        //Autenticação para iniciar o app
        try {
            //enquanto o menu for false fica preso no while
            while (!menu) {
                //informa o id
                aux = t.informarDado("ID", "ID");
                //compara o id
                if (aux.equals(id)) {
                    //informa a senha
                    aux = t.informarDado("senha", "senha");
                    //compara a senha
                    if (aux.equals(senha)) {
                        //menu recebe true para sair do while
                        menu = true;
                        //mostra mensagem de boas vindas
                        t.mostrarMensagem("Bem Vindo", "Boas vindas", 1);
                    } else {
                        //mostra mensagem de senha errada
                        t.mostrarMensagem("Senha inválida!", "Errou", 0);
                    }
                } else {
                    //mostra mensagem de id errado
                    t.mostrarMensagem("ID errado!", "Errou", 0);
                }//fecha if e else comparadores de id e senha
            }//fecha while de id e senha 
        } catch (Exception e) {
            t.mostrarMensagem("Erro de digitação", "Errou", 0);
        }//fecha try e catch de id e senha

        //Começa o menu
        while (menu) {

            try {
                op = Integer.parseInt(t.criarMenu());
                switch (op) {
                    case 0:
                        //Encerra app, se tela confirmarFechar for diferente de 0 então permanece no menu, senão...
                        if (t.confirmarFechar() == 0) {
                            //mostra mensagem de encerramento do app
                            t.mostrarMensagem("Encerrando o sistema...", "Atenção", 1);
                            //menu recebe false para sair do while e encerrar o app
                            menu = false;
                        }
                        break;
                    case 1:
                        //vê as vagas
                        mostrarVagas();
                        break;
                    case 2:
                        //cadastra vagas
                        cadastrarCliente();
                        break;
                    case 3:
                        //dar baixa
                        sairCliente();
                        break;
                    case 4:
                        //tabela de preços
                        tabelaPrecos();
                        break;
                    default:
                        //Informa erro de escolha de números do menu
                        t.mostrarMensagem("Erro de digitação, escolha uma opção válida!", "Erro de digitação", 0);
                        break;
                }

            } catch (Exception e) {
                //mostra mensagem de erro
                t.mostrarMensagem("Erro de digitação! Use apenas números!", "Erro de digitação", 0);
            }

        }

    }//fecha o iniciarApp

    //cria o método de cadastrar
    private void cadastrarCliente() {

        if ((list.size() + 1) >= 30) {
            t.mostrarMensagem("Impocível receber mais clientes, não há vagas!", "Atenção!", 2);
        } else {
            //Se não houver dados nas variáveis poderá entrar com dados
            if (nome.equals("")) {
                nome = t.informarDado("nome", "nome");
            }
            if (rg.equals("")) {
                rg = t.informarDado("RG", "RG");
            }
            if (telefone.equals("")) {
                telefone = t.informarDado("telefone", "telefone");
            }
            if (marca.equals("")) {
                marca = t.informarDado("marca do carro", "marca do carro");
            }
            if (modelo.equals("")) {
                modelo = t.informarDado("modelo do carro", "modelo");
            }
            if (cor.equals("")) {
                cor = t.informarDado("cor do carro", "cor");
            }
            if (placa.equals("")) {
                placa = t.informarDado("placa", "placa");
            }
            if(hora == 0){
                hora = Integer.parseInt(t.informarDado("horário de entreda,\nconsiderando que o horário de atendimento é das 6 horas às 24 horas.", "hora"));
                if(hora < 6 || hora > 24 ){
                    hora = 0;
                }
            }

            //Se não foi deixado campos em branco partirá para o cadastro, senão...
            if (!nome.equals("") && !rg.equals("") && !telefone.equals("") && !marca.equals("") && !modelo.equals("") && !cor.equals("") && !placa.equals("") && hora!= 0) {
                //chamando objeto para realizar o cadastro
                Contato c = new Contato();
                //salva os dados das variáveis nas variáveis da classe Contato
                c.setCor(cor);
                c.setMarca(marca);
                c.setModelo(modelo);
                c.setNome(nome);
                c.setPlaca(placa);
                c.setRg(rg);
                c.setTelefone(telefone);
                c.setHora(hora);
                
                //Faz com que a situação da vaga seja verdadeiro, dizendo que está ocupado
                c.setVaga(true);
                //Guarda cadastro no ArrayList
                list.add(c);

                t.mostrarMensagem("Cadastro realizado com sucesso", "Atenção", 1);
                nome = "";
                rg = "";
                telefone = "";
                placa = "";
                modelo = "";
                marca = "";
                cor = "";
                hora = 0;

            } else {
                //Mensagem avisando sobre campos vazios
                t.mostrarMensagem("Preencha todos os campos", "Atenção", 2);
                //chama recursivamente a classe para refazer o cadastro
                cadastrarCliente();
            }//encerrando if else
        }

    }//fecha cadastrarCliente

    //cria método de sairCliente
    private void sairCliente() {
        //verifica se há registros na lista
        if (list.size() > 0) {
            //String local para receber as informações necessárias para mostrar na tela mais tarde
            String registro = "";
            //Percorre list achando os dados para serem motrados
            for (int i = 0; i < list.size(); i++) {
                //concatena os rresultados na String
                registro += "ID: " + (i + 1) + "\n"
                        + "Placa: " + list.get(i).getPlaca() + "\n"
                        + "Nome: " + list.get(i).getNome() + "\n"
                        + "RG: " + list.get(i).getRg() + "\n"
                        + "Hora de entrada: "+ list.get(i).getHora()+ "\n"
                        + "\n-------------------------\n";
            }
            //mostra os resultados
            t.mostrarMensagem("Todos registrados no momento.\n" + registro, "Cadastrados", 1);
            
            //pede id que será apagado
            int numId = Integer.parseInt(t.informarDado("ID para ser apagado", "ID"));
            
            //testa o número para ver se é o número válido
            if (list.size() >= numId && numId > 0) {
                
                do{//Executa os códigos entre as chaves
                    //Recebe valor do usuário
                    numAux = Integer.parseInt(t.informarDado("horário de saída", "Hora"));
                    //Se o usuário digitar um número que fuja de 0 à 24 cai no else mostrando mensagem de erro e repete o código
                    if(numAux > 6 || numAux < 24){
                        //verifica se o horário de saída é maior ou igual ao de entrada, não pode ser digitado um menor
                        if(list.get(numId-1).getHora() <= numAux){
                            //se digitar um número correto controle vira false caindo fora do while
                            controle = false;
                        }else{//Mensagem de erro
                            t.mostrarMensagem("Número inválido, o horário de saída não pode ser menor\ndo que o horário de entreada"
                                    , "Errou!", 0);
                        }
                    }else{//Mensagem de erro
                        t.mostrarMensagem("Número inválido! Escolha um número no padrão de 24 horas", "Errou!", 0);
                    }
                }while(controle);
                //controle recebe true para ser usado novamente
                controle = true;
                
                if((numAux-list.get(numId-1).getHora()) > 11){
                    valor = 50;
                }else{
                    valor = (numAux - list.get(numId-1).getHora()) * 5;
                }
                
                
                t.mostrarMensagem("Nome: "+list.get(numId-1).getNome()+"\n"+
                        "RG: "+list.get(numId-1).getRg()+"\n"+
                        "Telefone: "+list.get(numId-1).getTelefone()+"\n"+
                        "Placa: "+list.get(numId-1).getPlaca()+"\n"+
                        "Marca: "+list.get(numId-1).getMarca()+"\n"+
                        "Modelo: "+list.get(numId-1).getModelo()+"\n"+
                        "Cor: "+list.get(numId-1).getCor()+"\n"
                        + "Hora de entrada: "+list.get(numId-1).getHora()+ "   Hora de saída: "+ numAux+"\n"
                        + "Valor a pagar: R$ "+valor
                        , "Nota Fiscal", 1);
                //Remove os registros, -1 é uma compensação
                list.remove(numId - 1);
                t.mostrarMensagem("Registro apagado, vaga agora livre", "Atenção", 2);
            } else {
                t.mostrarMensagem("ID inesistente", "Errou!", 0);
            }

        } else {
            t.mostrarMensagem("Não há registros!", "Errou", 0);
        }//Acaba if else
    }//fecha sairCliente

    //Método que monta as vagas do estacionamento
    public void mostrarVagas() {
        t.mostrarMensagem("Total de vagas: 30\nVagas ocupadas: " + list.size(), "Vagas", 1);
    }//fecha vagas
    
    //mostra os precos
    public void tabelaPrecos(){
        t.mostrarMensagem("R$ 5,00 por hora, ou se ficar menos de 1 hora.\n"
                + "R$ 50,00 por ficar 12 horas ou mais.\nNão é permitido ficar mais de 18 horas,\n"
                + "considerando que o horário de atendimento é das 6 horas às 24 horas.", "Preços", 1);
    }//fecha tabelaPrecos

}
