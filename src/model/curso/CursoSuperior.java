package model.curso;

public class CursoSuperior extends Curso {
    
    private double notanp1; 
    private double notanp2;
    private double reposicao;
    private double exame;
    private double media;
    private double mediaFinal;

    public CursoSuperior (String aNome) {
        super(aNome);
                
        this.notanp1 = 0.0;
        this.notanp2 = 0.0;
        this.reposicao = 0.0;
        this.exame = 0.0;
        this.media = 0.0;
        this.mediaFinal = 0.0;
        
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
        
        if ((this.reposicao > this.notanp1) || (this.reposicao > this.notanp2)) {
            if (this.reposicao > this.notanp1) {
            	if( ( (this.reposicao + this.notanp2) /2) < 7) {
            		this.mediaFinal = (( (this.reposicao + this.notanp2) /2) + exame)/2;
            	};       
            }
            else{
            	if( ( (this.reposicao + this.notanp1) /2) < 7) {
            		this.mediaFinal = (( (this.reposicao + this.notanp1) /2) + exame)/2;
            	};
            }
        }
        return mediaFinal;
    }
    
    @Override
    public boolean isPassou(){
    	this.media = (this.notanp1 + this.notanp2) / 2;
        if (media >= 7){
            return true;
        } 
        else{            
            return false;
        }
    }
    
    @Override
    public boolean isAprovado(){
        boolean status = isPassou();
        if(status == true) {
        	System.out.println("Status: Aprovado!");
            return true;
        }
        else {
        	if (mediaFinal>= 5){
        		System.out.println("Status: Aprovado!");
        		return true;
        	} 
        	else{
        		System.out.println("Status: Reprovado.");
        		return false;
        	}
        }
    }
}