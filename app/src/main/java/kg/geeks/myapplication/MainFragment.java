package kg.geeks.myapplication;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import kg.geeks.myapplication.databinding.FragmentMainBinding;


public class MainFragment extends Fragment implements  OnItemClick{
    private FragmentMainBinding binding;
    private ArrayList<Continent> continentList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        binding = FragmentMainBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        addData();
        ContinentAdapter continentAdapter = new ContinentAdapter(continentList,this);
        binding.rvContinents.setAdapter(continentAdapter);
    }

    private void addData(){
        continentList = new ArrayList<>();
        continentList.add(new Continent("Eurasia","54"));
        continentList.add(new Continent("Africa","30"));
        continentList.add(new Continent("North America","24"));
        continentList.add(new Continent("South America","18"));
        continentList.add(new Continent("Australia","7"));
    }

    @Override
    public void onClick(int position){
        Bundle bundle = new Bundle();
        ContinentCountriesFragment continentCountriesFragment = new ContinentCountriesFragment();
        bundle.putInt("key",position);
        continentCountriesFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,continentCountriesFragment).addToBackStack(null).commit();
    }
}