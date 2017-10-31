package com.zzb.retrofitrxdemo.services;

import com.zzb.retrofitrxdemo.constance.InterfaceUrl;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by 张梓彬 on 2017/10/31 0031.
 */

public class RestClient {

    private Retrofit mRetrofit;
    private ApiService mService;

    //构造方法
    public RestClient() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(InterfaceUrl.MAIN_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        mService = mRetrofit.create(ApiService.class);
    }

    public ApiService getRectService() {
        if (mService != null) {
            return mService;
        }
        return null;
    }
}
