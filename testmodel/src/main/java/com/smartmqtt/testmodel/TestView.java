package com.smartmqtt.testmodel;

import com.smartmqtt.network.BaseModel;
import com.smartmqtt.network.mvp.IBaseView;

/**
 * @author kerry
 */
public interface TestView extends IBaseView {


    void sendSmS(BaseModel<String> smsModel);


}
