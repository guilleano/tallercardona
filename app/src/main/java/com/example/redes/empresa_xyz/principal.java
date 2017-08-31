package com.example.redes.empresa_xyz;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;


public class principal extends AppCompatActivity {
    private TextView valorManilla;
    private EditText cantidadManillas;
    private Resources resources;
    private Spinner dije;
    private Spinner tipo;
    private Spinner material;
    private Spinner tipoMoneda;
    private String Materi[];
    private String Dij[];
    private String Tip[];
    private String TipMone[];
    private ArrayAdapter<String> adapter, adapter1, adapter2, adapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        valorManilla = (TextView) findViewById(R.id.lblValorManilla);
        cantidadManillas = (EditText) findViewById(R.id.txtcantidadManillas);
        dije = (Spinner) findViewById(R.id.cmbdije);
        tipo = (Spinner) findViewById(R.id.cmbtipo);
        material = (Spinner) findViewById(R.id.cmbmaterial);
        tipoMoneda = (Spinner) findViewById(R.id.cmbTipoMoneda);
        resources = this.getResources();
        Materi = resources.getStringArray(R.array.Materi);
        Dij = resources.getStringArray(R.array.Dij);
        Tip = resources.getStringArray(R.array.Tip);
        TipMone = resources.getStringArray(R.array.TipMone);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Materi);
        material.setAdapter(adapter);
        adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Dij);
        dije.setAdapter(adapter1);
        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Tip);
        tipo.setAdapter(adapter2);
        adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, TipMone);
        tipoMoneda.setAdapter(adapter3);

    }

    public boolean validar(){

        if(cantidadManillas.getText().toString().isEmpty()){
            cantidadManillas.setError(resources.getString(R.string.msm_error_uno));

            return false;
        }

        return true;
    }

    public void calcular(View v) {
        int precio = 0, cant, total;
        if (validar()) {


            cant = Integer.parseInt(cantidadManillas.getText().toString());

            if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 0) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 100;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 0) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 100 * 3200;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 1) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 100;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 1) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 100 * 3200;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 2) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 80;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 2) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 80 * 3200;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 3) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 70;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 3) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 70 * 3200;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 0) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 120;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 0) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 120 * 3200;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 1) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 120;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 1) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 120 * 3200;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 2) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 100;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 2) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 100 * 3200;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 3) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 90;
            } else if ((material.getSelectedItemPosition() == 0) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 3) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 90 * 3200;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 0) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 90;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 0) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 90 * 3200;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 1) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 90;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 1) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 90 * 3200;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 2) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 70;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 2) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 70 * 3200;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 3) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 50;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 0) && (tipo.getSelectedItemPosition() == 3) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 50 * 3200;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 0) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 110;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 0) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 110 * 3200;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 1) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 110;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 1) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 110 * 3200;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 2) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 90;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 2) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 90 * 3200;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 3) && (tipoMoneda.getSelectedItemPosition() == 0)) {
                precio = 80;
            } else if ((material.getSelectedItemPosition() == 1) && (dije.getSelectedItemPosition() == 1) && (tipo.getSelectedItemPosition() == 3) && (tipoMoneda.getSelectedItemPosition() == 1)) {
                precio = 80 * 3200;
            }
            total = precio * cant;
            valorManilla.setText( " " + total);
        }
    }




    public void borrar(View v){
        cantidadManillas.setText("");
        valorManilla.setText("");
        valorManilla.requestFocus();
        cantidadManillas.requestFocus();
        dije.setSelection(0);
        tipo.setSelection(0);
        tipoMoneda.setSelection(0);
        material.setSelection(0);
    }

}