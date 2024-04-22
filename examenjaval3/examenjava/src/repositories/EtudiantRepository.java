package repositories;
import entities.Etudiant;

import java.sql.ResultSet;
import java.sql.SQLException;


public class EtudiantRepository extends Database {
    private final String SQL_INSERT="INSERT INTO `etudiant` ( `matricule`, `nomComplet`, `tuteur`) VALUES (?,?,?);";
    private final String SQL_SELECT_BY_MATRICULE="SELECT * FROM `etudiant` where matricule like ? ";

    public void insert(Etudiant etudiant){
        try {
             ouvrirConnexion();
             initPrepareStatement(SQL_INSERT);
             statement.setString(1,etudiant.getMatricule());
             statement.setString(2,etudiant.getNomcomplet());
             statement.setString(3,etudiant.getTuteur());
             executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Etudiant selectEtudiantByMatricule(String mat){
        Etudiant etudiant = null;
        try{
            ouvrirConnexion();
            initPrepareStatement(SQL_SELECT_BY_MATRICULE);
            statement.setString(1,mat);
            ResultSet rs=executeSelect();
            if(rs.next()){
                 etudiant=new Etudiant();
                 etudiant.setMatricule(rs.getString ("matricule"));
                 etudiant.setNomcomplet(rs.getString("nomComplet"));
                 etudiant.setTuteur(rs.getString("tuteur"));
              

            }
            statement.close();
            rs.close();
            conn.close();

        }catch (SQLException e) {
            System.out.println("Erreur de connexion à la BD");
        }
        return etudiant;
    }
    
}
