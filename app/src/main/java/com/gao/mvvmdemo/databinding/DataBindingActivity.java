package com.gao.mvvmdemo.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.gao.mvvmdemo.R;
import com.gao.mvvmdemo.databinding.beans.User;

public class DataBindingActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//       /*下面的ActivityDataBindingBinding是自动生成的，根据当前activity的名称*/
        com.gao.mvvmdemo.databinding.ActivityDataBindingBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_data_binding);

        User user=new User();
        user.setAge(22);
        user.setName("MRGao");
        binding.setUser(user);



        binding.setOnclickListener(this);

        binding.setClickUtils(new OnClickUtils());
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn1:
                Toast.makeText(DataBindingActivity.this,"你点了我马蛋",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
