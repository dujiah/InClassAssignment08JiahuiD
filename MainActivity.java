package com.example.du.inclassassignment08jiahuid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private List<Question> questions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionAdapter(questions, this));
    }

    private void initialData() {
        questions = new ArrayList<>();
        questions.add(new Question(R.string.a, R.string.question_americans, R.drawable.a, true));
        questions.add(new Question(R.string.e, R.string.question_africa, R.drawable.e, false));
        questions.add(new Question(R.string.f, R.string.question_asia, R.drawable.f, true));
        questions.add(new Question(R.string.b, R.string.question_mideast, R.drawable.b, false));
        questions.add(new Question(R.string.c, R.string.question_oceans, R.drawable.c, true));
        questions.add(new Question(R.string.d, R.string.question_australia, R.drawable.d, true));

    }
}
