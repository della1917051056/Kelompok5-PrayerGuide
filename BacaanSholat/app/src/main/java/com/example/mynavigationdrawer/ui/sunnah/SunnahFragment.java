package com.example.mynavigationdrawer.ui.sunnah;

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
import com.example.mynavigationdrawer.databinding.FragmentSunnahBinding;

public class SunnahFragment extends Fragment {

    private SunnahViewModel sunnahViewModel;
    private FragmentSunnahBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sunnahViewModel =
                new ViewModelProvider(this).get(SunnahViewModel.class);

        binding = FragmentSunnahBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSunnah;
        sunnahViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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