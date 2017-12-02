# HorizontalStepView
![image](https://github.com/lizhanqi/HorizontalStepView/blob/master/gif/GIF.gif)

#特性：

    1.支持连续完成
    2.支持间断完成
    3.支持点击事件
#  gradle：
   compile 'com.lizhanqi:libstepview:1.0.1'
   
   xml：
    <com.lizhanqi.www.stepview.HorizontalStepView
        android:id="@+id/horizontalSteps"
        android:layout_marginTop="@dimen/px30"
        android:layout_marginBottom="@dimen/px30"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">
    </com.lizhanqi.www.stepview.HorizontalStepView>

   点击事件:
   
     view.setOnItemClickList(new HorizontalStepView.ItemClick() {
 
          @Override
   
          public void onItemClick(int position, boolean isfinish, String text) {
          
                  ToastUtils.show(text+position+isfinish);
                  
          }
      });
      
    #一些设置
    
    //总步骤（底部文字，arrayList）
    view.setStepViewTexts(new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.steps))))
    .setmCircleRadius(23)//圆点大小   
    .setTextMarginTop(-30)//文字距离上边的距离  
    .fixPointPadding(true)//固定距离（默认false）
    .imaginaryLine(true)//未完成的是否使用虚线绘制(默认false)
    .setFinshTextIsBold(true)//完成的文字是否加粗(默认false)
    //设置StepsViewIndicator完成线的颜色    
    .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(SearchOrderActivity.this,R.color.themeColor))
    //设置StepsViewIndicator未完成线的颜色
    .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(SearchOrderActivity.this, R.color.textHint_99))
    //间断完成（与连续完成只有一种生效）
    .setComplete(1,5)
    //连续完成步数
    .setStepsViewIndicatorComplectingPosition(2)
    //设置StepsViewIndicator完成文本的颜色
    .setStepViewComplectedTextColor(ContextCompat.getColor(SearchOrderActivity.this, R.color.themeColor))
    //设置StepsViewIndicator未完成文本的颜
    .setStepViewUnComplectedTextColor(ContextCompat.getColor(SearchOrderActivity.this, R.color.textHint_99))
    //设置StepsViewIndicator完成图标
    .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(SearchOrderActivity.this,R.drawable.icon_finished))
    //设置StepsViewIndicator 未完成图标
    .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(SearchOrderActivity.this,R.drawable.icon_unfinished))
    //设置StepsViewIndicator 当前图标（连续完成才有，连续完成的最后一个）
    .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(SearchOrderActivity.this,R.drawable.icon_current));
