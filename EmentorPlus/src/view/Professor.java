package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Professor extends People{
    private String Disciplina;
    private String Matricula;
    private String DataAdmissao;
    private double Salario;
    
    public Professor(){}
    
    public Professor(String Disciplina, String Matricula, String DataAdmissao, double Salario, String Nome, String NomeMae, String NomePai, String DataNascimento, String CPF, String Telefone){
        super(Nome, NomeMae, NomePai, DataNascimento, CPF, Telefone);
        this.Disciplina = Disciplina;
        this.Matricula = Matricula;
        this.DataAdmissao = DataAdmissao;
        this.Salario = Salario;
    }

    public String getDisciplina() {
        return Disciplina;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getDataAdmissao() {
        return DataAdmissao;
    }

    public double getSalario() {
        return Salario;
    }

    
    public void setDisciplina(String Disciplina) {
        this.Disciplina = Disciplina;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void setDataAdmissao(String DataAdmissao) {
        this.DataAdmissao = DataAdmissao;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    public String createRecord(){
        Random random = new Random();
        
        String caracters = "0123456789";
        String record = "";
        int index = -1;
        for( int i = 0; i < 9; i++ ) {
           index = random.nextInt( caracters.length() );
           record += caracters.substring( index, index + 1 );
        }
        
        return record;
    }
    
    public String getDateTime() {
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	return dateFormat.format(date);
}
}
