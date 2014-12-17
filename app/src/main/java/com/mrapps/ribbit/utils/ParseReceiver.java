package com.mrapps.ribbit.utils;

import android.content.Context;
import android.content.Intent;

import com.mrapps.ribbit.ui.MainActivity;
import com.parse.ParsePushBroadcastReceiver;

/**
 * Created by Mason Reaves on 12/13/2014.
 */
public class ParseReceiver extends ParsePushBroadcastReceiver {

    public void onPushOpen(Context context, Intent intent) {
        Intent i = new Intent(context, MainActivity.class);
        i.putExtras(intent.getExtras());
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
