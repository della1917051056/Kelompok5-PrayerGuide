package com.example.mynavigationdrawer.ui.wudhu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mynavigationdrawer.R;

public class WudhuViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WudhuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(String.valueOf(R.layout.fragment_cara_wudhu));
    }

    public LiveData<String> getText() {
        return mText;
    }
}