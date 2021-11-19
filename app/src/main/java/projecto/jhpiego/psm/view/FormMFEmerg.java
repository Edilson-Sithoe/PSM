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
import projecto.jhpiego.psm.conection.DAOManiFEmerg;
import projecto.jhpiego.psm.conection.DAOManiFoldTwoo;
import projecto.jhpiego.psm.model.ManiFoldEmerg;

public class FormMFEmerg extends AppCompatActivity {

    private Button btnBack, btnSave;
    private CheckBox chkYesMF,chkNoMF,chkPrimaMF,chkSecondMF,chkEmergMF;
    private CheckBox chkLess, chkB3_10,chkB11_20, chkMore20, chkMANMF, chkAUTOMF, chkEMF, chkFMF,chkGMF,chkJMF, chkDontNoMF;
    private CheckBox chkPINMF,chkBullnoseMF,chkHandwheelMF,chkYMF,chkNMF,chkPartlyMF,chkDontNMF,chkGIUMF,chkGBNUMF;
    private CheckBox chkIU_BNRMF,chkIUNNTRMF,chkOOSBRMF,chkOOSAndNRMF,chkStilInstPhaMF,chkYESPMMF,chkNOPMMF,chkPHFMF;
    private CheckBox chkPDIMF, chkSubCMF,chkYesPMCMMF,chkNOSPMCMMF,chkYESKBMF,chkNOLBMF,chkDailyMF,chkWeeklyMF,chkFortnightlyMF,chkMonthlyMF,chkOnrequestMF;
    private TextView txtLPMMF,txtMMMF,txtCCMF, txtAGVMonthMF, txtOtherMF,txtFPMMF;
    private TextView txtNMCMF,txtAVGCostMF,txtBMPMF,txtCSMF,txtCommentsMF;
    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_mfemerg);

        getSupportActionBar().hide();
        InitComponents();

        DAOManiFEmerg dao = new DAOManiFEmerg();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backMFT = new Intent(FormMFEmerg.this, TelaPrincipal.class);
                startActivity(backMFT);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ManiFoldEmerg maniFoldEmerg = new ManiFoldEmerg(
                        chkYesMF.isChecked() ? "Yes" : "",
                        chkNoMF.isChecked() ? "No" : "",

                        chkPrimaMF.isChecked() ? "Primary" : "",
                        chkSecondMF.isChecked() ? "Secondary" : "",
                        chkEmergMF.isChecked() ? "Emergency" : "",

                        chkLess.isChecked() ? "Less than 3 years" : "",
                        chkB3_10.isChecked() ? "Between 3-10 years" : "",
                        chkB11_20.isChecked() ? "Between 11-20 years" : "",
                        chkMore20.isChecked() ? "More than 20 years" : "",

                        chkMANMF.isChecked() ? "Manual " : "",
                        chkAUTOMF.isChecked() ? "Automatic" : "",

                        txtLPMMF.getText().toString(),

                        txtMMMF.getText().toString(),

                        txtCCMF.getText().toString(),

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

                        txtCommentsMF.getText().toString());
                if (txtAVGCostMF.getText().toString().isEmpty() || txtAGVMonthMF.getText().toString().isEmpty() || txtBMPMF.getText().toString().isEmpty() ||
                        txtNMCMF.getText().toString().isEmpty() || txtLPMMF.getText().toString().isEmpty() ||txtCSMF.getText().toString().isEmpty()|| txtFPMMF.getText().toString().isEmpty()||
                        txtOtherMF.getText().toString().isEmpty() || txtCCMF.getText().toString().isEmpty() ||txtMMMF.getText().toString().isEmpty()) {
                    Snackbar snackbar = Snackbar.make(v, mensagens[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                } else {
                    dao.add(maniFoldEmerg).addOnCompleteListener(suc -> {
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
        btnBack = findViewById(R.id.btn_backME);
        btnSave = findViewById(R.id.btn_saveME);

        chkYesMF = findViewById(R.id.idChkYesME);
        chkNoMF = findViewById(R.id.idChkNoME);

        chkPrimaMF = findViewById(R.id.chkPrimaME);
        chkSecondMF = findViewById(R.id.chkSecondME);
        chkEmergMF = findViewById(R.id.chkEmergME);

        chkLess = findViewById(R.id.chkLessME);
        chkB3_10 = findViewById(R.id.chkB3_10ME);
        chkB11_20 = findViewById(R.id.idChkB11_20ME);
        chkMore20 = findViewById(R.id.idChkMore20ME);

        chkMANMF = findViewById(R.id.chkMANME);
        chkAUTOMF = findViewById(R.id.chkAUTOME);

        txtLPMMF = findViewById(R.id.txtLPMME);

        txtMMMF = findViewById(R.id.txtMMME);

        txtCCMF = findViewById(R.id.txtCCMF);

        txtAGVMonthMF = findViewById(R.id.txtAGVMonthME);

        chkEMF = findViewById(R.id.chkEME);
        chkFMF = findViewById(R.id.chkFME);
        chkGMF = findViewById(R.id.chkGME);
        chkJMF = findViewById(R.id.chkJME);
        chkDontNoMF = findViewById(R.id.chkDontNoME);
        txtOtherMF = findViewById(R.id.txtOtherME);

        chkPINMF = findViewById(R.id.chkPINME);
        chkPINMF = findViewById(R.id.chkPINME);
        chkBullnoseMF = findViewById(R.id.chkBullnoseME);
        chkHandwheelMF = findViewById(R.id.chkHandwheelME);

        chkYMF = findViewById(R.id.chkYME);
        chkNMF = findViewById(R.id.chkNME);
        chkPartlyMF = findViewById(R.id.chkPartlyME);
        chkDontNMF = findViewById(R.id.chkDontNME);

        chkGIUMF = findViewById(R.id.chkGIUME);
        chkGBNUMF = findViewById(R.id.chkGBNUME);
        chkIU_BNRMF = findViewById(R.id.chkIU_BNRME);
        chkIUNNTRMF = findViewById(R.id.chkIUNNTRME);
        chkOOSBRMF = findViewById(R.id.chkOOSBRME);
        chkOOSAndNRMF = findViewById(R.id.chkOOSAndNRME);
        chkStilInstPhaMF = findViewById(R.id.chkStilInstPhaME);
        chkDontNMF = findViewById(R.id.chkDontNME);

        chkYESPMMF = findViewById(R.id.chkYESPMME);
        chkNOPMMF = findViewById(R.id.chkNOPMME);

        txtFPMMF = findViewById(R.id.txtFPMME);

        chkPHFMF = findViewById(R.id.chkPHFME);
        chkPDIMF = findViewById(R.id.chkPDIME);
        chkSubCMF = findViewById(R.id.chkSubCME);

        txtNMCMF = findViewById(R.id.txtNMCME);
        txtAVGCostMF = findViewById(R.id.txtAVGCostME);
        txtBMPMF = findViewById(R.id.txtBMPME);

        chkYesPMCMMF = findViewById(R.id.chkYesPMCMME);
        chkNOSPMCMMF = findViewById(R.id.chkNOSPMCMME);

        chkYESKBMF = findViewById(R.id.chkYESKBME);
        chkNOLBMF = findViewById(R.id.chkNOLBME);

        txtCSMF = findViewById(R.id.txtCSME);

        chkDailyMF = findViewById(R.id.chkDailyME);
        chkWeeklyMF = findViewById(R.id.chkWeeklyME);
        chkFortnightlyMF = findViewById(R.id.chkFortnightlyME);
        chkMonthlyMF = findViewById(R.id.chkMonthlyME);
        chkOnrequestMF = findViewById(R.id.chkOnrequestME);

        txtCommentsMF = findViewById(R.id.txtCommentsME);
    }

    public void LimparCampos(){
        txtAVGCostMF.setText("");
        txtAGVMonthMF.setText("");
        txtBMPMF.setText("");
        txtNMCMF.setText("");
        txtLPMMF.setText("");
        txtCSMF.setText("");
        txtFPMMF.setText("");
        txtCommentsMF.setText("");
        txtOtherMF.setText("");
        txtMMMF.setText("");
    }
}