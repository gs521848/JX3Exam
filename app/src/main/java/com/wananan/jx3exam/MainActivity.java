package com.wananan.jx3exam;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import com.wananan.jx3exam.Fragment.BlankFragment;
import com.wananan.jx3exam.Fragment.SocersFragment2;
import com.ycl.tabview.library.TabView;
import com.ycl.tabview.library.TabViewChild;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    TabView tabView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTabView();

    }


    private void initTabView()
    {
        tabView=findViewById(R.id.tabView);
        List<TabViewChild> tabViewChildList=new ArrayList<>();
        TabViewChild tabViewChild01=new TabViewChild(R.drawable.tab01_sel,R.drawable.tab01_unsel,"考试Time", new BlankFragment());
        TabViewChild tabViewChild02=new TabViewChild(R.drawable.tab02_sel,R.drawable.tab02_unsel,"成绩栏", new SocersFragment2());
        tabViewChildList.add(tabViewChild01);
        tabViewChildList.add(tabViewChild02);
        tabView.setTextViewSelectedColor(Color.BLUE);
        tabView.setTextViewUnSelectedColor(Color.BLACK);
        tabView.setImageViewTextViewMargin(2);
        tabView.setTextViewSize(14);
        tabView.setImageViewTextViewMargin(2);
        tabView.setTabViewHeight(dip2px(70));
        tabView.setTabViewGravity(Gravity.BOTTOM);
        tabView.setTabViewChild(tabViewChildList,getSupportFragmentManager());
    }
    public  int dip2px(float dpValue)
    {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
