package com.cameronvoell.ethereumlightclientsample;

import android.app.Application;

import com.cameronvoell.ethereumlightclientsample.common.dependencyinjection.application.ApplicationComponent;
import com.cameronvoell.ethereumlightclientsample.common.dependencyinjection.application.ApplicationModule;
import com.cameronvoell.ethereumlightclientsample.common.dependencyinjection.application.DaggerApplicationComponent;

public class MyApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder()
                //.applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

}

