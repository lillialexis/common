package ${PACKAGE_NAME};

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

#parse("File Header.java")
public class ${NAME} extends BroadcastReceiver {
    private final static String TAG = "${PROJECT_NAME}:${NAME}";

    @Override
    public void onReceive(Context context, Intent intent) {
    }
}
