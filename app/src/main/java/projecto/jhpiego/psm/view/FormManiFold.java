package projecto.jhpiego.psm.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import projecto.jhpiego.psm.R;
import projecto.jhpiego.psm.conection.DAOManiFold;
import projecto.jhpiego.psm.model.ManiFold;

public class FormManiFold extends AppCompatActivity {

    private Button btnBack, btnSave;
    private CheckBox chkYesMF,chkNoMF,chkPrimaMF,chkSecondMF,chkEmergMF,chkNAMF, chkCAMF,chkPTMF, chkMaternMF, chkICUMF;
    private CheckBox chkLess, chkB3_10,chkB11_20, chkMore20, chkMANMF, chkAUTOMF, chkEMF, chkFMF,chkGMF,chkJMF, chkDontNoMF;
    private CheckBox chkPINMF,chkPINSMF,chkBullnoseMF,chkHandwheelMF,chkYMF,chkNMF,chkPartlyMF,chkDontNMF,chkGIUMF,chkGBNUMF;
    private CheckBox chkIU_BNRMF,chkIUNNTRMF,chkOOSBRMF,chkOOSAndNRMF,chkStilInstPhaMF,chkDontKnowMF,chkYESPMMF,chkNOPMMF,chkPHFMF;
    private CheckBox chkPDIMF, chkSubCMF,chkYesPMCMMF,chkNOSPMCMMF,chkYESKBMF,chkNOLBMF,chkDailyMF,chkWeeklyMF,chkFortnightlyMF,chkMonthlyMF,chkOnrequestMF,chkYESSUC,chkNOSC;
    private TextView txtOtherOMF,txtOtherTMF,txtLPMMF,txtMMMF,txtRMF,txtLSMF,txtTotalMF, txtAGVMonthMF, txtOtherMF,txtFPMMF;
    private TextView txtNMCMF,txtAVGCostMF,txtBMPMF,txtCSMF,txtCommentsMF;
    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_mani_fold);

        getSupportActionBar().hide();
        InitComponents();

        DAOManiFold dao = new DAOManiFold();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backMF = new Intent(FormManiFold.this, TelaPrincipal.class);
                startActivity(backMF);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ManiFold maniFold = new ManiFold(
                        chkYesMF.isChecked() ? "Yes" : "",
                        chkNoMF.isChecked() ? "No" : "",

                        chkPrimaMF.isChecked() ? "Primary" : "",
                        chkSecondMF.isChecked() ? "Secondary" : "",
                        chkEmergMF.isChecked() ? "Emergency" : "",

                        chkNAMF.isChecked() ? "Nursery ward" : "",
                        chkCAMF.isChecked() ? "Casualty ward" : "",
                        chkPTMF.isChecked() ? "Operating Theatre" : "",
                        chkMaternMF.isChecked() ? "Maternity" : "",
                        chkICUMF.isChecked() ? "Intensive Care (ICU)" : "",
                        txtOtherOMF.getText().toString(),
                        txtOtherTMF.getText().toString(),

                        chkLess.isChecked() ? "Less than 3 years" : "",
                        chkB3_10.isChecked() ? "Between 3-10 years" : "",
                        chkB11_20.isChecked() ? "Between 11-20 years" : "",
                        chkMore20.isChecked() ? "More than 20 years" : "",

                        chkMANMF.isChecked() ? "Manual " : "",
                        chkAUTOMF.isChecked() ? "Automatic" : "",

                        txtLPMMF.getText().toString(),
                        txtMMMF.getText().toString(),

                        txtRMF.getText().toString(),
                        txtLSMF.getText().toString(),
                        txtTotalMF.getText().toString(),
                        txtAGVMonthMF.getText().toString(),

                        chkEMF.isChecked() ? "E (1m3/680L)" : "",
                        chkFMF.isChecked() ? "F (1.5m3/1360L)" : "",
                        chkGMF.isChecked() ? "G (3.5m3/3400L)" : "",
                        chkJMF.isChecked() ? "J (7.5m3/7800L)" : "",
                        chkDontNoMF.isChecked() ? "Don't know" : "",
                        txtOtherMF.getText().toString(),

                        chkPINMF.isChecked() ? "Pin index" : "",
                        chkPINMF.isChecked() ? "Pin-index side spindle valve" : "",
                        chkBullnoseMF.isChecked() ? "Bullnose valve" : "",
                        chkHandwheelMF.isChecked() ? "Handwheel side outlet" : "",

                        chkYMF.isChecked() ? "Yes" : "",
                        chkNMF.isChecked() ? "No" : "",
                        chkPartlyMF.isChecked() ? "Partly" : "",
                        chkDontNMF.isChecked() ? "Don't know" : "",

                        chkGIUMF.isChecked() ? "Good and in use" : "",
                        chkGBNUMF.isChecked() ? "Good, but not in use" : "",
                        chkIU_BNRMF.isChecked() ? "In use, but needs repair" : "",
                        chkIUNNTRMF.isChecked() ? "In use, but needs to be replaced" : "",
                        chkOOSBRMF.isChecked() ? "Out of service, but repairable" : "",
                        chkOOSAndNRMF.isChecked() ? "Out of service and needs to be replaced" : "",
                        chkStilInstPhaMF.isChecked() ? "Still in the installation phase" : "",
                        chkDontNMF.isChecked() ? "Don’t know " : "",

                        chkYESPMMF.isChecked() ? "Yes" : "",
                        chkNOPMMF.isChecked() ? "No" : "",

                        txtFPMMF.getText().toString(),

                        chkPHFMF.isChecked() ? "Internal Technical Personnel of the Health Facility" : "",
                        chkPDIMF.isChecked() ? "Personnel from the Department of Infrastructure" : "",
                        chkSubCMF.isChecked() ? "Subcontracted" : "",

                        txtNMCMF.getText().toString(),
                        txtAVGCostMF.getText().toString(),
                        txtBMPMF.getText().toString(),

                        chkYesPMCMMF.isChecked() ? "Yes" : "",
                        chkNOSPMCMMF.isChecked() ? "No" : "",

                        chkYESKBMF.isChecked() ? "Yes" : "",
                        chkNOLBMF.isChecked() ? "No" : "",

                        txtCSMF.getText().toString(),

                        chkDailyMF.isChecked() ? "Daily" : "",
                        chkWeeklyMF.isChecked() ? "Weekly" : "",
                        chkFortnightlyMF.isChecked() ? "Fortnightly" : "",
                        chkMonthlyMF.isChecked() ? "Monthly" : "",
                        chkOnrequestMF.isChecked() ? "On request" : "",

                        chkYESSUC.isChecked() ? "Yes" : "",
                        chkNOSC.isChecked() ? "No" : "",
                        txtCommentsMF.getText().toString());
                if (txtAVGCostMF.getText().toString().isEmpty() || txtAGVMonthMF.getText().toString().isEmpty() || txtBMPMF.getText().toString().isEmpty() ||
                        txtOtherOMF.getText().toString().isEmpty() || txtNMCMF.getText().toString().isEmpty() || txtOtherTMF.getText().toString().isEmpty() ||
                        txtLPMMF.getText().toString().isEmpty() ||txtCSMF.getText().toString().isEmpty()|| txtFPMMF.getText().toString().isEmpty()||
                        txtOtherMF.getText().toString().isEmpty()|| txtTotalMF.getText().toString().isEmpty() ||txtLSMF.getText().toString().isEmpty()||
                        txtRMF.getText().toString().isEmpty() ||txtMMMF.getText().toString().isEmpty()) {
                    Snackbar snackbar = Snackbar.make(v, mensagens[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                } else {
                    dao.add(maniFold).addOnCompleteListener(suc -> {
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

    public void InitComponents(){
        btnBack = findViewById(R.id.btn_backMF);
        btnSave = findViewById(R.id.btn_saveMF);
        chkYesMF = findViewById(R.id.idChkYesMF);
                chkNoMF = findViewById(R.id.idChkNoMF);

                chkPrimaMF = findViewById(R.id.chkPrimaMF);
                chkSecondMF = findViewById(R.id.chkPrimaMF);
                chkEmergMF = findViewById(R.id.chkPrimaMF);

                chkNAMF = findViewById(R.id.chkNAMF);
                chkCAMF = findViewById(R.id.chkCAMF);
                chkPTMF = findViewById(R.id.chkPTMF);
                chkMaternMF = findViewById(R.id.chkMaternMF);
                chkICUMF = findViewById(R.id.chkICUMF);
                txtOtherOMF = findViewById(R.id.txtOtherOMF);
                txtOtherTMF = findViewById(R.id.txtOtherTMF);

                chkLess = findViewById(R.id.chkLess);
                chkB3_10 = findViewById(R.id.chkB3_10);
                chkB11_20 = findViewById(R.id.idChkB11_20);
                chkMore20 = findViewById(R.id.idChkMore20);

                chkMANMF = findViewById(R.id.chkMANMF);
                chkAUTOMF = findViewById(R.id.chkAUTOMF);

                txtLPMMF = findViewById(R.id.txtLPMMF);
                txtMMMF = findViewById(R.id.txtMMMF);

                txtRMF = findViewById(R.id.txtRMF);
                txtLSMF = findViewById(R.id.txtLSMF);
                txtTotalMF = findViewById(R.id.txtTotalMF);
                txtAGVMonthMF = findViewById(R.id.txtAGVMonthMF);

                chkEMF = findViewById(R.id.chkEMF);
                chkFMF = findViewById(R.id.chkFMF);
                chkGMF = findViewById(R.id.chkGMF);
                chkJMF = findViewById(R.id.chkJMF);
                chkDontNoMF = findViewById(R.id.chkDontNoMF);
                txtOtherMF = findViewById(R.id.txtOtherMF);

                chkPINMF = findViewById(R.id.chkPINMF);
                chkPINMF = findViewById(R.id.chkPINMF);
                chkBullnoseMF = findViewById(R.id.chkBullnoseMF);
                chkHandwheelMF = findViewById(R.id.chkHandwheelMF);

                chkYMF = findViewById(R.id.chkYMF);
                chkNMF = findViewById(R.id.chkNMF);
                chkPartlyMF = findViewById(R.id.chkPartlyMF);
                chkDontNMF = findViewById(R.id.chkDontNMF);

                chkGIUMF = findViewById(R.id.chkGIUMF);
                chkGBNUMF = findViewById(R.id.chkGBNUMF);
                chkIU_BNRMF = findViewById(R.id.chkIU_BNRMF);
                chkIUNNTRMF = findViewById(R.id.chkIUNNTRMF);
                chkOOSBRMF = findViewById(R.id.chkOOSBRMF);
                chkOOSAndNRMF = findViewById(R.id.chkOOSAndNRMF);
                chkStilInstPhaMF = findViewById(R.id.chkStilInstPhaMF);
                chkDontNMF = findViewById(R.id.chkDontNMF);

                chkYESPMMF = findViewById(R.id.chkYESPMMF);
                chkNOPMMF = findViewById(R.id.chkNOPMMF);

                txtFPMMF = findViewById(R.id.txtFPMMF);

                chkPHFMF = findViewById(R.id.chkPHFMF);
                chkPDIMF = findViewById(R.id.chkPDIMF);
                chkSubCMF = findViewById(R.id.chkSubCMF);

                txtNMCMF = findViewById(R.id.txtNMCMF);
                txtAVGCostMF = findViewById(R.id.txtAVGCostMF);
                txtBMPMF = findViewById(R.id.txtBMPMF);

                chkYesPMCMMF = findViewById(R.id.chkYesPMCMMF);
                chkNOSPMCMMF = findViewById(R.id.chkNOSPMCMMF);

                chkYESKBMF = findViewById(R.id.chkYESKBMF);
                chkNOLBMF = findViewById(R.id.chkNOLBMF);

                txtCSMF = findViewById(R.id.txtCSMF);

                chkDailyMF = findViewById(R.id.chkDailyMF);
                chkWeeklyMF = findViewById(R.id.chkWeeklyMF);
                chkFortnightlyMF = findViewById(R.id.chkFortnightlyMF);
                chkMonthlyMF = findViewById(R.id.chkMonthlyMF);
                chkOnrequestMF = findViewById(R.id.chkOnrequestMF);

                chkYESSUC = findViewById(R.id.chkYESSUC);
                chkNOSC = findViewById(R.id.chkNOSC);
                txtCommentsMF = findViewById(R.id.txtCommentsMF);
    }

    public void LimparCampos(){
        txtAVGCostMF.setText("");
        txtAGVMonthMF.setText("");
        txtBMPMF.setText("");
        txtOtherOMF.setText("");
        txtNMCMF.setText("");
        txtOtherTMF.setText("");
        txtLPMMF.setText("");
        txtCSMF.setText("");
        txtFPMMF.setText("");
        txtCommentsMF.setText("");
        txtOtherMF.setText("");
        txtTotalMF.setText("");
        txtLSMF.setText("");
        txtRMF.setText("");
        txtMMMF.setText("");
    }
}