package projecto.jhpiego.ett.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;


import projecto.jhpiego.ett.R;

public class FormLogin extends AppCompatActivity {

    private TextInputEditText userName, password;
    private Button btn_login;
    private ProgressBar progressBar;
    private TextView registerTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        IniciarComponentes();


        String[] mensagens = {"Fill in all fields","Login successfully","Fail to login"};

        registerTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormLogin.this, FormCadastro.class);
                startActivity(i);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormLogin.this, TelaPrincipal.class);
                startActivity(i);

            }
        });

    }


    public void IniciarComponentes(){
        userName = findViewById(R.id.idEditUserName);
        password = findViewById(R.id.idEditPassword);
        btn_login = findViewById(R.id.btn_register);
        progressBar = findViewById(R.id.progressbar);
        registerTV = findViewById(R.id.idTVLogin);
    }
}