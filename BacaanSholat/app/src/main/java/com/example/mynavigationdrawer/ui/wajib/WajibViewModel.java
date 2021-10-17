package com.example.mynavigationdrawer.ui.wajib;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WajibViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WajibViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is shalat wajib fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}