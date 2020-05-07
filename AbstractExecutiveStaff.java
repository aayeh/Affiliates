/** AbstractExecutiveStaff.java
 * Aaron Yeh
 * 002311707
 * aayeh@chapman.edu
 * cpsc 231-03
 * Assignment 9
 * Create a class named AbstractExecutiveStaff that is an extention of AbstractStaff
 */

public class AbstractExecutiveStaff extends AbstractStaff{
  private String m_parkingSpace;
  private String m_rank;

  //setters and getters
  public void setParkingSpace(String parkingSpace){
    m_parkingSpace = parkingSpace;
  }

  public String getParkingSpace(){
    return m_parkingSpace;
  }

  public void setRank(String rank){
    m_rank = rank;
  }

  public String setRank(){
    return m_rank;
  }
}
