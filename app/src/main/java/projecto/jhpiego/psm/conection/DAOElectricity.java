package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.Electricity;

public class DAOElectricity {

    private DatabaseReference databaseReference;

    public DAOElectricity () {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Electricity.class.getSimpleName());
    }

    public Task<Void> add(Electricity electricity){
        return databaseReference.push().setValue(electricity);
    }
}
