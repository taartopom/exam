package com.sandra.biblotheque;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * @author Sandra Vanhove
 * @version 1.0
 * Examen CDA 2019
 */
public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    /*-----------------------------------------------------------------------------*/
    //les attributs
    /*-----------------------------------------------------------------------------*/
    /**
     * Declaration des pointeurs
     */

    private Button btnAdd, btnDelete,btnUpdate, btnReset;
    private TextView txtId, txtNom, txtPrenom, txtDateNaissance,txtPays;

    //pour la connection en base de donnees SQLite
    private Connexion connexion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton();

        txtId = findViewById(R.id.txtIdAuteur);
        txtNom = findViewById(R.id.txtNom);
        txtPrenom = findViewById(R.id.txtPrenom);
        txtDateNaissance = findViewById(R.id.txtDateNaissance);
        txtPays = findViewById(R.id.txtPays);

    /*-----------------------------------------------------------------------------*/
        //Test des methodes
    /*-----------------------------------------------------------------------------*/
        /**
         * Creation de l'espace memoire
         */
        connexion =  new Connexion(this);

        /*------------------------------------------------------------------------*/
        /**
         * Pour ajouter un auteur a la base
         */
        //connexion.insertAuteur("Dupont","michel","13/06/1967");
        //connexion.insertAuteur("Dupuis","jack,"15/08/1972");
        //connexion.insertAuteur("Dufour","george","07/05/1984");

        /*------------------------------------------------------------------------*/
        /**
         * Pour supprimer un auteur a la base
         */
        //Connexion.deleteAuteur(2);
    }
    /*------------------------------------------------------------------------------------------*/
    //Evenement ( faute de temps, je n'ai pas eu le temps de terminer)
    /*------------------------------------------------------------------------------------------*/
    @Override
    public void onClick(View view) {
        if (view.equals(btnAdd)){

            txtId.getText().toString();
            txtNom.getText().toString();
            txtPrenom.getText().toString();
            txtDateNaissance.getText().toString();;
            txtPays.getText().toString();



        }

        if(view.equals(btnDelete)){
            txtId.getText().toString();


        }

        if (view.equals(btnUpdate)){

        }

        if (view.equals(btnReset)){
            initButton();
            txtId.setText("");
            txtNom.setText("");
            txtPrenom.setText("");
            txtDateNaissance.setText("");
            txtPays.setText("");
        }

    }
    /*-----------------------------------------------------------------------------*/
    //factorisation
    /*-----------------------------------------------------------------------------*/
    public void initButton(){
        btnAdd = findViewById(R.id.btnAdd);
        btnDelete = findViewById(R.id.btnDelete);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnReset = findViewById(R.id.btnReset);
    }

    public void listenerButton(){
        btnAdd.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
        btnUpdate.setOnClickListener(this);
        btnReset.setOnClickListener(this);
;
    }
}
