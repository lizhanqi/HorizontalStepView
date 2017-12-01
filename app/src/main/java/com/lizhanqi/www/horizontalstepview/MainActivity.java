package com.lizhanqi.www.horizontalstepview;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.lizhanqi.www.stepview.HorizontalStepView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private HorizontalStepView mH1;
    private HorizontalStepView mH2;
    private HorizontalStepView mH3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mH1 = (HorizontalStepView) findViewById(R.id.h1);
        mH2 = (HorizontalStepView) findViewById(R.id.h2);
        mH3 = (HorizontalStepView) findViewById(R.id.h3);
        ArrayList<String> asb = new ArrayList<String>();
        asb.add("步骤1");
        mH1.setStepViewTexts(asb)//总步骤
                .setmCircleRadius(23)
                .setTextMarginTop(-30)
                .fixPointPadding(false)
                .imaginaryLine(true)
                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(this,R.color.themeColor))//设置StepsViewIndicator完成线的颜色
                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(this, R.color.textHint_99))//设置StepsViewIndicator未完成线的颜色
                .setStepViewComplectedTextColor(ContextCompat.getColor(this, R.color.themeColor))//设置StepsView text完成线的颜色
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(this, R.color.textHint_99))//设置StepsView text未完成线的颜色
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(this, R.drawable.icon_finished))//设置StepsViewIndicator CompleteIcon
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(this, R.drawable.icon_unfinished))//设置StepsViewIndicator DefaultIcon
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(this, R.drawable.icon_current));//设置StepsViewIndicator AttentionIcon
        ArrayList<String> as = new ArrayList<String>();
        as.add("步骤1");
        as.add("步骤二");
        as.add("步骤三");
        as.add("步骤四");
        as.add("步骤五");

        mH2.setOnItemClickList(new HorizontalStepView.ItemClick() {
            @Override
            public void onItemClick(int position, boolean isfinish, String text) {
                Toast.makeText(MainActivity.this,"下标："+position+"，是否完成"+isfinish+text,Toast.LENGTH_SHORT).show();
            }
        });
   mH3.setOnItemClickList(new HorizontalStepView.ItemClick() {
            @Override
            public void onItemClick(int position, boolean isfinish, String text) {
                Toast.makeText(MainActivity.this,"下标："+position+"，是否完成"+isfinish+text,Toast.LENGTH_SHORT).show();
            }
        });
        mH2    .setStepViewTexts(as)//总步骤
                .setmCircleRadius(23)//每个点的大小
                .setTextMarginTop(-30)//调节文字和步骤距离
                .fixPointPadding(false)//不固定每个步骤的距离（非动态计算，默认false）
                .imaginaryLine(true)//未完成的使用虚线
                .setStepsViewIndicatorComplectingPosition(2)//完成步骤数
                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(this,R.color.themeColor))//设置StepsViewIndicator完成线的颜色
                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(this, R.color.textHint_99))//设置StepsViewIndicator未完成线的颜色
                .setStepViewComplectedTextColor(ContextCompat.getColor(this, R.color.themeColor))//设置StepsView text完成线的颜色
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(this, R.color.textHint_99))//设置StepsView text未完成线的颜色
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(this, R.drawable.icon_finished))//设置StepsViewIndicator CompleteIcon
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(this, R.drawable.icon_unfinished))//设置StepsViewIndicator DefaultIcon
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(this, R.drawable.icon_current));//设置StepsViewIndicator AttentionIcon
        mH3 .setStepViewTexts(as)//总步骤
                .setComplete(1,3,5)
                .setmCircleRadius(23)
                .setTextMarginTop(-30)
                .fixPointPadding(true)
                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(this,R.color.themeColor))//设置StepsViewIndicator完成线的颜色
                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(this, R.color.textHint_99))//设置StepsViewIndicator未完成线的颜色
                .setStepViewComplectedTextColor(ContextCompat.getColor(this, R.color.themeColor))//设置StepsView text完成线的颜色
                .setStepViewUnComplectedTextColor(ContextCompat.getColor(this, R.color.textHint_99))//设置StepsView text未完成线的颜色
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(this, R.drawable.icon_finished))//设置StepsViewIndicator CompleteIcon
                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(this, R.drawable.icon_unfinished))//设置StepsViewIndicator DefaultIcon
                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(this, R.drawable.icon_current));//设置StepsViewIndicator AttentionIcon

    }
}
