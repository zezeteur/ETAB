package ci.digitalacademy.monetab.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Professeur extends Personne {

    private Boolean vacant;
    private String matiereEnseigne;
    private String prochainCours;
    private String sujetProchaineReunion;

    public Professeur() {
    }

    public Professeur(int id, Date dateNaissance, String ville, String nom, String prenom, String vacant, String matiereEnseigne
    , String prochainCours, String sujetProchaineReunion) {
        super(id, dateNaissance, ville, nom, prenom);
        this.vacant = Boolean.valueOf(vacant);
        this.matiereEnseigne = matiereEnseigne;
        this.prochainCours = prochainCours;
        this.sujetProchaineReunion = sujetProchaineReunion;
    }

    public Boolean getVacant() {
        return vacant;
    }

    public String getMatiereEnseigne() {
        return matiereEnseigne;
    }

    public String getProchainCours() {
        return prochainCours;
    }

    public String getSujetProchaineReunion() {
        return sujetProchaineReunion;
    }

    public void setVacant(Boolean vacant) {
        this.vacant = vacant;
    }

    public void setMatiereEnseigne(String matiereEnseigne) {
        this.matiereEnseigne = matiereEnseigne;
    }

    public void setProchainCours(String prochainCours) {
        this.prochainCours = prochainCours;
    }

    public void setSujetProchaineReunion(String sujetProchaineReunion) {
        this.sujetProchaineReunion = sujetProchaineReunion;
    }

    public void ajouter(Professeur professeur){

    }

    public void mettreAjour(Professeur professeur){

    }
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "models.Professeur ID: " + getId() +
                ", Nom: " + getNom() +
                ", Prénom: " + getPrenom() +
                ", Ville: " + getVille() +
                ", Date de Naissance: " + sdf.format(getDateNaissance()) +
                ", Vacant: " + getVacant()+
                ", Matiere: " + getMatiereEnseigne()+
                ", Prochain cours: " + getProchainCours()+
                ", Prochaine Reunion: " + getSujetProchaineReunion();

    }
}
