package com.myapplicationdev.android.p04_revisionnotes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

	ListView lv;
	ArrayAdapter aa;
	ArrayList<Note> noteList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//TODO implement the Custom ListView


		DBHelper db = new DBHelper(SecondActivity.this);
		noteList = db.getNoteContent();
		db.close();

		aa = new RevisionNotesArrayAdapter(this, R.layout.row, noteList);
		lv.setAdapter(aa);

	}


}
