package com.gao.mvvmdemo.databinding;

import android.view.View;
import android.widget.Toast;

/**
 * Created by mr.gao on 2018/4/5.
 * Package:    com.gao.mvvmdemo.databinding
 * Create Date:2018/4/5
 * Project Name:MVVMDemo
 * Description:
 */

public class OnClickUtils {

    public void onClickSecond(View view){
        Toast.makeText(view.getContext(),"你点了第2个Btn",Toast.LENGTH_SHORT).show();

    }
}
