package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.AplicacaoVacina;
import model.bean.Paciente;
import model.bean.ProfissionalSaude;
import model.bean.Vacina;

public class AplicacaoVacinaDAO {
    
    private Connection con = null;
    
    public AplicacaoVacinaDAO(){
        con = ConnectionFactory.getConnection();
    }
    
    public boolean create(AplicacaoVacina aplicacaoVacina){
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO aplicacao_vacina (id, data_aplicacao, local_aplicacao, paciente_id, profissional_saude_id, vacina_id) VALUES (?, ?, ?, ?, ?, ?)");
            stmt.setInt(1, aplicacaoVacina.getId());
            stmt.setString(2, aplicacaoVacina.getDataAplicacao());
            stmt.setString(3, aplicacaoVacina.getLocalAplicacao());
            stmt.setInt(4, aplicacaoVacina.getPaciente().getId());
            stmt.setInt(5, aplicacaoVacina.getResponsavel().getId());
            stmt.setInt(6, aplicacaoVacina.getVacina().getId());
            stmt.executeUpdate();
            return true;
        } catch(SQLException ex){
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ArrayList<AplicacaoVacina> getAplicacaoVacina(int idvacina){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        ArrayList<AplicacaoVacina> listaAplicacaoVacina = new ArrayList<>();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM view_aplicao_vacina WHERE vacina_id = ?");
            stmt.setInt(1, idvacina);
            rs = stmt.executeQuery();
            while(rs.next()){
                AplicacaoVacina aplicacaoVacina = new AplicacaoVacina();
                
                aplicacaoVacina.setDataAplicacao(rs.getString("data_aplicacao"));
                aplicacaoVacina.setLocalAplicacao(rs.getString("local_aplicacao"));
                
                Vacina vacina = new Vacina();
                vacina.setId(rs.getInt("vacina_id"));
                vacina.setNome(rs.getString("vacina_nome"));
                vacina.setFabricante(rs.getString("vacina_fabricante"));
                vacina.setDosesNecessarias(rs.getInt("vacina_doses_necessarias"));
                aplicacaoVacina.setVacina(vacina);
                
                Paciente paciente = new Paciente();
                paciente.setId(rs.getInt("paciente_id"));
                paciente.setNome(rs.getString("paciente_nome"));
                paciente.setCpf(rs.getString("paciente_cpf"));
                paciente.setTelefone(rs.getString("paciente_telefone"));
                paciente.setDataNascimento(rs.getString("paciente_data_nascimento"));
                paciente.setAlergias(rs.getString("paciente_alergias"));
                paciente.setSexo(rs.getString("paciente_sexo"));
                aplicacaoVacina.setPaciente(paciente);
                
                ProfissionalSaude profissionalSaude = new ProfissionalSaude();
                profissionalSaude.setId(rs.getInt("profissional_id"));
                profissionalSaude.setNome(rs.getString("profissional_nome"));
                profissionalSaude.setCpf(rs.getString("profissional_cpf"));
                profissionalSaude.setRegistroProfissional(rs.getString("profissional_registro_profissional"));
                aplicacaoVacina.setResponsavel(profissionalSaude);
                
                listaAplicacaoVacina.add(aplicacaoVacina);
            } 
        } catch(SQLException ex){
            System.err.println("Erro: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return listaAplicacaoVacina;
    }
    
    public boolean update(AplicacaoVacina aplicacaoVacina){
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("UPDATE aplicacao_vacina SET data_aplicacao = ?, local_aplicacao = ? WHERE id = ? and paciente_id = ? and profissional_saude_id = ? and vacina_id = ?");
            stmt.setString(1, aplicacaoVacina.getDataAplicacao());
            stmt.setString(2, aplicacaoVacina.getLocalAplicacao());
            stmt.setInt(3, aplicacaoVacina.getId());
            stmt.setInt(4, aplicacaoVacina.getPaciente().getId());
            stmt.setInt(5, aplicacaoVacina.getResponsavel().getId());
            stmt.setInt(6, aplicacaoVacina.getVacina().getId());
            stmt.executeUpdate();
            return true;
        } catch(SQLException ex){
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean delete(AplicacaoVacina aplicacaoVacina){
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM aplicacao_vacina WHERE id = ? and paciente_id = ? and profissional_saude_id = ? and vacina_id = ?");
            stmt.setInt(1, aplicacaoVacina.getId());
            stmt.setInt(2, aplicacaoVacina.getPaciente().getId());
            stmt.setInt(3, aplicacaoVacina.getResponsavel().getId());
            stmt.setInt(4, aplicacaoVacina.getVacina().getId());
            stmt.executeUpdate();
            return true;
        } catch(SQLException ex){
            System.err.println("Erro: " + ex);
            return false;
        } finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
