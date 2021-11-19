package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.ManiFold;
import projecto.jhpiego.psm.model.ManiFoldEmerg;

public class DAOManiFEmerg {

    private DatabaseReference db;

    public DAOManiFEmerg() {
        db = FirebaseDatabase.getInstance().getReference(ManiFoldEmerg.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(ManiFoldEmerg maniFoldEmerg){
        return db.push().setValue(maniFoldEmerg);
    }
}
