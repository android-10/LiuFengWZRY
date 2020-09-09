package com.example.liufengwzry.base;

import androidx.lifecycle.ViewModel;

public abstract class BaseActivityWithVM<T extends ViewModel> extends BaseActivity{

    protected abstract T InitVm();
    protected T vm;

    @Override
    protected void InitVMAndObserve() {
        vm=InitVm();
        Observe();
    }
    protected void Observe(){

    }
}
