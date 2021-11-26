package projecto.jhpiego.ett.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.google.android.material.snackbar.Snackbar;

import java.util.Locale;

import projecto.jhpiego.ett.WebService.Utils;
import projecto.jhpiego.ett.model.InterViewID;
import projecto.jhpiego.ett.R;
import projecto.jhpiego.ett.conection.DAOInterviewID;

public class FormInterviewID extends AppCompatActivity {

    private Button btnBack, btnSave, btnNext;
    private EditText fullName, organization,dates, others,secInterV, secInterVTwoo;
    private CheckBox chkSet, chkPhone, chkEmail;
    private ProgressDialog load;
    String[] mensagens = {"Fill in all fields","Fail to registration","Registration performed successfully"};

    InterViewID interViewID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_interview_id);

        getSupportActionBar().hide();
        IniciarComponentes();

   //     GetJson getJson = new GetJson();

    //    getJson.execute();
       // SimpleMaskFormater smf = new SimpleMaskFormater("DD/MM/AAAA");
       // MaskTextWatcher mtw = new MaskTextWatcher(dates, smf);
      //  dates.addTextChangedListener(mtw);

      //  DAOInterviewID dao = new DAOInterviewID();
      //  FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                interViewID = new InterViewID(
                        fullName.getText().toString(),
                        organization.getText().toString(),
                        dates.getText().toString(),
                        chkSet.isChecked()? "OnSet" : "",
                        chkPhone.isChecked()? "Phone" : "",
                        chkEmail.isChecked()? "Email" : "",
                        others.getText().toString(),
                        secInterV.getText().toString(),
                        secInterVTwoo.getText().toString());

                 if (fullName.getText().toString().isEmpty() || organization.getText().toString().isEmpty()|| dates.getText().toString().isEmpty()) {
                     Snackbar snackbar = Snackbar.make(v,mensagens[0],Snackbar.LENGTH_SHORT);
                     snackbar.setBackgroundTint(Color.BLUE);
                     snackbar.setTextColor(Color.WHITE);
                     snackbar.show();
                 } else {
                     Intent i = new Intent(FormInterviewID.this, FormIdentiInterV.class);
                     startActivity(i);
                 /*    dao.add(interViewID).addOnCompleteListener(suc ->{
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
                     });*/
                 }
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormInterviewID.this, TelaPrincipal.class);
                startActivity(i);
            }
        });

      /*  btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormInterviewID.this, FormIdentiInterV.class);
                startActivity(i);
            }
        });*/
    }

    public void IniciarComponentes(){
        fullName = findViewById(R.id.idFisrtUsar);
        organization = findViewById(R.id.idOrga);
        dates = findViewById(R.id.id_date_inter);
     //   dates.addTextChangedListener(Mask.insert("##/##/####", dates));
     //   NascimentoUsu = (EditText)findViewById(R.id.edtdata_usu);
      //  NascimentoUsu.addTextChangedListener(Mask.insert("##/##/####", NascimentoUsu));

        /****************************************************/
        chkSet = findViewById(R.id.chkOnSet);
        chkPhone = findViewById(R.id.chkByPhone);
        chkEmail = findViewById(R.id.chkByEmail);
        /****************************************************/
        others = findViewById(R.id.id_other);
        secInterV = findViewById(R.id.idIntervThree);
        secInterVTwoo = findViewById(R.id.idIntervTwo);

        btnBack = findViewById(R.id.btn_back);
        btnSave = findViewById(R.id.btn_save);
        btnNext = findViewById(R.id.btn_next);


    }

    public void LimparCampos() {
        fullName.setText("");
        organization.setText("");
        dates.setText("");

        others.setText("");
        secInterV.setText("");
        secInterVTwoo.setText("");
    }
/*
    private class GetJson extends AsyncTask<Void, Void, InterViewID> {

        @Override
        protected void onPreExecute() {
            load = ProgressDialog.show(FormInterviewID.this,"Wait please..", "Getting informaction");
        }

        @Override
        protected InterViewID doInBackground(Void... params) {
            Utils util = new Utils();

            return util.getInformacao("https://projecto-psm-1276c-default-rtdb.firebaseio.com/");
        }

        @Override
        protected void onPostExecute(InterViewID interViewID) {
            fullName.setText(interViewID.getTxtFullName().substring(0,1).toUpperCase()+interViewID.getTxtFullName().substring(1));
            organization.setText(interViewID.getTxtOrganization().substring(0,1).toUpperCase()+interViewID.getTxtOrganization().substring(1));
           // dates.setText(interViewID.getDataDates().substring(0,1).toUpperCase()+interViewID.getTxtOrganization().substring(1));
            others.setText(interViewID.getTxtOthers().substring(0,1).toUpperCase()+interViewID.getTxtOthers().substring(1));
            secInterV.setText(interViewID.getTxtSecInterV().substring(0,1).toUpperCase()+interViewID.getTxtSecInterV().substring(1));
            secInterVTwoo.setText(interViewID.getTxtSecInterVTwoo().substring(0,1).toUpperCase()+interViewID.getTxtSecInterVTwoo().substring(1));
            chkSet.setText(interViewID.getCboOnSet().substring(0,1).toUpperCase()+interViewID.getCboOnSet().substring(1));
            chkPhone.setText(interViewID.getCboByPhone().substring(0,1).toUpperCase()+interViewID.getCboByPhone().substring(1));
            chkEmail.setText(interViewID.getCboByEmail().substring(0,1).toUpperCase()+interViewID.getCboByEmail().substring(1));
        }
    }*/
}