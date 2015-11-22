package com.yydcdut.note.injector.component;

import android.app.Activity;
import android.content.Context;

import com.yydcdut.note.injector.ContextLife;
import com.yydcdut.note.injector.PerFragment;
import com.yydcdut.note.injector.module.FragmentModule;
import com.yydcdut.note.mvp.v.home.impl.AlbumFragment;
import com.yydcdut.note.mvp.v.login.impl.UserDetailFragment;
import com.yydcdut.note.mvp.v.note.impl.DetailFragment;

import dagger.Component;

/**
 * Created by yuyidong on 15/11/22.
 */
@PerFragment
@Component(modules = FragmentModule.class, dependencies = ApplicationComponent.class)
public interface FragmentComponent {
    @ContextLife("Application")
    Context getContext();

    @ContextLife("Activity")
    Context getActivityContext();

    Activity getActivity();

    void inject(AlbumFragment albumFragment);

    void inject(UserDetailFragment userDetailFragment);

    void inject(DetailFragment detailFragment);
}
