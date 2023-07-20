package Prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        var project = new Project(1,"First","code");
        var projectFactory= new ProjectFactory(project);
        var projectClone = projectFactory.cloneProjects();
        System.out.println(projectClone);
    }
}

