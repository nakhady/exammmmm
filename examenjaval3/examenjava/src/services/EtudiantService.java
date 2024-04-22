package services;



import entities.Etudiant;
import repositories.EtudiantRepository;

public class EtudiantService {
    
    EtudiantRepository etudiantRepository= new EtudiantRepository();

    public void ajouterEtudiant(Etudiant etudiant){
        etudiantRepository.insert(etudiant);
    }

    public Etudiant rechercheEtudiantParMatricule(String matricule){
        return etudiantRepository.selectEtudiantByMatricule(matricule);
    }
   // public List<Etudiant> listerEtudiant(){
   //     return etudiantRepository.selectAllEtudiant();
   // }
}
