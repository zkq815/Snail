package com.zkq.snail.ui.main.memory;

import com.zkq.snail.base.mvp.BasePresenter;
import com.zkq.snail.base.mvp.BaseView;

/**
 * @author:zkq
 * time:2018/10/6:16:12
 * email:zkq815@126.com
 */
public interface MemoryContract {

    interface View extends BaseView<Presenter> {
    }

    interface Presenter extends BasePresenter {
    }

}