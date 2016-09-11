package com.hfad.utdappstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    public static int [] prgmImages={R.drawable.utda,R.drawable.u,R.drawable.t,R.drawable.d};
    public static String [] prgmNameList={"UT Dallas","University" ,"Texas","Dallas"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView) findViewById(R.id.list_item);
        lv.setAdapter(new ListViewAdapter(this, prgmNameList, prgmImages));



    }


}
