package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Eleve extends Personne {
    private String classe;
    private String matricule;


    public Eleve() {
    }


    public Eleve(int id, Date dateNaissance, String ville, String nom, String prenom, String classe, String matricule) {
        super(id, dateNaissance, ville, nom, prenom);
        this.classe = classe;
        this.matricule = matricule;
    }

    public String getClasse() {
        return classe;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public void supprimer(int identifiant) {
        // Implémentation de la suppression d'un élève
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Élève ID: " + getId() +
                ", Nom: " + getNom() +
                ", Prénom: " + getPrenom() +
                ", Ville: " + getVille() +
                ", Date de Naissance: " + sdf.format(getDateNaissance()) +
                ", Classe: " + getClasse() +
                ", Matricule: " + getMatricule();
    }
}
