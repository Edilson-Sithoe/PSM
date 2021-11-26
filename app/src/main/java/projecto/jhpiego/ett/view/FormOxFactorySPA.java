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
import projecto.jhpiego.ett.conection.DAOxFactorySPA;
import projecto.jhpiego.ett.model.OxFactorySPA;

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