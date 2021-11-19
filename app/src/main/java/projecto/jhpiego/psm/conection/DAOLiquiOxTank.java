package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.Concentrators;
import projecto.jhpiego.psm.model.LiquiOxTank;

public class DAOLiquiOxTank {

    private DatabaseReference db;

    public DAOLiquiOxTank() {
        db = FirebaseDatabase.getInstance().getReference(LiquiOxTank.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(LiquiOxTank liquiOxTank){
        return db.push().setValue(liquiOxTank);
    }
}
