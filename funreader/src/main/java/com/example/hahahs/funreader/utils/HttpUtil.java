package com.example.hahahs.funreader.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedHashSet;

/**
 * Created by hahahs on 2015/10/13.
 */
public class HttpUtil {
    public static void getJSON(final String address, final RequestListener requestListener){
        new Thread(new Runnable() {
            @Override
            public void run() {
                HttpURLConnection connection = null;
                BufferedReader bufferedReader ;
                StringBuilder stringBuilder = null;
                try {
                    URL url = new URL(address);
                    connection = (HttpURLConnection) url.openConnection();
                    InputStream inputStream = connection.getInputStream();
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
                    stringBuilder = new StringBuilder();
                    String line;
                    while ((line=bufferedReader.readLine())!=null){
                        stringBuilder.append(line);
                    }
                    if (requestListener!=null){
                        requestListener.onSuccess(stringBuilder.toString());
                    }
                    bufferedReader.close();
                } catch (IOException e) {
                    if (requestListener!=null){
                        requestListener.onError(e);
                    }


                }finally {

                    if (connection!=null){
                        connection.disconnect();
                    }
                }

            }
                

        }).start();



    }
    public static void postJSON(final String address,final String params,final RequestListener requestListener) {
        new Thread(new Runnable() {

            public void run() {
                HttpURLConnection connection = null;
                BufferedReader bufferedReader;
                StringBuilder stringBuilder = null;
                try {
                    URL url = new URL(address);
                    connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setDoOutput(true);
                    DataOutputStream dataOutputStream = (DataOutputStream) connection.getOutputStream();
                    dataOutputStream.writeBytes(params);
                    InputStream inputStream = connection.getInputStream();
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                    String line;
                    while ((line = bufferedReader.readLine()) != null) {
                        stringBuilder.append(line);
                    }
                    if (requestListener!=null){
                        requestListener.onSuccess(stringBuilder.toString());
                    }
                    bufferedReader.close();

                } catch (IOException e) {
                    if (requestListener!=null){
                        requestListener.onError(e);
                    }
                } finally {
                    if (connection != null) {
                        connection.disconnect();
                    }
                }
            }


        }).start();
    }

    public  interface RequestListener{
        void onSuccess(String result);
        void onError(Exception e);

    }
}
