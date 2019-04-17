
package model;
import java.util.Iterator;
import java.util.Collection;
import java.util.TreeSet;
import model.curso.Curso;

public class Historico implements Iterable<Curso>{
    
    Collection<Curso> Cursos;
    
    public Historico(){
        Cursos = new TreeSet<>();
    }
    
    public void add(Curso curso){
        Cursos.add(curso);
    }
        
    @Override
    public Iterator<Curso> iterator() {
        return Cursos.iterator();
    }
    
    @Override
    public String toString(){
        return this.Cursos.toString();
    }
}   
