package com.aswifter.material;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by zczhang on 16/3/1.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println(getClass().getSimpleName()+":onRestart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(getClass().getSimpleName()+":onCreate");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        System.out.println(getClass().getSimpleName()+":onRestoreInstanceState");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        System.out.println(getClass().getSimpleName()+":onSaveInstanceState outPersistentState");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        System.out.println(getClass().getSimpleName()+":onSaveInstanceState");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println(getClass().getSimpleName()+":onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println(getClass().getSimpleName()+":onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println(getClass().getSimpleName()+":onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println(getClass().getSimpleName()+":onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println(getClass().getSimpleName()+":onDestroy");
    }
}
