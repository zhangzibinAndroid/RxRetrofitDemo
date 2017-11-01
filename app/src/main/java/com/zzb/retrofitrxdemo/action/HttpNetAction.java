package com.zzb.retrofitrxdemo.action;

import android.util.Log;

import com.zzb.retrofitrxdemo.bean.UserLoginBean;
import com.zzb.retrofitrxdemo.constance.InterfaceUrl;
import com.zzb.retrofitrxdemo.services.RestClient;
import com.zzb.retrofitrxdemo.utils.RxBus;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * 作者： 张梓彬
 * 日期： 2017/10/31 0031
 * 时间： 上午 9:44
 * 描述： 网络请求封装
 */

public class HttpNetAction {
    private static HttpNetAction uniqueInstance = null;
    private RestClient mRestClient;
    private static final String TAG = "TAG";

    private HttpNetAction() {
        mRestClient = new RestClient();
    }

    public static HttpNetAction getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new HttpNetAction();
        }
        return uniqueInstance;
    }

    public void postUserLogin(String action, String userId, String pwds, final String eventMessage) {
        mRestClient.getRectService().postUserLogin(action, InterfaceUrl.TOKEN, userId, pwds)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<UserLoginBean>() {
                    @Override
                    public void onCompleted() {
                        Log.e(TAG, "onCompleted: ");
                    }

                    @Override
                    public void onError(Throwable throwable) {
                        Log.e(TAG, "onError: " + throwable.getMessage());

                    }

                    @Override
                    public void onNext(UserLoginBean userLoginBean) {
                        UserLoginBean.RetDataBean bean = userLoginBean.getRet_data();
                        //发送内容
                        RxBus.getInstance().post(eventMessage, bean);
                    }
                });
    }


}
