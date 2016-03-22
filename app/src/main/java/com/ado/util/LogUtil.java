package com.ado.util;

import android.util.Log;

/**
 * log日志
 *
 * @author zf-win10
 *         created at 2016/3/22 10:12
 */
public class LogUtil {

    /**
     * 打印Log
     * @author zf-win10
     * created at 2016/3/21 16:40
     */
    public static void LOG_I(String tag, String content){
        if(Constants.LOG_DEBUG){
            Log.i(tag, content);
        }
    }

    public static void LOG_E(String tag, String content){
        if(Constants.LOG_DEBUG){
            Log.e(tag, content);
        }
    }

}
