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
import projecto.jhpiego.ett.conection.DAOCylinders_UWM;
import projecto.jhpiego.ett.model.CYLINDERS_UWM;

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