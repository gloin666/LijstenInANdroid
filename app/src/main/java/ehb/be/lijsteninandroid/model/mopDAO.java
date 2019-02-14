package ehb.be.lijsteninandroid.model;

import java.util.ArrayList;

public class mopDAO {
    private static final mopDAO ourInstance = new mopDAO();
    //lijst moppen maken (arraylist is flexible cunnen dingne aan toegevoegd worden of verweiderd)
    private ArrayList<Mop> moplijst = new ArrayList<>();


    public static mopDAO getInstance() {
        return ourInstance;
    }

    private mopDAO() {
        moplijst.add(new Mop("Het is oud en het vliegt", "Een bejaardelaar"));
        moplijst.add(new Mop("het is rond en vleigt door de klas", "een ongestelde vraag"));
        moplijst.add(new Mop("het is geel en weegt niet veel", "Lichtgeel"));



    }

    public ArrayList<Mop> getMoplijst() {
        return moplijst;
    }
}
