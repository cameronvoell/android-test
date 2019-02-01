package com.cameronvoell.ethereumlightclientsample.common.dependencyinjection.presentation;

import com.cameronvoell.ethereumlightclientsample.views.MainActivity;

import dagger.Subcomponent;

@Subcomponent(modules = PresentationModule.class)
public interface PresentationComponent {
    void inject(MainActivity questionsListActivity);
}
