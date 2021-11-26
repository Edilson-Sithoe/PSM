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
import projecto.jhpiego.ett.conection.DAOMedGasSyst;
import projecto.jhpiego.ett.model.MedGasSistema;

public class FormMedGasSystem extends AppCompatActivity {

    private Button btnBack, btnSave;
    private EditText txtConsumOxig, txtComment;
    private CheckBox chkFactory, chkLiquidTank,chkManifold,chkConcentrators,chkCylinders, chkNA;
    private CheckBox chkFactoryPS, chkLiquidTankPS,chkManifoldPS,chkConcentratorsPS,chkCylindersPS, chkNAPS;
    private CheckBox chkFactorySS, chkLiquidTankSS,chkManifoldSS,chkConcentratorsSS,chkCylindersSS, chkNASS;
    private CheckBox chkFactoryES, chkLiquidTankES,chkManifoldES,chkConcentratorsES,chkCylindersES, chkNAES;

    String [] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_med_gas_system);

        getSupportActionBar().hide();
        InitializerComponents();

        DAOMedGasSyst dao = new DAOMedGasSyst();
   //     FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backMGS = new Intent(FormMedGasSystem.this,TelaPrincipal.class);
                startActivity(backMGS);
            }
        });

    }

    public void InitializerComponents(){

        btnBack = findViewById(R.id.btn_backMGS);
        btnSave = findViewById(R.id.btn_saveMGS);

        txtConsumOxig = findViewById(R.id.idTxtConsumMGS);

        chkFactory = findViewById(R.id.idChkFactory);
        chkLiquidTank = findViewById(R.id.idChkLiqTank);
        chkManifold = findViewById(R.id.idChkManifold);
        chkConcentrators = findViewById(R.id.idChkConc);
        chkCylinders = findViewById(R.id.idChkCylinders);
        chkNA = findViewById(R.id.idChkNA);

        chkFactoryPS = findViewById(R.id.idChkFactoryPS);
        chkLiquidTankPS = findViewById(R.id.idChkLiqTankPS);
        chkManifoldPS = findViewById(R.id.idChkManifoldPS);
        chkConcentratorsPS = findViewById(R.id.idChkConcPS);
        chkCylindersPS = findViewById(R.id.idChkCylindersPS);
        chkNAPS = findViewById(R.id.idChkNAPS);

        chkFactorySS = findViewById(R.id.idChkFactorySS);
        chkLiquidTankSS = findViewById(R.id.idChkLiqTankSS);
        chkManifoldSS = findViewById(R.id.idChkManifoldSS);
        chkConcentratorsSS = findViewById(R.id.idChkConcSS);
        chkCylindersSS = findViewById(R.id.idChkCylindersSS);
        chkNASS = findViewById(R.id.idChkNASS);

        chkFactoryES = findViewById(R.id.idChkFactoryES);
        chkLiquidTankES = findViewById(R.id.idChkLiqTankES);
        chkManifoldES = findViewById(R.id.idChkManifoldES);
        chkConcentratorsES = findViewById(R.id.idChkConcES);
        chkCylindersES = findViewById(R.id.idChkCylindersES);
        chkNAES = findViewById(R.id.idChkNAES);

        txtComment = findViewById(R.id.idTxtComentMGS);
    }

    public void LimparCampos(){
        txtConsumOxig.setText("");
        txtComment.setText("");
    }
}