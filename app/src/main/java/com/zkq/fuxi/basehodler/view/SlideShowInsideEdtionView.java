package com.zkq.fuxi.basehodler.view;

import android.content.Context;
import androidx.annotation.NonNull;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.zkq.fuxi.basehodler.module.BaseEdtionModuleView;
import com.zkq.fuxi.basehodler.module.SlideShowEdtionModule;
import com.zkq.fuxi.customview.widget.AutoScrollViewPager;
import com.zkq.weapon.market.tools.ToolSize;

/**
 * @author zkq
 * create:2019/5/29 12:04 AM
 * email:zkq815@126.com
 * desc: 轮播内部滑动模块视图
 */
public class SlideShowInsideEdtionView extends BaseEdtionModuleView<SlideShowEdtionModule> {

    private AutoScrollViewPager mViewPager;
    private LinearLayout mCircleContainerView;

    public SlideShowInsideEdtionView(@NonNull Context context) {
        super(context);
    }

    public SlideShowInsideEdtionView(@NonNull Context context, @NonNull SlideShowEdtionModule edtionModule) {
        super(context, edtionModule);
        initViews();
    }

    public AutoScrollViewPager getViewPager() {
        return mViewPager;
    }

    public LinearLayout getCircleContainerView() {
        return mCircleContainerView;
    }

    private void initViews() {
        mViewPager = new AutoScrollViewPager(getContext());
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT
                , ViewGroup.LayoutParams.MATCH_PARENT);
        mViewPager.setLayoutParams(lp);
        this.addView(mViewPager);
        mCircleContainerView = createCirclePointContainView();
        this.addView(mCircleContainerView);
    }

    private LinearLayout createCirclePointContainView() {
        LinearLayout circleContainerView = new LinearLayout(getContext());
        circleContainerView.setOrientation(LinearLayout.HORIZONTAL);
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT
                , ViewGroup.LayoutParams.WRAP_CONTENT);
        lp.bottomMargin = ToolSize.dp2Px(getContext(), 8);
        lp.gravity = Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL;
        circleContainerView.setLayoutParams(lp);
        return circleContainerView;
    }
}
