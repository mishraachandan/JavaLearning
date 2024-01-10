package practice;

class Person {
    private String name;
    private int age;
    private String gender;

    // Constructor
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter methods to access the private attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    // Setter methods to modify the private attributes (with validation)
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) { // Reasonable age range
            this.age = age;
        }
    }

    public void setGender(String gender) {
        if (gender != null && (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))) {
            this.gender = gender;
        }
    }
}