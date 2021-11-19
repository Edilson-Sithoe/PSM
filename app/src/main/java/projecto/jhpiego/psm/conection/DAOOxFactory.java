package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.LiquiOxTank;
import projecto.jhpiego.psm.model.OxFactorySPA;

public class DAOOxFactory {

    private DatabaseReference db;

    public DAOOxFactory() {
        db = FirebaseDatabase.getInstance().getReference(OxFactorySPA.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(OxFactorySPA oxFactorySPA){
        return db.push().setValue(oxFactorySPA);
    }
}
