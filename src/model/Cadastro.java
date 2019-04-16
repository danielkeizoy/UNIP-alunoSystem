
package model;

public class Cadastro {
    
    private Aluno aluno;
    private Historico historico;
    
    public Cadastro (String id, String nome){
        
        
        
    }
        

    public Aluno getAluno(){
        return this.aluno;
    }
    
    public Historico getHistorico(){
        return this.historico;
    }
    
    public void add(Curso curso){
        
    }
    
    public String toString(){
        String res += "Nome do aluno: " + getAluno();
        res += "ID: " +
    }
}
