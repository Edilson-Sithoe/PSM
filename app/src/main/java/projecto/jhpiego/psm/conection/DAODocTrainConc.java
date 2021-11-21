package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.DocTrainConc;
import projecto.jhpiego.psm.model.DocTrainCylin;

public class DAODocTrainConc {

    private DatabaseReference db;

    public DAODocTrainConc() {
        db = FirebaseDatabase.getInstance().getReference(DocTrainConc.class.getSimpleName());
        db.keepSynced(true);
    }

    public Task<Void> add(DocTrainConc docTrainConc){
        return db.push().setValue(docTrainConc);
    }
}
