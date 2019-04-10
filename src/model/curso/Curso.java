
package model.curso;


abstract class Curso {
    
    private String nome;
    
    public Curso(String aNome){
        this.nome = aNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String aNome) {
        this.nome = aNome;
    }
    
    public abstract boolean isPassou();
    
    public abstract double getMedia();
 
    public String toString(String aNome){
        String res = "Nome: " + aNome;
        return res;
    }
    
}
