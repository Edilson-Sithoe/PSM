package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.GeneratorTwoo;

public class DAOGeneratorTwoo {
    private DatabaseReference db;

    public DAOGeneratorTwoo () {
        db = FirebaseDatabase.getInstance().getReference(GeneratorTwoo.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(GeneratorTwoo generatorTwoo){
        return db.push().setValue(generatorTwoo);
    }
}
