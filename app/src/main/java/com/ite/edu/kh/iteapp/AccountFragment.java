package com.ite.edu.kh.iteapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ite.edu.kh.iteapp.databinding.FragmnetAccountBinding;

public class AccountFragment extends Fragment {
    private FragmnetAccountBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmnetAccountBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}
