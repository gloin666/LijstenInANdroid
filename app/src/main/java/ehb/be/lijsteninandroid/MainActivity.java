package ehb.be.lijsteninandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import ehb.be.lijsteninandroid.model.mopDAO;
import ehb.be.lijsteninandroid.recyclerUtil.MopAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMopjes;
    private MopAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //verw naar recycler
        rvMopjes = findViewById(R.id.rv_mop);
        //adapter, hoe erecycler opvullen
        adapter = new MopAdapter(mopDAO.getInstance().getMoplijst());
        rvMopjes.setAdapter(adapter);
        //hoe elementen weergeven horizontaale lijst vert lijst ...?
        RecyclerView.LayoutManager LeManager = new LinearLayoutManager(this);
        rvMopjes.setLayoutManager(LeManager);

    }
}
