package com.cameronvoell.ethereumlightclientsample.common.dependencyinjection.presentation;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;

import dagger.Module;
import dagger.Provides;

@Module
public class PresentationModule {
    private final FragmentActivity mActivity;

    public PresentationModule(FragmentActivity fragmentActivity) {
        mActivity = fragmentActivity;
    }

    @Provides
    Activity getActivity() {
        return mActivity;
    }

    @Provides
    Context context(Activity activity) {
        return activity;
    }
}
