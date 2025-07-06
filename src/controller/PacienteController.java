
package controller;

import java.util.ArrayList;
import model.bean.Paciente;
import model.dao.PacienteDAO;

public class PacienteController {
    
    public boolean create(String telefone, String dataNascimento, String alergias, String sexo, String cpf, String nome){
        Paciente paciente = new Paciente();
        paciente.setTelefone(telefone);
        paciente.setDataNascimento(dataNascimento);
        paciente.setAlergias(alergias);
        paciente.setSexo(sexo);
        paciente.setCpf(cpf);
        paciente.setNome(nome);
        
        PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.create(paciente);
    }
    
    public ArrayList<Paciente> read(){
        PacienteDAO pacientedao = new PacienteDAO();
        return pacientedao.read();
    }
    
    public ArrayList<Paciente> getPacientesNome(String nome){
        PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.getPacientesNome(nome);
    }
    
    public ArrayList<Paciente> getPacientesCpf(String cpf){
        PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.getPacientesCpf(cpf);
    }
    
    public boolean update(int id, String telefone, String dataNascimento, String alergias, String sexo, String cpf, String nome){
        Paciente paciente = new Paciente();
        paciente.setId(id);
        paciente.setDataNascimento(dataNascimento);
        paciente.setAlergias(alergias);
        paciente.setSexo(sexo);
        paciente.setCpf(cpf);
        paciente.setNome(nome);
        
        PacienteDAO pacienteDAO = new PacienteDAO();
        return pacienteDAO.update(paciente);
    }
    
    public boolean delete(int id){
        Paciente paciente = new Paciente();
        paciente.setId(id);
        
        PacienteDAO pacientedao = new PacienteDAO();
        return pacientedao.delete(paciente);
    }
}
