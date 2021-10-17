package com.example.mynavigationdrawer.ui.wudhu;

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
import com.example.mynavigationdrawer.databinding.FragmentWudhuBinding;

public class WudhuFragment extends Fragment {

    private WudhuViewModel wudhuViewModel;
    private FragmentWudhuBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        wudhuViewModel =
                new ViewModelProvider(this).get(WudhuViewModel.class);

        binding = FragmentWudhuBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textWudhu;
        wudhuViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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