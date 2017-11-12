package glm.seclass.qc.edu.glm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {



    ListView groceryListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button searchItem = findViewById(R.id.searchItemButton);


        groceryListView = findViewById(R.id.listview);


        final String []strArr = new String[]{
                "DIY Supplies",
                "Party Supplies",
                "Drugs",
                "CS 370 rations",
                "Random Stuff",
                "Comfort Food",
                "Rations",
                "Survival gear",
                "Testing Testing 123",
                "Items for Don",
                "Items for Jack",
                "Items for Jessica",
                "Items for Lin"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, strArr);

        groceryListView.setAdapter(adapter);

        groceryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String value = strArr[i];
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_LONG).show();
            }
        });}


    public void displaySearchScreen (View view){
        Intent search_intent = new Intent(this, SearchEngine.class);
        startActivity(search_intent);
    }





    public void onClick(View view){
        switch(view.getId()){
            case R.id.searchItemButton:


                break;

        }
    }



}

