package com.example.push;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseInstallation;
import com.parse.ParsePush;
import com.parse.PushService;
import com.parse.SaveCallback;

public class Application extends android.app.Application {

  public Application() {
  }

  @Override
  public void onCreate() {
    super.onCreate();

	// Initialize the Parse SDK.
	Parse.initialize(this, "3hLYSVpjzLpXuaY6agPc1h3zIQsfZT4U0SbNbdXm", 
			"Y50EKQM9WFrr6BnyBtBMBMQQfaUAhUC4wF9OdzHJ"); 

	// Specify an Activity to handle all pushes by default.
	ParsePush.subscribeInBackground("costa", new SaveCallback() {
		
		@Override
		public void done(ParseException e) {
			// TODO Auto-generated method stub
			if (e == null) {
				System.out.println("Everything is OK");
			}
			
		}
	});
  }
}