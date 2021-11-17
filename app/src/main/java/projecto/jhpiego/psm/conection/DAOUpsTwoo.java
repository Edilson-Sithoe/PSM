package projecto.jhpiego.psm.conection;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import projecto.jhpiego.psm.model.UpsOne;
import projecto.jhpiego.psm.model.UpsTwoo;


public class DAOUpsTwoo {

    private DatabaseReference db;

    public DAOUpsTwoo(){
        db = FirebaseDatabase.getInstance().getReference(UpsTwoo.class.getSimpleName());
    }

    public Task<Void> add(UpsTwoo upsTwoo){
        return db.push().setValue(upsTwoo);
    }
}
