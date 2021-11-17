package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.GeneratorTwoo;

public class DAOGeneratorTwoo {
    private DatabaseReference databaseReference;

    public DAOGeneratorTwoo () {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(GeneratorTwoo.class.getSimpleName());
    }

    public Task<Void> add(GeneratorTwoo generatorTwoo){
        return databaseReference.push().setValue(generatorTwoo);
    }
}
