package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.GeneratorFour;

public class DAOGeneratorFour {
    private DatabaseReference db;

    public DAOGeneratorFour () {
        db = FirebaseDatabase.getInstance().getReference(GeneratorFour.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(GeneratorFour generatorFour){
        return db.push().setValue(generatorFour);
    }
}
