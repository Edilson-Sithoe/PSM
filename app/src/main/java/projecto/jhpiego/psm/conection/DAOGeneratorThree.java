package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.GeneratorFour;
import projecto.jhpiego.psm.model.GeneratorThree;
import projecto.jhpiego.psm.model.InterViewID;

public class DAOGeneratorThree {
    private DatabaseReference db;


    public DAOGeneratorThree () {
        db = FirebaseDatabase.getInstance().getReference(GeneratorThree.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(GeneratorThree generatorThree){
        return db.push().setValue(generatorThree);
    }
}
