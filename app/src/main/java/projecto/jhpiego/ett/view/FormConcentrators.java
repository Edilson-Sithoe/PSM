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
import projecto.jhpiego.ett.conection.DAOConcentrators;
import projecto.jhpiego.ett.model.Concentrators;

public class FormConcentrators extends AppCompatActivity {

    private Button btnBack, btnSave;
    private TextView txtHFCO,txtBrokenCO,txtFPMCO,txtMCCO,txtCPMCONCO,txtMPCO,txtCommentCO;
    private CheckBox chkYesCO,chkNoCO,chkYesPMCO,chkNoPMCO,chkPHFCO,chkPDICO,chkSubCCO;
    private CheckBox chkYesPMCMCO,chkNoPMCMCO,chkYesLBCO, chkNoLBCO;
    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_concentrators);

        getSupportActionBar().hide();
        IniciarComponentes();

        DAOConcentrators dao = new DAOConcentrators();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conc = new Intent(FormConcentrators.this, TelaPrincipal.class);
                startActivity(conc);
            }
        });

    }

    public void IniciarComponentes(){
        btnBack = findViewById(R.id.btn_backCO);
        btnSave = findViewById(R.id.btn_saveCO);

        chkYesCO = findViewById(R.id.idChkYesCO);
        chkNoCO = findViewById(R.id.idChkNoCO);

        txtHFCO = findViewById(R.id.idTxtHFCO);
        txtBrokenCO = findViewById(R.id.idTxtBrokenCO);

        chkYesPMCO = findViewById(R.id.idChkYesPMCO);
        chkNoPMCO = findViewById(R.id.idChkNoPMCO);

        chkPHFCO = findViewById(R.id.idChkPHFCO);
        chkPDICO = findViewById(R.id.idChkPDICO);
        chkSubCCO = findViewById(R.id.idChkSubCCO);

        txtFPMCO = findViewById(R.id.idTxtFPMCO);
        txtMCCO = findViewById(R.id.idTxtMCCO);
        txtCPMCONCO = findViewById(R.id.idTxtCPMCONCO);
        txtMPCO = findViewById(R.id.idTxtMPCO);

        chkYesPMCMCO = findViewById(R.id.idChkYesPMCMCO);
        chkNoPMCMCO = findViewById(R.id.idChkNoPMCMCO);

        chkYesLBCO = findViewById(R.id.idChkYesLBCO);
        chkNoLBCO = findViewById(R.id.idChkNoLBCO);

        txtCommentCO = findViewById(R.id.idTxtCommentCO);
    }

    public void LimparCampos(){
        txtBrokenCO.setText("");
        txtCPMCONCO.setText("");
        txtFPMCO.setText("");
        txtCommentCO.setText("");
        txtHFCO.setText("");
        txtMCCO.setText("");
        txtMPCO.setText("");
    }
}