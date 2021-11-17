package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.UpsOne;


public class DAOUpsOne {

    private DatabaseReference db;

    public DAOUpsOne (){
        db = FirebaseDatabase.getInstance().getReference(UpsOne.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(UpsOne upsOne){
        return db.push().setValue(upsOne);
    }
}
