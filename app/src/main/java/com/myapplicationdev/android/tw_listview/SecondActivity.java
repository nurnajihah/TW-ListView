package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Modules> modules;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = this.findViewById(R.id.lvModules);
        tvYear = this.findViewById(R.id.tvYear);

        Intent i = getIntent();
        int selected = i.getIntExtra("selected", 0);
        modules = new ArrayList<Modules>();

        //Create Array in Modules Array
        if(selected == 2) {
            modules = new ArrayList<Modules>();
            modules.add(new Modules("C208", true));
            modules.add(new Modules("C200", false));
            modules.add(new Modules("C346", true));

            aa = new ModuleAdapter(this, R.layout.row, modules);
            lv.setAdapter(aa);
        }
        



    }



}
