/** AbstractAcademicStaff.java
 * Aaron Yeh
 * 002311707
 * aayeh@chapman.edu
 * cpsc 231-03
 * Assignment 9
 * Create a class named AbstractAcademicStaff that is an extention of AbstractStaff
 */

 public class AbstractAcademicStaff extends AbstractStaff{
   private String m_academicUnit;
   private int m_payGrade;

   //getters and setters
   public void setAcademicUnit(String academicUnit){
     m_academicUnit = academicUnit;
   }

   public String getAcademicUnit(){
     return m_academicUnit;
   }

   public void setPayGrade(int payGrade){
     m_payGrade = payGrade;
   }

   public int getPayGrade(){
     return m_payGrade;
   }
 }
