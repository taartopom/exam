package com.sandra.biblotheque;
import java.util.List;
/**
 * @author Sandra Vanhove
 * @version 1.0
 * Examen CDA 2019
 */

public class Auteur {
   /*-----------------------------------------------------------------------------*/
    //les attributs
    /*-----------------------------------------------------------------------------*/
    private int idAuteur;
    private String nomAuteur;
    private String prenomAuteur;
    private String dateNaissanceAuteur;
    private Pays paysAuteur;
    private List<Auteur> listeAuteur;

    /*-----------------------------------------------------------------------------*/
    //Constructeur
    /*-----------------------------------------------------------------------------*/

    public Auteur(int idAuteur, String nomAuteur, String prenomAuteur, String dateNaissanceAuteur, Pays paysAuteur) {
        this.idAuteur = idAuteur;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
        this.dateNaissanceAuteur = dateNaissanceAuteur;
        this.paysAuteur = paysAuteur;
    }

    public Auteur(int idAuteur, String nomAuteur, String prenomAuteur, String dateNaissanceAuteur, Pays paysAuteur, List<Auteur> listecat) {
        this.idAuteur = idAuteur;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
        this.dateNaissanceAuteur = dateNaissanceAuteur;
        this.paysAuteur = paysAuteur;
        this.listeAuteur = listeAuteur;
    }

    public Auteur(int idAuteur, String nomAuteur, String prenomAuteur, String dateNaissanceAuteur) {
        this.idAuteur = idAuteur;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
        this.dateNaissanceAuteur = dateNaissanceAuteur;
    }

    public Auteur(List<Auteur> listecat) {
        this.listeAuteur = listeAuteur;
    }

    public Auteur() {
        paysAuteur =  new Pays();
    }


    /*-----------------------------------------------------------------------------*/
    //Getter
    /*-----------------------------------------------------------------------------*/

    public int getIdAuteur() {
        return idAuteur;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public String getPrenomAuteur() {
        return prenomAuteur;
    }

    public String getDateNaissanceAuteur() {
        return dateNaissanceAuteur;
    }

    public Pays getPaysAuteur() {
        return paysAuteur;
    }

    public List<Auteur> getListeAuteur() {
        return listeAuteur;
    }
    /*-----------------------------------------------------------------------------*/
    //Setter
    /*-----------------------------------------------------------------------------*/

    public void setIdAuteur(int idAuteur) {
        this.idAuteur = idAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public void setPrenomAuteur(String prenomAuteur) {
        this.prenomAuteur = prenomAuteur;
    }

    public void setDateNaissanceAuteur(String dateNaissanceAuteur) {
        this.dateNaissanceAuteur = dateNaissanceAuteur;
    }

    public void setPaysAuteur(Pays paysAuteur) {
        this.paysAuteur = paysAuteur;
    }

    public void setListeAuteur(List<Auteur> listeAuteur) {
        this.listeAuteur = listeAuteur;
    }
    /*-----------------------------------------------------------------------------*/
    //toString
    /*-----------------------------------------------------------------------------*/

    @Override
    public String toString() {
        return "Auteur{" +
                "idAuteur=" + idAuteur +
                ", nomAuteur='" + nomAuteur + '\'' +
                ", prenomAuteur='" + prenomAuteur + '\'' +
                ", dateNaissanceAuteur='" + dateNaissanceAuteur + '\'' +
                ", paysAuteur=" + paysAuteur +
                ", listeAuteur=" + listeAuteur +
                '}';
    }
    /*-----------------------------------------------------------------------------*/
    //CRUD
    /*-----------------------------------------------------------------------------*/

}
