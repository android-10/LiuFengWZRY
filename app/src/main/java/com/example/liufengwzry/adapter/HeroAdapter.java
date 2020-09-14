package com.example.liufengwzry.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.module.LoadMoreModule;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.liufengwzry.R;
import com.example.liufengwzry.database.Hero;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class HeroAdapter extends BaseQuickAdapter<Hero, BaseViewHolder> implements LoadMoreModule {
    private ImageView bg;
    public HeroAdapter(){
        super(R.layout.hero_item);
    }
    @Override
    protected void convert(@NotNull BaseViewHolder holder, Hero hero) {
        bg=holder.getView(R.id.bg);
        Glide.with(getContext()).load(hero.bg_url).into(bg);
    }
}
