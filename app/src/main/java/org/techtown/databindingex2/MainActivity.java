package org.techtown.databindingex2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;

import org.techtown.databindingex2.databinding.ActivityMainBinding;

import VO.Dog;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        Dog dog = new Dog("mari", 3);
        binding.setDog(dog);
    }

}