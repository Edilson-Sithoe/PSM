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
import projecto.jhpiego.psm.conection.DAOLiquiOxTank;
import projecto.jhpiego.psm.model.LiquiOxTank;

public class FormLiquidOx extends AppCompatActivity {

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
        setContentView(R.layout.activity_form_liquid_ox);

        getSupportActionBar().hide();
        InitComponents();

        DAOLiquiOxTank dao = new DAOLiquiOxTank();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backLOX = new Intent(FormLiquidOx.this, TelaPrincipal.class);
                startActivity(backLOX);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LiquiOxTank liquiOxTank = new LiquiOxTank(
                        chkYesLOX.isChecked()?"Yes":"",
                        chkNoMFLOX.isChecked()?"No":"",

                        txtAVGLOX.getText().toString(),
                        txtMCLOX.getText().toString(),

                        chkMISAULOX.isChecked()?"MISAU-Hospital":"",
                        chkSupLOX.isChecked()?"Supplier":"",
                        txtOtherLOX.getText().toString(),

                        chkLessLOX.isChecked() ? "Less than 3 years" : "",
                        chkB3_10LOX.isChecked() ? "Between 3-10 years" : "",
                        chkB11_20LOX.isChecked() ? "Between 11-20 years" : "",
                        chkMore20LOX.isChecked() ? "More than 20 years" : "",

                        txtCapaTLOX.getText().toString(),
                        txtCapTonsLOX.getText().toString(),

                        chkYLOX.isChecked() ? "Yes" : "",
                        chkNLOX.isChecked() ? "No" : "",
                        chkPartlyLOX.isChecked() ? "Partly" : "",
                        chkDontNLOX.isChecked() ? "Don't know" : "",

                        chkGIULOX.isChecked() ? "Good and in use" : "",
                        chkGBNULOX.isChecked() ? "Good, but not in use" : "",
                        chkIU_BNRLOX.isChecked() ? "In use, but needs repair" : "",
                        chkIUNNTRLOX.isChecked() ? "In use, but needs to be replaced" : "",
                        chkOOSBRLOX.isChecked() ? "Out of service, but repairable" : "",
                        chkOOSAndNRLOX.isChecked() ? "Out of service and needs to be replaced" : "",
                        chkStilInstPhaLOX.isChecked() ? "Still in the installation phase" : "",
                        chkDontKnowLOX.isChecked() ? "Don’t know " : "",

                        chkYESPMLOX.isChecked() ? "Yes" : "",
                        chkNOPMLOX.isChecked() ? "No" : "",

                        chkPHFLOX.isChecked() ? "Internal Technical Personnel of the Health Facility" : "",
                        chkPDILOX.isChecked() ? "Personnel from the Department of Infrastructure" : "",
                        chkSubLOX.isChecked() ? "Subcontracted" : "",

                        txtFPMMLOX.getText().toString(),
                        txtNMCLOX.getText().toString(),
                        txtAVGCPMLOX.getText().toString(),
                        txtBudgetLOX.getText().toString(),

                        chkYesPMCMLOX.isChecked() ? "Yes" : "",
                        chkNoPMCMLOX.isChecked() ? "No" : "",

                        chkYesLBLOX.isChecked() ? "Yes" : "",
                        chkNoLBLOX.isChecked() ? "No" : "",

                        txtNSLOX.getText().toString(),

                        chkDailyLOX.isChecked() ? "Daily" : "",
                        chkWeeklyLOX.isChecked() ? "Weekly" : "",
                        chkFortnightlyLOX.isChecked() ? "Fortnightly" : "",
                        chkMonthlyLOX.isChecked() ? "Monthly" : "",
                        chkOnrequestLOX.isChecked() ? "On request" : "",

                        chkYEShorLOX.isChecked() ? "Yes" : "",
                        chkNoShorLOX.isChecked() ? "No" : "",

                        chkYesSITLOX.isChecked() ? "Yes" : "",
                        chkNoSITLOX.isChecked() ? "No" : "",

                        txtTechAvLOX.getText().toString(),
                        txtCommentLOX.getText().toString());

                if (txtAVGLOX.getText().toString().isEmpty() ||txtMCLOX.getText().toString().isEmpty() ||txtOtherLOX.getText().toString().isEmpty()||
                        txtCapaTLOX.getText().toString().isEmpty() || txtCapTonsLOX.getText().toString().isEmpty() || txtFPMMLOX.getText().toString().isEmpty()||
                txtNMCLOX.getText().toString().isEmpty() || txtAVGCPMLOX.getText().toString().isEmpty() || txtBudgetLOX.getText().toString().isEmpty() ||
                        txtNSLOX.getText().toString().isEmpty() || txtTechAvLOX.getText().toString().isEmpty()){
                    Snackbar snackbar = Snackbar.make(v, mensagens[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                } else {
                    dao.add(liquiOxTank).addOnCompleteListener(suc -> {
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