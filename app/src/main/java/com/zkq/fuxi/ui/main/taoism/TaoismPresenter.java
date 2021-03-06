package com.zkq.fuxi.ui.main.taoism;

import androidx.annotation.NonNull;

/**
 * @author:zkq
 * time:2018/10/6:16:11
 * email:zkq815@126.com
 * desc: 道教页面逻辑处理
 */
public class TaoismPresenter implements TaoismContract.Presenter{
    private TaoismContract.View mView;
    public TaoismPresenter(@NonNull TaoismContract.View view){
        this.mView = view;
        view.setPresenter(this);
    }


    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }
}
