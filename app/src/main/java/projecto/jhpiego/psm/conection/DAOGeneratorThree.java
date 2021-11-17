package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.GeneratorFour;
import projecto.jhpiego.psm.model.GeneratorThree;

public class DAOGeneratorThree {
    private DatabaseReference databaseReference;

    public DAOGeneratorThree () {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(GeneratorThree.class.getSimpleName());
    }

    public Task<Void> add(GeneratorThree generatorThree){
        return databaseReference.push().setValue(generatorThree);
    }
}
