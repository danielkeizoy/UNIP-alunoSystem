
package model.curso;


public class CursoDeVerao extends Curso {
    
    private double notaNP1, notaNP2;

    public CursoDeVerao(String aNome) {
        super(aNome);
    }
    
    public void setNotaP1(double nota){
        this.notaNP1 = nota;
    } 
    
    public void setNotaP2(double nota){
        this.notaNP2 = nota;
    }
    
    public double getNotaP1(){
        return notaNP1;
    }
    
    public double getNotaP2(){
        return notaNP2;
    }
    
    @Override
    public boolean isPassou(){
        if(isAprovado() == false){
            System.out.println("-------------------------------------");
            System.out.println("Aluno: " + getNomeAluno());
            System.out.println("");
        }
    }
    
    @Override
    public double getMedia(){
        double res = (this.notaNP1 + this.notaNP2) / 2;
        return res;
    }
    
    public boolean isAprovado(){
        double media = getMedia();
        if (media >= 7){
            System.out.println("Media: " + media);
            System.out.println("Status: Aprovado.");
            return true;
        } else {
            System.out.println("Media: " + media);
            System.out.println("Status: Reprovado.");
            return false;
        }
    }
    
    public String toString(){
        
    }
}
