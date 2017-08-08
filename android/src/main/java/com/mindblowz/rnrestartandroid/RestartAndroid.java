package com.mindblowz.rnrestartandroid;

import android.app.Application;
import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RestartAndroid extends ReactContextBaseJavaModule {
  private Application mApplication;

  public RestartAndroid(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override public String getName() { return "RestartAndroid"; }

  public void setApplicationContext(Application application) {
    this.mApplication = application;
  }

  @ReactMethod
  public void restart() {
    Intent i = mApplication.getBaseContext().getPackageManager()
      .getLaunchIntentForPackage(mApplication.getBaseContext().getPackageName());
    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
      | Intent.FLAG_ACTIVITY_CLEAR_TASK
      | Intent.FLAG_ACTIVITY_NEW_TASK);
    mApplication.startActivity(i);
  }
}