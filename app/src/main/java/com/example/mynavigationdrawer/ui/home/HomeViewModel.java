package com.example.mynavigationdrawer.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mynavigationdrawer.R;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(String.valueOf(R.layout.fragment_home));
    }

    public LiveData<String> getText() {
        return mText;
    }
}