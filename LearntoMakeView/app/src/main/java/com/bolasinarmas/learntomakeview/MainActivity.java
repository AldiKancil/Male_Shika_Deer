package com.bolasinarmas.learntomakeview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listview);
        adapter = ArrayAdapter.createFromResource(this, R.array.jenjang, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((adapterView, view, i, l) -> Toast.makeText(MainActivity.this, adapter.getItem(i) + "dipilih",Toast.LENGTH_SHORT).show());
    }
}