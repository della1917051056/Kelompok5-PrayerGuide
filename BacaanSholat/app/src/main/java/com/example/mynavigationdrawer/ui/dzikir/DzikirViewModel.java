package com.example.mynavigationdrawer.ui.dzikir;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mynavigationdrawer.R;

public class DzikirViewModel extends ViewModel {
   private MutableLiveData<String> mText;

    public DzikirViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(String.valueOf(R.layout.fragment_dzikir));
    }

    public LiveData<String> getText() {
        return mText;
    }
}
