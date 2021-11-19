package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.CYLINDERS_UWM;

public class DAOCylinders_UWM {

    private DatabaseReference db;

    public DAOCylinders_UWM() {
        db = FirebaseDatabase.getInstance().getReference(CYLINDERS_UWM.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(CYLINDERS_UWM cylinders_uwm){
        return db.push().setValue(cylinders_uwm);
    }
}
