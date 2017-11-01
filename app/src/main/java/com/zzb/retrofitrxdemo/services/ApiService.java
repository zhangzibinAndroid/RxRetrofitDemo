package com.zzb.retrofitrxdemo.services;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * 作者： 张梓彬
 * 日期： 2017/10/31 0031
 * 时间： 上午 10:14
 * 描述： retrofit2设置请求服务
 */

public interface ApiService<T> {

    @POST("Action{action}/Token{token}/UserId{UserId}/Pwd{pwd}")
    @FormUrlEncoded
    Observable<T> postUserLogin(@Field("Action") String action, @Field("Token") String token, @Field("UserId") String userId, @Field("Pwd") String pwd);

}
