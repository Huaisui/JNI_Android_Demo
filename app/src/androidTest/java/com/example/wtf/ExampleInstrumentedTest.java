package com.example.wtf;

import android.content.Context;
import android.util.Log;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.wtf", appContext.getPackageName());
    }

    @Test
    public void ArrayTestM(){
        ArrayTest test = new ArrayTest();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = 1;
        }
        int[] newArray = test.intMethod(array);
        String TAG = "myTestTag";
    }

    @Test
    public void ObjectTestM(){
        ObjectTest tt = new ObjectTest();
        tt.Obj1();
    }

    @Test
    public void NMSL(){
        System.out.println("NMSL");
    }
}