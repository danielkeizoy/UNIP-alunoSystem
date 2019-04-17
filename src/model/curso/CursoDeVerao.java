
package model.curso;

public class CursoDeVerao extends Curso {
    
    private double notaNP1;
    private double notaNP2;

    public CursoDeVerao(String aNome) {
        super(aNome);
        this.notaNP1 = 0.0;
        this.notaNP2 = 0.0;
    }

    public void setNotaP1(double nota){
        
        if ((nota >= 0) && (nota <= 10)) {
            this.notaNP2 = nota;
        } else{
            System.out.println("Erro!");
            System.out.println("Por favor digite uma nota válida entre 0 e 10.");
        }
    } 
    
    public void setNotaP2(double nota){
        
        if ((nota >= 0) && (nota <= 10)) {
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
        double media = getMedia();
        if (media >= 7){
            System.out.println("Status: Aprovado!");
            return true;
        } else{
            System.out.println("Status: Reprovado.");
            return false;
        }
    }
    
    @Override
    public double getMedia(){
        double res = (this.notaNP1 + this.notaNP2) / 2;
        return res;
    }
     
    @Override
    public String toString(){
        String res = "";
        res += "----------------------" + "\n";
        res += "Curso: " + getNomeCurso() + "\n";
        res += "Media: " + getMedia() + "\n";
        res += isPassou() + "\n";
        res += "----------------------" + "\n";
        
        return res;
    }
}
