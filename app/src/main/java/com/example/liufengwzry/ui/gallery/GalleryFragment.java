package com.example.liufengwzry.ui.gallery;


import android.view.LayoutInflater;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.chad.library.adapter.base.module.BaseLoadMoreModule;
import com.example.liufengwzry.adapter.HeroAdapter;
import com.example.liufengwzry.base.BaseFragment;
import com.example.liufengwzry.databinding.FragmentGalleryBinding;
public class GalleryFragment extends BaseFragment<GalleryViewModel, FragmentGalleryBinding> {


    HeroAdapter heroAdapter;
    BaseLoadMoreModule loadMore;


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
        vm.getHeros().observe(getViewLifecycleOwner(), heros->{
            if(loadMore.isLoading()){
                loadMore.loadMoreComplete();
            }
            heroAdapter.addData(heros);
        });
    }
    @Override
    protected void Go() {
        initHeroAdapter();
        vm.loadHeros();
    }
    private void initHeroAdapter(){
        bind.rec.setLayoutManager(new LinearLayoutManager(context));
        heroAdapter=new HeroAdapter();
        loadMore=heroAdapter.getLoadMoreModule();
        loadMore.setOnLoadMoreListener(()->{
            vm.loadHeros();
        });
        heroAdapter.setAnimationEnable(true);
        bind.rec.setAdapter(heroAdapter);
        vm.loadHeros();
    }
}