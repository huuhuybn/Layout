package vn.edu.poly.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    private ItemAdapter itemAdapter;

    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.lvList);

        itemAdapter = new ItemAdapter(MainActivity.this);

        linearLayoutManager = new LinearLayoutManager(MainActivity.this);


        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(itemAdapter);


    }


}
