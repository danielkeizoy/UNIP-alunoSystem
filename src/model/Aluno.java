
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

    public String getNome() {
        return nomeAluno;
    }

    public void setNome(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "Nome do Aluno: " + getNome() + "\n";
        res += "ID: " + getIdAluno() + "\n";
        
        return res;
    }
    
}
