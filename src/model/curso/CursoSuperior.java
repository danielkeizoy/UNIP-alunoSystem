package model.curso;

public class CursoSuperior extends Curso {
    
    private double notanp1; 
    private double notanp2;
    private double reposicao;
    private double exame;

    public CursoSuperior (String aNome) {
        super(aNome);
                
        this.notanp1 = 0.0;
        this.notanp2 = 0.0;
        this.reposicao = 0.0;
        this.exame = 0.0;
        
    }
    
    public void setNotaP1(double nota) {
        this.notanp1 = nota; 
    }

    public void setNotaP2(double nota){
        this.notanp2 = nota; 
    }

    public void setNotaReposicao(double nota) {
        this.reposicao = nota; 
    }

    public void setNotaExame(double nota) {
        this.exame = nota; 
    }
  
    public double getNotaP1(){
        return notanp1;
    }

    public double getNotaP2(){
        return notanp2;
    }

    public double getNotaReposicao() {
        return reposicao;
    }

    public double getNotaExame(){
        return exame;
    }
    
   
    @Override
    public double getMedia(){
        // TESTE DE NOTA 
        
        if ((this.reposicao > this.notanp1) && (this.reposicao this.notanp2)) {
            
           
            
            
                 
            
        }
            
    }
}
