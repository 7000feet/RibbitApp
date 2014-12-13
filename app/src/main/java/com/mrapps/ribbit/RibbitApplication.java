package com.mrapps.ribbit;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by Mason Reaves on 11/25/2014.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "3u6Qm1V643MZfi4SzlWtobDcgkJbxwv9RoQVjsNj", "U1EK6KSdf8AlEJuRwOBpAiPiEMWKUvyvb0TTRNIF");

        //create a testobject below to check communication with parse backend
        //ParseObject testObject = new ParseObject("TestObject");
        //testObject.put("foo", "bar");
        //testObject.saveInBackground();
    }

}
