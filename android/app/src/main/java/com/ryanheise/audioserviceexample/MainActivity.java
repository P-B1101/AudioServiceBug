package com.ryanheise.audioserviceexample;

import android.content.Context;

import androidx.annotation.NonNull;

import com.ryanheise.audioservice.AudioServicePlugin;

import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;

public class MainActivity extends FlutterFragmentActivity {
    @Override
    public FlutterEngine provideFlutterEngine(@NonNull Context context) {
      return AudioServicePlugin.getFlutterEngine(context);
    }
  }