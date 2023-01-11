package view;

public class People {
    protected String Nome;
    protected String NomeMae;
    protected String NomePai;
    protected String DataNascimento;
    protected String CPF;
    protected String Telefone;
    
    public People(){}
    
    public People(String Nome, String NomeMae, String NomePai, String DataNascimento, String CPF, String Telefone){
        this.Nome = Nome;
        this.NomeMae = NomeMae;
        this.NomePai = NomePai;
        this.DataNascimento = DataNascimento;
        this.CPF = CPF;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public String getNomeMae() {
        return NomeMae;
    }
    
    public String getNomePai() {
        return NomePai;
    }
    
    public String getDataNascimento() {
        return DataNascimento;
    }
    
    public String getCPF() {
        return CPF;
    }
    
    public String getTelefone() {
        return Telefone;
    }
    
    
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setNomeMae(String NomeMae) {
        this.NomeMae = NomeMae;
    }

    public void setNomePai(String NomePai) {
        this.NomePai = NomePai;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    
    
    
}
