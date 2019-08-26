package com.example.tallerandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void colorRojo(View view){
      findViewById(R.id.layoutmain).setBackgroundColor(Color.parseColor("#F4350D"));
        findViewById(R.id.lbltitulo).setBackgroundColor(Color.parseColor("#F4350D"));
      Toast notificacion = Toast.makeText(this,"Color Rojo",Toast.LENGTH_LONG);
      notificacion.show();
    }

    public void colorAzul(View view){
        findViewById(R.id.layoutmain).setBackgroundColor(Color.parseColor("#0A1FF5"));
        findViewById(R.id.lbltitulo).setBackgroundColor(Color.parseColor("#0A1FF5"));
        Toast notificacion = Toast.makeText(this,"Color Azul",Toast.LENGTH_LONG);
        notificacion.show();
    }

    public void colorRosado(View view){
        findViewById(R.id.layoutmain).setBackgroundColor(Color.parseColor("#C80A83"));
        findViewById(R.id.lbltitulo).setBackgroundColor(Color.parseColor("#C80A83"));
        Toast notificacion = Toast.makeText(this,"Color Rosado",Toast.LENGTH_LONG);
        notificacion.show();
    }

    public void colorAmarillo(View view){
        findViewById(R.id.layoutmain).setBackgroundColor(Color.parseColor("#E8F20B"));
        findViewById(R.id.lbltitulo).setBackgroundColor(Color.parseColor("#E8F20B"));
        Toast notificacion = Toast.makeText(this,"Color Amarillo",Toast.LENGTH_LONG);
        notificacion.show();
    }

    public void colorReset(View view){
        findViewById(R.id.layoutmain).setBackgroundColor(Color.parseColor("#FFFFFF"));
        findViewById(R.id.lbltitulo).setBackgroundColor(Color.parseColor("#FFFFFF"));
        Toast notificacion = Toast.makeText(this,"Reset Color",Toast.LENGTH_LONG);
        notificacion.show();
    }
}
