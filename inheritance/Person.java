package inheritance;

public class Person {
  String firstName, lastName, gender;
  public Person() {}
  public Person(String firstName, String lastName, String gender) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getFirstName() {
    return this.firstName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getLastName() {
    return this.lastName;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public String getGender() {
    return this.gender;
  }
  public String toString() {
    return String.format("First Name: %s\nLast Name: %s\nGender: %s", this.firstName, this.lastName, this.gender);
  }
  public boolean equals(Person p) {
    return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.gender.equals(p.gender);
  }
  public static void main(String[] args) {
    
  }
}
