package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.UpsOne;


public class DAOUpsOne {

    private DatabaseReference databaseReference;

    public DAOUpsOne (){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(UpsOne.class.getSimpleName());
    }

    public Task<Void> add(UpsOne upsOne){
        return databaseReference.push().setValue(upsOne);
    }
}
