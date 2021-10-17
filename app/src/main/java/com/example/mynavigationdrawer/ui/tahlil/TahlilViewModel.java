package com.example.mynavigationdrawer.ui.tahlil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TahlilViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TahlilViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Tahlil fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}