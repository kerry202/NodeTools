package com.smartmqtt.testmodel;

import com.smartmqtt.network.ApiConfig;
import com.smartmqtt.network.BaseModel;

import java.util.HashMap;

import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import rx.Observable;
import rx.Observer;

/**
 * @author: kerry
 * date: On $ {DATE}
 */
public interface TestApi {

    @GET(ApiConfig.bloom)
    Observable<BaseModel<String>> getData();


    @FormUrlEncoded
    @POST(ApiConfig.SendSms)
    Observer<String> sendSmd(@Field("mobile") String phone, @Field("type") String type);

    @FormUrlEncoded
    @POST(ApiConfig.SendSms)
    Observable<String> getPost(@FieldMap HashMap<String, String> fields);

    @FormUrlEncoded
    @PUT(ApiConfig.SendSms)
    Observable<String> getPut(@FieldMap HashMap<String, String> fields);
}
