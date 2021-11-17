package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.FreePrevAnFFS;

public class DAOFreePrevFFS {

    private DatabaseReference db;

    public DAOFreePrevFFS() {
        db = FirebaseDatabase.getInstance().getReference(FreePrevAnFFS.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(FreePrevAnFFS freePrevAnFFS){
        return db.push().setValue(freePrevAnFFS);
    }
}
