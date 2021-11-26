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
import projecto.jhpiego.ett.conection.DAOManiFoldTwoo;
import projecto.jhpiego.ett.model.ManiFoldTwoo;

public class FormManiFoldTwoo extends AppCompatActivity {

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
        setContentView(R.layout.activity_form_mani_fold_twoo);

        getSupportActionBar().hide();
        InitComponents();

        DAOManiFoldTwoo dao = new DAOManiFoldTwoo();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backMFT = new Intent(FormManiFoldTwoo.this, TelaPrincipal.class);
                startActivity(backMFT);
            }
        });

    }

    public void InitComponents(){
        btnBack = findViewById(R.id.btn_backMF);
        btnSave = findViewById(R.id.btn_saveMF);
        chkYesMF = findViewById(R.id.idChkYesMF);
        chkNoMF = findViewById(R.id.idChkNoMF);

        chkPrimaMF = findViewById(R.id.chkPrimaMF);
        chkSecondMF = findViewById(R.id.chkSecondMF);
        chkEmergMF = findViewById(R.id.chkEmergMF);

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