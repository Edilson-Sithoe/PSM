package projecto.jhpiego.ett.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


import java.util.ArrayList;

import projecto.jhpiego.ett.R;
import projecto.jhpiego.ett.model.IdentInterView;

public class FormIdentIntMenu extends AppCompatActivity implements IdentInterViewAdapter.IdentIntViewClickInterface{

    private RecyclerView identInteRV;
  //  private ProgressBar progressBarPB;
    private FloatingActionButton addFAB;
    private ArrayList<IdentInterView> identInterViewArrayList;
    private RelativeLayout bottomSheetRL;
    private IdentInterViewAdapter identInterViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_ident_int_menu);

        getSupportActionBar().hide();
        IniciarComponentes();

        identInterViewArrayList = new ArrayList<>();

        identInterViewAdapter = new IdentInterViewAdapter(identInterViewArrayList,this,this);
        identInteRV.setLayoutManager(new LinearLayoutManager(this));
        identInteRV.setAdapter(identInterViewAdapter);
        addFAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FormIdentIntMenu.this,FormIdentiInterV.class));
            }
        });

    }


    public void IniciarComponentes(){
        identInteRV = findViewById(R.id.idRVIdentInter);
     //   progressBarPB = findViewById(R.id.idPBLoading);
        addFAB = findViewById(R.id.idAddFAB);
        bottomSheetRL = findViewById(R.id.idRLBSheet);



    }

    @Override
    public void onIdentIntViewClick(int position) {
        displayButtomSheet(identInterViewArrayList.get(position));
    }

    private void displayButtomSheet(IdentInterView identInterView){
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        View layout = LayoutInflater.from(this).inflate(R.layout.buttom_dialog,bottomSheetRL);
        bottomSheetDialog.setContentView(layout);
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setCanceledOnTouchOutside(true);
        bottomSheetDialog.show();

        TextView nameTV = findViewById(R.id.idTVName);
        TextView emailTV = findViewById(R.id.idTVEmail);
        TextView telephoneTV = findViewById(R.id.idTVTelephone);
        TextView positonTV = findViewById(R.id.idTVPosition);
        Button editBtn = layout.findViewById(R.id.idBtnEditIdent);
        Button viewDetailsBtn = layout.findViewById(R.id.idBtnViewDetails);

        nameTV.setText(identInterView.getNome());

   /*     nameTV.setText(identInterView.getNome());
        emailTV.setText(identInterView.getEmail());
        telephoneTV.setText(identInterView.getTelephone());
        positonTV.setText(identInterView.getPosition());*/

        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FormIdentIntMenu.this, EditIdentInter.class);
                i.putExtra("InterView",identInterView);
                startActivity(i);
            }
        });

        viewDetailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(identInterView.getIdentInterID()));
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.meu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.idLogOut:
                Toast.makeText(this, "User Logged Out",Toast.LENGTH_SHORT).show();

                Intent i = new Intent(FormIdentIntMenu.this,FormLogin.class);
                startActivity(i);
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}