package projecto.jhpiego.psm.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

import projecto.jhpiego.psm.R;

public class TelaPrincipal extends AppCompatActivity {

    private Button btn_interview, btnLogout, btn_identInter, btn_identiHFa;
    private Button btn_electricity, btn_generatorOne, btn_generatorTwoo;
    private Button btn_generatorThree, btn_generatorFour, btn_stabilizer;
    private Button btn_upsOne, btn_upsTwoo, btn_solarEnerg, btn_medGasSystem;
    private Button btn_FPAFFS, btn_cylinder,btn_conc, btn_maniF,btn_maniFTwoo;
    private Button btn_maniFoldEmerg,btn_liquidOX, btn_liquidOXT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        getSupportActionBar().hide();
        InitializerComponents();

        btn_interview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent interviw = new Intent(TelaPrincipal.this, FormInterviewID.class);
                startActivity(interviw);
            }
        });

        btn_identInter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent identInter = new Intent(TelaPrincipal.this, FormIdentIntMenu.class);
                startActivity(identInter);
            }
        });

        btn_identiHFa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent identHeath = new Intent(TelaPrincipal.this, FormIdentiHeaFacil.class);
                startActivity(identHeath);
            }
        });

        btn_electricity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent electr = new Intent(TelaPrincipal.this, FormInfrastructure.class);
                startActivity(electr);
            }
        });

        btn_generatorOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent genOne = new Intent(TelaPrincipal.this, FormGeneratorOne.class);
                startActivity(genOne);
            }
        });

        btn_generatorTwoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent genTwoo = new Intent(TelaPrincipal.this, FormGeneratorTwo.class);
                startActivity(genTwoo);
            }
        });

        btn_generatorThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent genThree = new Intent(TelaPrincipal.this, FormGeneratorThree.class);
                startActivity(genThree);
            }
        });

        btn_generatorFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent genFour = new Intent(TelaPrincipal.this, FormGeneratorFour.class);
                startActivity(genFour);
            }
        });

        btn_stabilizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent stabilizer = new Intent(TelaPrincipal.this, FormStabilizer.class);
                startActivity(stabilizer);
            }
        });

        btn_upsOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent upsOne = new Intent(TelaPrincipal.this, FormUPSOne.class);
                startActivity(upsOne);
            }
        });

        btn_upsTwoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent upsTwoo = new Intent(TelaPrincipal.this, FormUPSTwoo.class);
                startActivity(upsTwoo);
            }
        });

        btn_solarEnerg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent solarEnerg = new Intent(TelaPrincipal.this, FormSolarEnergy.class);
                startActivity(solarEnerg);
            }
        });

        btn_medGasSystem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent solarEnerg = new Intent(TelaPrincipal.this, FormMedGasSystem.class);
                startActivity(solarEnerg);
            }
        });

        btn_FPAFFS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent freePrev = new Intent(TelaPrincipal.this, FormFreePrevFFS.class);
                startActivity(freePrev);
            }
        });

        btn_cylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cwm = new Intent(TelaPrincipal.this, FormCylinders_UWM.class);
                startActivity(cwm);
            }
        });

        btn_conc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conc = new Intent(TelaPrincipal.this, FormConcentrators.class);
                startActivity(conc);
            }
        });

        btn_maniF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manif = new Intent(TelaPrincipal.this, FormManiFold.class);
                startActivity(manif);
            }
        });

        btn_maniFTwoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manift = new Intent(TelaPrincipal.this, FormManiFoldTwoo.class);
                startActivity(manift);
            }
        });

        btn_maniFoldEmerg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent manift = new Intent(TelaPrincipal.this, FormMFEmerg.class);
                startActivity(manift);
            }
        });

        btn_liquidOX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liquidOx = new Intent(TelaPrincipal.this, FormLiquidOx.class);
                startActivity(liquidOx);
            }
        });

        btn_liquidOXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent liquidOxT = new Intent(TelaPrincipal.this, FormLiquidOxTwoo.class);
                startActivity(liquidOxT);
            }
        });

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent i = new Intent(TelaPrincipal.this, FormLogin.class);
                startActivity(i);
                finish();
            }
        });


    }

    private void InitializerComponents(){
        btn_interview = findViewById(R.id.btn_interviewID);
        btn_identInter = findViewById(R.id.idBtn_identOfInter);
        btn_identiHFa = findViewById(R.id.idBtn_identiOfHealt);
        btnLogout = findViewById(R.id.idBtn_logout);
        btn_electricity = findViewById(R.id.idBtn_eletc);
        btn_generatorOne = findViewById(R.id.idBtn_generatorOne);
        btn_generatorTwoo = findViewById(R.id.idBtn_generatorTwoo);
        btn_generatorThree = findViewById(R.id.idBtn_generatorThree);
        btn_generatorFour = findViewById(R.id.idBtn_generatorFour);
        btn_stabilizer = findViewById(R.id.idBtn_stabilizer);
        btn_upsOne = findViewById(R.id.idBtn_upsOne);
        btn_upsTwoo = findViewById(R.id.idBtn_upsTwoo);
        btn_solarEnerg = findViewById(R.id.idBtn_solarEnergy);
        btn_medGasSystem = findViewById(R.id.idBtn_medicalSystem);
        btn_FPAFFS = findViewById(R.id.idBtn_FPAFFS);
        btn_cylinder = findViewById(R.id.idBtn_CWM);
        btn_conc = findViewById(R.id.idBtn_CONC);
        btn_maniF = findViewById(R.id.idBtn_MFOne);
        btn_maniFTwoo = findViewById(R.id.idBtn_MFTwoo);
        btn_maniFoldEmerg = findViewById(R.id.idBtn_EM);
        btn_liquidOX = findViewById(R.id.idBtn_LOTOne);
        btn_liquidOXT = findViewById(R.id.idBtn_LOTTwo);
    }
}