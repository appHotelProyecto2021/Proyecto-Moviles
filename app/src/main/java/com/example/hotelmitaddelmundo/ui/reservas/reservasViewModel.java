package com.example.hotelmitaddelmundo.ui.reservas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class reservasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public reservasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is reservas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}