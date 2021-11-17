package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.GeneratorOne;

public class DAOGeneratorOne {
    private DatabaseReference databaseReference;

    public DAOGeneratorOne () {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(GeneratorOne.class.getSimpleName());
    }

    public Task<Void> add(GeneratorOne generatorOne){
        return databaseReference.push().setValue(generatorOne);
    }
}
