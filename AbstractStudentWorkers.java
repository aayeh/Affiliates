/** AbstractStudentWorkers.java
 * Aaron Yeh
 * 002311707
 * aayeh@chapman.edu
 * cpsc 231-03
 * Assignment 9
 * Create a class named AbstractStudentWorkers that is an extention of AbstractStaff
 */

public class AbstractStudentWorkers extends AbstractStaff{
  String m_major;
  boolean m_workStudy;

  //getters and setters
  public void setMajor(String major){
    m_major = major;
  }

  public String getMajor(){
    return m_major
  }

  public void setWorkStudy(boolean workStudy){
    m_workStudy = workStudy;
  }

  public boolean getWorkStudy(){
    return m_workStudy;
  }
}
