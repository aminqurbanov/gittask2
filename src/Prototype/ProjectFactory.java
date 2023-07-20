package Prototype;

public class ProjectFactory {
    private final Prototype.Project project;
    public ProjectFactory(Project project){
        this.project=project;
    }
    public Project cloneProjects(){
        return (Project) project.copy();
    }
}