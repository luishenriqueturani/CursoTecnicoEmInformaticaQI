package model;

import controller.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import view.GUI;

/**
 *
 * @author luis_
 */
public class UsuarioCRUD {
    GUI telas = new GUI();
    // cria um método de leitura de bd
    public boolean checkLogin(String id, String senha){
        //Chama os objetos
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        boolean check = false;
        
        try {
            //Recebe o comando sql
            stmt = con.prepareStatement("SELECT * FROM secure WHERE id = ? and senha = ?");
            stmt.setString(1, id);
            stmt.setString(2, senha);
            //executa o comando
            rs = stmt.executeQuery();
            
            if(rs.next()){
                check = true;
            }
            
            //Captura erro na query e...
        } catch (SQLException ex) {
            //mostra mensagem de erro com o erro
            telas.criarMensagem("Erro: "+ex, "Erro", 0);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }
    
    //método de alterar id e senha
    public void updateIdSenha(Usuario u, String idAntigo){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            //Pega o comando sql para executar no bd
            stmt = con.prepareCall("UPDATE secure SET id = ?, senha = ? WHERE id = ? ");
            //insere na posição especificada cada valor da variável
            stmt.setString(1, u.getId());
            stmt.setString(2, u.getSenha());
            stmt.setString(3, idAntigo);
            
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
    
    
    
    
}
