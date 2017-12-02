# HorizontalStepView
![image](https://github.com/lizhanqi/HorizontalStepView/blob/master/gif/GIF.gif)
used：
    gradle：
   compile 'com.lizhanqi:libstepview:1.0.1'
   xml：
    <com.lizhanqi.www.stepview.HorizontalStepView
        android:id="@+id/horizontalSteps"
        android:layout_marginTop="@dimen/px30"
        android:layout_marginBottom="@dimen/px30"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
    </com.lizhanqi.www.stepview.HorizontalStepView>

    //点击事件
  view.setOnItemClickList(new HorizontalStepView.ItemClick() {
          @Override
          public void onItemClick(int position, boolean isfinish, String text) {
                  ToastUtils.show(text+position+isfinish);
          }
      });
      //一些设置
      view.setStepViewTexts(new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.steps))))//总步骤（底部文字，arrayList）
              .setmCircleRadius(23)//圆点大小
              .setTextMarginTop(-30)//文字距离上边的距离
              .fixPointPadding(true)//固定距离（默认false）
             .imaginaryLine(true)//未完成的是否使用虚线绘制(默认false)
              .setFinshTextIsBold(true)//完成的文字是否加粗(默认false)
              .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(SearchOrderActivity.this,R.color.themeColor))//设置StepsViewIndicator完成线的颜色
              .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(SearchOrderActivity.this, R.color.textHint_99))//设置StepsViewIndicator未完成线的颜色
              .setStepViewComplectedTextColor(ContextCompat.getColor(SearchOrderActivity.this, R.color.themeColor))//设置StepsView text完成线的颜色
              .setStepViewUnComplectedTextColor(ContextCompat.getColor(SearchOrderActivity.this, R.color.textHint_99))//设置StepsView text未完成线的颜色
              .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(SearchOrderActivity.this, R.drawable.icon_finished))//设置StepsViewIndicator CompleteIcon
              .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(SearchOrderActivity.this, R.drawable.icon_unfinished))//设置StepsViewIndicator DefaultIcon
              .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(SearchOrderActivity.this, R.drawable.icon_current));//设置StepsViewIndicator AttentionIcon

