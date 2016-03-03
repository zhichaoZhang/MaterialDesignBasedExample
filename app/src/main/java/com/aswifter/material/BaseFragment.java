package com.aswifter.material;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zczhang on 16/3/1.
 */
public class BaseFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        System.out.println(getClass().getSimpleName()+":onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println(getClass().getSimpleName()+":onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        System.out.println(getClass().getSimpleName()+":onCreateView");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        System.out.println(getClass().getSimpleName()+":onViewCreated");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        System.out.println(getClass().getSimpleName()+":onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println(getClass().getSimpleName()+":onStart");
    }

    @Override
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        System.out.println(getClass().getSimpleName()+":onViewStateRestored");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        System.out.println(getClass().getSimpleName()+":onSaveInstanceState");
    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println(getClass().getSimpleName()+":onResume");
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        System.out.println(this+":onHiddenChanged--------" + hidden);
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        System.out.println(this+":setUserVisibleHint-------" + isVisibleToUser);
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println(getClass().getSimpleName()+":onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println(getClass().getSimpleName()+":onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println(getClass().getSimpleName()+":onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println(getClass().getSimpleName()+":onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println(getClass().getSimpleName()+":onDetach");
    }
}
