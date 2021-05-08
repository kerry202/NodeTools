package com.smartmqtt.network.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.smartmqtt.network.BasePresenter;


/**
 * @author kerry
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

    protected P mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();

    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (mPresenter != null) {
            mPresenter.detachView();
        }
    }

}
