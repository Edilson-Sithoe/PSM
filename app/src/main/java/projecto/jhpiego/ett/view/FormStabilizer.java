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
import projecto.jhpiego.ett.conection.DAOStabilizer;
import projecto.jhpiego.ett.model.Stabilizer;

public class FormStabilizer extends AppCompatActivity {

    private Button btnBack, btnSave;
    private EditText txtComent, txtNameOfMant,txtFreqPM, txtOther, txtCapacity;
    private CheckBox chkStaY, chkStaN,chkWhoHosp,chkOpTheatre,chkEmergRoom, chkLess, chkB3_10, chkB11_20, chkMore20;
    private CheckBox chkSTABY, chkSTABN, chkSTABPartly, chkSTABDontN,chkLab, chkMatern, chkGIU,chkGBNU, chkIU_BNR, chkIUNNTR;
    private CheckBox chkOOSBR, chkOOSAndNR, chkStilInstPha, chkDontN,chkY, chkN;
    private CheckBox chkPMY, chkPMN;
    private CheckBox chkPMITPHF, chkPMPDI, chkSubcontracted, chkPMCMY,chkPMCMN, chkLoBY, chkLoBN;
    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_stabilizer);

        getSupportActionBar().hide();
        IniciarComponentes();

        DAOStabilizer dao = new DAOStabilizer();
      //  FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormStabilizer.this, TelaPrincipal.class);
                startActivity(i);
            }
        });

    }

    public void IniciarComponentes(){
        btnBack = findViewById(R.id.btn_backSTAB);
        btnSave = findViewById(R.id.btn_saveSTAB);

        chkStaY = findViewById(R.id.idChkYesSTAB);
        chkStaN = findViewById(R.id.idChkNoSTAB);

        chkLab = findViewById(R.id.idChkLab);
        chkLess = findViewById(R.id.idChkLessSis);
        chkB3_10 = findViewById(R.id.idChkB3_10Sis);
        chkB11_20 = findViewById(R.id.idChkB11_20Sis);
        chkMore20 = findViewById(R.id.idChkMore20Sis);

        chkSTABY = findViewById(R.id.idChkSTABY);
        chkSTABN = findViewById(R.id.idChkSTABN);
        chkSTABPartly = findViewById(R.id.idChkSTABPartly);
        chkSTABDontN = findViewById(R.id.idChkSTABDontN);

        chkGIU = findViewById(R.id.idChkGIUSTAB);
        chkGBNU = findViewById(R.id.idChkGBNUSTAB);
        chkIU_BNR = findViewById(R.id.idChkIU_BNRSTAB);
        chkIUNNTR = findViewById(R.id.idChkIUNNTRSTAB);
        chkOOSBR = findViewById(R.id.idchkOOSBRSTAB);
        chkOOSAndNR = findViewById(R.id.idChkOOSAndNRSTAB);
        chkStilInstPha = findViewById(R.id.idChkStilInstPhaSTAB);
        chkDontN = findViewById(R.id.idChkDontNSTAB);

        chkPMY = findViewById(R.id.idChkPMYSTAB);
        chkPMN = findViewById(R.id.idChkPMNSTAB);

        chkPMITPHF = findViewById(R.id.idChkPMITPHFSTAB);
        chkPMPDI = findViewById(R.id.idChkPMPDISTAB);
        chkSubcontracted = findViewById(R.id.idChkSubcontractedSTAB);

        chkPMCMY = findViewById(R.id.idChkPMCMYSTAB);
        chkPMCMN = findViewById(R.id.idChkPMCMNSTAB);

        chkLoBY = findViewById(R.id.idChkLoBYSTAB);
        chkLoBN = findViewById(R.id.idChkLoBNSTAB);

        txtComent = findViewById(R.id.idTxtComentSTAB);
        txtNameOfMant = findViewById(R.id.idTxtNameOfMantSTAB);
        txtFreqPM = findViewById(R.id.idTxtFreqSTAB);
        txtCapacity = findViewById(R.id.idTxtCapGen);
    }

    public void LimparCampos() {
        txtComent.setText("");
        txtFreqPM.setText("");
        txtNameOfMant.setText("");
        txtCapacity.setText("");
    }
}