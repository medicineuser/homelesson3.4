package kg.geeks.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kg.geeks.myapplication.databinding.ItemCountryBinding;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder> {


    private ArrayList<Countries> countries;

    public CountriesAdapter(ArrayList<Countries> countries) {
        this.countries = countries;
    }

    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountriesViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {
            holder.onBind(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }




    class CountriesViewHolder extends RecyclerView.ViewHolder{

        private ItemCountryBinding binding;

        public CountriesViewHolder(@NonNull ItemCountryBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(Countries countries){
            binding.tvName.setText(countries.getName());
        }
    }
}
