package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.CYLINDERS_UWM;
import projecto.jhpiego.psm.model.Concentrators;

public class DAOConcentrators {

    private DatabaseReference db;

    public DAOConcentrators() {
        db = FirebaseDatabase.getInstance().getReference(Concentrators.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(Concentrators concentrators){
        return db.push().setValue(concentrators);
    }
}
