
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import connection.ConnectionFactory;
import java.util.ArrayList;
import model.bean.ProfissionalSaude;
import java.sql.ResultSet;

public class ProfissionalSaudeDAO {
    
    private Connection con = null;
    
    public ProfissionalSaudeDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean create(ProfissionalSaude profissionalSaude){
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("INSERT INTO profissional_saude (registro_profissional, cpf, nome) VALUES (?, ?, ?)");
            stmt.setString(1, profissionalSaude.getRegistroProfissional());
            stmt.setString(2, profissionalSaude.getCpf());
            stmt.setString(3, profissionalSaude.getNome());
            stmt.executeUpdate();
            return true;
        }catch(SQLException ex){
            System.err.println("Erro ao salvar: " + ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<ProfissionalSaude> read(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<ProfissionalSaude> listaProfissionalSaude = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT * FROM profissional_saude ORDER by id");
            rs = stmt.executeQuery();
            while(rs.next()){
                ProfissionalSaude profissionalsaude = new ProfissionalSaude();
                profissionalsaude.setRegistroProfissional(rs.getString("registro_profissional"));
                profissionalsaude.setId(rs.getInt("id"));
                profissionalsaude.setCpf(rs.getString("cpf"));
                profissionalsaude.setNome(rs.getString("nome"));
                listaProfissionalSaude.add(profissionalsaude);
            }
        } catch(SQLException ex){
            System.err.println("Erro ao ler: " + ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaProfissionalSaude;
    }
    
    public boolean update(ProfissionalSaude profissionalsaude){
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("UPDATE profissional_saude set registro_profissional = ?, cpf = ?, nome = ? WHERE id = ?");
            stmt.setString(1, profissionalsaude.getRegistroProfissional());
            stmt.setString(2, profissionalsaude.getCpf());
            stmt.setString(3, profissionalsaude.getNome());
            stmt.setInt(4, profissionalsaude.getId());
            stmt.executeUpdate();
            return true;
        } catch(SQLException ex){
            System.err.println("Erro ao atualizar: " + ex);
            return false;
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean delete(ProfissionalSaude profissionalsaude){
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("DELETE from profissional_saude WHERE id = ?");
            stmt.setInt(1, profissionalsaude.getId());
            stmt.executeUpdate();
            return true;
        } catch(SQLException ex){
            System.err.println("Erro ao excluir: " + ex);
            return false;
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
