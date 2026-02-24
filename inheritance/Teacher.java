package inheritance;

import java.util.ArrayList;

public class Teacher extends Person {
  String department;
  ArrayList<String> courses;
  public Teacher() {}
  public Teacher(String department, ArrayList<String> courses) {
    this.department = department;
    this.courses = courses;
  }
  //public Teacher(String department, String[] courses) {
  //  this.department = department;
  //  this.courses = new ArrayList<String>(courses);
  //}
  public void setDepartment(String department) {
    this.department = department;
  }
  public String getDepartment() {
    return this.department;
  }
  public void setCourses(ArrayList<String> courses) {
    this.courses = courses;
  }
  public void addCourse(String course) {
    this.courses.add(course);
  }
  public void setCourse(int index, String course) {
    this.courses.set(index, course);
  }
  public ArrayList<String> getCourses() {
    return this.courses;
  }
  public String getCourse(int index) {
    return this.courses.get(index);
  }
  @Override
  public String toString() {
    return String.format("First Name: %s\nLast Name: %s\nGender: %s\nDepartment: %s\n", this.firstName, this.lastName, this.gender, this.department);
  }
  public boolean equals(Teacher t) {
    return this.firstName.equals(t.firstName) && this.lastName.equals(t.lastName) && this.gender.equals(t.gender) && this.department.equals(t.department) && this.courses.equals(t.courses);
  }
  public static void main(String[] args) {
    
  }
}
