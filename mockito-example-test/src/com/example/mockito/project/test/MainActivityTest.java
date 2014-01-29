package com.example.mockito.project.test;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.test.AndroidTestCase;

import com.example.mockito.project.MainActivity;

public class MainActivityTest extends AndroidTestCase {

	@Mock
	private Context context;
	
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		System.setProperty( "dexmaker.dexcache", getContext().getCacheDir().getPath());
		MockitoAnnotations.initMocks(this);
	}
	
	public void testQuery(){
		Intent intent = MainActivity.createQuery(context, "query", "value");
		assertNotNull(intent);
		Bundle extras = intent.getExtras();
		assertNotNull(extras);
		assertEquals("query", extras.getString("QUERY"));
		assertEquals("value", extras.getString("VALUE"));
	}
	
}
