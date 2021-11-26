package projecto.jhpiego.ett.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import java.util.HashMap;
import java.util.Map;

import projecto.jhpiego.ett.R;
import projecto.jhpiego.ett.model.IdentInterView;

public class EditIdentInter extends AppCompatActivity {

    private Button btnBack, btnUpdate, btnDelete;
    private EditText name, email,telefone, position, other, otherTwoo;
    String[] mensagens = {"Fill to update","Update performed successfully","Deleted"};

    private String identiInterID;
    private IdentInterView identInterView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_ident_inter);

        getSupportActionBar().hide();
        IniciarComponentes();

        identInterView = getIntent().getParcelableExtra("InterView");
        if (identInterView != null) {
            name.setText(identInterView.getNome());
            email.setText(identInterView.getEmail());
            telefone.setText(identInterView.getTelephone());
            position.setText(identInterView.getPosition());
            other.setText(identInterView.getOther());
            otherTwoo.setText(identInterView.getOtherTwo());
            identiInterID = identInterView.getIdentInterID();
        }


        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteIdentInter(v);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(EditIdentInter.this, FormIdentIntMenu.class);
                startActivity(i);
            }
        });
    }

    private void deleteIdentInter(View v){
        Snackbar snackbar = Snackbar.make(v,mensagens[2],Snackbar.LENGTH_SHORT);
        snackbar.setBackgroundTint(Color.BLUE);
        snackbar.setTextColor(Color.WHITE);
        snackbar.show();
        startActivity(new Intent(EditIdentInter.this, TelaPrincipal.class));
    }

    public void IniciarComponentes(){
        btnBack = findViewById(R.id.btn_back);
        btnDelete = findViewById(R.id.btn_delete);
        btnUpdate = findViewById(R.id.btn_update);
        name = findViewById(R.id.idName);
        email = findViewById(R.id.idEmail);
        telefone = findViewById(R.id.idPhone);
        position = findViewById(R.id.idPos);

        other = findViewById(R.id.idOther);
        otherTwoo = findViewById(R.id.idOtherTwo);


    }
}