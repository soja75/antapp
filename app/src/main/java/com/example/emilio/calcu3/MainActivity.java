package com.example.emilio.calcu3;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public Button boton;
    public EditText mci;
    public EditText jci;
    public EditText tjc;
    public TextView m;
    public double aux2;
    public double aux3;
    public double aux4;
    public double aux5;
    public double aux6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton= findViewById(R.id.boton1);
        mci=findViewById(R.id.monto_cancha_input);
        jci=findViewById(R.id.jugadores_cancha_input);
        tjc=findViewById(R.id.total_jugadores_input);
        m=findViewById(R.id.monto_total);

        boton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"DefaultLocale", "SetTextI18n"})
            @Override
            public void onClick(View v) {
                try{

                    String aux2 = mci.getText().toString();
                    double aux22 = Double.parseDouble(aux2);

                    String aux3 = jci.getText().toString();
                    double aux33= Double.parseDouble(aux3);

                    String aux4 = tjc.getText().toString();
                    double aux44 = Double.parseDouble(aux4);

                    aux5 = aux22/(aux33*2);
                    aux6 = aux22/aux44;
                    Integer aux66 = (int) aux6 ;
                    Integer aux55 = (int) aux5;
                    String aux66s= Integer.toString(aux66);
                    String aux55s= Integer.toString(aux55);

                    if (aux66==aux55) {
                        m.setText("La cancha vale " + aux2 + " y cada uno paga " + aux66);
                    }
                    else {
                        m.setText("La cancha vale " + aux2 + " y cada uno paga " + aux66 + " , si el equipo estuviera completo , pagariamos " + aux55);
                    }
                    }catch(NumberFormatException ignored){}

            }
        });
    }
}
