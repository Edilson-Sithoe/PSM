package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.GeneratorOne;
import projecto.jhpiego.psm.model.InterViewID;

public class DAOGeneratorOne {
    private DatabaseReference databaseReference;
    private DatabaseReference db;

    public DAOGeneratorOne () {
        db = FirebaseDatabase.getInstance().getReference(GeneratorOne.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(GeneratorOne generatorOne){
        return databaseReference.push().setValue(generatorOne);
    }
}
