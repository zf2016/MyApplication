package com.example.zf.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.ado.util.Constants;

/**
 * 基础Activity
 * @author zf-win10
 * created at 2016/3/21 16:41
 */
public class BasicActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }

    /**
     * 打印Log
     * @author zf-win10
     * created at 2016/3/21 16:40
     */
    public void LogTag(String tag, String content){
        if(Constants.LOG_DEBUG){
            Log.i(tag, content);
        }
    }


}
