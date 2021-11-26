package projecto.jhpiego.ett.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

import projecto.jhpiego.ett.R;
import projecto.jhpiego.ett.conection.DAOElectricity;
import projecto.jhpiego.ett.model.Electricity;

public class FormInfrastructure extends AppCompatActivity {

    private Button btnBack, btnSave;
    private EditText txtOther, txtComPoSrc,txtElectUsaLast, txtCostOrElect;
    private CheckBox ckhEDM, chkGenerator,chkSolarPanels, chkOther, chkOutage, chkOutLesHour, chkFrquen, chkWeekly, chkDaily, chkBToYes, chkThWeek;
    private CheckBox  chkThMonth,chkThYear, chkLesThanMin, chkFewMinute, chkLessThanH, chkBetweeOneEi, chkDay, chkYesOR,chkNOoR;
    private CheckBox chkDontKnow, chkNo,chkGeneratorSec, chkSolPanels, chkOtherSec, chkYesProvPO,chkNoProvPO , chkICU, chkOpTheatre, chkByEmrgeRoom;
    private CheckBox chkDanger, chkPoor, chkAdequate, chkGood;
    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_infrastructure);

        getSupportActionBar().hide();
        IniciarComponentes();

        DAOElectricity dao = new DAOElectricity();
    //    FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormInfrastructure.this, TelaPrincipal.class);
                startActivity(i);
            }
        });


    }

    public void IniciarComponentes(){
        btnBack = findViewById(R.id.btn_back);
        btnSave = findViewById(R.id.btn_save);

        ckhEDM = findViewById(R.id.chkEDM);
        chkGenerator = findViewById(R.id.chkGenerator);
        chkSolarPanels = findViewById(R.id.chkSolPanels);
        chkOther = findViewById(R.id.chkOther);
        chkOutage = findViewById(R.id.chkOutage);
        chkOutLesHour = findViewById(R.id.chkOutLesHour);
        chkFrquen = findViewById(R.id.chkFrquent);
        chkWeekly = findViewById(R.id.chkWeekly);
        chkDaily = findViewById(R.id.chkDaily);
        chkBToYes = findViewById(R.id.chkBToYes);
        chkThWeek = findViewById(R.id.chkThWeek);

        chkThMonth = findViewById(R.id.chkThMonth);
        chkThYear = findViewById(R.id.chkThYear);
        chkLesThanMin = findViewById(R.id.chkLesThanMin);
        chkFewMinute = findViewById(R.id.chkFewMinute);
        chkLessThanH = findViewById(R.id.chkLessThanH);
        chkBetweeOneEi = findViewById(R.id.chkBetweeOneEi);

        chkYesOR = findViewById(R.id.chkYesOR);
        chkNOoR = findViewById(R.id.chkNOoR);

        chkDay = findViewById(R.id.chkDay);
        chkDontKnow = findViewById(R.id.chkDontKnow);
        chkNo = findViewById(R.id.chkNo);
        chkGeneratorSec = findViewById(R.id.chkGeneratorSec);

        chkSolPanels = findViewById(R.id.chkSolPanels);
        chkOtherSec = findViewById(R.id.chkOtherSec);
        chkYesProvPO = findViewById(R.id.chkYesProvPO);
        chkNoProvPO = findViewById(R.id.chkNoProvPO);

        chkICU = findViewById(R.id.chkICU);
        chkOpTheatre = findViewById(R.id.chkOpTheatre);
        chkByEmrgeRoom = findViewById(R.id.chkByEmrgeRoom);

        txtOther = findViewById(R.id.id_other);
        txtComPoSrc = findViewById(R.id.idComPoSrc);
        txtElectUsaLast = findViewById(R.id.idElectUsaLast);
        txtCostOrElect = findViewById(R.id.idCostOrElect);

        chkDanger = findViewById(R.id.chkDanger);
        chkPoor = findViewById(R.id.chkPoor);
        chkAdequate = findViewById(R.id.chkAdequate);
        chkGood = findViewById(R.id.chkGood);
    }

    public void LimparCampos() {
        txtOther.setText("");
        txtComPoSrc.setText("");
        txtElectUsaLast.setText("");
        txtCostOrElect.setText("");
    }
}