package kg.geeks.myapplication;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class Countries extends ArrayList<Parcelable> implements  Serializable{
    private String name;
    public Countries(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
