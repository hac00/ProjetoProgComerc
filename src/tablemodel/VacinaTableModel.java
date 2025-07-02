package tablemodel;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.bean.Vacina;

public class VacinaTableModel extends AbstractTableModel {
    
    private List<Vacina> listaVacinas;
    private String[] colunas = {"Nome", "Fabricante", "Doses Necessarias"};
    
    public VacinaTableModel(){
        listaVacinas = new ArrayList<>();
    }
    
    public VacinaTableModel(List<Vacina> vacinas){
        this();
        this.listaVacinas.addAll(vacinas);
    }
    
    @Override
    public int getRowCount(){
        return listaVacinas.size();
    }
    
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna){
        Vacina vacina = listaVacinas.get(linha);
        switch(coluna){
            case 0:
                return vacina.getNome();
            case 1:
                return vacina.getFabricante();
            case 2:
                return vacina.getDosesNecessarias();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    public Vacina getVacina(int linha){
        if (linha >= listaVacinas.size()){
            return null;
        }
        return listaVacinas.get(linha);
    }
}
