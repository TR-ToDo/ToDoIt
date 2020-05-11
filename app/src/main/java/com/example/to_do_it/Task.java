package com.example.to_do_it;

import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task {
    //Declaring Variables
    private String title;
    private String difficulty;
    private String doDate;
    private String priority;

    public Task() {

    }

    public Task(String title, String difficulty, String doDate, String priority) {
        this.title = title;
        this.difficulty = difficulty;
        this.doDate = doDate;
        this.priority = priority;
    }

    public String getTitle() { return title; }

    public String getDifficulty() { return difficulty; }

    public String getDoDate() { return doDate; }

    public String getPriority() { return priority; }

    public void setTitle(String title) { this.title = title; }

    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }

    public void setDoDate(String doDate) { this.doDate = doDate; }

    public void setPriority(String priority) { this.priority = priority; }

    public static ArrayList<Task> getTasks() {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Finish Week 10 Tutorial", "Hard", "12/5/2020", "High"));
        tasks.add(new Task("Create RecyclerView", "Hard", "12/5/2020", "High"));
        tasks.add(new Task("Complete INFS3634 Final Exam", "Hard", "12/5/2020", "Medium"));
        tasks.add(new Task("Celebration of End of Quarantine", "Easy", "13/5/2020", "Medium"));
        tasks.add(new Task("Go to James' Birthday", "Easy", "13/5/2020", "Low"));
        tasks.add(new Task("Finish Uni", "Hard", "14/5/2020", "High"));
        tasks.add(new Task("Create new wireframes", "Medium", "14/5/2020", "Medium"));
        return tasks;
    }
}
