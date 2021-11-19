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
import projecto.jhpiego.psm.conection.DAOConcentrators;
import projecto.jhpiego.psm.model.Concentrators;

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

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Concentrators concentrators = new Concentrators(
                        chkYesCO.isChecked()?"Yes":"",
                        chkNoCO.isChecked()?"No":"",

                        txtHFCO.getText().toString(),
                        txtBrokenCO.getText().toString(),

                        chkYesPMCO.isChecked()?"Yes":"",
                        chkNoPMCO.isChecked()?"No":"",

                        chkPHFCO.isChecked()?"Internal Technical Personnel of the health facility":"",
                        chkPDICO.isChecked()?"Personnel of the Department of Infrastructure":"",
                        chkSubCCO.isChecked()?"Subcontracted":"",

                        txtFPMCO.getText().toString(),
                        txtMCCO.getText().toString(),
                        txtCPMCONCO.getText().toString(),
                        txtMPCO.getText().toString(),

                        chkYesPMCMCO.isChecked()?"Yes":"",
                        chkNoPMCMCO.isChecked()?"No":"",

                        chkYesLBCO.isChecked()?"Yes":"",
                        chkNoLBCO.isChecked()?"No":"",

                        txtCommentCO.getText().toString());

                if (txtBrokenCO.getText().toString().isEmpty()||txtCPMCONCO.getText().toString().isEmpty()||txtFPMCO.getText().toString().isEmpty()||
                        txtMCCO.getText().toString().isEmpty() ||txtHFCO.getText().toString().isEmpty()||txtMPCO.getText().toString().isEmpty()){
                    Snackbar snackbar = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                }else {
                    dao.add(concentrators).addOnCompleteListener(suc ->{
                        Snackbar snackbar = Snackbar.make(v,mensagens[2],Snackbar.LENGTH_SHORT);
                        snackbar.setBackgroundTint(Color.BLUE);
                        snackbar.setTextColor(Color.WHITE);
                        snackbar.show();
                        LimparCampos();
                    }).addOnFailureListener(er->{
                        Snackbar snackbar = Snackbar.make(v,mensagens[1],Snackbar.LENGTH_SHORT);
                        snackbar.setBackgroundTint(Color.BLUE);
                        snackbar.setTextColor(Color.WHITE);
                        snackbar.show();
                    }).addOnFailureListener(er->{
                        Snackbar snackbar = Snackbar.make(v,mensagens[1],Snackbar.LENGTH_SHORT);
                        snackbar.setBackgroundTint(Color.BLUE);
                        snackbar.setTextColor(Color.WHITE);
                        snackbar.show();
                    });
                }
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