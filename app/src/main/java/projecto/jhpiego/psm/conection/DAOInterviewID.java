package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.IdentInterView;
import projecto.jhpiego.psm.model.InterViewID;

public class DAOInterviewID {
    private DatabaseReference databaseReference;

    public DAOInterviewID() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
     //   FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        databaseReference = db.getReference(InterViewID.class.getSimpleName());
    }

    public Task<Void> add(InterViewID interview){
        return databaseReference.push().setValue(interview);
    }

}
