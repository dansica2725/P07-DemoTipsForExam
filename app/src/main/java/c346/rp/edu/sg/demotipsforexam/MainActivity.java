package c346.rp.edu.sg.demotipsforexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView examTipsLv;

    String[] examTipsArray = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        examTipsLv = findViewById(R.id.examTipsLv);

        examTipsArray[0] = "Prepare way before the exam";
        examTipsArray[1] = "Practice Coding";
        examTipsArray[2] = "Seek help from lecturer";
        examTipsArray[3] = "Prepare Template Code";
        examTipsArray[4] = "Create Empty Projects for MSA";

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, examTipsArray);
        examTipsLv.setAdapter(adapter);
    }
}
