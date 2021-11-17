package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.Electricity;
import projecto.jhpiego.psm.model.MedGasSistema;

public class DAOMedGasSyst {

    private DatabaseReference databaseReference;

    public DAOMedGasSyst() {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(MedGasSistema.class.getSimpleName());
    }

    public Task<Void> add(MedGasSistema medGasSistema){
        return databaseReference.push().setValue(medGasSistema);
    }
}
