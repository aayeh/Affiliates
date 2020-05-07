/** Affiliates.java
 * Aaron Yeh
 * 002311707
 * aayeh@chapman.edu
 * cpsc 231-03
 * Assignment 9
 * Create a class named Affiliates that is the main file for everything to branch off of
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public abstract class Affiliates{
  //starting hashmap and variables
  static HashMap<Integer, Object> hmap = new HashMap<Integer, Object>();
  private String name;
  private int age;
  private int phoneNumber;
  private int yearCame;
//setters and getters
  public void setName(String name){
    String name = name;
  }
  public String getName(){
    return name;
  }

  public void setAge(int age){
    int age = age;
  }
  public String getAge(){
    return age;
  }

  public void setPhoneNumber(int phoneNumber){
    int phoneNumber = phoneNumber;
  }
  public String getPhoneNumber(){
    return phoneNumber;
  }

  public void setYearCame(int yearCame){
    int yearCame = yearCame;
  }
  public String getYearCame(){
    return yearCame;
  }
/**
 * comparing the two people and putting them in an array list to see who is higher
 */
  public void comparable(){
    ArrayList<Integer> senority  = new ArrayList<Integer>();
    int tempYear1 = this.yearCame;
    int size = senority.size();
    senority.add(tempYear1);

    for(int index = 0; index < size; index++){
      if(tempYear1.compareTo(senority.get(index)) >= 1){
        senority.add(tempYear1);
        int secIndex = senority.get(index);
        int temp = tempYear1;
        tempYear1 = senority.get(index);
        secIndex = temp;
      }
      else if(tempYear1.compareTo(senority.get(index)) <= -1){
        senority.add(tempYear1);
      }
      else{
        senority.add(tempYear1);
      }
    }
  }

  /**
   * prints the information of the affiliate
   */
  public void print(){
    System.out.println("Name: "+ name +" , Age: "+ age +" , PhoneNumber: "+ phoneNumber +" , Year Came: "+ yearCame);
  }
  /**
   * main function
   * @param args [main function]
   */
  public static void main(String[] args) {
    //asking what selection they want to do
    Scanner kb = new Scanner(System.in);
    System.out.println("Choose one of the following: \n1) Create an "
    +"affiliate record\n2)Print information for an Affiliate given the id\n "
    +"3)List all affiliates in order of senority\n4)Delete a record given the "
    +"id\n5)Exit");
    int selection = kb.nextInt();
    //start selection 1 and ask questions for input
    if(selection == 1){
      Affiliate newAff = new Affiliate();

      System.out.println("Is it a Student, Faculty, or Staff: ");
      String m_sfs = kb.next(); //sfs meaning student, faculty, or staff

      if(m_sfs == "Student"){
        System.out.println("Enter the Student id: ");
        int m_sID = kb.nextInt();
        newAff.setStuID(m_sID);

        System.out.println("Enter the Major: ");
        String m_major = kb.next();
        newAff.setMajor(m_major);

        System.out.println("Enter the Minor: ");
        String m_minor = kb.next();
        newAff.setMinor(m_minor);

        System.out.println("Enter the Class Standing: ");
        String m_classStanding = kb.next();
        newAff.setClassStanding(m_classStanding);

        System.out.println("Is it a graduate or undergraduate: ");
        String m_gradOrUndergrad = kb.next();

        hmap.put(newAff.getStuID(), newAff);

        if(m_gradOrUndergrad == "graduate"){

          System.out.println("Enter the number of published papers: ");
          int m_numPaper = kb.nextInt();
          newAff.setPublishPaper(m_numPaper);

          System.out.println("Enter the thesis advisor: ");
          String m_thesisAdvisor = kb.next();
          newAff.setThesisAdvisor(m_thesisAdvisor);

        }
        else{
          System.out.println("Enter the number of courses taken: ");
          int m_numCoursesTaken = kb.nextInt();
          newAff.setCourseTaken(m_numCoursesTaken);

          System.out.println("Enter the scholarship amount: ");
          int m_scholarshipAmount = kb.nextInt();
          newAff.setScholarAmnt(m_scholarshipAmount);


        }
      }
      else if(m_sfs == "Faculty"){
        System.out.println("Enter the faculty id: ");
        int m_facID = kb.nextInt();
        newAff.setfacID(m_facID);

        System.out.println("Enter the department: ");
        String m_department = kb.next();
        newAff.setDepartment(m_department);

        System.out.println("Enter the Salary: ");
        int m_salary = kb.nextInt();
        newAff.setSalary(m_salary);

        System.out.println("Enter the number of papers: ");
        int m_numpaperf = kb.nextInt(); //meaning number of papers f (faculty)
        newAff.setNumOfPapers(m_numpaperf);

        hmap.put(newAff.getfacID(), newAff);

        System.out.println("Is it an assistant, associate, or full professor");
        String m_aafp = kb.next(); //meaning assistant, associate, or full professor
        if(m_aafp == "assistant"){
          System.out.println("Enter the number of years until tenure: ");
          int m_yearsUntilTenure = kb.nextInt();
          newAff.setYearUntilTenure(m_yearsUntilTenure);

        }
        else if(m_aafp == "associate"){
          System.out.println("Enter the number of years since tenure: ");
          int m_yearsSinceTenure = kb.nextInt();
          newAff.setYearSinceTenure(m_yearsSinceTenure);
        }
        else{
          System.out.println("Enter the number of years until retirement: ");
          int m_yearsUntilRetirement = kb.nextInt();
          newAff.setYearUntilRetirement(m_yearsUntilRetirement);
        }
      }
      else{
        System.out.println("Enter the staff id: ");
        int m_staffID = kb.nextInt();
        newAff.setStaffID(m_staffID);

        System.out.println("Enter the title: ");
        String m_title = kb.next();
        newAff.settitle(m_title);

        System.out.println("Enter the building they deal with: ");
        String m_building = kb.next();
        newAff.setBuilding(m_building);

        System.out.println("Is it full or part time");
        String m_fullOrPart = kb.next();
        if(m_fullOrPart == "full"){
          System.out.println("Enter the yearly salary: ");
          int m_yearlySalary = kb.nextInt();
          newAff.setYearlySalary(m_yearlySalary);
        }
        else{
          System.out.println("Enter the hourly salary: ");
          int m_hourlySalary = kb.nextInt();
          newAff.setHourlySalary(m_hourlySalary);
        }
      }

      System.out.println("Enter the name: ");
      String m_name = kb.next();
      newAff.setName(m_name);

      System.out.println("Enter the age: ");
      int m_age = kb.nextInt();
      newAff.setAge(m_age);

      System.out.println("Enter the phone number: ");
      int m_phoneNumber = kb.nextInt();
      newAff.setPhoneNumber(m_phoneNumber);

      System.out.println("Enter the year came: ");
      int m_yearCame = kb.nextInt();
      newAff.setYearCame(m_yearCame);


    }
    //start selection 2 and ask for input to display information
    else if(selection == 2){
      System.out.println("Type the id: ");
      int idNum = kb.nextInt();
      Object newinfo = hmap.get(idNum);
      System.out.println(Arrays.asList(hmap));
    }
    //start selection 3 and list all affiliates in order
    else if(selection == 3){
      Arrays.toString(senority.toArray());
    }
    //start selection 4 and remove the person
    else if(selection == 4){
      System.out.println("Type the id number you want to remove: ");
      int m_idRemove = kb.nextInt();
      hmap.remove(m_idRemove);
    }
    //start selection 5. end the program
    else{
      System.out.println("Good Bye!");
    }
  }
}
