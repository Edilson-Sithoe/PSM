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
import projecto.jhpiego.psm.conection.DAOGeneratorThree;
import projecto.jhpiego.psm.model.GeneratorThree;

public class FormGeneratorThree extends AppCompatActivity {

    private Button btnBack, btnSave;
    private EditText txtComent, txtNameOfMant,txtFreqPM, txtOther, txtCapacity;
    private CheckBox chkNo, chkYes,chkDontKnow, chkWhoHosp, chkOpTheatre, chkEmergRoom, chkLab, chkLess, chkB3_10, chkB11_20, chkMore20;
    private CheckBox chkGENY, chkGENN, chkGENPartly, chkGENDontN, chkGIU,chkGBNU, chkIU_BNR, chkIUNNTR, chkOOSBR, chkOOSAndNR, chkStilInstPha, chkDontN,chkY;
    private CheckBox chkN, chkDN, chkATSN, chkATSPartly, chkATDontN,chkFuelY , chkFuelN, chkPMY, chkPMN;
    private CheckBox chkPMITPHF, chkPMPDI, chkSubcontracted, chkPMCMY,chkPMCMN, chkLoBY, chkLoBN;
    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_generator_three);

        getSupportActionBar().hide();
        IniciarComponentes();

        DAOGeneratorThree dao = new DAOGeneratorThree();
     //   FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormGeneratorThree.this, TelaPrincipal.class);
                startActivity(i);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GeneratorThree generatorThree = new GeneratorThree(
                        chkYes.isChecked()? "Yes":"",
                        chkNo.isChecked()? "No":"No",
                        chkDontKnow.isChecked()? "Don't Know":"",
                        chkWhoHosp.isChecked()? "The whole hospital":"",
                        chkOpTheatre.isChecked()? "Operating theatre":"",
                        chkEmergRoom.isChecked()? "Emergency Room":"",
                        chkLab.isChecked()? "Laboratory":"",
                        txtOther.getText().toString(),
                        chkLess.isChecked()? "Less than 3 years":"",
                        chkB3_10.isChecked()? "Between 3-10 years":"",
                        chkB11_20.isChecked()? "Between 11-20 years":"",
                        chkMore20.isChecked()? "More than 20 years ":"",
                        chkGENY.isChecked()? "Yes":"",
                        chkGENN.isChecked()? "No":"",
                        chkGENPartly.isChecked()? "Partly":"",
                        chkGENDontN.isChecked()? "Don’t know":"",
                        chkGIU.isChecked()? "Good and in use":"",
                        chkGBNU.isChecked()? "Good, but not in use":"",
                        chkIU_BNR.isChecked()? "In use, but needs repair":"",
                        chkIUNNTR.isChecked()? "In use, but needs to be replaced":"",
                        chkOOSBR.isChecked()? "Out of service, but repairable":"",
                        chkOOSAndNR.isChecked()? "Out of service and needs to be replaced":"",
                        chkStilInstPha.isChecked()? "Still in the installation phase":"",
                        chkDontN.isChecked()? "Don’t know ":"",
                        chkY.isChecked()? "Yes ":"",
                        chkN.isChecked()? "No":"",
                        chkDN.isChecked()? "Don’t know":"",
                        chkATSN.isChecked()? "Yes":"",
                        chkATSN.isChecked()? "No":"No",
                        chkATSPartly.isChecked()? "Partly  ":"",
                        chkATDontN.isChecked()? "Don’t know":"",
                        chkFuelY.isChecked()? "Yes":"",
                        chkFuelN.isChecked()? "No":"",
                        txtCapacity.getText().toString(),
                        chkPMY.isChecked()? "Yes":"",
                        chkPMN.isChecked()? "No":"",
                        chkPMITPHF.isChecked()? "Internal Technical Personnel of the Health Facility":"",
                        chkPMPDI.isChecked()? "Personnel from the Department of Infrastructure":"",
                        chkSubcontracted.isChecked()? "Subcontracte":"",
                        txtFreqPM.getText().toString(),
                        txtNameOfMant.getText().toString(),
                        chkPMCMY.isChecked()? "Yes":"",
                        chkPMCMN.isChecked()? "No":"",
                        chkLoBY.isChecked()? "Yes":"",
                        chkLoBN.isChecked()? "No":"",
                        txtComent.getText().toString());

                if (txtCapacity.getText().toString().isEmpty() || txtFreqPM.getText().toString().isEmpty() || txtNameOfMant.getText().toString().isEmpty()) {
                    Snackbar snackbar = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                } else {
                    dao.add(generatorThree).addOnCompleteListener(suc ->{
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

        chkNo = findViewById(R.id.idChkNo);
        chkYes = findViewById(R.id.idChkYes);
        chkDontKnow = findViewById(R.id.IdChkDontKnow);
        chkWhoHosp = findViewById(R.id.idChkWhoHosp);
        chkOpTheatre = findViewById(R.id.idChkOpTheatre);
        chkEmergRoom = findViewById(R.id.idChkEmergRoom);
        chkLab = findViewById(R.id.idChkLab);
        chkLess = findViewById(R.id.idChkLess);
        chkB3_10 = findViewById(R.id.idChkB3_10);
        chkB11_20 = findViewById(R.id.idChkB11_20);
        chkMore20 = findViewById(R.id.idChkMore20);

        chkGENY = findViewById(R.id.idChkGENY);
        chkGENN = findViewById(R.id.idChkGENN);
        chkGENPartly = findViewById(R.id.idChkGENPartly);
        chkGENDontN = findViewById(R.id.idChkGENDontN);
        chkGIU = findViewById(R.id.idChkGIU);
        chkGBNU = findViewById(R.id.idChkGBNU);

        chkIU_BNR = findViewById(R.id.idChkIU_BNR);
        chkIUNNTR = findViewById(R.id.idChkIUNNTR);

        chkOOSBR = findViewById(R.id.idchkOOSBR);
        chkOOSAndNR = findViewById(R.id.idChkOOSAndNR);
        chkStilInstPha = findViewById(R.id.idChkStilInstPha);
        chkDontN = findViewById(R.id.idChkDontN);

        chkY = findViewById(R.id.idChkY);
        chkN = findViewById(R.id.idChkN);
        chkDN = findViewById(R.id.idChkDontN);
        chkATSN = findViewById(R.id.idChkATSN);

        chkATSPartly = findViewById(R.id.idChkATSPartly);
        chkATDontN = findViewById(R.id.idChkDontN);
        chkFuelY = findViewById(R.id.idChkFuelY);

        chkFuelN = findViewById(R.id.idChkFuelN);
        chkPMY = findViewById(R.id.idChkPMY);
        chkPMN = findViewById(R.id.idChkPMN);
        chkPMITPHF = findViewById(R.id.idChkPMITPHF);

        chkPMPDI = findViewById(R.id.idChkPMPDI);
        chkSubcontracted = findViewById(R.id.idChkSubcontracted);
        chkPMCMY = findViewById(R.id.idChkPMCMY);
        chkPMCMN = findViewById(R.id.idChkPMCMN);
        chkLoBY = findViewById(R.id.idChkLoBY);
        chkLoBN = findViewById(R.id.idChkLoBN);
        txtComent = findViewById(R.id.idTxtComent);
        txtNameOfMant = findViewById(R.id.idTxtNameOfMant);
        txtFreqPM = findViewById(R.id.idTxtFreq);
        txtOther = findViewById(R.id.idTxtOther);
        txtCapacity = findViewById(R.id.idTxtCapGen);
    }

    public void LimparCampos() {
        txtOther.setText("");
        txtComent.setText("");
        txtFreqPM.setText("");
        txtNameOfMant.setText("");
    }
}