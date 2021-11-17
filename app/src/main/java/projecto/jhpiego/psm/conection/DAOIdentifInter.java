package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.IdentInterView;

public class DAOIdentifInter {
    private DatabaseReference db;

    public DAOIdentifInter () {
        db = FirebaseDatabase.getInstance().getReference(IdentInterView.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(IdentInterView identInterView){
        return db.push().setValue(identInterView);
    }
}
