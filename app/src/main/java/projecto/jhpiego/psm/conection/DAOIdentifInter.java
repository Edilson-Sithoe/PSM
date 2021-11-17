package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.IdentInterView;

public class DAOIdentifInter {
    private DatabaseReference databaseReference;

    public DAOIdentifInter () {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(IdentInterView.class.getSimpleName());
    }

    public Task<Void> add(IdentInterView identInterView){
        return databaseReference.push().setValue(identInterView);
    }
}
