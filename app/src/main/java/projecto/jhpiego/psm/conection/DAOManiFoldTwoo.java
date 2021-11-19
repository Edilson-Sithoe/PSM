package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.ManiFoldTwoo;

public class DAOManiFoldTwoo {

    private DatabaseReference db;

    public DAOManiFoldTwoo() {
        db = FirebaseDatabase.getInstance().getReference(ManiFoldTwoo.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(ManiFoldTwoo maniFoldtwoo){
        return db.push().setValue(maniFoldtwoo);
    }
}
