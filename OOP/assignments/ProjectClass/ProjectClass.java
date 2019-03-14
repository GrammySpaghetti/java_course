import sun.print.resources.serviceui;

public class ProjectClass{
    private String name;
    private String description;

    public ProjectClass(){

    }
    public ProjectClass(String name){
        this.name = name;
    }
    public ProjectClass(String name, String description){
        this.name = name;
        this.description = description;
    }

    public getName(){
        return name;
    }
    public setName(String name){
        this.name = name;
    }
    public getDescription(){
        return description;
    }
    public setDescription(String description){
        this.description = description;
    }
}