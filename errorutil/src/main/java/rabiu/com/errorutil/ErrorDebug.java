package rabiu.com.errorutil;

import android.util.Log;

/**
 * Created by rabiu on 10/03/2019.
 */

public class ErrorDebug  {

    private static final String TAG = "SUPER_AWESOME_APP";

    public static void e(String message){
        Log.d(TAG,message);
    }
}
