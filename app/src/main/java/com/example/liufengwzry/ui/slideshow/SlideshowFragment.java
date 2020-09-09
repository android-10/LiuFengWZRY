package com.example.liufengwzry.ui.slideshow;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.example.liufengwzry.R;
import com.example.liufengwzry.base.BaseFragment;
import com.example.liufengwzry.databinding.FragmentSlideshowBinding;

import butterknife.BindView;
import butterknife.OnClick;

public class SlideshowFragment extends BaseFragment<SlideshowViewModel, FragmentSlideshowBinding> {

    @BindView(R.id.text_slideshow)
    TextView textSlideshow;


    @Override
    protected SlideshowViewModel InitVM() {
        return ViewModelProviders.of(this).get(SlideshowViewModel.class);
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_slideshow;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        vm.getText().observe(getViewLifecycleOwner(), s -> {
            textSlideshow.setText(s);
        });
    }

    @OnClick(R.id.text_slideshow)
    public void onViewClicked() {
        Toast.makeText(context, vm.getText().getValue(), Toast.LENGTH_LONG).show();
    }
}