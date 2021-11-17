package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.Electricity;
import projecto.jhpiego.psm.model.MedGasSistema;

public class DAOMedGasSyst {

    private DatabaseReference db;

    public DAOMedGasSyst() {
        db = FirebaseDatabase.getInstance().getReference(MedGasSistema.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(MedGasSistema medGasSistema){
        return db.push().setValue(medGasSistema);
    }
}
