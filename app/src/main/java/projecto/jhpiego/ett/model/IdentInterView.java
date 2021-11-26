package projecto.jhpiego.ett.model;

import android.os.Parcel;
import android.os.Parcelable;

public class IdentInterView implements Parcelable {
    String nome;
    String email;
    String telephone;
    String position;

    String other;
    String otherTwo;
    String identInterID;

    public IdentInterView() {
    }

    public IdentInterView(String nome, String email, String telephone, String position, String other, String otherTwo, String identInterID) {
        this.nome = nome;
        this.email = email;
        this.telephone = telephone;
        this.position = position;
        this.other = other;
        this.otherTwo = otherTwo;
        this.identInterID = identInterID;
    }

    protected IdentInterView(Parcel in) {
        nome = in.readString();
        email = in.readString();
        telephone = in.readString();
        position = in.readString();
        other = in.readString();
        otherTwo = in.readString();
        identInterID = in.readString();
    }

    public static final Creator<IdentInterView> CREATOR = new Creator<IdentInterView>() {
        @Override
        public IdentInterView createFromParcel(Parcel in) {
            return new IdentInterView(in);
        }

        @Override
        public IdentInterView[] newArray(int size) {
            return new IdentInterView[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getOtherTwo() {
        return otherTwo;
    }

    public void setOtherTwo(String otherTwo) {
        this.otherTwo = otherTwo;
    }

    public String getIdentInterID() {
        return identInterID;
    }

    public void setIdentInterID(String identInterID) {
        this.identInterID = identInterID;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(email);
        dest.writeString(telephone);
        dest.writeString(position);
        dest.writeString(other);
        dest.writeString(otherTwo);
        dest.writeString(identInterID);
    }
}
