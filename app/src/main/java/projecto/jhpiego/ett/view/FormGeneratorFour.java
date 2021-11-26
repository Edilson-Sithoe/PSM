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
import projecto.jhpiego.ett.conection.DAOGeneratorFour;
import projecto.jhpiego.ett.model.GeneratorFour;

public class FormGeneratorFour extends AppCompatActivity {

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
        setContentView(R.layout.activity_form_generator_four);

        getSupportActionBar().hide();
        IniciarComponentes();

        DAOGeneratorFour dao = new DAOGeneratorFour();
      //  FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormGeneratorFour.this, TelaPrincipal.class);
                startActivity(i);
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