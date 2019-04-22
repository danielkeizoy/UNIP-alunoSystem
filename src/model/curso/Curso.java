
package model.curso;


public abstract class Curso implements Comparable<Curso>{
    
    private String nomeCurso;
    
    public Curso(String aNome){
        this.nomeCurso = aNome;
    }

    public String getNome() {
        return "\n" + nomeCurso;
    }

    public void setNome(String aNome) {
        this.nomeCurso = aNome;
    }
    
    
    public abstract boolean isAprovado();
    
    public abstract double getMedia();
 
    @Override
    public int compareTo(Curso outroCurso){
        return this.nomeCurso.compareTo(outroCurso.getNome());
    }
    
    @Override
    public String toString(){
        String res = "Nome: " + getNome();
        return res;
    }
    
}
