package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.IdentInterView;
import projecto.jhpiego.psm.model.InterViewID;

public class DAOInterviewID {
    private DatabaseReference db;

    public DAOInterviewID() {

        //FirebaseDatabase db = FirebaseDatabase.getInstance();
        //databaseReference = db.getReference(InterViewID.class.getSimpleName());
        db = FirebaseDatabase.getInstance().getReference(InterViewID.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(InterViewID interview){
        return db.push().setValue(interview);
    }

}
