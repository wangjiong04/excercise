package basic.builder;

public class PersonWtihBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public static class Builder{
        private String firstName;
        private String lastName;
        private int age;
        private String gender;
        public Builder firstName(String val){
            firstName=val;
            return this;
        }
        public Builder lastName(String val){
            lastName=val;
            return this;
        }
        public Builder age(int val){
            age=val;
            return this;
        }
        public Builder gender(String val){
            gender=val;
            return this;
        }
        public PersonWtihBuilder build(){
            return new PersonWtihBuilder(this);
        }
    }
    private PersonWtihBuilder(Builder builder){
        firstName=builder.firstName;
        lastName=builder.lastName;
        age=builder.age;
        gender=builder.gender;
    }

    @Override
    public String toString() {
        return "PersonWtihBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args){
        PersonWtihBuilder person=new Builder().age(10).firstName("Jiong").lastName("Wang").build();
        System.out.println(person);
    }
}
