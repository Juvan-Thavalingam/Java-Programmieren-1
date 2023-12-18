public class Person {
    private String name;
    private String id;

    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }

    public String gibInfo(){
        return name+" "+id;
    }
}
