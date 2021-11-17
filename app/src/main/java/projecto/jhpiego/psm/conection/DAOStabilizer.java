package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.Stabilizer;

public class DAOStabilizer {

    private DatabaseReference db;

    public DAOStabilizer () {
        db = FirebaseDatabase.getInstance().getReference(Stabilizer.class.getSimpleName());
        db.keepSynced(true);
}

    public Task<Void> add(Stabilizer stabilizer){
        return db.push().setValue(stabilizer);
    }
}
