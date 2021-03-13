package com.example.hotelmitaddelmundo.ui.reservas;

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
import com.example.hotelmitaddelmundo.ui.servicios.serviciosViewModel;

public class reservasFragment extends Fragment {

    private reservasViewModel reservasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        reservasViewModel =
                new ViewModelProvider(this).get(reservasViewModel.class);
        View root = inflater.inflate(R.layout.activity_reservas, container, false);

        reservasViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Toast.makeText(getActivity(), "bienvenido a reservas", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}