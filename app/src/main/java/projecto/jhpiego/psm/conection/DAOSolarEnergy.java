package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.SolarEnergy;
import projecto.jhpiego.psm.model.UpsOne;


public class DAOSolarEnergy {

    private DatabaseReference databaseReference;

    public DAOSolarEnergy(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(SolarEnergy.class.getSimpleName());
    }

    public Task<Void> add(SolarEnergy upsOne){

        return databaseReference.push().setValue(upsOne);
    }
}
