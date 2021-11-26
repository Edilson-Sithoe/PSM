package projecto.jhpiego.ett.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import projecto.jhpiego.ett.R;
import projecto.jhpiego.ett.conection.DAOManiFEmerg;
import projecto.jhpiego.ett.model.ManiFoldEmerg;

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