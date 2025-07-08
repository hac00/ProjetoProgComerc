package controller;

import java.util.ArrayList;
import model.bean.ProfissionalSaude;
import model.dao.ProfissionalSaudeDAO;

public class ProfissionalSaudeController {
    
    public boolean create(String nome, String cpf, String registroProfissional){
        ProfissionalSaude profissionalsaude = new ProfissionalSaude();
        profissionalsaude.setNome(nome);
        profissionalsaude.setCpf(cpf);
        profissionalsaude.setRegistroProfissional(registroProfissional);
        
        ProfissionalSaudeDAO profissionalsaudedao = new ProfissionalSaudeDAO();
        return profissionalsaudedao.create(profissionalsaude);
    }
    
    public ArrayList<ProfissionalSaude> read(){
        ProfissionalSaudeDAO profissionalsaudedao = new ProfissionalSaudeDAO();
        return profissionalsaudedao.read();
    }
    
    public ArrayList<ProfissionalSaude> getProfissionalNome(String nome){
        ProfissionalSaudeDAO profissionalsaudedao = new ProfissionalSaudeDAO();
        return profissionalsaudedao.getProfissionalNome(nome);
    }
    
    public ArrayList<ProfissionalSaude> getProfissionalCpf(String cpf){
        ProfissionalSaudeDAO profissionalsaudedao = new ProfissionalSaudeDAO();
        return profissionalsaudedao.getProfissionalCpf(cpf);
    }
    
    public ArrayList<ProfissionalSaude> getProfissionalRegistro(String registro){
        ProfissionalSaudeDAO profissionalsaudedao = new ProfissionalSaudeDAO();
        return profissionalsaudedao.getProfissionalRegistro(registro);
    }
    
    public boolean update(int id, String cpf, String registroProfissional, String nome){
        ProfissionalSaude profissionalsaude = new ProfissionalSaude();
        profissionalsaude.setId(id);
        profissionalsaude.setCpf(cpf);
        profissionalsaude.setRegistroProfissional(registroProfissional);
        profissionalsaude.setNome(nome);
        
        ProfissionalSaudeDAO profissionalsaudedao = new ProfissionalSaudeDAO();
        return profissionalsaudedao.update(profissionalsaude);
    }
    
    public boolean delete(int id){
        ProfissionalSaude profissionalsaude = new ProfissionalSaude();
        profissionalsaude.setId(id);
        
        ProfissionalSaudeDAO profissionalsaudedao = new ProfissionalSaudeDAO();
        return profissionalsaudedao.delete(profissionalsaude);
    }
}
