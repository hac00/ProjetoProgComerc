package tablemodel;

import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.bean.Paciente;

public class PacienteTableModel extends AbstractTableModel {
    
    private List<Paciente> listaPacientes;
    private String[] colunas = {"Nome", "CPF", "Telefone", "Data Nascimento", "Sexo", "Alergias"};
    
    public PacienteTableModel(){   
        listaPacientes = new ArrayList<>();
    }
    
    public PacienteTableModel(List<Paciente> pacientes){
        this();
        this.listaPacientes.addAll(pacientes);
    }
    
    @Override
    public int getRowCount(){
        return listaPacientes.size();
    }
    
    @Override
    public int getColumnCount(){
        return colunas.length;
    }
    
    @Override
    public Object getValueAt(int linha, int coluna){
        Paciente paciente = listaPacientes.get(linha);
        switch(coluna){
            case 0:
                return paciente.getNome();
            case 1:
                return paciente.getCpf();
            case 2:
                return paciente.getTelefone();
            case 3:
                return paciente.getDataNascimento();
            case 4:
                return paciente.getSexo();
            case 5:
                return paciente.getAlergias();
            default:
                return "";
        }
    }
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    public Paciente getPaciente(int linha){
        if (linha >= listaPacientes.size()){
            return null;
        }
        return listaPacientes.get(linha);
    }
}
