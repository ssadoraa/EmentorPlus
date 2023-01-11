package view;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexaoMySQL {
    private String caminho = "localhost"; //Indica que usaremos o serve na máquina local
    private String porta = "3306"; //Porta padrão de conexão do MySQL
    private String nome = "ementorplus"; //Nome da base de dados do projeto
    private String usuario = "root"; //Usuário padrão do MySQL
    private String senha = "admin"; // Senha definida na hr da instalação do MySQL
    private String FusoHorario = "?useTimeZone=true&serverTimezone=UTC"; // Ajustar horário com a Oracle
    private String URL = "jdbc:mysql://"+caminho+":"+porta+"/"+nome+FusoHorario;
    
    public ConexaoMySQL(){}
    
    public Connection realizaConexao(){
        try{
            return DriverManager.getConnection(URL, usuario, senha);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algum imprevisto ocorreu"+e+"", "ERRO BANCO", ERROR_MESSAGE);
            return null;
        }
    }
    
    public void desconectaMySQL(Connection conexao){
        try{
            if (conexao != null)
                conexao.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algum imprevisto ocorreu"+e+"", "ERRO BANCO", ERROR_MESSAGE);            
        }
    }
    
    public void insertStudent(String Nome, String NomeMae, String NomePai, String DataNascimento, String CPF, String Telefone, String Matricula, String AnoEscolar, String Turma){
        Connection conexao = realizaConexao();
        String sql_pessoa = "insert into pessoa (CPF, Nome, NomeMae, NomePai, DataNascimento, Telefone) values (?,?,?,?,?,?)";
        String sql_aluno = "insert into aluno (CPF, Matricula, AnoEscolar, Turma) values (?,?,?,?)";
        
        try {
            PreparedStatement Atuador_pessoa = conexao.prepareStatement(sql_pessoa);
            PreparedStatement Atuador_aluno = conexao.prepareStatement(sql_aluno);
            
            Atuador_pessoa.setString(1, CPF);  //Substitiu a 1ª interrogação do insert into
            Atuador_pessoa.setString(2, Nome);  //Substitiu a 2ª interrogação do insert into
            Atuador_pessoa.setString(3, NomeMae);  //Substitiu a 3ª interrogação do insert into
            Atuador_pessoa.setString(4, NomePai);  //Substitiu a 4ª interrogação do insert into
            Atuador_pessoa.setString(5, DataNascimento);  //Substitiu a 5ª interrogação do insert into
            Atuador_pessoa.setString(6, Telefone);  //Substitiu a 6ª interrogação do insert into
            Atuador_pessoa.execute();  //Executa diretamente no banco
            
            Atuador_aluno.setString(1, CPF); //Substitiu a 1ª interrogação do insert into
            Atuador_aluno.setString(2, Matricula); //Substitiu a 2ª interrogação do insert into
            Atuador_aluno.setString(3, AnoEscolar); //Substitiu a 3ª interrogação do insert into
            Atuador_aluno.setString(4, Turma); //Substitiu a 4ª interrogação do insert into
            Atuador_aluno.execute();  //Executa diretamente no banco
            
            desconectaMySQL(conexao);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algum imprevisto ocorreu"+e+"","ERRO BANCO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertProfessor(String Nome, String NomeMae, String NomePai, String DataNascimento, String CPF, String Telefone, String Disciplina, String Matricula, String DataAdmissao, double Salario){
        Connection conexao = realizaConexao();
        String sql_pessoa = "insert into pessoa (CPF, Nome, NomeMae, NomePai, DataNascimento, Telefone) values (?,?,?,?,?,?)";
        String sql_professor = "insert into professor (CPF, Disciplina, Matricula, DataAdmissao, Salario) values (?,?,?,?,?)";
        
        try {
            PreparedStatement Atuador_pessoa = conexao.prepareStatement(sql_pessoa);
            PreparedStatement Atuador_professor = conexao.prepareStatement(sql_professor);
            
            Atuador_pessoa.setString(1, CPF);  //Substitiu a 1ª interrogação do insert into
            Atuador_pessoa.setString(2, Nome);  //Substitiu a 2ª interrogação do insert into
            Atuador_pessoa.setString(3, NomeMae);  //Substitiu a 3ª interrogação do insert into
            Atuador_pessoa.setString(4, NomePai);  //Substitiu a 4ª interrogação do insert into
            Atuador_pessoa.setString(5, DataNascimento);  //Substitiu a 5ª interrogação do insert into
            Atuador_pessoa.setString(6, Telefone);  //Substitiu a 6ª interrogação do insert into
            Atuador_pessoa.execute();  //Executa diretamente no banco
            
            Atuador_professor.setString(1, CPF); //Substitiu a 1ª interrogação do insert into
            Atuador_professor.setString(2, Disciplina); //Substitiu a 2ª interrogação do insert into
            Atuador_professor.setString(3, Matricula); //Substitiu a 3ª interrogação do insert into
            Atuador_professor.setString(4, DataAdmissao); //Substitiu a 4ª interrogação do insert into
            Atuador_professor.setDouble(5, Salario); //Substitiu a 5ª interrogação do insert into
            Atuador_professor.execute();  //Executa diretamente no banco
            
            desconectaMySQL(conexao);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algum imprevisto ocorreu"+e+"","ERRO BANCO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertUser(String Nome, String Senha, String TipoAcesso){
        Connection conexao = realizaConexao();
        String sql_user = "insert into usuario (Nome, Senha, TipoAcesso) values (?,?,?)";
        
        try {
            PreparedStatement Atuador_user = conexao.prepareStatement(sql_user);
            
            Atuador_user.setString(1, Nome);  //Substitiu a 1ª interrogação do insert into
            Atuador_user.setString(2, Senha);  //Substitiu a 2ª interrogação do insert into
            Atuador_user.setString(3, TipoAcesso);  //Substitiu a 3ª interrogação do insert into
            Atuador_user.execute();  //Executa diretamente no banco
            
            desconectaMySQL(conexao);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algum imprevisto ocorreu"+e+"","ERRO BANCO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public People searchPeople(String CPF){
        Connection conexao = realizaConexao();
        People person = new People();
        person = null;
        
        try {
            String sql_select_person = "SELECT *FROM ementorplus.pessoa WHERE pessoa.CPF = '" + CPF + "'";
            PreparedStatement Atuador_select_person = conexao.prepareStatement(sql_select_person);
            ResultSet Resultado_select = Atuador_select_person.executeQuery();
            
            while(Resultado_select.next()){
                People Object_person = new People();
                Object_person.setCPF(Resultado_select.getString("CPF"));
                Object_person.setNome(Resultado_select.getString("Nome"));
                Object_person.setNomeMae(Resultado_select.getString("NomeMae"));
                Object_person.setNomePai(Resultado_select.getString("NomePai"));
                Object_person.setDataNascimento(Resultado_select.getString("DataNascimento"));
                Object_person.setTelefone(Resultado_select.getString("Telefone"));
                person = Object_person;
            }
            Resultado_select.close();
            Atuador_select_person.close();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Algum imprevisto ocorreu: " + e + "","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectaMySQL(conexao);
        return person;
    }
    
    public Student searchStudent(String Nome){
        Connection conexao = realizaConexao();
        Student person = new Student();
        person = null;
        
        try {
            String sql_select_student = "SELECT *FROM ementorplus.pessoa, ementorplus.aluno WHERE pessoa.Nome = '" + Nome + "' AND aluno.CPF = pessoa.CPF";
            PreparedStatement Atuador_select_student = conexao.prepareStatement(sql_select_student);
            ResultSet Resultado_select = Atuador_select_student.executeQuery();
            
            while(Resultado_select.next()){
                Student Object_student = new Student();
                Object_student.setCPF(Resultado_select.getString("CPF"));
                Object_student.setNome(Resultado_select.getString("Nome"));
                Object_student.setNomeMae(Resultado_select.getString("NomeMae"));
                Object_student.setNomePai(Resultado_select.getString("NomePai"));
                Object_student.setDataNascimento(Resultado_select.getString("DataNascimento"));
                Object_student.setTelefone(Resultado_select.getString("Telefone"));
                Object_student.setMatricula(Resultado_select.getString("Matricula"));
                Object_student.setAnoEscolar(Resultado_select.getString("AnoEscolar"));
                Object_student.setTurma(Resultado_select.getString("Turma"));
                person = Object_student;
            }
            Resultado_select.close();
            Atuador_select_student.close();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Algum imprevisto ocorreu: " + e + "","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectaMySQL(conexao);
        return person;
    }
    
    public Professor searchProfessor(String Nome){
        Connection conexao = realizaConexao();
        Professor person = new Professor();
        person = null;
        
        try {
            String sql_select_professor = "SELECT *FROM ementorplus.pessoa, ementorplus.professor WHERE pessoa.Nome = '" + Nome + "' AND professor.CPF = pessoa.CPF";
            PreparedStatement Atuador_select_professor = conexao.prepareStatement(sql_select_professor);
            ResultSet Resultado_select = Atuador_select_professor.executeQuery();
            
            while(Resultado_select.next()){
                Professor Object_professor = new Professor();
                Object_professor.setCPF(Resultado_select.getString("CPF"));
                Object_professor.setNome(Resultado_select.getString("Nome"));
                Object_professor.setNomeMae(Resultado_select.getString("NomeMae"));
                Object_professor.setNomePai(Resultado_select.getString("NomePai"));
                Object_professor.setDataNascimento(Resultado_select.getString("DataNascimento"));
                Object_professor.setTelefone(Resultado_select.getString("Telefone"));
                Object_professor.setDisciplina(Resultado_select.getString("Disciplina"));
                Object_professor.setMatricula(Resultado_select.getString("Matricula"));
                Object_professor.setDataAdmissao(Resultado_select.getString("DataAdmissao"));
                Object_professor.setSalario(Resultado_select.getDouble("Salario"));
                person = Object_professor;
            }
            Resultado_select.close();
            Atuador_select_professor.close();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Algum imprevisto ocorreu: " + e + "","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectaMySQL(conexao);
        return person;
    }
    
    public User searchUser(String Nome){
        Connection conexao = realizaConexao();
        User person = new User();
        person = null;
        
        try {
            String sql_select_user = "SELECT *FROM ementorplus.usuario WHERE usuario.Nome = '" + Nome + "'";
            PreparedStatement Atuador_select_user = conexao.prepareStatement(sql_select_user);
            ResultSet Resultado_select = Atuador_select_user.executeQuery();
            
            while(Resultado_select.next()){
                User Object_user = new User();
                Object_user.setNome(Resultado_select.getString("Nome"));
                Object_user.setSenha(Resultado_select.getString("Senha"));
                Object_user.setTipoAcesso(Resultado_select.getString("TipoAcesso"));
                person = Object_user;
            }
            Resultado_select.close();
            Atuador_select_user.close();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Algum imprevisto ocorreu: " + e + "","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectaMySQL(conexao);
        return person;
    }
    
    public void updateStudents(String Nome, String NomeMae, String NomePai, String DataNascimento, String CPF, String Telefone, String Matricula, String AnoEscolar, String Turma){
        Connection conexao = realizaConexao();
        String sql_update_student = "update ementorplus.pessoa, ementorplus.aluno set Nome='" + Nome + "', NomeMae='" + NomeMae + "', NomePai='" + NomePai + "', DataNascimento='" + DataNascimento + "', Telefone='" + Telefone + "', Matricula='" + Matricula + "', AnoEscolar='" + AnoEscolar + "', Turma='" + Turma + "' where pessoa.CPF = aluno.CPF AND aluno.CPF = '" + CPF + "';";
        
        try {
            PreparedStatement Atuador = conexao.prepareStatement(sql_update_student);
            Atuador.executeUpdate();
            Atuador.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algum imprevisto ocorreu: " + e + "","ERRO BANCO", JOptionPane.ERROR_MESSAGE);
        }
        desconectaMySQL(conexao);
    }
    
    public void updateProfessors(String Nome, String NomeMae, String NomePai, String DataNascimento, String CPF, String Telefone, String Disciplina, String Matricula, String DataAdmissao, double Salario){
        Connection conexao = realizaConexao();
        String sql_update_professor = "update ementorplus.pessoa, ementorplus.professor set Nome='" + Nome + "', NomeMae='" + NomeMae + "', NomePai='" + NomePai + "', DataNascimento='" + DataNascimento + "', Telefone='" + Telefone + "', Disciplina='" + Disciplina + "', Matricula='" + Matricula + "', DataAdmissao='" + DataAdmissao + "', Salario='" + Salario + "' where pessoa.CPF = professor.CPF AND professor.CPF = '" + CPF + "';";
        
        try {
            PreparedStatement Atuador = conexao.prepareStatement(sql_update_professor);
            Atuador.executeUpdate();
            Atuador.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algum imprevisto ocorreu: " + e + "","ERRO BANCO", JOptionPane.ERROR_MESSAGE);
        }
        desconectaMySQL(conexao);
    }
    
    public void updateUser(String Nome, String Senha, String TipoAcesso){
        Connection conexao = realizaConexao();
        String sql_update_user = "update ementorplus.usuario set Senha='" + Senha + "', TipoAcesso='" + TipoAcesso + "' where usuario.Nome = '" + Nome + "';";
        
        try {
            PreparedStatement Atuador = conexao.prepareStatement(sql_update_user);
            Atuador.executeUpdate();
            Atuador.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algum imprevisto ocorreu: " + e + "","ERRO BANCO", JOptionPane.ERROR_MESSAGE);
        }
        desconectaMySQL(conexao);
    }
    
    public void RemovePerson(String CPF){
        Connection conexao = realizaConexao();
        String sql_person = "DELETE FROM pessoa where CPF = ?;";
        
        try {
            PreparedStatement Atuador_person = conexao.prepareStatement(sql_person);
            
            Atuador_person.setString(1, CPF);
            Atuador_person.execute();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algum imprevisto ocorreu"+e+"","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectaMySQL(conexao);
    }
    
    public void RemoveStudent(String CPF){
        Connection conexao = realizaConexao();
        String sql_student = "DELETE FROM aluno where CPF = ?;";
        
        try {
            PreparedStatement Atuador_student = conexao.prepareStatement(sql_student);
            
            Atuador_student.setString(1, CPF);
            Atuador_student.execute();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algum imprevisto ocorreu"+e+"","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectaMySQL(conexao);
    }
    
    public void RemoveProfessor(String CPF){
        Connection conexao = realizaConexao();
        String sql_professor = "DELETE FROM professor where CPF = ?;";
        
        try {
            PreparedStatement Atuador_professor = conexao.prepareStatement(sql_professor);
            
            Atuador_professor.setString(1, CPF);
            Atuador_professor.execute();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algum imprevisto ocorreu"+e+"","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectaMySQL(conexao);
    }
    
    public void RemoveUser(String Nome){
        Connection conexao = realizaConexao();
        String sql_user = "DELETE FROM usuario where Nome = ?;";
        
        try {
            PreparedStatement Atuador_user = conexao.prepareStatement(sql_user);
            
            Atuador_user.setString(1, Nome);
            Atuador_user.execute();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algum imprevisto ocorreu"+e+"","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        desconectaMySQL(conexao);
    }
}
