package view;

public class User extends People{
    private String Usuario;
    private String Senha;
    private String SenhaConfirma;
    private String TipoAcesso;
    
    public User() {}
    
    public User (String Usuario, String Senha, String SenhaConfirma, String TipoAcesso, String Nome, String NomeMae, String NomePai, String DataNascimento, String CPF, String Telefone){        
        super(Nome, NomeMae, NomePai, DataNascimento, CPF, Telefone);
        this.Usuario = Usuario;
        this.Senha = Senha;
        this.SenhaConfirma = SenhaConfirma;
        this.TipoAcesso = TipoAcesso;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public String getSenhaConfirma() {
        return SenhaConfirma;
    }

    public String getTipoAcesso() {
        return TipoAcesso;
    }

    
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public void setSenhaConfirma(String SenhaConfirma) {
        this.SenhaConfirma = SenhaConfirma;
    }

    public void setTipoAcesso(String TipoAcesso) {
        this.TipoAcesso = TipoAcesso;
    }
    
    
}
