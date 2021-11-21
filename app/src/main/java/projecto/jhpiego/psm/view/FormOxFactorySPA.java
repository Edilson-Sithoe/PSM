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
import projecto.jhpiego.psm.conection.DAOxFactorySPA;
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

        DAOxFactorySPA dao = new DAOxFactorySPA();

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

                        txtTecnAvailOX.getText().toString(),

                        chkYEShorOX.isChecked() ? "Yes" : "",
                        chkNoShorOX.isChecked() ? "No" : "",

                        txtCommentOX.getText().toString());

                if (txtCapaFactOX.getText().toString().isEmpty() ||txtDiametreOX.getText().toString().isEmpty() ||txtTotalProdOX.getText().toString().isEmpty()||
                        txtCapFSOX.getText().toString().isEmpty() || txtCAPOXTankOX.getText().toString().isEmpty() || txtOtherOX.getText().toString().isEmpty()||
                        txtFreqPMOX.getText().toString().isEmpty() || txtCaseSNMaintOX.getText().toString().isEmpty() || txtAVGOX.getText().toString().isEmpty() ||
                        txtBudgetOX.getText().toString().isEmpty() || txtTecnAvailOX.getText().toString().isEmpty()){
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
        btnSave = findViewById(R.id.btn_saveFSPA);
        btnBack = findViewById(R.id.btn_backFSPA);

        chkYesOX = findViewById(R.id.chkYesOX);
                chkNoOX = findViewById(R.id.chkNoOX);

                chkLessOX = findViewById(R.id.chkLessOX);
                chkB3_10OX = findViewById(R.id.chkB3_10OX);
                chkB11_20OX = findViewById(R.id.chkB11_20OX);
                chkMore20OX = findViewById(R.id.chkMore20OX);

                txtCapaFactOX = findViewById(R.id.txtCapaFactOX);
                txtDiametreOX = findViewById(R.id.txtDiametreOX);
                txtTotalProdOX = findViewById(R.id.txtTotalProdOX);

                chkYOX = findViewById(R.id.chkYOX);
                chkNOX = findViewById(R.id.chkNOX);
                chkPartlyOX = findViewById(R.id.chkPartlyOX);
                chkDontNOX = findViewById(R.id.chkDontNOX);

                chkGIUOX = findViewById(R.id.chkGIUOX);
                chkGBNUOX = findViewById(R.id.chkGBNUOX);
                chkIU_BNROX = findViewById(R.id.chkIU_BNROX);
                chkIUNNTROX = findViewById(R.id.chkIUNNTROX);
                chkOOSBROX = findViewById(R.id.chkOOSBROX);
                chkOOSAndNROX = findViewById(R.id.chkOOSAndNROX);
                chkStilInstPhaOX = findViewById(R.id.chkStilInstPhaOX);
                chkDontKnowOX = findViewById(R.id.chkDontKnowOX);

                chkYESTranOX = findViewById(R.id.chkYESTranOX);
                chkNOTranOX = findViewById(R.id.chkNOTranOX);
                chkYesBIDWTranOX = findViewById(R.id.chkYesBIDWTranOX);

                chkYESGENOX = findViewById(R.id.chkYESGENOX);
                chkNOGENOX = findViewById(R.id.chkNOGENOX);
                chkYesBIDWGENOX = findViewById(R.id.chkYesBIDWGENOX);

                chkYESUPSOX = findViewById(R.id.chkYESUPSOX);
                chkNOUPSOX = findViewById(R.id.chkNOUPSOX);
                chkYesBIDWUPSOX = findViewById(R.id.chkYesBIDWUPSOX);

                chkYESSTABOX = findViewById(R.id.chkYESSTABOX);
                chkNOSTABOX = findViewById(R.id.chkNOSTABOX);
                chkYesBIDWSTABOX = findViewById(R.id.chkYesBIDWSTABOX);

                chkYESMCOX = findViewById(R.id.chkYESMCOX);
                chkNOMCOX = findViewById(R.id.chkNOMCOX);
                chkYesBIDWMCOX = findViewById(R.id.chkYesBIDWMCOX);

                txtCapFSOX = findViewById(R.id.txtCapFSOX);
                txtCAPOXTankOX = findViewById(R.id.txtCAPOXTankOX);

                chkEOX = findViewById(R.id.chkEOX);
                chkFOX = findViewById(R.id.chkFOX);
                chkGOX = findViewById(R.id.chkGOX);
                chkJOX = findViewById(R.id.chkJOX);
                chkDontNoOX = findViewById(R.id.chkDontNoOX);
                txtOtherOX = findViewById(R.id.txtOtherOX);

                chkSWYOX = findViewById(R.id.chkSWYOX);
                chkSWNOX = findViewById(R.id.chkSWNOX);
                chkSWPartlyOX = findViewById(R.id.chkSWPartlyOX);
                chkSWDontNOX = findViewById(R.id.chkSWDontNOX);

                chkYesCHOX = findViewById(R.id.chkYesCHOX);
                chkNoCHOX = findViewById(R.id.chkNoCHOX);

                txtOne = findViewById(R.id.txtOne);
                txtTwo = findViewById(R.id.txtTwo);
                txtThree = findViewById(R.id.txtThree);
                txtFour = findViewById(R.id.txtFour);
                txtFive = findViewById(R.id.txtFive);
                txtSix = findViewById(R.id.txtSix);
                txtSeven = findViewById(R.id.txtSeven);
                txtEight = findViewById(R.id.txtEight);
                txtNine = findViewById(R.id.txtNine);
                txtTen = findViewById(R.id.txtTen);

                chkYesPMOX = findViewById(R.id.chkYesPMOX);
                chkNoPMOX = findViewById(R.id.chkNoPMOX);

                txtFreqPMOX = findViewById(R.id.txtFreqPMOX);

                chkPHFOX = findViewById(R.id.chkPHFOX);
                chkPDIOX = findViewById(R.id.chkPDIOX);
                chkSubOX = findViewById(R.id.chkSubOX);

                txtCaseSNMaintOX = findViewById(R.id.txtCaseSNMaintOX);
                txtAVGOX = findViewById(R.id.txtAVGOX);
                txtBudgetOX = findViewById(R.id.txtBudgetOX);

                chkYesHFSpecOX = findViewById(R.id.chkYesHFSpecOX);
                chkNoHFSpecOX = findViewById(R.id.chkNoHFSpecOX);

        txtTecnAvailOX = findViewById(R.id.txtTecnAvailOX);

                chkYEShorOX = findViewById(R.id.chkYEShorOX);
                chkNoShorOX = findViewById(R.id.chkNoShorOX);

                txtCommentOX = findViewById(R.id.txtCommentOX);
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
        txtTecnAvailOX.setText("");
        txtCommentOX.setText("");
    }

}