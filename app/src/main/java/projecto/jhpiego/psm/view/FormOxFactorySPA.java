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
import projecto.jhpiego.psm.conection.DAOOxFactory;
import projecto.jhpiego.psm.model.LiquiOxTankTwoo;
import projecto.jhpiego.psm.model.OxFactorySPA;

public class FormOxFactorySPA extends AppCompatActivity {

    private Button btnBack, btnSave;
    private CheckBox chkYesOX,chkNoOX,chkLessOX,chkB3_10OX,chkB11_20OX,chkMore20OX, chkYOX,chkNOX, chkPartlyOX, chkDontNOX;
    private CheckBox chkGIUOX, chkGBNUOX,chkIU_BNROX, chkIUNNTROX, chkOOSBROX, chkOOSAndNROX, chkStilInstPhaOX, chkDontKnowOX,chkYESTranOX,chkNOTranOX, chkYesBIDWTranOX;
    private CheckBox chkYESGENOX,chkNOGENOX,chkYesBIDWGENOX,chkYESUPSOX,chkNOUPSOX,chkYesBIDWUPSOX,chkYESSTABOX,chkNOSTABOX,chkYesBIDWSTABOX,chkYESMCOX;
    private CheckBox chkNOMCOX,chkYesBIDWMCOX,chkEOX,chkFOX,chkGOX,chkJOX,chkDontNoOX,chkSWYOX,chkSWNOX;
    private CheckBox chkSWPartlyOX, chkSWDontNOX,chkYesCHOX,chkNoCHOX,chkYesPMOX,chkNoPMOX,chkPHFOX,chkPDIOX,chkSubOX,chkYesHFSpecOX;
    private CheckBox chkNoHFSpecOX,chkYEShorOX,chkNoShorOX;
    private TextView txtCapaFactOX,txtDiametreOX,txtTotalProdOX,txtCapFSOX,txtCAPOXTankOX,txtOtherOX,txtOne, txtTwo, txtThree,txtFour;
    private TextView txtFive,txtSix,txtSeven,txtEight,txtNine, txtTen, txtFreqPMOX,txtCaseSNMaintOX,txtAVGOX,txtBudgetOX, txtTecnAvailOX, txtCommentOX;
    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_ox_factory_spa);

        getSupportActionBar().hide();
        InitComponents();

        DAOOxFactory dao = new DAOOxFactory();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backOXSPA = new Intent(FormOxFactorySPA.this, TelaPrincipal.class);
                startActivity(backOXSPA);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OxFactorySPA oxFactorySPA = new OxFactorySPA (
                        chkYesOX.isChecked()?"Yes":"",
                        chkNoOX.isChecked()?"No":"",

                        chkLessOX.isChecked() ? "Less than 3 years" : "",
                        chkB3_10OX.isChecked() ? "Between 3-10 years" : "",
                        chkB11_20OX.isChecked() ? "Between 11-20 years" : "",
                        chkMore20OX.isChecked() ? "More than 20 years" : "",

                        txtCapaFactOX.getText().toString(),
                        txtDiametreOX.getText().toString(),
                        txtTotalProdOX.getText().toString(),

                        chkYOX.isChecked() ? "Yes" : "",
                        chkNOX.isChecked() ? "No" : "",
                        chkPartlyOX.isChecked() ? "Partly" : "",
                        chkDontNOX.isChecked() ? "Don't know" : "",

                        chkGIUOX.isChecked() ? "Good and in use" : "",
                        chkGBNUOX.isChecked() ? "Good, but not in use" : "",
                        chkIU_BNROX.isChecked() ? "In use, but needs repair" : "",
                        chkIUNNTROX.isChecked() ? "In use, but needs to be replaced" : "",
                        chkOOSBROX.isChecked() ? "Out of service, but repairable" : "",
                        chkOOSAndNROX.isChecked() ? "Out of service and needs to be replaced" : "",
                        chkStilInstPhaOX.isChecked() ? "Still in the installation phase" : "",
                        chkDontKnowOX.isChecked() ? "Don’t know " : "",

                        chkYESTranOX.isChecked() ? "Yes" : "",
                        chkNOTranOX.isChecked() ? "No" : "",
                        chkYesBIDWTranOX.isChecked() ? "Yes, but it does not work" : "",

                        chkYESGENOX.isChecked() ? "Yes" : "",
                        chkNOGENOX.isChecked() ? "No" : "",
                        chkYesBIDWGENOX.isChecked() ? "Yes, but it does not work" : "",

                        chkYESUPSOX.isChecked() ? "Yes" : "",
                        chkNOUPSOX.isChecked() ? "No" : "",
                        chkYesBIDWUPSOX.isChecked() ? "Yes, but it does not work" : "",

                        chkYESSTABOX.isChecked() ? "Yes" : "",
                        chkNOSTABOX.isChecked() ? "No" : "",
                        chkYesBIDWSTABOX.isChecked() ? "Yes, but it does not work" : "",

                        chkYESMCOX.isChecked() ? "Yes" : "",
                        chkNOMCOX.isChecked() ? "No" : "",
                        chkYesBIDWMCOX.isChecked() ? "Yes, but it does not work" : "",

                        txtCapFSOX.getText().toString(),
                        txtCAPOXTankOX.getText().toString(),

                        chkEOX.isChecked() ? "E (1m3/680L)" : "",
                        chkFOX.isChecked() ? "F (1.5m3/1360L)" : "",
                        chkGOX.isChecked() ? "G (3.5m3/3400L)" : "",
                        chkJOX.isChecked() ? "J (7.5m3/7800L)" : "",
                        chkDontNoOX.isChecked() ? "Don't know" : "",
                        txtOtherOX.getText().toString(),

                        chkSWYOX.isChecked() ? "Yes" : "",
                        chkSWNOX.isChecked() ? "No" : "",
                        chkSWPartlyOX.isChecked() ? "Partly" : "",
                        chkSWDontNOX.isChecked() ? "Don't know" : "",

                        chkYesCHOX.isChecked() ? "Yes" : "",
                        chkNoCHOX.isChecked() ? "No" : "",

                        txtOne.getText().toString(),
                        txtTwo.getText().toString(),
                        txtThree.getText().toString(),
                        txtFour.getText().toString(),
                        txtFive.getText().toString(),
                        txtSix.getText().toString(),
                        txtSeven.getText().toString(),
                        txtEight.getText().toString(),
                        txtNine.getText().toString(),
                        txtTen.getText().toString(),

                        chkYesPMOX.isChecked() ? "Yes" : "",
                        chkNoPMOX.isChecked() ? "No" : "",

                        txtFreqPMOX.getText().toString(),

                        chkPHFOX.isChecked() ? "Internal Technical Personnel of the Health Facility" : "",
                        chkPDIOX.isChecked() ? "Personnel from the Department of Infrastructure" : "",
                        chkSubOX.isChecked() ? "Subcontracted" : "",

                        txtCaseSNMaintOX.getText().toString(),
                        txtAVGOX.getText().toString(),
                        txtBudgetOX.getText().toString(),

                        chkYesHFSpecOX.isChecked() ? "Yes" : "",
                        chkNoHFSpecOX.isChecked() ? "No" : "",

                        txtBudgetOX.getText().toString(),

                        chkYEShorOX.isChecked() ? "Yes" : "",
                        chkNoShorOX.isChecked() ? "No" : "",

                        txtCommentOX.getText().toString());

                if (txtCapaFactOX.getText().toString().isEmpty() ||txtDiametreOX.getText().toString().isEmpty() ||txtTotalProdOX.getText().toString().isEmpty()||
                        txtCapFSOX.getText().toString().isEmpty() || txtCAPOXTankOX.getText().toString().isEmpty() || txtOtherOX.getText().toString().isEmpty()||
                        txtFreqPMOX.getText().toString().isEmpty() || txtCaseSNMaintOX.getText().toString().isEmpty() || txtAVGOX.getText().toString().isEmpty() ||
                        txtBudgetOX.getText().toString().isEmpty() || txtBudgetOX.getText().toString().isEmpty()){
                    Snackbar snackbar = Snackbar.make(v, mensagens[0], Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                } else {
                    dao.add(oxFactorySPA).addOnCompleteListener(suc -> {
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

        chkYesOX = findViewById(R.id.txtBudgetLOX);
                chkNoOX = findViewById(R.id.txtBudgetLOX);

                chkLessOX = findViewById(R.id.txtBudgetLOX);
                chkB3_10OX = findViewById(R.id.txtBudgetLOX);
                chkB11_20OX = findViewById(R.id.txtBudgetLOX);
                chkMore20OX = findViewById(R.id.txtBudgetLOX);

                txtCapaFactOX = findViewById(R.id.txtBudgetLOX);
                txtDiametreOX = findViewById(R.id.txtBudgetLOX);
                txtTotalProdOX = findViewById(R.id.txtBudgetLOX);

                chkYOX = findViewById(R.id.txtBudgetLOX);
                chkNOX = findViewById(R.id.txtBudgetLOX);
                chkPartlyOX = findViewById(R.id.txtBudgetLOX);
                chkDontNOX = findViewById(R.id.txtBudgetLOX);

                chkGIUOX = findViewById(R.id.txtBudgetLOX);
                chkGBNUOX = findViewById(R.id.txtBudgetLOX);
                chkIU_BNROX = findViewById(R.id.txtBudgetLOX);
                chkIUNNTROX = findViewById(R.id.txtBudgetLOX);
                chkOOSBROX = findViewById(R.id.txtBudgetLOX);
                chkOOSAndNROX = findViewById(R.id.txtBudgetLOX);
                chkStilInstPhaOX = findViewById(R.id.txtBudgetLOX);
                chkDontKnowOX = findViewById(R.id.txtBudgetLOX);

                chkYESTranOX = findViewById(R.id.txtBudgetLOX);
                chkNOTranOX = findViewById(R.id.txtBudgetLOX);
                chkYesBIDWTranOX = findViewById(R.id.txtBudgetLOX);

                chkYESGENOX = findViewById(R.id.txtBudgetLOX);
                chkNOGENOX = findViewById(R.id.txtBudgetLOX);
                chkYesBIDWGENOX = findViewById(R.id.txtBudgetLOX);

                chkYESUPSOX = findViewById(R.id.txtBudgetLOX);
                chkNOUPSOX = findViewById(R.id.txtBudgetLOX);
                chkYesBIDWUPSOX = findViewById(R.id.txtBudgetLOX);

                chkYESSTABOX = findViewById(R.id.txtBudgetLOX);
                chkNOSTABOX = findViewById(R.id.txtBudgetLOX);
                chkYesBIDWSTABOX = findViewById(R.id.txtBudgetLOX);

                chkYESMCOX = findViewById(R.id.txtBudgetLOX);
                chkNOMCOX = findViewById(R.id.txtBudgetLOX);
                chkYesBIDWMCOX = findViewById(R.id.txtBudgetLOX);

                txtCapFSOX = findViewById(R.id.txtBudgetLOX);
                txtCAPOXTankOX = findViewById(R.id.txtBudgetLOX);

                chkEOX = findViewById(R.id.txtBudgetLOX);
                chkFOX = findViewById(R.id.txtBudgetLOX);
                chkGOX = findViewById(R.id.txtBudgetLOX);
                chkJOX = findViewById(R.id.txtBudgetLOX);
                chkDontNoOX = findViewById(R.id.txtBudgetLOX);
                txtOtherOX = findViewById(R.id.txtBudgetLOX);

                chkSWYOX = findViewById(R.id.txtBudgetLOX);
                chkSWNOX = findViewById(R.id.txtBudgetLOX);
                chkSWPartlyOX = findViewById(R.id.txtBudgetLOX);
                chkSWDontNOX = findViewById(R.id.txtBudgetLOX);

                chkYesCHOX = findViewById(R.id.txtBudgetLOX);
                chkNoCHOX = findViewById(R.id.txtBudgetLOX);

                txtOne = findViewById(R.id.txtBudgetLOX);
                txtTwo = findViewById(R.id.txtBudgetLOX);
                txtThree = findViewById(R.id.txtBudgetLOX);
                txtFour = findViewById(R.id.txtBudgetLOX);
                txtFive = findViewById(R.id.txtBudgetLOX);
                txtSix = findViewById(R.id.txtBudgetLOX);
                txtSeven = findViewById(R.id.txtBudgetLOX);
                txtEight = findViewById(R.id.txtBudgetLOX);
                txtNine = findViewById(R.id.txtBudgetLOX);
                txtTen = findViewById(R.id.txtBudgetLOX);

                chkYesPMOX = findViewById(R.id.txtBudgetLOX);
                chkNoPMOX = findViewById(R.id.txtBudgetLOX);

                txtFreqPMOX = findViewById(R.id.txtBudgetLOX);

                chkPHFOX = findViewById(R.id.txtBudgetLOX);
                chkPDIOX = findViewById(R.id.txtBudgetLOX);
                chkSubOX = findViewById(R.id.txtBudgetLOX);

                txtCaseSNMaintOX = findViewById(R.id.txtBudgetLOX);
                txtAVGOX = findViewById(R.id.txtBudgetLOX);
                txtBudgetOX = findViewById(R.id.txtBudgetLOX);

                chkYesHFSpecOX = findViewById(R.id.txtBudgetLOX);
                chkNoHFSpecOX = findViewById(R.id.txtBudgetLOX);

                txtBudgetOX = findViewById(R.id.txtBudgetLOX);

                chkYEShorOX = findViewById(R.id.txtBudgetLOX);
                chkNoShorOX = findViewById(R.id.txtBudgetLOX);

                txtCommentOX = findViewById(R.id.txtBudgetLOX);
    }

    public void LimparCampos(){
        txtCapaFactOX.setText("");
        txtDiametreOX.setText("");
        txtTotalProdOX.setText("");
        txtCapFSOX.setText("");
        txtOtherOX.setText("");
        txtCAPOXTankOX.setText("");
        txtOne.setText("");
        txtTwo.setText("");
        txtThree.setText("");
        txtFour.setText("");
        txtFive.setText("");
        txtSix.setText("");
        txtSeven.setText("");
        txtEight.setText("");
        txtNine.setText("");
        txtTen.setText("");
        txtFreqPMOX.setText("");
        txtCaseSNMaintOX.setText("");
        txtAVGOX.setText("");
        txtBudgetOX.setText("");
        txtCommentOX.setText("");
    }

}