package projecto.jhpiego.psm.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.InterViewID;
import projecto.jhpiego.psm.R;
import projecto.jhpiego.psm.conection.DAOInterviewID;

public class FormInterviewID extends AppCompatActivity {

    private Button btnBack, btnSave;
    private EditText fullName, organization,dates, others,secInterV, secInterVTwoo;
    private CheckBox chkSet, chkPhone, chkEmail;
    String[] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    InterViewID interViewID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_interview_id);

        getSupportActionBar().hide();
        IniciarComponentes();

        DAOInterviewID dao = new DAOInterviewID();
      //  FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                InterViewID interViewID = new InterViewID(
                        fullName.getText().toString(),
                        organization.getText().toString(),
                        dates.getText().toString(),
                        chkSet.isChecked()? "OnSet" : "No",
                        chkPhone.isChecked()? "Phone" : "No",
                        chkEmail.isChecked()? "Email" : "No",
                        others.getText().toString(),
                        secInterV.getText().toString(),
                        secInterVTwoo.getText().toString());

                 if (fullName.getText().toString().isEmpty() || organization.getText().toString().isEmpty()|| dates.getText().toString().isEmpty()) {
                     Snackbar snackbar = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_SHORT);
                     snackbar.setBackgroundTint(Color.BLUE);
                     snackbar.setTextColor(Color.WHITE);
                     snackbar.show();
                 } else {
                     dao.add(interViewID).addOnCompleteListener(suc ->{
                         Snackbar snackbar = Snackbar.make(v,mensagens[2],Snackbar.LENGTH_SHORT);
                         snackbar.setBackgroundTint(Color.BLUE);
                         snackbar.setTextColor(Color.WHITE);
                         snackbar.show();
                         LimparCampos();
                     }).addOnFailureListener(er->{
                         Snackbar snackbar = Snackbar.make(v,mensagens[1],Snackbar.LENGTH_SHORT);
                         snackbar.setBackgroundTint(Color.BLUE);
                         snackbar.setTextColor(Color.WHITE);
                         snackbar.show();
                     });
                 }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormInterviewID.this, TelaPrincipal.class);
                startActivity(i);
            }
        });
    }

    public void IniciarComponentes(){
        fullName = findViewById(R.id.idFisrtUsar);
        organization = findViewById(R.id.idOrga);
        dates = findViewById(R.id.id_date_inter);
        /****************************************************/
        chkSet = findViewById(R.id.chkOnSet);
        chkPhone = findViewById(R.id.chkByPhone);
        chkEmail = findViewById(R.id.chkByEmail);
        /****************************************************/
        others = findViewById(R.id.id_other);
        secInterV = findViewById(R.id.idIntervThree);
        secInterVTwoo = findViewById(R.id.idIntervTwo);

        btnBack = findViewById(R.id.btn_back);
        btnSave = findViewById(R.id.btn_save);
    }

    public void LimparCampos() {
        fullName.setText("");
        organization.setText("");
        dates.setText("");

        others.setText("");
        secInterV.setText("");
        secInterVTwoo.setText("");
    }
}