package model;


import controller.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import view.GUI;

/**
 *
 * @author luis_
 */
public class CRUD {
    GUI telas = new GUI();
    
    //método de inserção de dados na tabela
    public void createCadastro(Dados d){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //Pega o comando sql para executar no bd
            stmt = con.prepareCall("INSERT INTO cadastro(id,vaga,nome,rg,telefone,placa,marca,modelo,cor,hora) VALUES(default,?,?,?,?,?,?,?,?,?)");
            //insere na posição especificada cada valor da variável
            stmt.setInt(1, d.getVaga());
            stmt.setString(2, d.getNome());
            stmt.setString(3, d.getRg());
            stmt.setString(4, d.getTelefone());
            stmt.setString(5, d.getPlaca());
            stmt.setString(6, d.getMarca());
            stmt.setString(7, d.getModelo());
            stmt.setString(8, d.getCor());
            stmt.setInt(9, d.getHora());
            
            //executa o comando
            stmt.executeUpdate();
            
            //mostra uma mensagem de sucesso
            telas.criarMensagem("Salvo com sucesso!", "Salvo", 1);
            
        } catch (SQLException ex) {
            //Mostra mensagem de erro caso caia no exception, isso é, caso o comando esteja errado
            telas.criarMensagem("Erro ao salvar! Erro: "+ ex, "Erro!", 0);
        }finally{// Encerra a conexão após fazer tudo, seja lá o que for
            ConnectionFactory.closeConnection(con, stmt);
        }
    }//fecha createCadastro
    
    // cria um método de leitura de bd
    public List<Dados> read(){
        //Chama os objetos
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //Cria uma ArrayList
        List<Dados> cadastro = new ArrayList<>();
        
        try {
            //Recebe o comando sql
            stmt = con.prepareStatement("SELECT * FROM cadastro");
            //executa o comando
            rs = stmt.executeQuery();
            
            //enquanto ouver um registro no banco...
            while(rs.next()){
                //Irá criar  novo objeto...
                Dados d = new Dados();
                // e irá adicionar o que há no bd nas variáveis...
                d.setId(rs.getInt("id"));
                d.setVaga(rs.getInt("vaga"));
                d.setNome(rs.getString("nome"));
                d.setRg(rs.getString("rg"));
                d.setTelefone(rs.getString("telefone"));
                d.setPlaca(rs.getString("placa"));
                d.setMarca(rs.getString("marca"));
                d.setModelo(rs.getString("modelo"));
                d.setCor(rs.getString("cor"));
                d.setHora(rs.getInt("hora"));
                
                //e cadastrar no ArrayList retornando-o no final do método
                cadastro.add(d);
                
            }
            //Captura erro na query e...
        } catch (SQLException ex) {
            //mostra mensagem de erro com o erro
            telas.criarMensagem("Erro: "+ex, "Erro", 0);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        //retorno do ArrayList
        return cadastro;
    }//termina read
    
    // cria um método de leitura de bd
    public List<Dados> readUm(Dados d){
        //Chama os objetos
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //Cria uma ArrayList
        List<Dados> cadastro = new ArrayList<>();
        
        try {
            //Recebe o comando sql
            stmt = con.prepareStatement("SELECT * FROM cadastro WHERE id = ?");
            //busca id para a pesquisa
            stmt.setInt(1, d.getId());
            //executa o comando
            rs = stmt.executeQuery();
            
            //enquanto houver um registro no banco...
            while(rs.next()){
                
                // e irá adicionar o que há no bd nas variáveis...
                d.setId(rs.getInt("id"));
                d.setVaga(rs.getInt("vaga"));
                d.setNome(rs.getString("nome"));
                d.setRg(rs.getString("rg"));
                d.setTelefone(rs.getString("telefone"));
                d.setPlaca(rs.getString("placa"));
                d.setMarca(rs.getString("marca"));
                d.setModelo(rs.getString("modelo"));
                d.setCor(rs.getString("cor"));
                d.setHora(rs.getInt("hora"));
                
                //e cadastrar no ArrayList retornando-o no final do método
                cadastro.add(d);
                
            }
            //Captura erro na query e...
        } catch (SQLException ex) {
            //mostra mensagem de erro com o erro
            telas.criarMensagem("Erro: "+ex, "Erro", 0);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        //retorno do ArrayList
        return cadastro;
    }//termina readUm
    
    //cria método de update de bd
    public void update(Dados d){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //Pega o comando sql para executar no bd
            stmt = con.prepareCall("UPDATE cadastro SET nome = ? ,rg = ? ,telefone = ? ,placa = ? ,marca = ? ,modelo = ? ,cor = ? ,hora = ? WHERE vaga = ? ");
            //insere na posição especificada cada valor da variável
            stmt.setInt(1, d.getVaga());
            stmt.setString(9, d.getNome());
            stmt.setString(2, d.getRg());
            stmt.setString(3, d.getTelefone());
            stmt.setString(4, d.getPlaca());
            stmt.setString(5, d.getMarca());
            stmt.setString(6, d.getModelo());
            stmt.setString(7, d.getCor());
            stmt.setInt(8, d.getHora());
            
            //executa o comando
            stmt.executeUpdate();
            
            //mostra uma mensagem de sucesso
            telas.criarMensagem("Atualizado com sucesso!", "Salvo", 1);
            
        } catch (SQLException ex) {
            //Mostra mensagem de erro caso caia no exception, isso é, caso o comando esteja errado
            telas.criarMensagem("Erro: "+ ex, "Erro!", 0);
        }finally{// Encerra a conexão após fazer tudo, seja lá o que for
            ConnectionFactory.closeConnection(con, stmt);
        }
    }//fecha update
    
    //cria método de deletar dados do bd
    public void delete(Dados d){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            //Pega o comando sql para executar no bd
            stmt = con.prepareCall("DELETE FROM cadastro WHERE id = ? ");
            //pega o valor para usar na query
            stmt.setInt(1, d.getId());
            
            //executa o comando
            stmt.executeUpdate();
            
            //mostra uma mensagem de sucesso
            telas.criarMensagem("Excluido com sucesso!", "Salvo", 1);
            
        } catch (SQLException ex) {
            //Mostra mensagem de erro caso caia no exception, isso é, caso o comando esteja errado
            telas.criarMensagem("Erro: "+ ex, "Erro!", 0);
        }finally{// Encerra a conexão após fazer tudo, seja lá o que for
            ConnectionFactory.closeConnection(con, stmt);
        }
    }//fecha delete
    
    //método de ler banco para modificar a situação da vaga
    public List<Dados> readSituacaoVaga(){
        //Chama os objetos
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //Cria uma ArrayList
        List<Dados> vaga = new ArrayList<>();
        
        try {
            //Recebe o comando sql
            stmt = con.prepareStatement("SELECT vaga FROM cadastro");
            //executa o comando
            rs = stmt.executeQuery();
            
            //enquanto ouver um registro no banco...
            while(rs.next()){
                //Irá criar  novo objeto...
                Dados d = new Dados();
                // e irá adicionar o que há no bd vaga na variável...
                d.setVaga(rs.getInt("vaga"));
                
                //e cadastrar no ArrayList retornando-o no final do método
                vaga.add(d);
                
            }
        //Captura erro na query e...
        } catch (SQLException ex) {
            //mostra mensagem de erro com o erro
            telas.criarMensagem("Erro: "+ex, "Erro", 0);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        //retorno do ArrayList
        return vaga;
    }
    
    
    
}
