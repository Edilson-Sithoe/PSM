package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.CYLINDERS_UWM;
import projecto.jhpiego.psm.model.ManiFold;

public class DAOManiFold {

    private DatabaseReference db;

    public DAOManiFold() {
        db = FirebaseDatabase.getInstance().getReference(ManiFold.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(ManiFold maniFold){
        return db.push().setValue(maniFold);
    }
}
