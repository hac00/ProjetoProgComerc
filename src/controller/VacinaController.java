package controller;

import java.util.ArrayList;
import model.bean.Vacina;
import model.dao.VacinaDAO;

public class VacinaController {
    
    public boolean create(String nome, String fabricante, int dosesNecessarias){
        Vacina vacina = new Vacina();
        vacina.setNome(nome);
        vacina.setFabricante(fabricante);
        vacina.setDosesNecessarias(dosesNecessarias);
        
        VacinaDAO vacinaDAO = new VacinaDAO();
        return vacinaDAO.create(vacina);
    }
    
    public ArrayList<Vacina> read(){
        VacinaDAO vacinaDAO = new VacinaDAO();
        return vacinaDAO.read();
    }
    
    public ArrayList<Vacina> getVacinasNome(String nome){
        VacinaDAO vacinaDAO = new VacinaDAO();
        return vacinaDAO.getVacinasNome(nome);
    }
    
    public ArrayList<Vacina> getVacinasFabricante(String fabricante){
        VacinaDAO vacinaDAO = new VacinaDAO();
        return vacinaDAO.getVacinasFabricante(fabricante);
    }
    
    public ArrayList<Vacina> getVacinasDoses(int doses){
        VacinaDAO vacinaDAO = new VacinaDAO();
        return vacinaDAO.getVacinasDoses(doses);
    }
    
    public boolean update(int id, String nome, String fabricante, int dosesNecessarias){
        Vacina vacina = new Vacina();
        vacina.setId(id);
        vacina.setNome(nome);
        vacina.setFabricante(fabricante);
        vacina.setDosesNecessarias(dosesNecessarias);
        
        VacinaDAO vacinaDAO = new VacinaDAO();
        return vacinaDAO.update(vacina);
    }
    
    public boolean delete(int id){
        Vacina vacina = new Vacina();
        vacina.setId(id);
        
        VacinaDAO vacinaDAO = new VacinaDAO();
        return vacinaDAO.delete(vacina);
    }
}