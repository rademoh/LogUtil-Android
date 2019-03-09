package rabiu.com.logutil;

import android.util.Log;

/**
 * Created by rabiu on 09/03/2019.
 */

public class LogDebug {

    private static final String TAG = "SUPER_AWESOME_APP";

    public static void d(String message){
        Log.d(TAG,message);
    }
}
