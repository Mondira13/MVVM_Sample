package com.example.mvvm_sample.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.mvvm_sample.BR;
import com.example.mvvm_sample.model.Person;

public class PersonViewModel extends BaseObservable {
    private Person person;
    @Bindable
    public String toastMessage = null;

    private String successMessage = "Data matched";
    private String errorMessage = "Data not matched";

    public PersonViewModel() {
        person = new Person("", "");
    }

    public String getToastMessage() {
        return toastMessage;
    }

    public void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }

    public void afterNameTextChanged(CharSequence s) {
        person.setName(s.toString());
    }

    public void afterAddressTextChanged(CharSequence s) {
        person.setAddress(s.toString());
    }


    public void onLoginClicked() {
        if (person.isValidInput())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }

}
