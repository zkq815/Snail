package com.zkq.fuxi.basehodler.operation;

import android.content.Context;
import android.view.View;

import com.zkq.fuxi.basehodler.holder.BaseNativeEdtionHolder;
import com.zkq.fuxi.basehodler.holder.SlideShowInsideHolder;
import com.zkq.fuxi.basehodler.module.SlideShowEdtionModule;
import com.zkq.fuxi.basehodler.view.SlideShowInsideEdtionView;

/**
 * @author zkq
 * create:2019/5/29 12:08 AM
 * email:zkq815@126.com
 * desc: 内部滑动轮播图
 */
public class SlideShowInsideOperationModel extends BaseEdtionOperationModel<SlideShowEdtionModule> {

    public SlideShowInsideOperationModel(Context context, SlideShowEdtionModule edtionModule) {
        super(context, edtionModule);
    }

    @Override
    public BaseNativeEdtionHolder createEdtionHolder() {
        return new SlideShowInsideHolder(getContext(), createShowView());
    }

    @Override
    View createShowView() {
        return new SlideShowInsideEdtionView(getContext(), getEdtionModule());
    }
}
