/** AbstractStaff.java
 * Aaron Yeh
 * 002311707
 * aayeh@chapman.edu
 * cpsc 231-03
 * Assignment 9
 * Create a class named AbstractStaff that is an extention of affiliates
 */

public abstract class AbstractStaff extends Affiliates{
  //variables needed
  private int m_staffID;
  private String m_title;
  private String m_building;
  private int m_supervisor;
  private boolean m_fulltime;
  private int m_salary;

  //all of my setters and getters
  public void setStaffID(int staffID){
    m_staffID = staffID;
  }
  public int getStaffID(){
    return m_staffID;
  }

  public void setTitle(String title){
    m_title = title;
  }
  public String getTitle(){
    return m_title;
  }

  public void setBuilding(String building){
    m_building = building;
  }
  public String getBuilding(){
    return m_building;
  }

  public void setSalary(int salary){
    m_salary = salary;
  }

  public int getSalary(){
    return m_salary;
  }

  public void setSupervisor(int supervisor){
    m_supervisor = supervisor;
  }

  public int getSupervisor(){
    return m_supervisor;
  }

  public void setFullTime(boolean fulltime){
    m_fulltime = fulltime;
  }

  public boolean getFullTime(){
    return m_fulltime;
  }
  /**
   * prints the information of the staff member
   */
  public void print(){
    System.out.println("Staff id: " + staffID + " , Title: " + title +
    " , Building: " + building);
  }
}
