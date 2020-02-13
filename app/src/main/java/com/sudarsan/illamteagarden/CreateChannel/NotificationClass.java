package com.sudarsan.illamteagarden.CreateChannel;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

public class NotificationClass {

    Context context;
    public  final  static  String channel_1="Channel1";
    public final static  String channel_2="Channel2";
    public final static  String channel_3="Channel 3";

    public NotificationClass(Context context) {
        this.context = context;
    }

    public  void createChannel()
    {
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.O)
        {
            NotificationChannel channel1 = new NotificationChannel(channel_1,"Channel 1", NotificationManager.IMPORTANCE_HIGH);
            channel1.setDescription("Sucessfully added to Cart");

            NotificationChannel channel2 = new NotificationChannel(channel_2,"Channel 2", NotificationManager.IMPORTANCE_HIGH);
            channel1.setDescription("Thank you for booking");

            NotificationChannel channel3 = new NotificationChannel(channel_3,"Channel 3", NotificationManager.IMPORTANCE_HIGH);
            channel1.setDescription("Congratulation!! Your account has been created Sucessfully");

            NotificationManager notificationManager=context.getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel1);
            notificationManager.createNotificationChannel(channel2);
            notificationManager.createNotificationChannel(channel3);


        }
    }
}
