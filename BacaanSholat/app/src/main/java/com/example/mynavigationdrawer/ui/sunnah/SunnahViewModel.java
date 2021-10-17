package com.example.mynavigationdrawer.ui.sunnah;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SunnahViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SunnahViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is sholat sunnah fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}