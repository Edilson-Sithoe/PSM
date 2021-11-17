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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;

import projecto.jhpiego.psm.R;

public class FormCadastro extends AppCompatActivity {

    private TextView usernameEdt, emailEdt, passwordEdt, confirmPassEdt;
    private Button btn_register;
    private ProgressBar progressBar;
    private TextView login;
    private FirebaseAuth mAuth;
    String[] mensagens = {"Fill in all fields","Insert the same password","Registration performed successfully"};
    String usuarioID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();
        IniciarCompontes();

        mAuth = FirebaseAuth.getInstance();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormCadastro.this, FormLogin.class);
                startActivity(i);
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = usernameEdt.getText().toString();
               // String email = emailEdt.getText().toString();
                String passWD = passwordEdt.getText().toString();
                String confPassWD = confirmPassEdt.getText().toString();

                if (!passWD.equalsIgnoreCase(confPassWD)){
                    Snackbar snackbar = Snackbar.make(v,mensagens[1],Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                } else if (TextUtils.isEmpty(userName) || (TextUtils.isEmpty(passWD) || TextUtils.isEmpty(confPassWD))){
                    Snackbar snackbar = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                } else {
                    mAuth.createUserWithEmailAndPassword(userName,passWD).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                progressBar.setVisibility(View.GONE);
                                Snackbar snackbar = Snackbar.make(v,mensagens[2],Snackbar.LENGTH_SHORT);
                                snackbar.setBackgroundTint(Color.BLUE);
                                snackbar.setTextColor(Color.WHITE);
                                snackbar.show();

                                Intent i = new Intent(FormCadastro.this,FormLogin.class);
                                startActivity(i);
                                finish();
                            } else {
                                String erro;
                                try {
                                    throw task.getException();

                                } catch (FirebaseAuthWeakPasswordException e) {
                                    erro = "Enter a minimum 6-digit password";
                                } catch (FirebaseAuthUserCollisionException e) {
                                    erro = "Account already exist";
                                } catch (FirebaseAuthInvalidCredentialsException e) {
                                    erro = "Invalid email";
                                } catch (Exception e){
                                    erro = "Error registering user";
                                }

                                Snackbar snackbar = Snackbar.make(v,erro,Snackbar.LENGTH_SHORT);
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

    public void IniciarCompontes(){
        usernameEdt = findViewById(R.id.idEditUserName);
     //   emailEdt = findViewById(R.id.idEditEmail);
        passwordEdt = findViewById(R.id.idEditPassword);
        confirmPassEdt = findViewById(R.id.idEditConfPassword);
        btn_register = findViewById(R.id.btn_register);
        progressBar = findViewById(R.id.progressbar);
        login = findViewById(R.id.idTVLogin);
    }
}