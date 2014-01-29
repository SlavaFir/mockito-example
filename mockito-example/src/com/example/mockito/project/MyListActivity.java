package com.example.mockito.project;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MyListActivity extends ListActivity {

	private String[] mValues = new String[]{"USA, Canada, Brasil, France, England, Germany, Norway, Italy, Belgium"};
	private ArrayAdapter<String> mSimpleAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mValues);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listview);
		setListAdapter(mSimpleAdapter);
		
	}
	
}
