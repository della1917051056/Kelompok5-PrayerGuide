package com.example.mynavigationdrawer.ui.dzikir;

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
import com.example.mynavigationdrawer.databinding.FragmentDzikirBinding;
import com.example.mynavigationdrawer.databinding.FragmentHomeBinding;
import com.example.mynavigationdrawer.databinding.FragmentWudhuBinding;

public class DzikirFragment extends Fragment {

    private DzikirViewModel dzikirViewModel;
    private FragmentDzikirBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dzikirViewModel =
                new ViewModelProvider(this).get(DzikirViewModel.class);

        binding = FragmentDzikirBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDzikir;
        dzikirViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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