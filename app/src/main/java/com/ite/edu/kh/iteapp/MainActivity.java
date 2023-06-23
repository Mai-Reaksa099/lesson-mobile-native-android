package com.ite.edu.kh.iteapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.ite.edu.kh.iteapp.databinding.ActivityHomeBarBinding;
import com.ite.edu.kh.iteapp.databinding.ActivityProvincesBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityHomeBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        HomeFragment homeFragment = new HomeFragment();
        SearchFragment searchFragment = new SearchFragment();
        showFragment(homeFragment);
        showFragment(searchFragment);
    }
    private void showFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fmHome, fragment);
        fragmentTransaction.commit();
    }
    private void showHomeFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        HomeFragment homeFragment = new HomeFragment();
        fragmentTransaction.replace(R.id.fmHome, homeFragment);
        fragmentTransaction.commit();

    }
}