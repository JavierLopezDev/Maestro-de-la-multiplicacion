package com.dam.maestrodelamultiplicacion.ui.Estadisticas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.dam.maestrodelamultiplicacion.databinding.FragmentEstadisticasBinding;

public class EstadisticasFragment extends Fragment {

    private FragmentEstadisticasBinding binding;
    View root;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentEstadisticasBinding.inflate(inflater, container, false);
        root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}