package com.example.mynavigationdrawer.ui.wudhu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WudhuViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WudhuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is wudhu fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}