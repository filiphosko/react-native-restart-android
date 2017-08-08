package com.mindblowz.rnrestartandroid;

import android.app.Application;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RestartAndroidPackage implements ReactPackage {
    private Application mApplication;

    public RestartAndroidPackage(Application application) {
        this.mApplication = application;
    }

  @Override public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }

  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
      RestartAndroid instance = new RestartAndroid(reactContext);
      instance.setApplicationContext(mApplication);
      List<NativeModule> modules = new ArrayList<>();
      modules.add(instance);
      return modules;
    }

}