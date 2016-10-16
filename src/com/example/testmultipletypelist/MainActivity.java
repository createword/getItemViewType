package com.example.testmultipletypelist;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ListView listView = (ListView) findViewById(R.id.list_main);
		List<ListItem> list = new ArrayList<ListItem>();
		ListAdapter listAdapter = new ListAdapter(this);
	
		for (int i = 0; i < 30; i++) {
			ListItem item = new ListItem(i % 3, "index:" + i + " type:" + i % 3);
			list.add(item);
		}
		listAdapter.setList(list);
		listView.setAdapter(listAdapter);
	}
}
