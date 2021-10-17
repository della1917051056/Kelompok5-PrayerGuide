package com.example.mynavigationdrawer.ui.dzikir;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DzikirViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DzikirViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dzikir fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}