
package model;

public class Aluno {
    
    private String idAluno;
    private String nomeAluno;
    
    public Aluno(String aIdAluno, String aNomeAluno){
        this.idAluno = aIdAluno;
        this.nomeAluno = aNomeAluno;
    }

    public String getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(String idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "Nome do Aluno: " + getNomeAluno();
        res += "ID: " + getIdAluno();
        
        return res;
    }
    
}
