package model.bean;

public class AplicacaoVacina {
    
    int id;
    Paciente paciente;
    ProfissionalSaude responsavel;
    Vacina vacina;
    String dataAplicacao;
    String localAplicacao;
    
    public AplicacaoVacina(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ProfissionalSaude getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ProfissionalSaude responsavel) {
        this.responsavel = responsavel;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    public String getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(String dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public String getLocalAplicacao() {
        return localAplicacao;
    }

    public void setLocalAplicacao(String localAplicacao) {
        this.localAplicacao = localAplicacao;
    }
    
}
