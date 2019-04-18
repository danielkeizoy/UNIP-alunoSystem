
package model.curso;


public abstract class Curso {
    
    private String nomeCurso;
    
    public Curso(String aNome){
        this.nomeCurso = aNome;
    }

    public String getNome() {
        return nomeCurso;
    }

    public void setNome(String aNome) {
        this.nomeCurso = aNome;
    }
    
    public abstract boolean isPassou();
    
    public abstract boolean isAprovado();
    
    public abstract double getMedia();
 
    public String toString(){
        String res = "Nome: " + getNome();
        return res;
    }
    
}
