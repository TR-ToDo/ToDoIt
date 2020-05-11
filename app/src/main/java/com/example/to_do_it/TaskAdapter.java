package com.example.to_do_it;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.TaskViewHolder> {
    public ArrayList<Task> tasks;
    private RecyclerViewClickListener listener;

    public TaskAdapter(ArrayList<Task> tasks, RecyclerViewClickListener listener) {
        this.tasks = tasks;
        this.listener = listener;
    }

    public interface RecyclerViewClickListener{
        void onClick(View view, int position);
    }

    public static class TaskViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView title;
        private RecyclerViewClickListener listener;

        public TaskViewHolder(View v, RecyclerViewClickListener listener) {
            super(v);
            this.listener = listener;
            title = v.findViewById(R.id.txvTitle);
        }

        @Override
        public void onClick(View view) { listener.onClick(view, getAdapterPosition()); }
    }

    @Override
    public TaskAdapter.TaskViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.to_do_row, parent, false);
        return new TaskViewHolder(v, listener);
    }

    @Override
    public void onBindViewHolder(TaskViewHolder holder, int position) {
        Task task = tasks.get(position);
        holder.title.setText(task.getTitle());
    }

    @Override
    public int getItemCount() { return tasks.size(); }

}
