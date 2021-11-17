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

import projecto.jhpiego.psm.R;
import projecto.jhpiego.psm.conection.DAOIdentHealthFac;
import projecto.jhpiego.psm.model.IdentiHeathFac;

public class FormIdentiHeaFacil extends AppCompatActivity {

    private Button btnBack, btnSave;
    private EditText txtHealthID, txtNameHealth,txtLocation, txtDistrict, txtProvince, txtRegion, txtGpsCard, txtMaternity, txtCicov,txtIcu,txtTotal;
    private CheckBox chkUrbanHCenter, chkHealthPost,chkCentralHosp, chkSpecHosp, chkMilitaryHosp, chkDistHosp, chkGenHosp, chkRuralHosp, chkProvHosp, cbYyesOption, chkNoOption;
    private CheckBox  chkOutConsul,chkCasualWard, chkMaternityWard, chkNursWard, chkPaediatricWard, chkGeneralWard, chkSurgicalWard, chkOperThea,chkIntens;
    private CheckBox chkRadiology, chkOphthalm,chkCicov, chkLaundry, chkKitchen, chkWast, chkMorgue, chkPharmacy;
    private CheckBox chkFirstLevel, chkSecLEvel, chkThirdLevel, chkFoutLevel, chkRuralHCenter;
    String[] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_identi_hea_facil);

        getSupportActionBar().hide();
        IniciarComponentes();

        DAOIdentHealthFac dao = new DAOIdentHealthFac();

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormIdentiHeaFacil.this, TelaPrincipal.class);
                startActivity(i);
            }
        });

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IdentiHeathFac identiHeathFac = new IdentiHeathFac(
                        txtHealthID.getText().toString(),
                        txtNameHealth.getText().toString(),
                        txtLocation.getText().toString(),
                        txtDistrict.getText().toString(),
                        txtProvince.getText().toString(),
                        txtRegion.getText().toString(),
                        txtGpsCard.getText().toString(),
                        chkFirstLevel.isChecked()? "Firs Level": "No",
                        chkSecLEvel.isChecked()? "Second Level": "No",
                        chkThirdLevel.isChecked()? "Third Level": "No",
                        chkFoutLevel.isChecked()? "Fourth Level": "No",
                        chkRuralHCenter.isChecked()? "Rural Health Center": "No",
                        chkUrbanHCenter.isChecked()? "Urbano Health Center": "No",
                        chkHealthPost.isChecked()? "Health Post (HF)": "No",
                        chkCentralHosp.isChecked()? "Central Hospital (HF)": "No",
                        chkSpecHosp.isChecked()? "Specialized Hospital ": "No",
                        chkMilitaryHosp.isChecked()? "Military Hospital (HF)": "No",
                        chkDistHosp.isChecked()? "District Hospital (HF)": "No",
                        chkGenHosp.isChecked()? "General Hospital (HF)": "No",
                        chkRuralHosp.isChecked()? "Rural Hospital (HF)": "No",
                        chkProvHosp.isChecked()? "Provincial Hospital (HF)": "No",
                        cbYyesOption.isChecked()? "Yes  ": "No",
                        chkNoOption.isChecked()? "No": "No",
                        txtTotal.getText().toString(),
                        txtMaternity.getText().toString(),
                        txtCicov.getText().toString(),
                        txtIcu.getText().toString(),
                        chkOutConsul.isChecked()? "Outpatient Consultations": "No",
                        chkCasualWard.isChecked()? "Casualty Ward": "No",
                        chkMaternityWard.isChecked()? "Maternity Ward": "No",
                        chkNursWard.isChecked()? "Nursery Ward": "No",
                        chkPaediatricWard.isChecked()? "Paediatric Ward": "No",
                        chkGeneralWard.isChecked()? "General Ward": "No",
                        chkSurgicalWard.isChecked()? "Surgical ward": "No",
                        chkOperThea.isChecked()? "Operating Theatre": "No",
                        chkIntens.isChecked()? "Intensive Care (ICU)": "No",
                        chkRadiology.isChecked()? "Radiology": "No",
                        chkOphthalm.isChecked()? "Ophthalmology": "No",
                        chkCicov.isChecked()? "CICOV": "No",
                        chkLaundry.isChecked()? "Laundry": "No",
                        chkKitchen.isChecked()? "Kitchen": "No",
                        chkWast.isChecked()? "Waste treatment": "No",
                        chkMorgue.isChecked()? "Morgue": "No",
                        chkPharmacy.isChecked()? "Pharmacy": "No");

                if (txtTotal.getText().toString().isEmpty() || txtMaternity.getText().toString().isEmpty() || txtCicov.getText().toString().isEmpty() ||txtIcu.getText().toString().isEmpty()) {
                    Snackbar snackbar = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_SHORT);
                    snackbar.setBackgroundTint(Color.BLUE);
                    snackbar.setTextColor(Color.WHITE);
                    snackbar.show();
                } else {
                    dao.add(identiHeathFac).addOnCompleteListener(suc ->{
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

    public void IniciarComponentes(){
        btnBack = findViewById(R.id.btn_back);
        btnSave = findViewById(R.id.btn_save);

        txtHealthID = findViewById(R.id.idHealtFacID);
        txtNameHealth = findViewById(R.id.idNameHealt);
        txtLocation = findViewById(R.id.idNameHealt);
        txtDistrict = findViewById(R.id.idDistrict);
        txtProvince = findViewById(R.id.idProvince);
        txtRegion = findViewById(R.id.idRegion);
        txtGpsCard = findViewById(R.id.idGPS);
        txtMaternity = findViewById(R.id.idMaternity);
        txtCicov = findViewById(R.id.idCICOV);
        txtTotal = findViewById(R.id.idTotal);
        txtIcu = findViewById(R.id.idICU);

        chkFirstLevel = findViewById(R.id.chkFLevel);
        chkSecLEvel = findViewById(R.id.chkSLevel);
        chkThirdLevel = findViewById(R.id.chkTLevel);
        chkFoutLevel = findViewById(R.id.chkFLevel);
        chkRuralHCenter = findViewById(R.id.chkRuralHealthCenter);
        chkUrbanHCenter = findViewById(R.id.chkSLevel);
        chkHealthPost = findViewById(R.id.chkTLevel);
        chkCentralHosp = findViewById(R.id.chkFLevel);

        chkSpecHosp = findViewById(R.id.chkSpecializedHospital);
        chkMilitaryHosp = findViewById(R.id.chkMilitaryHospital);
        chkDistHosp = findViewById(R.id.chkDistrictHospital);
        chkGenHosp = findViewById(R.id.chkGeneralHospital);
        chkRuralHosp = findViewById(R.id.chkRuralHospital);
        chkProvHosp = findViewById(R.id.chkProvincialHospital);
        cbYyesOption = findViewById(R.id.chkYes);
        chkNoOption = findViewById(R.id.chkNo);

        chkOutConsul = findViewById(R.id.chkOutpatientConsultationsr);
        chkCasualWard = findViewById(R.id.chkCasualtyWard);
        chkMaternityWard = findViewById(R.id.chkMaternityWard);
        chkNursWard = findViewById(R.id.chkNurseryWard);
        chkPaediatricWard = findViewById(R.id.chkPaediatricWard);
        chkGeneralWard = findViewById(R.id.chkGeneralWard);
        chkSurgicalWard = findViewById(R.id.chkSurgicalward);
        chkOperThea = findViewById(R.id.chkOperatingTheatre);

        chkIntens = findViewById(R.id.chkIntensiveCare);
        chkRadiology = findViewById(R.id.chkRadiology);
        chkOphthalm = findViewById(R.id.chkOphthalmology);
        chkCicov = findViewById(R.id.chkCICOV);
        chkLaundry = findViewById(R.id.chkLaundry);
        chkKitchen = findViewById(R.id.chkKitchen);
        chkWast = findViewById(R.id.chkWasteTreatment);
        chkMorgue = findViewById(R.id.chkMorgue);
        chkPharmacy = findViewById(R.id.chkPharmacy);
    }

    public void LimparCampos() {
        txtCicov.setText("");
        txtDistrict.setText("");
        txtGpsCard.setText("");
        txtHealthID.setText("");
        txtIcu.setText("");
        txtLocation.setText("");
        txtMaternity.setText("");
        txtProvince.setText("");
        txtTotal.setText("");
    }
}