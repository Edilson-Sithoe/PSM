package projecto.jhpiego.ett.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import projecto.jhpiego.ett.R;
import projecto.jhpiego.ett.conection.DAOIdentifInter;
import projecto.jhpiego.ett.model.IdentInterView;

public class FormIdentiInterV extends AppCompatActivity {

    private Button btnBack, btnSave;
    private EditText  name, email,telefone, position, other, otherTwoo, id;
    String[] mensagens = {"Fill in all fields","Registration performed successfully"};
    private String identInterID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_identi_inter_v);

        getSupportActionBar().hide();
        IniciarComponentes();

        DAOIdentifInter dao = new DAOIdentifInter();
      //  FirebaseDatabase.getInstance().setPersistenceEnabled(true);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormIdentiInterV.this, TelaPrincipal.class);
                startActivity(i);
            }
        });
    }

    public void IniciarComponentes(){
        btnBack = findViewById(R.id.btn_back);
        btnSave = findViewById(R.id.btn_save);
        name = findViewById(R.id.idName);
        email = findViewById(R.id.idEmail);
        telefone = findViewById(R.id.idPhone);
        position = findViewById(R.id.idPos);

        other = findViewById(R.id.idOther);
        otherTwoo = findViewById(R.id.idOtherTwo);
    }

    public void LimparCampos() {
        name.setText("");
        email.setText("");
        telefone.setText("");
        position.setText("");
        other.setText("");
        otherTwoo.setText("");
    }
}