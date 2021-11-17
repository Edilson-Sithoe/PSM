package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.IdentiHeathFac;

public class DAOIdentHealthFac {
    private DatabaseReference db;

    public DAOIdentHealthFac () {
        db = FirebaseDatabase.getInstance().getReference(IdentiHeathFac.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(IdentiHeathFac identiHeathFac){
        return db.push().setValue(identiHeathFac);
    }
}
