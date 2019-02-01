package com.cameronvoell.ethereumlightclientsample.common.dependencyinjection.application;

import com.cameronvoell.ethereumlightclientsample.common.dependencyinjection.presentation.PresentationComponent;
import com.cameronvoell.ethereumlightclientsample.common.dependencyinjection.presentation.PresentationModule;
import com.cameronvoell.ethereumlightclientsample.common.dependencyinjection.service.ServiceComponent;
import com.cameronvoell.ethereumlightclientsample.common.dependencyinjection.service.ServiceModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    public PresentationComponent newPresentationComponent(PresentationModule presentationModule);
    public ServiceComponent newServiceComponent(ServiceModule serviceModule);
}
