package com.greedyguy.BTW;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by Luke-Kwon on 2016. 3. 27..
 */
public class MainService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        return super.onStartCommand(intent, flags, startId);

    }


}
