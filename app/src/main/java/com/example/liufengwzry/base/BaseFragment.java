package com.example.liufengwzry.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewbinding.ViewBinding;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BaseFragment<M extends ViewModel,B extends ViewBinding> extends Fragment {

    protected Context context;

    protected M InitVM(){
        return null;
    }
    protected M vm;
    protected B bind;

    protected B InitBinding(LayoutInflater inflater){
        return null;
    };
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.context=null;
        this.bind=null;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vm=InitVM();
    }
    protected int getLayout(){
        return 0;
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if(InitBinding(inflater)==null){
            View root=inflater.inflate(getLayout(),container,false);
            ButterKnife.bind(this,root);
            return root;
        }else{
            bind=InitBinding(inflater);
            Observe();
            return bind.getRoot();
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Go();
    }
    protected void Go(){

    }
    protected void Observe(){

    }
}
