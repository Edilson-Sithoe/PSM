package projecto.jhpiego.psm.view;

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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import projecto.jhpiego.psm.R;

public class FormLogin extends AppCompatActivity {

    private TextInputEditText userName, password;
    private Button btn_login;
    private ProgressBar progressBar;
    private TextView registerTV;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        IniciarComponentes();

        mAuth = FirebaseAuth.getInstance();
        String[] mensagens = {"Fill in all fields","Login successfully","Fail to login"};

        registerTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormLogin.this, FormCadastro.class);
                startActivity(i);
            }
        });

    /*    btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormLogin.this, TelaPrincipal.class);
                startActivity(i);

            }
        });*/

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userN = userName.getText().toString();
                String passwd = password.getText().toString();

                if (TextUtils.isEmpty(userN) || TextUtils.isEmpty(passwd)) {
                    Snackbar snackbar = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                } else {
                    mAuth.signInWithEmailAndPassword(userN,passwd).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                progressBar.setVisibility(View.VISIBLE);
                                Snackbar snackbar = Snackbar.make(v,mensagens[1],Snackbar.LENGTH_SHORT);
                                snackbar.setBackgroundTint(Color.BLUE);
                                snackbar.setTextColor(Color.WHITE);
                                snackbar.show();
                                Intent i = new Intent(FormLogin.this, TelaPrincipal.class);
                                startActivity(i);
                                finish();
                            } else {
                                progressBar.setVisibility(View.GONE);
                                Snackbar snackbar = Snackbar.make(v,mensagens[2],Snackbar.LENGTH_SHORT);
                                snackbar.setBackgroundTint(Color.BLUE);
                                snackbar.setTextColor(Color.WHITE);
                                snackbar.show();
                            }
                        }
                    });
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user  = mAuth.getCurrentUser();
        if (user != null) {
            Intent i = new Intent(FormLogin.this, TelaPrincipal.class);
            startActivity(i);
            this.finish();
        }
    }

    public void IniciarComponentes(){
        userName = findViewById(R.id.idEditUserName);
        password = findViewById(R.id.idEditPassword);
        btn_login = findViewById(R.id.btn_register);
        progressBar = findViewById(R.id.progressbar);
        registerTV = findViewById(R.id.idTVLogin);
    }
}