import java.util.Set;


    public class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name){
            newPerson.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            newPerson.surname = surname;
            return this;
        }

        public Builder withAge(int age){
            newPerson.age = age;
            return this;
        }

        public Builder withHeight(int height){
            newPerson.height = height;
            return this;
        }

        public Builder withWeight(int weight){
            newPerson.weight = weight;
            return this;
        }

        public Builder withParents(Set<Person> parents){
            newPerson.parents = parents;
            return this;
        }

        public Person build(){
            return newPerson;
        }


        public static void main(String[] args) {
            Person myPerson = new Person.Builder()
                    .withName("Jane")
                    .withSurname("Doe")
                    .withAge(32)
                    .withHeight(165)
                    .withWeight(70)
                    .build();
        }



