package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.Stabilizer;

public class DAOStabilizer {

    private DatabaseReference databaseReference;

    public DAOStabilizer () {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Stabilizer.class.getSimpleName());
}

    public Task<Void> add(Stabilizer stabilizer){
        return databaseReference.push().setValue(stabilizer);
    }
}
