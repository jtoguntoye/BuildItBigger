package com.udacity.gradle.builditbigger;

import android.support.annotation.Nullable;
import android.support.annotation.UiThread;

interface OnJokeRetrieve {
    @UiThread
    void onRetrieveJokeStart();

    @UiThread
    void onRetrieveJokeFinish(@Nullable String result);
}
