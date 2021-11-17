package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.GeneratorFour;

public class DAOGeneratorFour {
    private DatabaseReference databaseReference;

    public DAOGeneratorFour () {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(GeneratorFour.class.getSimpleName());
    }

    public Task<Void> add(GeneratorFour generatorFour){
        return databaseReference.push().setValue(generatorFour);
    }
}
