package com.example.liufengwzry.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.example.liufengwzry.R;
import com.example.liufengwzry.base.BaseFragment;
import com.example.liufengwzry.databinding.FragmentGalleryBinding;

public class GalleryFragment extends BaseFragment<GalleryViewModel, FragmentGalleryBinding> {


    @Override
    protected GalleryViewModel InitVM() {
        return ViewModelProviders.of(this).get(GalleryViewModel.class);
    }

    @Override
    protected FragmentGalleryBinding InitBinding(LayoutInflater inflater) {
        return FragmentGalleryBinding.inflate(inflater);
    }

    @Override
    protected void Observe() {
        vm.getText().observe(getViewLifecycleOwner(),s->{
            bind.textGallery.setText(s);
        });
    }

    @Override
    protected void Go() {

    }

}