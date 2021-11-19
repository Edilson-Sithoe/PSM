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
import projecto.jhpiego.psm.conection.DAOCylinders_UWM;
import projecto.jhpiego.psm.model.CYLINDERS_UWM;

public class FormCylinders_UWM extends AppCompatActivity {

    private Button btnBack, btnSave;
    private CheckBox chkYesC, chkNoC,chkEC,chkFC,chkGC,chkJC,chkDontNoC,chkPINC,chkPINSC,chkBullnoseC;
    private CheckBox chkHandwheelC,chkDailyC,chkWeeklyC,chkFortnightlyC,chkMonthlyC,chkOnrequestC,chkYESSUC,chkNOSC;
    private TextView txtAVGC,txtAVGMC,txtTypeC,txtOtherC,txtNameSuppC, txtComment;
    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cylinders_uwm);

        getSupportActionBar().hide();
        InicializarComponentes();

        DAOCylinders_UWM dao = new DAOCylinders_UWM();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iBack = new Intent(FormCylinders_UWM.this, TelaPrincipal.class);
                startActivity(iBack);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CYLINDERS_UWM cylinders_uwm = new CYLINDERS_UWM(
                        chkYesC.isChecked()? "Yes":"",
                        chkNoC.isChecked()? "No":"",

                        txtAVGC.getText().toString(),
                        txtAVGMC.getText().toString(),
                        txtTypeC.getText().toString(),

                        chkEC.isChecked()?"E (1m3/680L)":"",
                        chkFC.isChecked()?"F (1.5m3/1360L)":"",
                        chkGC.isChecked()?"G (3.5m3/3400L)":"",
                        chkJC.isChecked()?"J (7.5m3/7800L)":"",
                        chkDontNoC.isChecked()?"Don't know":"",
                        txtOtherC.getText().toString(),

                        chkPINC.isChecked()?"Pin index":"",
                        chkPINSC.isChecked()?"Pin-index side spindle valve":"",
                        chkBullnoseC.isChecked()?"Bullnose valve":"",
                        chkHandwheelC.isChecked()?"Handwheel side outlet":"",

                        txtNameSuppC.getText().toString(),

                        chkDailyC.isChecked()?"Daily":"",
                        chkWeeklyC.isChecked()?"Weekly":"",
                        chkFortnightlyC.isChecked()?"Fortnightly":"",
                        chkMonthlyC.isChecked()?"Monthly":"",
                        chkOnrequestC.isChecked()?"On request":"",

                        chkYESSUC.isChecked()?"Yes":"",
                        chkNOSC.isChecked()?"No":"",

                        txtComment.getText().toString());

                if (txtAVGC.getText().toString().isEmpty() || txtAVGMC.getText().toString().isEmpty() || txtTypeC.getText().toString().isEmpty() || txtNameSuppC.getText().toString().isEmpty()){
                    Snackbar snackbar = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                } else{
                    dao.add(cylinders_uwm).addOnCompleteListener(suc->{
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
                    });
                }
            }
        });
    }

    public void InicializarComponentes(){
        btnBack = findViewById(R.id.btn_backC);
        btnSave = findViewById(R.id.btn_saveC);

        chkYesC = findViewById(R.id.idChkYesC);
        chkNoC = findViewById(R.id.idChkNoC);
        txtAVGC = findViewById(R.id.idTxtAVGC);
        txtAVGMC = findViewById(R.id.idTxtAVGMC);
        txtTypeC = findViewById(R.id.idTxtTypeC);

        chkEC = findViewById(R.id.idChkEC);
        chkFC = findViewById(R.id.idChkFC);
        chkGC = findViewById(R.id.idChkGC);
        chkJC = findViewById(R.id.idChkJC);
        chkDontNoC = findViewById(R.id.idChkDontNoC);

        txtOtherC = findViewById(R.id.idTxtOtherC);

        chkPINC = findViewById(R.id.idChkPINC);
        chkPINSC = findViewById(R.id.idChkPINSC);
        chkBullnoseC = findViewById(R.id.idChkBullnoseC);
        chkHandwheelC = findViewById(R.id.idChkHandwheelC);

        txtNameSuppC = findViewById(R.id.idTxtNameSuppC);

        chkDailyC = findViewById(R.id.idChkDailyC);
        chkWeeklyC = findViewById(R.id.idChkWeeklyC);
        chkFortnightlyC = findViewById(R.id.idChkFortnightlyC);
        chkMonthlyC = findViewById(R.id.idChkMonthlyC);
        chkOnrequestC = findViewById(R.id.idChkOnrequestC);

        chkYESSUC = findViewById(R.id.idChkYESSUC);
        chkNOSC = findViewById(R.id.idChkNOSC);

        txtComment = findViewById(R.id.idTxtComment);
    }

    public void LimparCampos(){
        txtComment.setText("");
        txtNameSuppC.setText("");
        txtTypeC.setText("");
        txtAVGC.setText("");
        txtOtherC.setText("");
        txtAVGMC.setText("");
    }

}