package projecto.jhpiego.psm.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import projecto.jhpiego.psm.R;
import projecto.jhpiego.psm.conection.DAOMainPiping;
import projecto.jhpiego.psm.model.MainPiping;

public class FormMainPipingfff extends AppCompatActivity {

    private Button btnBack, btnSave;
    private TextView txtOtherMPP, txtFPMMPP, txtSubMPP, txtAVGPMMPP, txtBudgtMPP, txtCommentMPP;
    private CheckBox chkYesMPP,chkNoMPP,chkLessMPP,chkB3_10MPP,chkB11_20MPP,chkMore20MPP,chkYesSWMPP,chkNoSWMPP;
    private CheckBox chkPartlySWMPP,chkDontNSWMPP,chkYesVMPP,chkNoVMPP,chkPartlyVMPP,chkDontNVMPP,chkYesSOVMPP,chkNoSOVMPP;
    private CheckBox chkYesCFEVMPP,chkNoCFEMPP,chkYesLPMPP,chkNoLPMPP,chkPartlyLPMPP,chkDontNLPMPP,chkYesCAVMPP,chkNoCAMPP,chkGIUMPP;
    private CheckBox chkGBNUMPP, chkIU_BNRMPP,chkIUNNTRMPP,chkOOSBRMPP,chkOOSAndNRMPP,chkStilInstPhaMPP,chkDontNMPP,chkOQCMPP,chkAFROXMPP;
    private CheckBox chkDISSMPP, chkOUSAMPP,chkCUSAMPP,chkPUSAMPP,chkOMUSAMPP,chkYesPMMPP,chkNoPMMPP,chkPHFMPP,chkPDIMPP,chkSubCMPP;

    String[] mensagens = {"Fill in all fields", "Fail to registration", "Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_med_air_system);

        getSupportActionBar().hide();
        IniciarComponentes();

        DAOMainPiping dao = new DAOMainPiping();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormMainPipingfff.this, TelaPrincipal.class);
                startActivity(i);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainPiping txtCommentMPPS = new MainPiping(
                        chkYesMPP.isChecked() ? "Yes" : "",
                        chkNoMPP.isChecked() ? "No" : "",

                        chkLessMPP.isChecked()? "Less than 3 years":"",
                        chkB3_10MPP.isChecked()? "Between 3-10 years":"",
                        chkB11_20MPP.isChecked()? "Between 11-20 years":"",
                        chkMore20MPP.isChecked()? "More than 20 years ":"",

                        chkYesSWMPP.isChecked()? "Yes":"",
                        chkNoSWMPP.isChecked()? "No":"",
                        chkPartlySWMPP.isChecked()? "Partly":"",
                        chkDontNSWMPP.isChecked()? "Don’t know":"",

                        chkYesVMPP.isChecked()? "Yes":"",
                        chkNoVMPP.isChecked()? "No":"",
                        chkPartlyVMPP.isChecked()? "Partly":"",
                        chkDontNVMPP.isChecked()? "Don’t know":"",

                        chkYesSOVMPP.isChecked() ? "Yes" : "",
                        chkNoSOVMPP.isChecked() ? "No" : "",

                        chkYesCFEVMPP.isChecked() ? "Yes" : "",
                        chkNoCFEMPP.isChecked() ? "No" : "",

                        chkYesLPMPP.isChecked()? "Yes":"",
                        chkNoLPMPP.isChecked()? "No":"",
                        chkPartlyLPMPP.isChecked()? "Partly":"",
                        chkDontNLPMPP.isChecked()? "Don’t know":"",

                        chkYesCAVMPP.isChecked() ? "Yes" : "",
                        chkNoCAMPP.isChecked() ? "No" : "",

                        chkGIUMPP.isChecked()? "Good and in use":"",
                        chkGBNUMPP.isChecked()? "Good, but not in use":"",
                        chkIU_BNRMPP.isChecked()? "In use, but needs repair":"",
                        chkIUNNTRMPP.isChecked()? "In use, but needs to be replaced":"",
                        chkOOSBRMPP.isChecked()? "Out of service, but repairable":"",
                        chkOOSAndNRMPP.isChecked()? "Out of service and needs to be replaced":"",
                        chkStilInstPhaMPP.isChecked()? "Still in the installation phase":"",
                        chkDontNMPP.isChecked()? "Don’t know ":"",


                        chkOQCMPP.isChecked() ? "Ohio Quick-connect Quick-connect (OQC) Quick Link System" : "",
                        chkAFROXMPP.isChecked() ? "Rapid connection system (schourader) UK/AFROX" : "",
                        chkDISSMPP.isChecked() ? "Diameter Index Safety System (DISS) " : "",
                        chkOUSAMPP.isChecked() ? "Ohmeda (USA)" : "",
                        chkCUSAMPP.isChecked() ? "Chemetron (USA)" : "",
                        chkPUSAMPP.isChecked() ? "Puritan (USA) " : "",
                        chkOMUSAMPP.isChecked() ? "Oxequip/Medstar (USA) " : "",
                        txtOtherMPP.getText().toString(),

                        chkYesPMMPP.isChecked() ? "Yes" : "",
                        chkNoPMMPP.isChecked() ? "No" : "",

                        txtFPMMPP.getText().toString(),

                        chkPHFMPP.isChecked()? "Internal Technical Personnel of the Health Facility":"",
                        chkPDIMPP.isChecked()? "Personnel from the Department of Infrastructure":"",
                        chkSubCMPP.isChecked()? "Subcontracte":"",

                        txtSubMPP.getText().toString(),
                        txtAVGPMMPP.getText().toString(),
                        txtBudgtMPP.getText().toString(),

                        txtCommentMPP.getText().toString());

                if (txtBudgtMPP.getText().toString().isEmpty() || txtSubMPP.getText().toString().isEmpty() || txtAVGPMMPP.getText().toString().isEmpty() ||
                        txtFPMMPP.getText().toString().isEmpty()) {
                    Snackbar snackbar = Snackbar.make(v, mensagens[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                } else {
                    dao.add(txtCommentMPPS).addOnCompleteListener(suc -> {
                        Snackbar snackbar = Snackbar.make(v, mensagens[2], Snackbar.LENGTH_SHORT);
                        snackbar.setBackgroundTint(Color.BLUE);
                        snackbar.setTextColor(Color.WHITE);
                        snackbar.show();
                        LimparCampos();
                    }).addOnFailureListener(er -> {
                        Snackbar snackbar = Snackbar.make(v, mensagens[1], Snackbar.LENGTH_SHORT);
                        snackbar.setBackgroundTint(Color.BLUE);
                        snackbar.setTextColor(Color.WHITE);
                        snackbar.show();
                    });
                }
            }
        });
    }

    public void IniciarComponentes() {
        btnBack = findViewById(R.id.btn_backMPP);
        btnSave = findViewById(R.id.btn_saveMPP);

        chkYesMPP = findViewById(R.id.chkYesMPP);
        chkNoMPP = findViewById(R.id.chkNoMPP);

        chkLessMPP = findViewById(R.id.chkLessMPP);
        chkB3_10MPP = findViewById(R.id.chkB3_10MPP);
        chkB11_20MPP = findViewById(R.id.chkB11_20MPP);
        chkMore20MPP = findViewById(R.id.chkMore20MPP);

        chkYesSWMPP = findViewById(R.id.chkYesSWMPP);
        chkNoSWMPP = findViewById(R.id.chkNoSWMPP);
        chkPartlySWMPP = findViewById(R.id.chkPartlySWMPP);
        chkDontNSWMPP = findViewById(R.id.chkDontNSWMPP);

        chkYesVMPP = findViewById(R.id.chkYesVMPP);
        chkNoVMPP = findViewById(R.id.chkNoVMPP);
        chkPartlyVMPP = findViewById(R.id.chkPartlyVMPP);
        chkDontNVMPP = findViewById(R.id.chkDontNVMPP);

        chkYesSOVMPP = findViewById(R.id.chkYesSOVMPP);
        chkNoSOVMPP = findViewById(R.id.chkNoSOVMPP);

        chkYesCFEVMPP = findViewById(R.id.chkYesCFEVMPP);
        chkNoCFEMPP = findViewById(R.id.chkNoCFEMPP);

        chkYesLPMPP = findViewById(R.id.chkYesLPMPP);
        chkNoLPMPP = findViewById(R.id.chkNoLPMPP);
        chkPartlyLPMPP = findViewById(R.id.chkPartlyLPMPP);
        chkDontNLPMPP = findViewById(R.id.chkDontNLPMPP);

        chkYesCAVMPP = findViewById(R.id.chkYesCAVMPP);
        chkNoCAMPP = findViewById(R.id.chkNoCAMPP);

        chkGIUMPP = findViewById(R.id.chkGIUMPP);
        chkGBNUMPP = findViewById(R.id.chkGBNUMPP);
        chkIU_BNRMPP = findViewById(R.id.chkIU_BNRMPP);
        chkIUNNTRMPP = findViewById(R.id.chkIUNNTRMPP);
        chkOOSBRMPP = findViewById(R.id.chkOOSBRMPP);
        chkOOSAndNRMPP = findViewById(R.id.chkOOSAndNRMPP);
        chkStilInstPhaMPP = findViewById(R.id.chkStilInstPhaMPP);
        chkDontNMPP = findViewById(R.id.chkDontNMPP);

        chkOQCMPP = findViewById(R.id.chkOQCMPP);
        chkAFROXMPP = findViewById(R.id.chkAFROXMPP);
        chkDISSMPP = findViewById(R.id.chkDISSMPP);
        chkOUSAMPP = findViewById(R.id.chkOUSAMPP);
        chkCUSAMPP = findViewById(R.id.chkCUSAMPP);
        chkPUSAMPP = findViewById(R.id.chkPUSAMPP);
        chkOMUSAMPP = findViewById(R.id.chkOMUSAMPP);
        txtOtherMPP = findViewById(R.id.txtOtherMPP);

        chkYesPMMPP = findViewById(R.id.chkYesPMMPP);
        chkNoPMMPP = findViewById(R.id.chkNoPMMPP);

        txtFPMMPP = findViewById(R.id.txtFPMMPP);

        chkPHFMPP = findViewById(R.id.chkPHFMPP);
        chkPDIMPP = findViewById(R.id.chkPDIMPP);
        chkSubCMPP = findViewById(R.id.chkSubCMPP);

        txtSubMPP = findViewById(R.id.txtSubMPP);
        txtAVGPMMPP = findViewById(R.id.txtAVGPMMPP);
        txtBudgtMPP = findViewById(R.id.txtBudgtMPP);

        txtCommentMPP = findViewById(R.id.txtCommentMPP);
    }

    public void LimparCampos() {
     /*   txtSubCMAS.setText("");
        txtMAPMMAS.setText("");
        txtBudgteMAS.setText("");
        txtFPMMAS.setText("");
        txtCommentMAS.setText("");
        txtLPMMAS.setText("");*/
    }

}