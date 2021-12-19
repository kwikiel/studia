class Person {
    String name;

    public String getString() {
        return this.name;
    }
}

class Welder extends Person {

    String jobSeniority;

    public String getString() {
        return jobSeniority + super.getString();
    }

}