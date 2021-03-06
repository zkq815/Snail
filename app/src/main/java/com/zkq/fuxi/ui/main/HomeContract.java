package com.zkq.fuxi.ui.main;

import android.app.Activity;

import com.zkq.fuxi.base.mvp.BasePresenter;
import com.zkq.fuxi.base.mvp.BaseView;

/**
 * @author:zkq
 * create:2018/10/24 上午11:45
 * email:zkq815@126.com
 * desc:
 */

public interface HomeContract {

    interface View extends BaseView<Presenter> {

        void setUpNavigation();

        boolean isAlive();

        Activity getActivity();
    }

    interface Presenter extends BasePresenter {

    }
}
