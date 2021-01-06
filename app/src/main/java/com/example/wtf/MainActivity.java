package com.example.wtf;

import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * @description:
 * @return:
 * @author: Zhanghuairui
 * @date: 2021/1/5
 **/

public class MainActivity extends AppCompatActivity {
    String TAG = "myTag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFromC getFromC = new getFromC();
        TextView Stringtv, Integertv, booleantv, inttv, bytetv, longtv;
        Stringtv = findViewById(R.id.Stringtv);
        Integertv = findViewById(R.id.Integertv);
        booleantv = findViewById(R.id.booleantv);
        inttv = findViewById(R.id.inttv);
        bytetv = findViewById(R.id.bytetv);
        longtv = findViewById(R.id.longtv);

        // 基础类型测试
        Log.d(TAG, "onCreate: text");
        Stringtv.setText(getFromC.getStringFromC("abcZ"));
        if (getFromC.getbooleanFromC(true) == true) booleantv.setText("true"); else booleantv.setText("false");
        inttv.setText(String.valueOf(getFromC.getintFromC(1)));
        byte a = 1; bytetv.setText(String.valueOf(getFromC.getbyteFromC(a)));
        longtv.setText(String.valueOf(getFromC.getlongFromC(1)));

        System.out.println("-----------------------------------------");
        //数组测试
        ArrayTest test = new ArrayTest();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = 1;
        }
        int[] newArray = test.intMethod(array);
        Log.d(TAG, "onCreate: "+newArray.length);
        for (int i = 0; i < newArray.length; i++){
//            System.out.println(newArray[i]);
            Log.d(TAG, "ArrayTestM: "+newArray[i]);
        }

        //对象测试
        ObjectTest tt = new ObjectTest();
        tt.setAge(11);
        tt.setId("Huaisui");
        Log.d(TAG, "onCreate: "+tt.Obj1());
        System.out.println(tt.getAge());
        System.out.println(tt.getId());

        //C调用java测试
        InstanceMethodCall call = new InstanceMethodCall();
        call.nativeMethod();
    }
}