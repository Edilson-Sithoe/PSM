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
import projecto.jhpiego.ett.conection.DAOSolarEnergy;
import projecto.jhpiego.ett.model.SolarEnergy;

public class FormSolarEnergy extends AppCompatActivity {

    private Button btnBack, btnSave;
    private EditText txtOtherSE, txtCapacitySE,txtFreqPMSE, txtNameOfMantSE, txtComentSE;
    private CheckBox chkYSE, chkNSE,chkDNSE, chkWhoHospSE, chkOpTheatreSE, chkEmergRoomSE, chkLabSE, chkMaterSE, chkLessSE, chkB3_10SE, chkB11_20SE, chkMore20SE;
    private CheckBox chkSEY, chkSEN, chkSEPartly, chkSEDontN, chkGIUSE,chkGBNUSE, chkIU_BNRSE, chkIUNNTRSE, chkOOSBRSE, chkOOSAndNRSE, chkStilInstPhaSE, chkDontNSE;
    private CheckBox chkPMYSE, chkPMNSE,chkBISSSEDN,chkPMSEY,chkPMSEN, chkPMITPHFSE, chkPMPDISE, chkSubcontractedSE,chkPMCMYSE , chkPMCMNSE, chkLoBYSE, chkLoBNSE;
    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_solar_energy);

        getSupportActionBar().hide();
        IniciarComponentes();

        DAOSolarEnergy dao = new DAOSolarEnergy();
      //  FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(FormSolarEnergy.this, TelaPrincipal.class);
                startActivity(back);
            }
        });

    }

    public void IniciarComponentes(){
        btnBack = findViewById(R.id.btn_backSE);
        btnSave = findViewById(R.id.btn_saveSE);

        chkYSE = findViewById(R.id.idChkYesSE);
        chkNSE = findViewById(R.id.idChkNoSE);
        chkDNSE = findViewById(R.id.IdChkDontKnowSE);

        chkWhoHospSE = findViewById(R.id.idChkWhoHospSE);
        chkOpTheatreSE = findViewById(R.id.idChkOpTheatreSE);
        chkEmergRoomSE = findViewById(R.id.idChkEmergRoomSE);
        chkLabSE = findViewById(R.id.idChkLabSE);
        chkMaterSE = findViewById(R.id.idChkMaternSE);

        txtOtherSE = findViewById(R.id.idTxtOtherSE);

        chkLessSE = findViewById(R.id.idChkLessSE);
        chkB3_10SE = findViewById(R.id.idChkB3_10SE);
        chkB11_20SE = findViewById(R.id.idChkB11_20SE);
        chkMore20SE = findViewById(R.id.idChkMore20SE);

        chkSEY = findViewById(R.id.idChkSEY);
        chkSEN = findViewById(R.id.idChkSEN);
        chkSEPartly = findViewById(R.id.idChkSEPartly);
        chkSEDontN = findViewById(R.id.idChkSEDontN);

        chkGIUSE = findViewById(R.id.idChkGIUSE);
        chkGBNUSE = findViewById(R.id.idChkGBNUSE);
        chkIU_BNRSE = findViewById(R.id.idChkIU_BNRSE);
        chkIUNNTRSE = findViewById(R.id.idChkIUNNTRSE);
        chkOOSBRSE = findViewById(R.id.idchkOOSBRSE);
        chkOOSAndNRSE = findViewById(R.id.idChkOOSAndNRSE);
        chkStilInstPhaSE = findViewById(R.id.idChkStilInstPhaSE);
        chkDontNSE = findViewById(R.id.idChkDontNSE);

        txtCapacitySE = findViewById(R.id.idTxtCapSE);

        chkPMYSE = findViewById(R.id.idChkYSE);
        chkPMNSE = findViewById(R.id.idChkNSE);
        chkBISSSEDN = findViewById(R.id.idchkDNSE);

        chkPMSEY = findViewById(R.id.idChkPMYSE);
        chkPMSEN = findViewById(R.id.idChkPMNSE);

        chkPMITPHFSE = findViewById(R.id.idChkPMITPHFSE);
        chkPMPDISE = findViewById(R.id.idChkPMPDISE);
        chkSubcontractedSE = findViewById(R.id.idChkSubcontractedSE);

        txtFreqPMSE = findViewById(R.id.idTxtFreqSE);
        txtNameOfMantSE = findViewById(R.id.idTxtNameOfMantSE);

        chkPMCMYSE = findViewById(R.id.idChkPMCMYSE);
        chkPMCMNSE = findViewById(R.id.idChkPMCMNSE);
        chkLoBYSE = findViewById(R.id.idChkLoBYSE);
        chkLoBNSE = findViewById(R.id.idChkLoBNSE);

        txtComentSE = findViewById(R.id.idTxtComentSE);
    }

    public void LimparCampos() {
        txtCapacitySE.setText("");
        txtCapacitySE.setText("");
        txtFreqPMSE.setText("");
        txtComentSE.setText("");
        txtNameOfMantSE.setText("");
        txtOtherSE.setText("");
    }
}