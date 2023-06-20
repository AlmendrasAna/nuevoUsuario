package com.example.nuevousuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText nameEdit = findViewById(R.id.nameTxt);
        EditText lastNameEdit = findViewById(R.id.lastnameTxt);
        EditText emailEdit = findViewById(R.id.emailTxt);
        EditText passworEdit = findViewById(R.id.passwordTxt);

        Button commitB = findViewById(R.id.buttonUser);
commitB.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(nameEdit.getText().toString().isEmpty() || lastNameEdit.getText().toString().isEmpty()
                || emailEdit.getText().toString().isEmpty() || passworEdit.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(), "faltan campos por completar ", Toast.LENGTH_SHORT).show();
            return;
        }
        if(!emailEdit.getText().toString().contains("@")){
            Toast.makeText(getBaseContext(), "correo invalido ", Toast.LENGTH_SHORT).show();
            return;
        }

        String mensaje= "Bienvenido nuevo usuario " + nameEdit.getText().toString()+ " " + lastNameEdit.getText().toString()
                + " Email " +emailEdit.getText().toString()+" contraseña "+ passworEdit.getText().toString();

        Toast.makeText(getBaseContext(), mensaje, Toast.LENGTH_LONG).show();

    }
});



    }
}