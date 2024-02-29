package kg.geeks.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import kg.geeks.myapplication.databinding.FragmentContinentCountriesBinding;

public class ContinentCountriesFragment extends Fragment  {
    private FragmentContinentCountriesBinding binding;

    private ArrayList<Countries> countriesArrayList;
    private int position;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentCountriesBinding.inflate(getLayoutInflater());
        return  binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        checkPosition(position);
        CountriesAdapter countriesAdapter = new CountriesAdapter(countriesArrayList);
        binding.rvCountries.setAdapter(countriesAdapter);
        position = getArguments().getInt("key");
    }

    private void checkPosition(int position) {
        if (position == 0){
          loadEurasia();
        } else if (position == 1) {
            loadAfrica();
        }else if (position == 2) {
            loadNA();
        }else if (position == 2) {
            loadSA();
        }else if (position == 3) {
            loadAustralia();
        }
    }


    private void loadEurasia() {
        countriesArrayList = new ArrayList<>();
        countriesArrayList.add(new Countries("Kyrgyzstan"));
        countriesArrayList.add(new Countries("Kazakstan"));
        countriesArrayList.add(new Countries("Uzbekistan"));
        countriesArrayList.add(new Countries("Chine"));
    }

    private void loadAfrica() {
        countriesArrayList = new ArrayList<>();
        countriesArrayList.add(new Countries("Nigeria"));
        countriesArrayList.add(new Countries("Morocco"));
        countriesArrayList.add(new Countries("Ghana"));
        countriesArrayList.add(new Countries("Tanzania"));
    }

    private void loadNA() {
        countriesArrayList = new ArrayList<>();
        countriesArrayList.add(new Countries("Canada"));
        countriesArrayList.add(new Countries("Jamaica"));
        countriesArrayList.add(new Countries("USA"));
        countriesArrayList.add(new Countries("Haiti"));
    }

    private void loadSA() {
        countriesArrayList = new ArrayList<>();
        countriesArrayList.add(new Countries("Brazil"));
        countriesArrayList.add(new Countries("Argentina"));
        countriesArrayList.add(new Countries("Chile"));
        countriesArrayList.add(new Countries("Guyana"));
    }

    private void loadAustralia(){
        countriesArrayList = new ArrayList<>();
        countriesArrayList.add(new Countries("Tasmania"));
        countriesArrayList.add(new Countries("Victoria"));
        countriesArrayList.add(new Countries("South Australia"));
        countriesArrayList.add(new Countries("Queensland"));
    }

}