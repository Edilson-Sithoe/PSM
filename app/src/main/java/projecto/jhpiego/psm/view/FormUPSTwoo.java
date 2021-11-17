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

import projecto.jhpiego.psm.R;
import projecto.jhpiego.psm.conection.DAOUpsOne;
import projecto.jhpiego.psm.conection.DAOUpsTwoo;
import projecto.jhpiego.psm.model.UpsOne;
import projecto.jhpiego.psm.model.UpsTwoo;

public class FormUPSTwoo extends AppCompatActivity {

    private Button btnBack, btnSave;
    private EditText txtOtherUPS, txtCapacityUPS,txtFreqPMUPS, txtNameOfMantUPS, txtComentUPS;
    private CheckBox chkYUPS, chkNUPS,chkWhoHospUPS, chkOpTheatreUPS, chkEmergRoomUPS, chkLabUPS, chkMaterUPS, chkLessUPS, chkB3_10UPS, chkB11_20UPS, chkMore20UPS;
    private CheckBox chkUPSY, chkUPSN, chkUPSPartly, chkUPSDontN, chkGIUUPS,chkGBNUUPS, chkIU_BNRUPS, chkIUNNTRUPS, chkOOSBRUPS, chkOOSAndNRUPS, chkStilInstPhaUPS, chkDontNUPS;
    private CheckBox chkPMYUPS, chkPMNUPS, chkPMITPHFUPS, chkPMPDIUPS, chkSubcontractedUPS,chkPMCMYUPS , chkPMCMNUPS, chkLoBYUPS, chkLoBNUPS;
    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_ups_twoo);

        getSupportActionBar().hide();
        IniciarComponentes();

        DAOUpsTwoo dao = new DAOUpsTwoo();
     //   FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormUPSTwoo.this, TelaPrincipal.class);
                startActivity(i);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UpsTwoo upsTwoo = new UpsTwoo(
                        chkYUPS.isChecked() ? "Yes" : "",
                        chkNUPS.isChecked() ? "No" : "",

                        chkWhoHospUPS.isChecked() ? "The whole hospital" : "",
                        chkOpTheatreUPS.isChecked() ? "Operating theatre" : "",
                        chkEmergRoomUPS.isChecked() ? "Emergency Room" : "",
                        chkLabUPS.isChecked() ? "Laboratory" : "",
                        chkMaterUPS.isChecked() ? "Maternity" : "",

                        txtOtherUPS.getText().toString(),

                        chkLessUPS.isChecked() ? "Less than 3 years" : "",
                        chkB3_10UPS.isChecked() ? "Between 3-10 years" : "",
                        chkB11_20UPS.isChecked() ? "Between 11-20 years" : "",
                        chkMore20UPS.isChecked() ? "More than 20 years " : "",

                        chkUPSY.isChecked() ? "Yes" : "",
                        chkUPSN.isChecked() ? "No" : "",
                        chkUPSPartly.isChecked() ? "Partly" : "",
                        chkUPSDontN.isChecked() ? "Don’t know" : "",

                        chkGIUUPS.isChecked() ? "Good and in use" : "",
                        chkGBNUUPS.isChecked() ? "Good, but not in use" : "",
                        chkIU_BNRUPS.isChecked() ? "In use, but needs repair" : "",
                        chkIUNNTRUPS.isChecked() ? "In use, but needs to be replaced" : "",
                        chkOOSBRUPS.isChecked() ? "Out of service, but repairable" : "",
                        chkOOSAndNRUPS.isChecked() ? "Out of service and needs to be replaced" : "",
                        chkStilInstPhaUPS.isChecked() ? "Still in the installation phase" : "",
                        chkDontNUPS.isChecked() ? "Don’t know " : "",

                        txtCapacityUPS.getText().toString(),

                        chkPMYUPS.isChecked() ? "Yes" : "",
                        chkPMNUPS.isChecked() ? "No" : "",

                        chkPMITPHFUPS.isChecked() ? "Internal Technical Personnel of the Health Facility" : "",
                        chkPMPDIUPS.isChecked() ? "Personnel from the Department of Infrastructure" : "",
                        chkSubcontractedUPS.isChecked() ? "Subcontracted" : "",

                        txtFreqPMUPS.getText().toString(),
                        txtNameOfMantUPS.getText().toString(),

                        chkPMCMYUPS.isChecked() ? "Yes" : "",
                        chkPMCMNUPS.isChecked() ? "No" : "",
                        chkLoBYUPS.isChecked() ? "Yes" : "",
                        chkLoBNUPS.isChecked() ? "No" : "",

                        txtComentUPS.getText().toString());

                if (txtCapacityUPS.getText().toString().isEmpty() || txtNameOfMantUPS.getText().toString().isEmpty() || txtFreqPMUPS.getText().toString().isEmpty()) {
                    Snackbar snackbar = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                } else {
                    dao.add(upsTwoo).addOnCompleteListener(suc ->{
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

    }

    public void IniciarComponentes(){
        btnBack = findViewById(R.id.btn_back);
        btnSave = findViewById(R.id.btn_save);

        chkYUPS = findViewById(R.id.idChkYesUPS);
        chkNUPS = findViewById(R.id.idChkNoUPS);

        chkWhoHospUPS = findViewById(R.id.idChkWhoHospUPS);
        chkOpTheatreUPS = findViewById(R.id.idChkOpTheatreUPS);
        chkEmergRoomUPS = findViewById(R.id.idChkEmergRoomUPS);
        chkLabUPS = findViewById(R.id.idChkLabUPS);
        chkMaterUPS = findViewById(R.id.idChkMaternUPS);

        txtOtherUPS = findViewById(R.id.idTxtOtherUPS);

        chkLessUPS = findViewById(R.id.idChkLessUPS);
        chkB3_10UPS = findViewById(R.id.idChkB3_10UPS);
        chkB11_20UPS = findViewById(R.id.idChkB11_20UPS);
        chkMore20UPS = findViewById(R.id.idChkMore20UPS);

        chkUPSY = findViewById(R.id.idChkUPSY);
        chkUPSN = findViewById(R.id.idChkUPSN);
        chkUPSPartly = findViewById(R.id.idChkUPSPartly);
        chkUPSDontN = findViewById(R.id.idChkUPSDontN);

        chkGIUUPS = findViewById(R.id.idChkGIUUPS);
        chkGBNUUPS = findViewById(R.id.idChkGBNUUPS);
        chkIU_BNRUPS = findViewById(R.id.idChkIU_BNRUPS);
        chkIUNNTRUPS = findViewById(R.id.idChkIUNNTRUPS);
        chkOOSBRUPS = findViewById(R.id.idchkOOSBRUPS);
        chkOOSAndNRUPS = findViewById(R.id.idChkOOSAndNRUPS);
        chkStilInstPhaUPS = findViewById(R.id.idChkStilInstPhaUPS);
        chkDontNUPS = findViewById(R.id.idChkDontNUPS);

        txtCapacityUPS = findViewById(R.id.idTxtCapUPS);

        chkPMYUPS = findViewById(R.id.idChkPMYUPS);
        chkPMNUPS = findViewById(R.id.idChkPMNUPS);

        chkPMITPHFUPS = findViewById(R.id.idChkPMITPHFUPS);
        chkPMPDIUPS = findViewById(R.id.idChkPMPDIUPS);
        chkSubcontractedUPS = findViewById(R.id.idChkSubcontractedUPS);

        txtFreqPMUPS = findViewById(R.id.idTxtFreqUPS);
        txtNameOfMantUPS = findViewById(R.id.idTxtNameOfMantUPS);

        chkPMCMYUPS = findViewById(R.id.idChkPMCMYUPS);
        chkPMCMNUPS = findViewById(R.id.idChkPMCMNUPS);
        chkLoBYUPS = findViewById(R.id.idChkLoBYUPS);
        chkLoBNUPS = findViewById(R.id.idChkLoBNUPS);

        txtComentUPS = findViewById(R.id.idTxtComentUPS);
    }

    public void LimparCampos() {
        txtCapacityUPS.setText("");
        txtCapacityUPS.setText("");
        txtFreqPMUPS.setText("");
        txtComentUPS.setText("");
        txtNameOfMantUPS.setText("");
    }
}