package com.ite.edu.kh.iteapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ite.edu.kh.iteapp.databinding.FragmentProvincesBinding;

public class ProvincesFragment extends Fragment {
    private FragmentProvincesBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentProvincesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
