import java.util.Scanner;

import entities.Classe;

public class ResponsablePegagogiqueView {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1-Ajouter une classe");
            System.out.println("2-Lister les classes");
            System.out.println("3-Ajouter des professeurs");
            System.out.println("4-Lister les professeurs");
            System.out.println("5-Filtrer les classes d'un professeur");
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                System.out.println("Entrez le niveau de la classe(L1, L2, L3)");
                String niveau=sc.nextLine();
                System.out.println("Entrez la filière de la classe");
                String filiere=sc.nextLine();
                Classe cl= new Classe();
                cl.setNiveau(niveau);
                cl.setFiliere(filiere);
               // classeService.ajouterClasse(cl);
                System.out.println("Classe ajoutée avec succés");


                    break;
                case 2:

                    break;

                case 3:

                    break;
            
                default:
                    break;
            }
        }while(choix!=5);
    }
}
    
    

