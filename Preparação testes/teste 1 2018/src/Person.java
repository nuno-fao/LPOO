import java.util.Objects;

public abstract class Person extends User implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name){
        this.name = name;
        this.age=0;
        super.setUsername(name+Integer.toString(age));
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        super.setUsername(name+Integer.toString(age));
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        if(name.length() != o.getName().length()){
            if((int)name.charAt(0) < (int)o.getName().charAt(0)){
                return -1;
            }
            else{
                return 1;
            }
        }
        else{
            for(int i=0;i<name.length();i++){
                if(name.length() != o.getName().length()){
                    if((int)name.charAt(0) < (int)o.getName().charAt(0)){
                        return -1;
                    }
                    else{
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
