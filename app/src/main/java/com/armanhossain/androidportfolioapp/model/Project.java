package com.armanhossain.androidportfolioapp.model;

public class Project {
    String projectName;
    String projectDescription;
    int projectIcon;

    // R.drawable.name_of_the_file (this will be some sort of number, an 'int')
    // e.g. 12345678

    public Project(String projectName, String projectDescription, int projectIcon) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectIcon = projectIcon;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public int getProjectIcon() {
        return projectIcon;
    }

    public void setProjectIcon(int projectIcon) {
        this.projectIcon = projectIcon;
    }
}
