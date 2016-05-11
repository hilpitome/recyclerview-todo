package com.example.mansa.recyclerview;

/**
 * Created by mansa on 5/11/16.
 */
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class BayNairobiAdapter extends RecyclerView.Adapter<BayNairobiAdapter.MyViewHolder> {

    private List<BayNairobi> bayNairobiList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mNameTxt, mGenderTxt;

        public MyViewHolder(View view) {
            super(view);
            mNameTxt = (TextView) view.findViewById(R.id.name);
            mGenderTxt = (TextView) view.findViewById(R.id.gender);
        }
    }


    public BayNairobiAdapter(List<BayNairobi> bayNairobiList) {
        this.bayNairobiList = bayNairobiList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_row_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        BayNairobi bayNairobi = bayNairobiList.get(position);
        holder.mNameTxt.setText(bayNairobi.getName());
        holder.mGenderTxt.setText(bayNairobi.getGender());
    }

    @Override
    public int getItemCount() {
        return bayNairobiList.size();
    }
}
