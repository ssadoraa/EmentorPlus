package view;

import java.util.Random;

public class Student extends People{
    private String Matricula;
    private String AnoEscolar;
    private String Turma;
    
    public Student(){}
    
    public Student(String Matricula, String AnoEscolar, String Turma, String Nome, String NomeMae, String NomePai, String DataNascimento, String CPF, String Telefone){
        super(Nome, NomeMae, NomePai, DataNascimento, CPF, Telefone);
        this.Matricula = Matricula;
        this.AnoEscolar = AnoEscolar;
        this.Turma = Turma;
    }

    public String getMatricula() {
        return Matricula;
    }

    public String getAnoEscolar() {
        return AnoEscolar;
    }
    
    public String getTurma() {
        return Turma;
    }
    
    
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public void setAnoEscolar(String AnoEscolar) {
        this.AnoEscolar = AnoEscolar;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
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
}
