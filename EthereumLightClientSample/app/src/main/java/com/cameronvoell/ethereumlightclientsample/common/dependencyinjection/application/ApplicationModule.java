package com.cameronvoell.ethereumlightclientsample.common.dependencyinjection.application;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

//    @Provides
//    add a service here
}

