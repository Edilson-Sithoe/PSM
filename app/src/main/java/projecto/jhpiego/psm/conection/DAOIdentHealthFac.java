package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.IdentiHeathFac;

public class DAOIdentHealthFac {
    private DatabaseReference databaseReference;

    public DAOIdentHealthFac () {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(IdentiHeathFac.class.getSimpleName());
    }

    public Task<Void> add(IdentiHeathFac identiHeathFac){
        return databaseReference.push().setValue(identiHeathFac);
    }
}
