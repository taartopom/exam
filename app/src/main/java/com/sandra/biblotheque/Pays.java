package com.sandra.biblotheque;

/**
 * @author Sandra Vanhove
 * @version 1.0
 * Examen CDA 2019
 */

public class Pays {
    /*-----------------------------------------------------------------------------*/
    //les attributs
    /*-----------------------------------------------------------------------------*/
    private int idPays;
    private String nomPays;

    /*-----------------------------------------------------------------------------*/
    //Constructeur
    /*-----------------------------------------------------------------------------*/

    public Pays(int idPays, String nomPays) {
        this.idPays = idPays;
        this.nomPays = nomPays;
    }

    public Pays(int idPays) {
        this.idPays = idPays;
    }

    public Pays(String nomPays) {
        this.nomPays = nomPays;
    }

    public Pays() {
    }
    /*-----------------------------------------------------------------------------*/
    //Getter
    /*-----------------------------------------------------------------------------*/

    public int getIdPays() {
        return idPays;
    }

    public String getNomPays() {
        return nomPays;
    }
    /*-----------------------------------------------------------------------------*/
    //Setter
    /*-----------------------------------------------------------------------------*/

    public void setIdPays(int idPays) {
        this.idPays = idPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "idPays=" + idPays +
                ", nomPays='" + nomPays + '\'' +
                '}';
    }
}
