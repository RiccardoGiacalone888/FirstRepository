import java.util.StringTokenizer;

public class Residents {
    private String name;
    private String type;
    private String sex;
    private int age;
    public Residents(String name, String type, String sex, int age){
        this.name=name;
        this.type=type;
        this.sex=sex;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
