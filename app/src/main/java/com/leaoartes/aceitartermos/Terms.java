package com.leaoartes.aceitartermos;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class Terms extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

    }

    public void acceptTerms (View view){

        AlertDialog.Builder alertDialogAcceptTerms = new AlertDialog.Builder(this);

        alertDialogAcceptTerms.setTitle("Confirmação Termos de Uso");
        alertDialogAcceptTerms.setMessage("Para continuar você precisa aceitar os termos de uso.");

        alertDialogAcceptTerms.setPositiveButton("Sim", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {

                /*Toast.makeText(getApplicationContext(), "Você aceitou os termos, pode continuar.",
                        Toast.LENGTH_LONG

                ).show();*/

                        Intent rateapp = new Intent(Terms.this,
                        RateApp.class);
                        startActivity(rateapp);

                        finish();
                    }

        });

        alertDialogAcceptTerms.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(getApplicationContext(), "Você recusou os termos, acesso negado.",
                        Toast.LENGTH_LONG

                ).show();

            }
        });

        alertDialogAcceptTerms.create();
        alertDialogAcceptTerms.show();
    }
}