package ehb.be.lijsteninandroid.recyclerUtil;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import ehb.be.lijsteninandroid.R;
import ehb.be.lijsteninandroid.model.Mop;

public class MopAdapter extends RecyclerView.Adapter<MopAdapter.MopViewHolder>{
    //viewholder pattern
    //klse die verwijzingen bijhouden naar elementen in layout
    //klasse enkel hier nodig -> inner class
        class MopViewHolder extends RecyclerView.ViewHolder{
        //verwijzingen naar elementen in layout
        final TextView tv_mop;
        final TextView tv_punch;
        public MopViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_mop = itemView.findViewById(R.id.tv_mop);
            tv_punch = itemView.findViewById(R.id.tv_punch);
        }
    }

    //wat gaan we bijhouden
    private ArrayList<Mop> items;
    public MopAdapter(ArrayList<Mop> items) {
        this.items = items;
    }
    //hoe ziet de rij er uiit
    @NonNull
    @Override
    public MopViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //viewgroup,waarbinnen wordt alles getekend
        Context context = viewGroup.getContext();
        //binnen context effecteif layout.xml omzetten naar iets in het scherm
        View cardRijView = LayoutInflater.from(context).inflate(R.layout.mop_map, viewGroup, false);
        // nieuwe viewHolder op basis van de layout

        return new MopViewHolder(cardRijView);
    }
    //Rijen opvullen
    @Override
    public void onBindViewHolder(@NonNull MopViewHolder mopViewHolder, int i) {
        Mop mopVoorRij = items.get(i);

        mopViewHolder.tv_mop.setText(mopVoorRij.getMop());
        mopViewHolder.tv_punch.setText(mopVoorRij.getClou());

    }
    //hoeveel rijen moeten er getekend worden

    @Override
    public int getItemCount() {
        return items.size();
    }
}
