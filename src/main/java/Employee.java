public class Employee {
    private String name;
    private String PPSid;
    private String type;
    private String gender;
    private int age;

    public Employee(String name, String PPSid, String type, String gender, int age){
        setName(name);
        setPPSid(PPSid);
        setType(type);
        setGender(gender);
        setAge(age);
    }

    public String getName(){
        return name;
    }
    private void setName(String name) {
        if(name.length()>=3){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("This is not a valid name.");
        }
    }

    public String getPPSid(){

        return PPSid;
    }
    private void setPPSid(String PPSid) {
        if(PPSid.length()>=3){
                this.PPSid = PPSid;
        }
        else{
            throw new IllegalArgumentException("This is not a valid name.");
        }
    }

    public String getType(){
        return type;
    }
    private void setType(String type) {
        switch (type){
            case "Full-time":
            case "Part-time":
            case "Contract":
                this.type=type;
            default:
                throw new IllegalArgumentException("This is not a valid type.");
        }
    }

    public String getGender(){
        return gender;
    }
    private void setGender(String gender) {
        switch (gender){
            case "Male":
            case "Female":
            case "Non-Binary":
                this.gender=gender;
            default:
                throw new IllegalArgumentException("This is not a valid type.");
        }

    }

    public int getAge(){
        return age;
    }
    private void setAge(int age) {
        if(age>16 && age< 66){
            this.age = age;
        }
        else
            throw new IllegalArgumentException("This is not a valid age.");
    }

}