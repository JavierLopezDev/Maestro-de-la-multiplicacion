package com.dam.maestrodelamultiplicacion.ui.Configuracion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.dam.maestrodelamultiplicacion.databinding.FragmentConfiguracionBinding;

public class ConfiguracionFragment extends Fragment {

    private FragmentConfiguracionBinding binding;
    View root;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentConfiguracionBinding.inflate(inflater, container, false);
        root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}