
package com.nandasoftech.med.ijkplayer;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNIjkplayerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNIjkplayerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNIjkplayer";
  }
}