package com.example.hpomen06.registro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText lblNombre,lblApellido;
    RadioButton rbtCasado, rbtSoltero;
    RadioGroup rg;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblNombre=findViewById(R.id.lblNombre);
        lblApellido=findViewById(R.id.lblApellido);
        rbtCasado=findViewById(R.id.rbtCasado);
        rbtSoltero=findViewById(R.id.rbtSoltero);
        rg=findViewById(R.id.rg);
        btnGuardar=findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rg.getCheckedRadioButtonId()==-1 || lblNombre.length()<1 || lblApellido.length()<1) {
                    Toast.makeText(getApplicationContext(),"Complete todos los campos",Toast.LENGTH_LONG).show();

                }else {

                    Intent intent=new Intent(MainActivity.this,Lista.class);
                    intent.putExtra("usuario",lblNombre.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}
