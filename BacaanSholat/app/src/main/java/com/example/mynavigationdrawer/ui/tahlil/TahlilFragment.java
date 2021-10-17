package com.example.mynavigationdrawer.ui.tahlil;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.mynavigationdrawer.R;
import com.example.mynavigationdrawer.databinding.FragmentHomeBinding;
import com.example.mynavigationdrawer.databinding.FragmentSunnahBinding;
import com.example.mynavigationdrawer.databinding.FragmentTahlilBinding;
import com.example.mynavigationdrawer.databinding.FragmentWudhuBinding;

public class TahlilFragment extends Fragment {

    private TahlilViewModel tahlilViewModel;
    private FragmentTahlilBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tahlilViewModel =
                new ViewModelProvider(this).get(TahlilViewModel.class);

        binding = FragmentTahlilBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textTahlil;
        tahlilViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}