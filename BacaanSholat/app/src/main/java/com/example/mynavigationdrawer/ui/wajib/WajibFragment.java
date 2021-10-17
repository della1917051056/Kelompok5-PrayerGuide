package com.example.mynavigationdrawer.ui.wajib;

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

import com.example.mynavigationdrawer.databinding.FragmentWajibBinding;


public class WajibFragment extends Fragment {

    private WajibViewModel wajibViewModel;
    private FragmentWajibBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        wajibViewModel =
                new ViewModelProvider(this).get(WajibViewModel.class);

        binding = FragmentWajibBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textWajib;
        wajibViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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