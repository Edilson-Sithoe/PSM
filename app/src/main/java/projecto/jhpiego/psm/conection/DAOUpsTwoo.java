package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.UpsOne;
import projecto.jhpiego.psm.model.UpsTwoo;


public class DAOUpsTwoo {

    private DatabaseReference databaseReference;

    public DAOUpsTwoo(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(UpsTwoo.class.getSimpleName());
    }

    public Task<Void> add(UpsTwoo upsTwoo){
        return databaseReference.push().setValue(upsTwoo);
    }
}
