package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.Electricity;

public class DAOElectricity {

    private DatabaseReference db;

    public DAOElectricity () {
        db = FirebaseDatabase.getInstance().getReference(Electricity.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(Electricity electricity){
        return db.push().setValue(electricity);
    }
}
