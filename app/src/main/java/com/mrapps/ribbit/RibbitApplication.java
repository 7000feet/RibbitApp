package com.mrapps.ribbit;

import android.app.Application;
import android.util.Log;

import com.mrapps.ribbit.ui.MainActivity;
import com.mrapps.ribbit.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParsePush;
import com.parse.ParsePushBroadcastReceiver;
import com.parse.ParseUser;
import com.parse.PushService;
import com.parse.SaveCallback;

/**
 * Created by Mason Reaves on 11/25/2014.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "3u6Qm1V643MZfi4SzlWtobDcgkJbxwv9RoQVjsNj", "U1EK6KSdf8AlEJuRwOBpAiPiEMWKUvyvb0TTRNIF");

        ParseInstallation.getCurrentInstallation().saveInBackground();

        //create a testobject below to check communication with parse backend
        //ParseObject testObject = new ParseObject("TestObject");
        //testObject.put("foo", "bar");
        //testObject.saveInBackground();
    }

    public static void updateParseInstallation(ParseUser user){
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();

    }

}
