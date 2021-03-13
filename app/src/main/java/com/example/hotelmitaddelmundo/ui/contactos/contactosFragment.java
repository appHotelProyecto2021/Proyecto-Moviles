package com.example.hotelmitaddelmundo.ui.contactos;

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

public class contactosFragment extends Fragment {

    private contactosViewModel contactosViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        contactosViewModel =
                new ViewModelProvider(this).get(contactosViewModel.class);
        View root = inflater.inflate(R.layout.activity_contactos, container, false);

        contactosViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Toast.makeText(getActivity(), "bienvenido a contactos", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}