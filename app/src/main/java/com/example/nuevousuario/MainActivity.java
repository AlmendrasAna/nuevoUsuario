package com.example.nuevousuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nuevousuario.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
binding = ActivityMainBinding.inflate(getLayoutInflater());
setContentView(binding.getRoot());

binding.buttonUser.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(binding.nameTxt.getText().toString().isEmpty() || binding.lastnameTxt.getText().toString().isEmpty()
                || binding.emailTxt.getText().toString().isEmpty() || binding.passwordTxt.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(), "faltan campos por completar ", Toast.LENGTH_SHORT).show();
            return;
        }
        if(!binding.emailTxt.getText().toString().contains("@")){
            Toast.makeText(getBaseContext(), "correo invalido ", Toast.LENGTH_SHORT).show();
            return;
        }

        String mensaje= "Bienvenido nuevo usuario " + binding.nameTxt.getText().toString()+ " " + binding.lastnameTxt.getText().toString()
                + " Email " +binding.emailTxt.getText().toString()+" contraseña "+ binding.passwordTxt.getText().toString();

        Toast.makeText(getBaseContext(), mensaje, Toast.LENGTH_LONG).show();

    }
});



    }
}