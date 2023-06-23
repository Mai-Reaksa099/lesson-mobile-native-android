package com.ite.edu.kh.iteapp;

import android.content.Intent;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ite.edu.kh.iteapp.databinding.ActivityMainProfileBinding;

import java.time.Instant;

public class HomeActivity extends AppCompatActivity {

    private ActivityMainProfileBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
       binding.imgProfile.setOnClickListener(view ->{openProfileActivity();});
    }
    private void openProfileActivity(){
       Intent intent = new Intent(this, ProfileActivity.class);
       startActivity(intent);
    }
}
