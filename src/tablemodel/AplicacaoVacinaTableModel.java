package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.AplicacaoVacina;

public class AplicacaoVacinaTableModel extends AbstractTableModel {
    
    private List<AplicacaoVacina> listaAplicacaoVacina;
    private String[] colunas = {"Paciente", "Responsavel", "Vacina", "Data de Aplicacao", "Local de Aplicacao", "Doses Necessárias"};
    
    public AplicacaoVacinaTableModel(){
        listaAplicacaoVacina = new ArrayList<>();
        
    }
    
    public AplicacaoVacinaTableModel(List<AplicacaoVacina> aplicacaoVacina){
        this();
        this.listaAplicacaoVacina.addAll(aplicacaoVacina);
    }
    
    @Override
    public int getRowCount(){
        return listaAplicacaoVacina.size();
    }
    
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna){
        AplicacaoVacina aplicacaoVacina = listaAplicacaoVacina.get(linha);
        switch(coluna){
            case 0:
                return aplicacaoVacina.getPaciente().getNome();
            case 1:
                return aplicacaoVacina.getResponsavel().getNome();
            case 2:
                return aplicacaoVacina.getVacina().getNome();
            case 3:
                return aplicacaoVacina.getDataAplicacao();
            case 4:
                return aplicacaoVacina.getLocalAplicacao();
            case 5:
                return aplicacaoVacina.getVacina().getDosesNecessarias();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    public AplicacaoVacina getAplicacaoVacina(int linha){
        if (linha >= listaAplicacaoVacina.size()){
            return null;
        }
        return listaAplicacaoVacina.get(linha);
    }
}
