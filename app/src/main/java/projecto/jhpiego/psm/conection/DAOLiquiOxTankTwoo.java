package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.LiquiOxTankTwoo;

public class DAOLiquiOxTankTwoo {

    private DatabaseReference db;

    public DAOLiquiOxTankTwoo() {
        db = FirebaseDatabase.getInstance().getReference(LiquiOxTankTwoo.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(LiquiOxTankTwoo liquiOxTankTwoo){
        return db.push().setValue(liquiOxTankTwoo);
    }
}
