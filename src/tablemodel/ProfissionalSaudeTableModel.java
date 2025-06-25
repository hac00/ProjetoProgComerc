package tablemodel;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.bean.ProfissionalSaude;

public class ProfissionalSaudeTableModel extends AbstractTableModel {
    
    private java.util.List<ProfissionalSaude> listaProfissionaisSaude;
    private String[] colunas = {"Nome", "CPF", "Registro Profissional"};
    
    public ProfissionalSaudeTableModel(){   
        listaProfissionaisSaude = new ArrayList<>();
    }
    
    public ProfissionalSaudeTableModel(java.util.List<ProfissionalSaude> profissionaisSaude){
        this();
        this.listaProfissionaisSaude.addAll(profissionaisSaude);
    }
    
    @Override
    public int getRowCount(){
        return listaProfissionaisSaude.size();
    }
    
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna){
        ProfissionalSaude profissionalSaude = listaProfissionaisSaude.get(linha);
        switch(coluna){
            case 0:
                return profissionalSaude.getNome();
            case 1:
                return profissionalSaude.getCpf();
            case 2:
                return profissionalSaude.getRegistroProfissional();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    public ProfissionalSaude getProfissionalSaude(int linha){
        if (linha >= listaProfissionaisSaude.size()){
            return null;
        }
        return listaProfissionaisSaude.get(linha);
    }
}
