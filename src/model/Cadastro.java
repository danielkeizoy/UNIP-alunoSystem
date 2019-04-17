
package model;
import model.curso.Curso;

public class Cadastro {
    
    private Aluno aluno;
    private Historico historico;
    
    public Cadastro (String id, String nome){
        //Preciso verificar o funcionamento disso aqui.
        aluno.setIdAluno(id);
        aluno.setNomeAluno(nome);
    }
        

    public Aluno getAluno(){
        return this.aluno;
    }
    
    public Historico getHistorico(){
        return this.historico;
    }
    
    public void add(Curso curso){
        historico.add(curso);
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "Nome do aluno: " + getAluno();
        res += "ID: ";
        return res;
    }
}