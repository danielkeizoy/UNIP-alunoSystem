
package model;
import model.curso.*;

public class Cadastro {
    
    private Aluno aluno;
    private Historico historico;
    
    public Cadastro (String id, String nome){
        this.aluno = new Aluno(id, nome);
        this.historico = new Historico();
    }
        

    public Aluno getAluno(){
        return this.aluno;
    }
    
    public Historico getHistorico(){
        return this.historico;
    }
    
    public void add(Curso curso){
        this.historico.add(curso);
    }
    
    @Override
    public String toString() {
        String res = "";
        res += "----------- CADASTRO -----------" + "\n";
        res += getAluno() + "\n";
        res += "Histórico: " + "\n";
        res += getHistorico() + "\n";
        res += "--------------------------------" + "\n";
        return res;
    }
}