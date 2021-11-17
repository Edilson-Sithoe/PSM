package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.SolarEnergy;
import projecto.jhpiego.psm.model.UpsOne;


public class DAOSolarEnergy {

    private DatabaseReference db;

    public DAOSolarEnergy(){
        db = FirebaseDatabase.getInstance().getReference(SolarEnergy.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(SolarEnergy upsOne){

        return db.push().setValue(upsOne);
    }
}
