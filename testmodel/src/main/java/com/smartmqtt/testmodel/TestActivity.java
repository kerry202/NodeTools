package com.smartmqtt.testmodel;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.smartmqtt.basemodel.PathConfig;
import com.smartmqtt.network.BaseModel;
import com.smartmqtt.network.base.BaseActivity;

/**
 * @author: kerry
 * date: On $ {DATE}
 */
@Route(path = PathConfig.TEXT_ACTIVITY)
public class TestActivity extends BaseActivity<TestPresenter> implements TestView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);
    }

    @Override
    protected TestPresenter createPresenter() {
        return null;
    }


    @Override
    public void sendSmS(BaseModel<String> smsModel) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
