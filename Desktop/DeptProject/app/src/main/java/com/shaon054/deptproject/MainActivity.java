package com.shaon054.deptproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    private Toolbar toolbar;

    SearchView src;

    String[] items = {"Introduction", "Chairman", "Teachers", "Course Coordinators",
            "Students", "Academic Officiary", "Academic Syllabus", "Seminar Library",
            "Future of ICE", "Achievements", "Department Activity & Facility", "Class Representative",
            "Search Anyone", "Go to Dept. Site", "Contact Info.", "Emergency Contact"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.tool_bar); // Attaching the layout to the toolbar object
        setSupportActionBar(toolbar);


        lv = (ListView) findViewById(R.id.lv);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_activated_1, items);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                      @Override
                                      public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                          if (position == 0) {
                                              //  Toast.makeText(getApplicationContext(),"Here the dept introduction will display... ",Toast.LENGTH_LONG).show();
                                              Intent i = new Intent(MainActivity.this, TabActivity.class);
                                              startActivity(i);
                                          }
                                          if (position == 1) {
                                              Intent i1 = new Intent(MainActivity.this, ChairmanActivity.class);
                                              startActivity(i1);
                                          }
                                          if (position == 2) {
                                              //  Toast.makeText(getApplicationContext(),"Here all Teachers Info will display... ",Toast.LENGTH_LONG).show();
                                              Intent i2 = new Intent(MainActivity.this, TeacherActivity.class);
                                              startActivity(i2);
                                          }
                                          if (position == 3) {
                                              // Toast.makeText(getApplicationContext(),"Here all Course Co-Ordinators Info will display... ",Toast.LENGTH_LONG).show();
                                              Intent i3 = new Intent(MainActivity.this, CoordinateActivity.class);
                                              startActivity(i3);
                                          }
                                          if (position == 4) {
                                              // Toast.makeText(getApplicationContext(),"Here all Students Info will display... ",Toast.LENGTH_LONG).show();
                                              Intent i3 = new Intent(MainActivity.this, StudentActivity.class);
                                              startActivity(i3);
                                          }
                                          if (position == 5) {
                                              Intent i1 = new Intent(MainActivity.this, Studentinfo.class);
                                              startActivity(i1);
                                          }
                                          if (position == 6)
                                          //Toast.makeText(getApplicationContext(),"Here Academic Syllabus  will display...",Toast.LENGTH_LONG).show();
                                          {
                                              Intent i1 = new Intent(MainActivity.this, Syllabus.class);
                                              startActivity(i1);
                                          }
                                          if (position == 7) {
                                              Intent i1 = new Intent(MainActivity.this, seminer.class);
                                              startActivity(i1);
                                          }
                                          //Toast.makeText(getApplicationContext(),"Here Seminar Library Info will display... ",Toast.LENGTH_LONG).show();
                                          if (position == 8)

                                          {
                                              Intent i1 = new Intent(MainActivity.this, Future.class);
                                              startActivity(i1);
                                          }
                                              //Toast.makeText(getApplicationContext(), "Here Future of ICE Info will display... ", Toast.LENGTH_LONG).show();
                                          if (position == 9)
                                              Toast.makeText(getApplicationContext(), "Here dept Achievements Info will display... ", Toast.LENGTH_LONG).show();
                                          if (position == 10) {
                                              Intent i1 = new Intent(MainActivity.this, DeptActivity.class);
                                              startActivity(i1);
                                          }
                                          // Toast.makeText(getApplicationContext(),"Here Dept Activity Info will display... ",Toast.LENGTH_LONG).show();
                                          if (position == 11) {
                                              // Toast.makeText(getApplicationContext(),"Here all Course Co-Ordinators Info will display... ",Toast.LENGTH_LONG).show();
                                              Intent i3 = new Intent(MainActivity.this, CR.class);
                                              startActivity(i3);
                                          }
                                          //Toast.makeText(getApplicationContext(),"Here Class Representative Info will display... ",Toast.LENGTH_LONG).show();


                                          if (position == 12) {
                                              Intent i3 = new Intent(MainActivity.this, Search.class);
                                              startActivity(i3);
                                          }
                                          //  Toast.makeText(getApplicationContext(),"Here Admission Info will display... ",Toast.LENGTH_LONG).show();

                                          if (position == 13) {
                                              // Toast.makeText(getApplicationContext(),"By Clicking here ,u will go to our site directly... ",Toast.LENGTH_LONG).show();
                                              Intent i = new Intent(MainActivity.this, WebViewActivity.class);
                                              startActivity(i);
                                          }


                                          if (position == 14) {
                                              Intent i = new Intent(MainActivity.this, Empty.class);
                                              startActivity(i);
                                          }

                                          // Toast.makeText(getApplicationContext(),"Here Contact Info will display... ",Toast.LENGTH_LONG).show();

                                          if (position == 15)
                                          //  Toast.makeText(getApplicationContext(),"Here Emergency Contact Info will display ",Toast.LENGTH_LONG).show();
                                          {
                                              Intent i1 = new Intent(MainActivity.this, Emergency.class);
                                              startActivity(i1);
                                          }
                                      }
                                  }
        );
    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; //this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        if (id == R.id.about) {
            {
             //   WebView webView =(WebView)findViewById(R.id.webView) ;
              //  webView.getSettings().setJavaScriptEnabled(true);
              //  webView.setWebChromeClient(new WebChromeClient());

               // webView.loadUrl("file:///android_asset/html/about.html");
             Intent i1 = new Intent(MainActivity.this, About.class);
             startActivity(i1);

            }
            return true;
        }
        if (id == R.id.contributor) {
            {
                Intent i3 = new Intent(MainActivity.this, contributor.class);
                startActivity(i3);
            }
            return true;
        }
        if (id == R.id.devsays) {
            {

                Intent i3 = new Intent(MainActivity.this, devsays.class);
                startActivity(i3);
            }
            return true;
        }
        if (id == R.id.src) {
            {
                Intent i3 = new Intent(MainActivity.this, Search.class);
                startActivity(i3);

            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}