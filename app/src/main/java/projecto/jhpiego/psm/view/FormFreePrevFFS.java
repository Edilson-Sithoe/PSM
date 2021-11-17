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

import projecto.jhpiego.psm.R;
import projecto.jhpiego.psm.conection.DAOFreePrevFFS;
import projecto.jhpiego.psm.model.FreePrevAnFFS;

public class FormFreePrevFFS extends AppCompatActivity {

    private Button btnBack, btnSave;
    private EditText txtCommnts, txtOther;
    private CheckBox chkYesPO, chkNoPO,chkYesEC, chkNoEC, chkYesFE, chkNoFE, chkLGE, chkBC, chkABC, chkCO, chkD;
    private CheckBox chkK, chkOther, chkDontNo, chkLessMD, chkMoreThaOnYMD,chkMoreThnTwoYMD, chkDontNoMD, chkYesAS, chkNoAS, chkYesSW, chkNoSW, chkDontNoSW;
    private CheckBox chkLessLMD, chkMoreThaOnYLMD, chkMoreThnTwoYLMD, chkDontNoLMD, chkYesHS,chkNoHS , chkYesSWT, chkNoSWT, chkDontNoSWT;
    private CheckBox chkLessLMDT, chkMoreThaOnYLMDT, chkMoreThnTwoYLMDT, chkDontNoLMDT, chkYesCS,chkNoCS , chkYesSWTH, chkNoSWTH, chkDontNoSWTH;
    private CheckBox chkLessLMDTH, chkMoreThaOnYLMDTH, chkMoreThnTwoYLMDTH, chkDontNoLMDTH, chkYesWTF,chkNoWTF , chkDontNoWTF;
    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_free_prev_ffs);

        getSupportActionBar().hide();
        IniciarComponentes();

        DAOFreePrevFFS dao = new DAOFreePrevFFS();
        //    FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iback = new Intent(FormFreePrevFFS.this, TelaPrincipal.class);
                startActivity(iback);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FreePrevAnFFS freePrevAnFFS  = new FreePrevAnFFS(
                        chkYesPO.isChecked()?"Yes":"",
                        chkNoPO.isChecked()? "No" :"",

                        chkYesEC.isChecked()? "Yes" :"",
                        chkNoEC.isChecked()? "No" :"",

                        chkYesFE.isChecked()? "Yes" :"",
                        chkNoFE.isChecked()? "No" :"",

                        chkLGE.isChecked()? "LGE - Mechanical Foam" :"",
                        chkBC.isChecked()? "BC - Chemical powder" :"",
                        chkABC.isChecked()? "ABC - Chemical powder" :"",
                        chkCO.isChecked()? "CO2 - Carbon dioxide" :"",
                        chkD.isChecked()? "D - Sodium chloride" :"",
                        chkK.isChecked()? "K - Alkaline base" :"",
                        chkDontNo.isChecked()? "Don’t know " :"",
                        txtOther.getText().toString(),

                        chkLessMD.isChecked()? "Less than a year" :"",
                        chkMoreThaOnYMD.isChecked()? "More than one year" :"",
                        chkMoreThnTwoYMD.isChecked()? "More than 2 years" :"",
                        chkDontNoMD.isChecked()? "Don’t know" :"",

                        chkYesAS.isChecked()? "Yes" :"",
                        chkNoAS.isChecked()? "No" :"",

                        chkYesSW.isChecked()? "Yes" :"",
                        chkNoSW.isChecked()? "No" :"",
                        chkDontNoSW.isChecked()? "Don't Know" :"",

                        chkLessLMD.isChecked()? "Less than a year" :"",
                        chkMoreThaOnYLMD.isChecked()? "More than one year" :"",
                        chkMoreThnTwoYLMD.isChecked()? "More than 2 years" :"",
                        chkDontNoLMD.isChecked()? "Don’t know" :"",

                        chkYesHS.isChecked()? "Yes" :"",
                        chkNoHS.isChecked()? "No" :"",

                        chkYesSWT.isChecked()? "Yes" :"",
                        chkNoSWT.isChecked()? "No" :"",
                        chkDontNoSWT.isChecked()? "Don't know" :"",

                        chkLessLMDT.isChecked()? "Less than a year" :"",
                        chkMoreThaOnYLMDT.isChecked()? "More than one year" :"",
                        chkMoreThnTwoYLMDT.isChecked()? "More than 2 years" :"",
                        chkDontNoLMDT.isChecked()? "Don’t know" :"",

                        chkYesCS.isChecked()? "Yes" :"",
                        chkNoCS.isChecked()? "No" :"",

                        chkYesSWTH.isChecked()? "Yes" :"",
                        chkNoSWTH.isChecked()? "No" :"",
                        chkDontNoSWTH.isChecked()? "Don't know" :"",

                        chkLessLMDTH.isChecked()? "Less than a year" :"",
                        chkMoreThaOnYLMDTH.isChecked()? "More than one year" :"",
                        chkMoreThnTwoYLMDTH.isChecked()? "More than 2 years" :"",
                        chkDontNoLMDTH.isChecked()? "Don't know" :"",

                        chkYesWTF.isChecked()? "Yes" :"",
                        chkNoWTF.isChecked()? "No" :"",
                        chkDontNoWTF.isChecked()? "Don't know" :"",

                        txtCommnts.getText().toString());

                dao.add(freePrevAnFFS).addOnCompleteListener(suc ->{
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
        });

    }

    public void IniciarComponentes(){
        btnBack = findViewById(R.id.btn_backFPA);
        btnSave = findViewById(R.id.btn_saveFPA);

        chkYesPO = findViewById(R.id.idChkYesFFSPO);
        chkNoPO = findViewById(R.id.idChkNoFFSPO);

        chkYesEC = findViewById(R.id.idChkYesFFSEC);
        chkNoEC = findViewById(R.id.idChkNoFFSEC);

        chkYesFE = findViewById(R.id.idChkYesFFSFE);
        chkNoFE = findViewById(R.id.idChkNoFFSFE);

        chkLGE = findViewById(R.id.idChkLGE);
        chkBC = findViewById(R.id.idChkBC);
        chkABC = findViewById(R.id.idChkABC);
        chkCO = findViewById(R.id.idChkCO);
        chkD = findViewById(R.id.idChkD);
        chkK = findViewById(R.id.idChkK);
        chkDontNo = findViewById(R.id.idChkDontNFE);
        txtOther = findViewById(R.id.idTxtOther);

        chkLessMD = findViewById(R.id.idChkLessMD);
        chkMoreThaOnYMD = findViewById(R.id.idChkMorThanMD);
        chkMoreThnTwoYMD = findViewById(R.id.idChkMorThanTMD);
        chkDontNoMD = findViewById(R.id.idChkDontNMD);
        chkYesAS = findViewById(R.id.idChkYesAS);
        chkNoAS = findViewById(R.id.idChkNoAS);
        chkYesSW = findViewById(R.id.idChYesSW);
        chkNoSW = findViewById(R.id.idChkNoSW);
        chkDontNoSW = findViewById(R.id.idChkDontNoSW);

        chkLessLMD = findViewById(R.id.idChkLessLMD);
        chkMoreThaOnYLMD = findViewById(R.id.idChkMorThanLMD);

        chkMoreThnTwoYLMD = findViewById(R.id.idChkMorThanTLMD);
        chkDontNoLMD = findViewById(R.id.idChkDontNLMD);
        chkYesHS = findViewById(R.id.idChkYesFFSHS);

        chkNoHS = findViewById(R.id.idChkNoFFSHS);
        chkYesSWT = findViewById(R.id.idChYesSWT);
        chkNoSWT = findViewById(R.id.idChkNoSWT);
        chkDontNoSWT = findViewById(R.id.idChkDontNoSWT);
        chkLessLMDT = findViewById(R.id.idChkLessLMDT);
        chkMoreThaOnYLMDT = findViewById(R.id.idChkMorThanLMDT);
        chkMoreThnTwoYLMDT = findViewById(R.id.idChkMorThanTLMDT);
        chkDontNoLMDT = findViewById(R.id.idChkDontNLMDT);
        chkYesCS = findViewById(R.id.idChkYesFFSCS);
        chkNoCS = findViewById(R.id.idChkNoFFSCS);
        chkYesSWTH = findViewById(R.id.idChYesSWTH);
        chkNoSWTH = findViewById(R.id.idChkNoSWTH);
        chkDontNoSWTH = findViewById(R.id.idChkDontNoSWTH);
        chkLessLMDTH = findViewById(R.id.idChkLessLMDTH);
        chkMoreThaOnYLMDTH = findViewById(R.id.idChkMorThanLMDTH);
        chkMoreThnTwoYLMDTH = findViewById(R.id.idChkMorThanTLMDTH);
        chkDontNoLMDTH = findViewById(R.id.idChkDontNLMDTH);
        chkYesWTF = findViewById(R.id.idChYesWTF);
        chkNoWTF = findViewById(R.id.idChkNoWTF);
        chkDontNoWTF = findViewById(R.id.idChkDontNoWTF);

        txtCommnts = findViewById(R.id.idTxtComentUPS);
    }

    public void LimparCampos() {
        txtCommnts.setText("");
    }
}