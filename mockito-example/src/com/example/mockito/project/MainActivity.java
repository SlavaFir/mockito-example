package com.example.mockito.project;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public static Intent createQuery(Context context, String query, String value){
    	Intent i = new Intent(context, MyListActivity.class);
    	i.putExtra("QUERY", query);
    	i.putExtra("VALUE", value);
    	return i;
    }
    
}
