package com.armanhossain.androidportfolioapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.armanhossain.androidportfolioapp.R;
import com.armanhossain.androidportfolioapp.model.Project;

public class ProjectsAdapter extends RecyclerView.Adapter<ProjectsAdapter.ProjectViewHolder> {
    private final Project[] projects;

    public ProjectsAdapter(Project[] projects){
        this.projects = projects;
    }

    @Override
    public int getItemCount() {
        return projects.length;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.bind(projects[position]);
    }

    static class ProjectViewHolder extends RecyclerView.ViewHolder{
        private final ImageView ivProjectIcon;
        private final TextView tvProjectTitle;
        private final TextView tvProjectDescription;

        public ProjectViewHolder(@NonNull View itemView) {
            super(itemView);
            ivProjectIcon = itemView.findViewById(R.id.iv_project_icon);
            tvProjectTitle = itemView.findViewById(R.id.tv_project_title);
            tvProjectDescription = itemView.findViewById(R.id.tv_project_description);
        }

        public void bind(Project project){
            ivProjectIcon.setImageResource(project.getProjectIcon());
            tvProjectTitle.setText(project.getProjectName());
            tvProjectDescription.setText(project.getProjectDescription());
        }
    }
}
