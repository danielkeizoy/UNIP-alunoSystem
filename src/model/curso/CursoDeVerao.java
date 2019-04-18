
package model.curso;

public class CursoDeVerao extends Curso {
    
    private Double notaNP1;
    private Double notaNP2;
    private Double media;

    public CursoDeVerao(String aNome) {
        super(aNome);
        this.notaNP1 = 0.0;
        this.notaNP2 = 0.0;
    }

    public void setNotaP1(Double nota){
        
        if ((nota >= 0.0) && (nota <= 10.0)) {
            this.notaNP1 = nota;
        } else{
            System.out.println("Erro!");
            System.out.println("Por favor digite uma nota válida entre 0 e 10.");
        }
    } 
    
    public void setNotaP2(Double nota){
        
        if ((nota >= 0.0) && (nota <= 10.0)) {
            this.notaNP2 = nota;
        } else{
            System.out.println("Erro!");
            System.out.println("Por favor digite uma nota válida entre 0 e 10.");
        }
    }
    
    public double getNotaP1(){
        return notaNP1;
    }
    
    public double getNotaP2(){
        return notaNP2;
    }
     
    @Override
    public boolean isPassou(){
        Double md = getMedia();
        if (md >= 7) {
                return true;
        } else{
                return false;
            }       
    }
         
    @Override
    public double getMedia(){
        this.media = (getNotaP1() + getNotaP2()) / 2;    
        return this.media;
    }
     
    @Override
    public String toString(){
        String res = "";
        res += "Curso de Verão: " + getNome() + "\n";
        res += "Nota P1: " + getNotaP1() + "\n";
        res += "Nota P2: " + getNotaP2() + "\n";
        res += "Media: " + getMedia() + "\n";
        res += "Aprovado: " + isPassou() + "\n";
        
        return res;
    }
}
