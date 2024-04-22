package services;

import java.util.List;

import entities.Classe;
import repositories.ClasseRepository;

public class ClasseService {
    ClasseRepository classeRepository=new ClasseRepository();

    public void ajouterClasse(Classe classe){
        classeRepository.insertClasse(classe);
    }

    public List<Classe>ListerClasse(){
        return classeRepository.selectAll();
    }

    public Classe findClasseById(int id){
      return classeRepository.selectClasseById(id);
   }
    
}
