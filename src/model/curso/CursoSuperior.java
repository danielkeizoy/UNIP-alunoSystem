package model.curso;

public class CursoSuperior extends Curso {
    
    private double notaP1; 
    private double notaP2;
    private double notaReposicao;
    private double notaExame;
    private double media;
    private double mediaPrincipal;

    public CursoSuperior (String aNome) {
        super(aNome);
                
        this.notaP1 = 0.0;
        this.notaP2 = 0.0;
        this.notaReposicao = 0.0;
        this.notaExame = 0.0;
        this.media = 0.0;
        this.mediaPrincipal = 0.0;
        
    }
    
    public void setNotaP1(double nota) {
    	if ((nota >= 0.0) && (nota <= 10.0)) {
            this.notaP1 = nota;
        } else{
            System.out.println("Erro!");
            System.out.println("Por favor digite uma nota válida entre 0 e 10.");
        } 
    }

    public void setNotaP2(double nota){
    	if ((nota >= 0.0) && (nota <= 10.0)) {
            this.notaP2 = nota;
        } else{
            System.out.println("Erro!");
            System.out.println("Por favor digite uma nota válida entre 0 e 10.");
        }
    }

    public void setNotaReposicao(double nota) {
    	if ((nota >= 0.0) && (nota <= 10.0)) {
            this.notaReposicao = nota;
        } else{
            System.out.println("Erro!");
            System.out.println("Por favor digite uma nota válida entre 0 e 10.");
        }
    }

    public void setNotaExame(double nota) {
    	if ((nota >= 0.0) && (nota <= 10.0)) {
            this.notaExame = nota;
        } else{
            System.out.println("Erro!");
            System.out.println("Por favor digite uma nota válida entre 0 e 10.");
        } 
    }
  
    public double getNotaP1(){
        return notaP1;
    }

    public double getNotaP2(){
        return notaP2;
    }

    public double getNotaReposicao() {
        return notaReposicao;
    }

    public double getNotaExame(){
        return notaExame;
    }
    
   
    @Override
    public double getMedia(){
    	
        if ((this.notaReposicao > this.notaP1) || (this.notaReposicao > this.notaP2)) {        	
            
        	if (this.notaReposicao > this.notaP1) {        		
            	this.mediaPrincipal = this.notaReposicao + this.notaP2;
            	if (this.mediaPrincipal < 7) {            		
            		this.media = (this.mediaPrincipal + this.notaExame) /2;
            	}            	
            	else {
            		this.media = this.mediaPrincipal;
            	}
            }
        	
            else {
            	this.mediaPrincipal = this.notaReposicao + this.notaP1;
            	if (this.mediaPrincipal < 7) {
            		this.media = (this.mediaPrincipal + this.notaExame) /2;
            	}
            	else {
            		this.media = this.mediaPrincipal;
            	}
            }
        }
        else {
        	this.media = this.notaP1 + this.notaP2;
        }
        return media;
    }
    
    @Override
    public boolean isPassou(){
        if (this.media >= 7){
        	System.out.println("Status: Aprovado!");
            return true;
        } 
        else{
        	System.out.println("Status: Reprovado.");
            return false;
        }
    }
    @Override
    public String toString(){
        String res = "";
        res += "Curso Superior: " + getNome() + "\n";
        res += "Nota P1: " + getNotaP1() + "\n";
        res += "Nota P2: " + getNotaP2() + "\n";
        res += "Media: " + getMedia() + "\n";
        res += "Aprovado: " + isPassou() + "\n";
        
        return res;
    }

    
}