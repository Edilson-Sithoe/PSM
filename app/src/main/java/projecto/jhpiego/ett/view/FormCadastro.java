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


import projecto.jhpiego.ett.R;

public class FormCadastro extends AppCompatActivity {

    private TextView usernameEdt, passwordEdt, confirmPassEdt;
    private Button btn_register;
    private ProgressBar progressBar;
    private TextView login;
    String[] mensagens = {"Fill in all fields","Insert the same password","Registration performed successfully"};
    String usuarioID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();
        IniciarCompontes();


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormCadastro.this, FormLogin.class);
                startActivity(i);
            }
        });

    }



    public void IniciarCompontes(){
        usernameEdt = findViewById(R.id.idEditUserName);
        passwordEdt = findViewById(R.id.idEditPassword);
        confirmPassEdt = findViewById(R.id.idEditConfPassword);
        btn_register = findViewById(R.id.btn_register);
        progressBar = findViewById(R.id.progressbar);
        login = findViewById(R.id.idTVLogin);
    }
}