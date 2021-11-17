package projecto.jhpiego.psm.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

import projecto.jhpiego.psm.R;
import projecto.jhpiego.psm.model.IdentInterView;

public class EditIdentInter extends AppCompatActivity {

    private Button btnBack, btnUpdate, btnDelete;
    private EditText name, email,telefone, position, other, otherTwoo;
    String[] mensagens = {"Fill to update","Update performed successfully","Deleted"};

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
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

        firebaseDatabase = FirebaseDatabase.getInstance();
   //     FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        databaseReference = firebaseDatabase.getReference("InterView").child(identiInterID);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String interName = name.getText().toString();
                String interEmail = email.getText().toString();
                String interTelefone = telefone.getText().toString();
                String interPosition = position.getText().toString();
                String interOther = other.getText().toString();
                String interOtherTwoo = otherTwoo.getText().toString();

                Map<String, Object> map = new HashMap<>();
                map.put("interName",interName);
                map.put("interEmail",interEmail);
                map.put("interTelefone",interTelefone);
                map.put("interPosition",interPosition);
                map.put("interOther",interOther);
                map.put("interOtherTwoo",interOtherTwoo);
                map.put("identiInterID",identiInterID);

                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        databaseReference.updateChildren(map);
                        Snackbar snackbar = Snackbar.make(v,mensagens[1],Snackbar.LENGTH_SHORT);
                        snackbar.setBackgroundTint(Color.BLUE);
                        snackbar.setTextColor(Color.WHITE);
                        snackbar.show();
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {
                        Snackbar snackbar = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_SHORT);
                        snackbar.setBackgroundTint(Color.BLUE);
                        snackbar.setTextColor(Color.WHITE);
                        snackbar.show();
                    }
                });
            }
        });
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
        databaseReference.removeValue();
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