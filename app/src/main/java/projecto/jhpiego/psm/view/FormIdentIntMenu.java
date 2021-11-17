package projecto.jhpiego.psm.view;

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
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import projecto.jhpiego.psm.R;
import projecto.jhpiego.psm.model.IdentInterView;

public class FormIdentIntMenu extends AppCompatActivity implements IdentInterViewAdapter.IdentIntViewClickInterface{

    private RecyclerView identInteRV;
  //  private ProgressBar progressBarPB;
    private FloatingActionButton addFAB;
    private FirebaseAuth mAuth;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private ArrayList<IdentInterView> identInterViewArrayList;
    private RelativeLayout bottomSheetRL;
    private IdentInterViewAdapter identInterViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_ident_int_menu);

        getSupportActionBar().hide();
        IniciarComponentes();

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("IdentInterView");
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
        getAllIdentInter();
    }

    public void getAllIdentInter(){
        identInterViewArrayList.clear();
        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                identInterViewArrayList.add(snapshot.getValue(IdentInterView.class));
                identInterViewAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                identInterViewAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot snapshot) {
                identInterViewAdapter.notifyDataSetChanged();
            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
                identInterViewAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void IniciarComponentes(){
        identInteRV = findViewById(R.id.idRVIdentInter);
     //   progressBarPB = findViewById(R.id.idPBLoading);
        addFAB = findViewById(R.id.idAddFAB);
        bottomSheetRL = findViewById(R.id.idRLBSheet);
        mAuth = FirebaseAuth.getInstance();


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
        emailTV.setText(identInterView.getEmail());
        telephoneTV.setText(identInterView.getTelephone());
        positonTV.setText(identInterView.getPosition());

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
                mAuth.signOut();
                Intent i = new Intent(FormIdentIntMenu.this,FormLogin.class);
                startActivity(i);
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}