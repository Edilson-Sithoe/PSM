package projecto.jhpiego.psm.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.R;
import projecto.jhpiego.psm.conection.DAOMedGasSyst;
import projecto.jhpiego.psm.model.MedGasSistema;

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

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MedGasSistema medGasSistema = new MedGasSistema(
                        txtConsumOxig.getText().toString(),
                        chkFactory.isChecked()? "Factory" : "No",
                        chkLiquidTank.isChecked()?"O2 Liquid Tank" :"No",
                        chkManifold.isChecked()? "Manifold" : "No",
                        chkConcentrators.isChecked()? "Concentrators" : "No",
                        chkCylinders.isChecked()? "Cylinders" : "No",
                        chkNA.isChecked()? "N/A" : "No",

                        chkFactoryPS.isChecked()? "Factory" : "No",
                        chkLiquidTankPS.isChecked()?"O2 Liquid Tank" :"No",
                        chkManifoldPS.isChecked()? "Manifold" : "No",
                        chkConcentratorsPS.isChecked()? "Concentrators" : "No",
                        chkCylindersPS.isChecked()? "Cylinders" : "No",
                        chkNAPS.isChecked()? "N/A" : "No",

                        chkFactorySS.isChecked()? "Factory" : "No",
                        chkLiquidTankSS.isChecked()?"O2 Liquid Tank" :"No",
                        chkManifoldSS.isChecked()? "Manifold" : "No",
                        chkConcentratorsSS.isChecked()? "Concentrators" : "No",
                        chkCylindersSS.isChecked()? "Cylinders" : "No",
                        chkNASS.isChecked()? "N/A" : "No",

                        chkFactoryES.isChecked()? "Factory" : "No",
                        chkLiquidTankES.isChecked()?"O2 Liquid Tank" :"No",
                        chkManifoldES.isChecked()? "Manifold" : "No",
                        chkConcentratorsES.isChecked()? "Concentrators" : "No",
                        chkCylindersES.isChecked()? "Cylinders" : "No",
                        chkNAES.isChecked()? "N/A" : "No",

                        txtComment.getText().toString());

                if (txtConsumOxig.getText().toString().isEmpty()) {
                    Snackbar snackbar = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                } else {
                    dao.add(medGasSistema).addOnCompleteListener(suc ->{
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