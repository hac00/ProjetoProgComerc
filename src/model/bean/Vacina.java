package model.bean;

public class Vacina {
    
    int id;
    String nome;
    String fabricante;
    int dosesNecessarias;

    public Vacina(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getDosesNecessarias() {
        return dosesNecessarias;
    }

    public void setDosesNecessarias(int dosesNecessarias) {
        this.dosesNecessarias = dosesNecessarias;
    }
    
    @Override
    public String toString(){
        return nome;
    }
    
}
