
package model.curso;


abstract class Curso {
    
    private String nomeCurso;
    
    public Curso(String aNome){
        this.nomeCurso = aNome;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNome(String aNome) {
        this.nomeCurso = aNome;
    }
    
    public abstract boolean isPassou();
    
    public abstract double getMedia();
 
    public String toString(String aNome){
        String res = "Nome: " + aNome;
        return res;
    }
    
}
