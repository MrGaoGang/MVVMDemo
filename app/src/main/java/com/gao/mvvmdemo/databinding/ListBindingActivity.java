package com.gao.mvvmdemo.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.gao.mvvmdemo.R;

import java.util.ArrayList;
import java.util.List;

public class ListBindingActivity extends AppCompatActivity implements View.OnClickListener {
    private List<User> names;
    com.gao.mvvmdemo.databinding.ActivityListBindingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = DataBindingUtil.setContentView(this,R.layout.activity_list_binding);

        names = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            names.add(new User("item"+i,i));
        }
        binding.setData(names);

        binding.setOnclickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnbtn:
                for (int i = 21; i < 30; i++) {
                    names.add(new User("item"+i,i));
                }
                binding.setData(names);
                break;
        }
    }
}
