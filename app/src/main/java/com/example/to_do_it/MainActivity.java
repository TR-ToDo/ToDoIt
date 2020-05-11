package com.example.to_do_it;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    public static final String message = "position";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.taskList);
        recyclerView.setHasFixedSize(true);

        int numColumns = 2;
        recyclerView.setLayoutManager(new GridLayoutManager(this, numColumns));

        TaskAdapter.RecyclerViewClickListener listener = new TaskAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra(message, position);
                startActivity(intent);
            }
        };

        adapter = new TaskAdapter(Task.getTasks(), listener);
        recyclerView.setAdapter(adapter);
    }
}
