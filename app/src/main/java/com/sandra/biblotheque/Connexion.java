package com.sandra.biblotheque;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import android.database.Cursor;

/**
 * @author Sandra Vanhove
 * @version 1.0
 * Examen CDA 2019
 */
public class Connexion extends SQLiteOpenHelper {
    /*-----------------------------------------------------------------------------*/
    //les attributs
    /*-----------------------------------------------------------------------------*/
    private static final String DATABASE_NAME =  "bibliotheque";
    private static final int DATABASE_VERSION  = 1;

    /*-----------------------------------------------------------------------------*/
    //Constructeur
    /*-----------------------------------------------------------------------------*/

    public Connexion(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /*-----------------------------------------------------------------------------*/
    //Les methodes
    /*-----------------------------------------------------------------------------*/
    /*  this.idAuteur = idAuteur;
        this.nomAuteur = nomAuteur;
        this.prenomAuteur = prenomAuteur;
        this.dateNaissanceAuteur = dateNaissanceAuteur;
        this.paysAuteur = paysAuteur;*/
    @Override
    public void onCreate(SQLiteDatabase DB) {
        String requete =  "CREATE table auteur(idAuteur INTEGER primary key autoincrement, nomAuteur text not null,prenomAuteur text not null,dateNaissanceAuteur text not null,paysAuteur text not null )";

        DB.execSQL(requete);


        Log.i("DB","Creation ok");
    }


    @Override
    public void onUpgrade(SQLiteDatabase DB, int oldVersion, int newVersion) {
        Log.i("DB","OnUpgrate ok");
    }
    /*-----------------------------------------------------------------------------*/
    // CRUD
    /*-----------------------------------------------------------------------------*/

        //pour ajouter un auteur
    public void insertAuteur( String nom, String prenom,String date_de_naissance){
        String req =  "INSERT INTO auteur(nom,prenom,naissance) values('" + nom + "','"+ prenom +"','"+ date_de_naissance +"')";
        this.getReadableDatabase().execSQL(req);

        Log.i("DB","insert ok");
    }

        //pour supprimer un auteur avec son id
    public void deleteAuteur(Integer idAuteur){
        String req =  "DELETE from auteur WHERE idAuteur = values('"+ idAuteur + "')";
        this.getReadableDatabase().execSQL(req);

        Log.i("DB", "suppression ok");
    }
        // pour modifier un auteur
    public void updateAuteur(Integer idAuteur){
        String req = "UPDATE form auteur WHERE idAuteur = values('"+idAuteur+"')";
        this.getReadableDatabase().execSQL(req);

        Log.i("DB","modificataion OK");
    }
    //Pour reccuperer la liste
    public List<Auteur> getAllAuteur(){
        List<Auteur> listeAuteur =  new ArrayList<>();

        String req =  "SELECT * from auteur";
        Cursor cursor = this.getReadableDatabase().rawQuery(req, null);
        cursor.moveToFirst();
        while(!cursor.isAfterLast()){
            Auteur unAuteur =  new Auteur(cursor.getInt(0),cursor.getString(1));
            listeAuteur.add(unAuteur);

            cursor.moveToNext();
        }
        cursor.close();
        return listeAuteur;
    }


}
