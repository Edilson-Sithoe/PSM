package projecto.jhpiego.ett.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import projecto.jhpiego.ett.R;
import projecto.jhpiego.ett.conection.DAOUpsOne;
import projecto.jhpiego.ett.model.UpsOne;

public class FormUPSOne extends AppCompatActivity {

    private Button btnBack, btnSave;
    private EditText txtOtherUPS, txtCapacityUPS,txtFreqPMUPS, txtNameOfMantUPS, txtComentUPS;
    private CheckBox chkYUPS, chkNUPS,chkWhoHospUPS, chkOpTheatreUPS, chkEmergRoomUPS, chkLabUPS, chkMaterUPS, chkLessUPS, chkB3_10UPS, chkB11_20UPS, chkMore20UPS;
    private CheckBox chkUPSY, chkUPSN, chkUPSPartly, chkUPSDontN, chkGIUUPS,chkGBNUUPS, chkIU_BNRUPS, chkIUNNTRUPS, chkOOSBRUPS, chkOOSAndNRUPS, chkStilInstPhaUPS, chkDontNUPS;
    private CheckBox chkPMYUPS, chkPMNUPS, chkPMITPHFUPS, chkPMPDIUPS, chkSubcontractedUPS,chkPMCMYUPS , chkPMCMNUPS, chkLoBYUPS, chkLoBNUPS;
    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_upsone);

        getSupportActionBar().hide();
        IniciarComponentes();

        DAOUpsOne dao = new DAOUpsOne();
    //    FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormUPSOne.this, TelaPrincipal.class);
                startActivity(i);
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