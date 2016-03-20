package com.example.deyvison.aula08;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    private ListView listView;
    String[] lista = new String[] {"Fragment 01", "Fragment 02", "Fragment 03"};
    ArrayAdapter<?> adapter;

    FragmentManager fm = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter<Object>(this,android.R.layout.simple_list_item_1, lista);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Fragment f1 = new Fragment01();
                    fm.beginTransaction().replace(R.id.ladodireito,f1).commit();
                }
                else if(position == 1){
                    Fragment f2 = new Fragment02();
                    fm.beginTransaction().replace(R.id.ladodireito,f2).commit();
                }
                else if(position == 2){
                    Bundle bundle = new Bundle();
                    bundle.putString("nome", "Flamengo!");
                    Fragment f3 = new Fragment03();
                    f3.setArguments(bundle);

                    fm.beginTransaction().replace(R.id.ladodireito,f3).commit();
                }
            }
        });
    }
}
