package com.example.push;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseGeoPoint;
import com.parse.ParseObject;
import com.parse.ParsePush;
import com.parse.ParseQuery;
import com.parse.PushService;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}  

	public void sendPush(View v) {
		ParsePush push = new ParsePush();
		push.setMessage("From emulator");
		push.setChannel("costa");
		push.sendInBackground();

	}


	public void pushJson(View v) {
		JSONObject data;
		try {
			data = new JSONObject("{\"action\": \"com.example.UPDATE_STATUS\"," +
					"\"alert\": \"The Mets scored!\",\"badge\": \"Increment\"}");
			ParsePush push = new ParsePush();
			push.setChannel("costa");
			push.setData(data);
			push.sendInBackground();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
