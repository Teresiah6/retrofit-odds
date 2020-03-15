package com.example.android.oddsbets;

import android.content.Context;
import android.system.Os;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OddsAdapter extends RecyclerView.Adapter<OddsAdapter.OddsViewHolder> {
ArrayList<OddsBet> oddsBets;

    public OddsAdapter(ArrayList<OddsBet> oddsBets) {
        this.oddsBets = oddsBets;
    }

    @NonNull
    @Override
    public OddsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context= parent.getContext();
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.odds_row, parent, false);
        
        

        return new OddsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull OddsViewHolder holder, int position) {
        OddsBet oddsBet = oddsBets.get(position);
        holder.bind(oddsBet);

    }

    @Override
    public int getItemCount() {
        return oddsBets.size();
    }

    public class OddsViewHolder extends RecyclerView.ViewHolder {
         TextView sportKey, sportNice, sportTeams, commenceTime, homeTeam, sites;


        public OddsViewHolder(View itemView) {
            super(itemView);
            sportKey = itemView.findViewById(R.id.sport_key);
            sportNice = itemView.findViewById(R.id.sport_nice);
            sportTeams = itemView. findViewById(R.id.sport_teams);
            commenceTime = itemView.findViewById(R.id.commence_time);
            homeTeam = itemView.findViewById(R.id.home_team);
            sites = itemView.findViewById(R.id.sites);

        }

        public void bind(OddsBet oddsBet) {
            sportKey.setText(oddsBet.sport_key);
            sportNice.setText(oddsBet.sport_nice);
            sportNice.setText(oddsBet.sport_nice);
            commenceTime.setText(oddsBet.commence_time);
            homeTeam.setText(oddsBet.home_team);
            //sites.setText(oddsBet.sites);
        }
    }

}
