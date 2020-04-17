package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;



import java.io.IOException;

public class EndPointAsyncTask extends AsyncTask<Void, Void, String> {

    public static MyApi myApi = null;
    private Context context;
    String text;
    @Override
    protected String doInBackground(Void... voids) {

        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
