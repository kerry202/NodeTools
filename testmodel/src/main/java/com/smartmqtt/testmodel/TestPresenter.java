package com.smartmqtt.testmodel;


import com.smartmqtt.network.ApiCallBack;
import com.smartmqtt.network.BaseModel;
import com.smartmqtt.network.BasePresenter;

/**
 * @author kerry
 */
public class TestPresenter extends BasePresenter<TestView> {

    public TestPresenter(TestView loginView) {
        attachView(loginView);
    }

    public void sendSms() {

        subscribe(apiService.getData(), new ApiCallBack<BaseModel<String>>() {
            @Override
            public void onSuccess(BaseModel<String> sModelBaseModel) {
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
            }
        });
    }

}
