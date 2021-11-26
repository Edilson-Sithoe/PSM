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
import projecto.jhpiego.ett.conection.DAOLiquiOxTankTwoo;
import projecto.jhpiego.ett.model.LiquiOxTankTwoo;

public class FormLiquidOxTwoo extends AppCompatActivity {

    private Button btnBack, btnSave;
    private CheckBox chkYesLOX,chkNoMFLOX,chkMISAULOX,chkSupLOX,chkLessLOX,chkB3_10LOX, chkB11_20LOX,chkMore20LOX, chkYLOX, chkNLOX;
    private CheckBox chkPartlyLOX, chkDontNLOX,chkGIULOX, chkGBNULOX, chkIU_BNRLOX, chkIUNNTRLOX, chkOOSBRLOX, chkOOSAndNRLOX,chkStilInstPhaLOX,chkDontKnowLOX, chkYESPMLOX;
    private CheckBox chkNOPMLOX,chkPHFLOX,chkPDILOX,chkSubLOX,chkYesPMCMLOX,chkNoPMCMLOX,chkYesLBLOX,chkNoLBLOX,chkDailyLOX,chkWeeklyLOX;
    private CheckBox chkFortnightlyLOX,chkMonthlyLOX,chkOnrequestLOX,chkYEShorLOX,chkNoShorLOX,chkYesSITLOX,chkNoSITLOX,chkNOPMMF,chkPHFMF;
    private CheckBox chkPDIMF, chkSubCMF,chkYesPMCMMF,chkNOSPMCMMF,chkYESKBMF,chkNOLBMF,chkDailyMF,chkWeeklyMF,chkFortnightlyMF,chkMonthlyMF,chkOnrequestMF,chkYESSUC,chkNOSC;
    private TextView txtAVGLOX,txtMCLOX,txtOtherLOX,txtCapaTLOX,txtCapTonsLOX,txtFPMMLOX,txtNMCLOX, txtAVGCPMLOX, txtBudgetLOX,txtNSLOX;
    private TextView txtTechAvLOX,txtCommentLOX,txtBMPMF,txtCSMF,txtCommentsMF;
    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_liquid_ox_twoo);

        getSupportActionBar().hide();
        InitComponents();

        DAOLiquiOxTankTwoo dao = new DAOLiquiOxTankTwoo();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backLOXT = new Intent(FormLiquidOxTwoo.this, TelaPrincipal.class);
                startActivity(backLOXT);
            }
        });

    }

    public void InitComponents(){
        btnSave = findViewById(R.id.btn_saveLOX);
        btnBack = findViewById(R.id.btn_backLOX);

        chkYesLOX = findViewById(R.id.chkYesLOX);
        chkNoMFLOX = findViewById(R.id.chkNoMFLOX);

        txtAVGLOX = findViewById(R.id.txtAVGLOX);
        txtMCLOX = findViewById(R.id.txtMCLOX);

        chkMISAULOX = findViewById(R.id.chkMISAULOX);
        chkSupLOX = findViewById(R.id.chkSupLOX);
        txtOtherLOX = findViewById(R.id.txtOtherLOX);

        chkLessLOX = findViewById(R.id.chkLessLOX);
        chkB3_10LOX = findViewById(R.id.chkB3_10LOX);
        chkB11_20LOX = findViewById(R.id.chkB11_20LOX);
        chkMore20LOX = findViewById(R.id.chkMore20LOX);

        txtCapaTLOX = findViewById(R.id.txtCapaTLOX);
        txtCapTonsLOX = findViewById(R.id.txtCapTonsLOX);

        chkYLOX = findViewById(R.id.chkYLOX);
        chkNLOX = findViewById(R.id.chkNLOX);
        chkPartlyLOX = findViewById(R.id.chkPartlyLOX);
        chkDontNLOX = findViewById(R.id.chkDontNLOX);

        chkGIULOX = findViewById(R.id.chkGIULOX);
        chkGBNULOX = findViewById(R.id.chkGBNULOX);
        chkIU_BNRLOX = findViewById(R.id.chkIU_BNRLOX);
        chkIUNNTRLOX = findViewById(R.id.chkIUNNTRLOX);
        chkOOSBRLOX = findViewById(R.id.chkOOSBRLOX);
        chkOOSAndNRLOX = findViewById(R.id.chkOOSAndNRLOX);
        chkStilInstPhaLOX = findViewById(R.id.chkStilInstPhaLOX);
        chkDontKnowLOX = findViewById(R.id.chkDontKnowLOX);

        chkYESPMLOX = findViewById(R.id.chkYESPMLOX);
        chkNOPMLOX = findViewById(R.id.chkNOPMLOX);

        chkPHFLOX = findViewById(R.id.chkPHFLOX);
        chkPDILOX = findViewById(R.id.chkPDILOX);
        chkSubLOX = findViewById(R.id.chkSubLOX);

        txtFPMMLOX = findViewById(R.id.txtFPMMLOX);
        txtNMCLOX = findViewById(R.id.txtNMCLOX);
        txtAVGCPMLOX = findViewById(R.id.txtAVGCPMLOX);
        txtBudgetLOX = findViewById(R.id.txtBudgetLOX);

        chkYesPMCMLOX = findViewById(R.id.chkYesPMCMLOX);
        chkNoPMCMLOX = findViewById(R.id.chkNoPMCMLOX);

        chkYesLBLOX = findViewById(R.id.chkYesLBLOX);
        chkNoLBLOX = findViewById(R.id.chkNoLBLOX);

        txtNSLOX = findViewById(R.id.txtNSLOX);

        chkDailyLOX = findViewById(R.id.chkDailyLOX);
        chkWeeklyLOX = findViewById(R.id.chkWeeklyLOX);
        chkFortnightlyLOX = findViewById(R.id.chkFortnightlyLOX);
        chkMonthlyLOX = findViewById(R.id.chkMonthlyLOX);
        chkOnrequestLOX = findViewById(R.id.chkOnrequestLOX);

        chkYEShorLOX = findViewById(R.id.chkYEShorLOX);
        chkNoShorLOX = findViewById(R.id.chkNoShorLOX);

        chkYesSITLOX = findViewById(R.id.chkYesSITLOX);
        chkNoSITLOX = findViewById(R.id.chkNoSITLOX);

        txtTechAvLOX = findViewById(R.id.txtTechAvLOX);
        txtCommentLOX = findViewById(R.id.txtCommentLOX);
    }

    public void LimparCampos(){
        txtAVGLOX.setText("");
        txtMCLOX.setText("");
        txtOtherLOX.setText("");
        txtCapaTLOX.setText("");
        txtCapTonsLOX.setText("");
        txtFPMMLOX.setText("");
        txtNMCLOX.setText("");
        txtAVGCPMLOX.setText("");
        txtBudgetLOX.setText("");
        txtNSLOX.setText("");
        txtTechAvLOX.setText("");
        txtCommentLOX.setText("");
    }
}