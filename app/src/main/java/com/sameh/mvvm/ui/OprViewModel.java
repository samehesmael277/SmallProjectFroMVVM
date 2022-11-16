package com.sameh.mvvm.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.sameh.mvvm.repo.DataBase;
import com.sameh.mvvm.repo.NumberModel;

public class OprViewModel extends ViewModel {

    public MutableLiveData<Integer> mutablePlusLiveData = new MutableLiveData<>();
    public MutableLiveData<Integer> mutableDivLiveData = new MutableLiveData<>();
    public MutableLiveData<Integer> mutableMultiLiveData = new MutableLiveData<>();

    NumberModel numberModel = getNumbersFromDataBase();

    public void getPlusResult() {
        int result = numberModel.getFirstNumber() + numberModel.getSecondNumber();
        mutablePlusLiveData.setValue(result);
    }

    public void getDivResult() {
        int result = numberModel.getFirstNumber() / numberModel.getSecondNumber();
        mutableDivLiveData.setValue(result);
    }

    public void getMultiResult() {
        int result = numberModel.getFirstNumber() * numberModel.getSecondNumber();
        mutableMultiLiveData.setValue(result);
    }

    private NumberModel getNumbersFromDataBase() {
        return new DataBase().getNumbersFromModel();
    }

}
