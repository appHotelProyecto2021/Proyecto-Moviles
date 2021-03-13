package com.example.hotelmitaddelmundo.ui.galeria;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.hotelmitaddelmundo.R;

public class galeriaFragment extends Fragment {

    private galeriaViewModel galeriaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galeriaViewModel =
                new ViewModelProvider(this).get(galeriaViewModel.class);
        View root = inflater.inflate(R.layout.activity_galeria, container, false);

        galeriaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Toast.makeText(getActivity(), "bienvenido a galeria", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}