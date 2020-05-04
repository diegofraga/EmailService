package com.example.emailservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;

public class MessageIntentService extends IntentService {


    public MessageIntentService(){

        super("Receiving Emails");
    }


    private static final String TAG = "Email";
    private boolean running;

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        ReceiveEmails();
        running = true;
        Log.d(TAG,"Service stopped...");
    }

    private void ReceiveEmails(){

        try{
            Log.d(TAG,"Executing Service..." );
            LinkedList list1 = new LinkedList();

            //Receiving "Emails"
            Thread.sleep(1000);
            list1.insertAfter("a");
            list1.insertAfter("j");
            list1.insertAfter("b");
            list1.insertFirst("f");
            list1.insertFirst("g");
            list1.insertAfter("h");
            list1.insertAfter("i");
            list1.insertAfter("j");
            list1.insertAfter("j");
            list1.insertAfter("j");
            list1.insertAfter("j");
            list1.insertAfter("z");
            list1.insertAfter("x");
            list1.insertAfter("k");
            list1.insertAfter(list1.head.next,"g");
            list1.RemoveDuplicated();

            list1.printList();



        }catch (InterruptedException e){

            Log.e(TAG,e.getMessage());
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        running = false;
        Log.d(TAG,"Service onDestroy...");
    }
}
