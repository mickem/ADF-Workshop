package hr.sdo.bootcamp.model.views.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class SdoEmployeesViewSDOImpl extends SDODataObject implements SdoEmployeesViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 18;

   public SdoEmployeesViewSDOImpl() {}

   public java.math.BigDecimal getCommissionPct() {
      return getBigDecimal(START_PROPERTY_INDEX + 0);
   }

   public void setCommissionPct(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.Integer getDepartmentId() {
      return new Integer(getInt(START_PROPERTY_INDEX + 1));
   }

   public void setDepartmentId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getEmail() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setEmail(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.Integer getEmployeeId() {
      return new Integer(getInt(START_PROPERTY_INDEX + 3));
   }

   public void setEmployeeId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.String getFirstName() {
      return getString(START_PROPERTY_INDEX + 4);
   }

   public void setFirstName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.sql.Timestamp getHireDate() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 5);
   }

   public void setHireDate(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.String getJobId() {
      return getString(START_PROPERTY_INDEX + 6);
   }

   public void setJobId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.String getLastName() {
      return getString(START_PROPERTY_INDEX + 7);
   }

   public void setLastName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.Integer getManagerId() {
      return new Integer(getInt(START_PROPERTY_INDEX + 8));
   }

   public void setManagerId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getPhoneNumber() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setPhoneNumber(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.math.BigDecimal getSalary() {
      return getBigDecimal(START_PROPERTY_INDEX + 10);
   }

   public void setSalary(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getDepartmentName() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setDepartmentName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.Integer getDepartmentId1() {
      return new Integer(getInt(START_PROPERTY_INDEX + 12));
   }

   public void setDepartmentId1(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.lang.String getJobTitle() {
      return getString(START_PROPERTY_INDEX + 13);
   }

   public void setJobTitle(java.lang.String value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.lang.String getJobId1() {
      return getString(START_PROPERTY_INDEX + 14);
   }

   public void setJobId1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.lang.String getFirstName1() {
      return getString(START_PROPERTY_INDEX + 15);
   }

   public void setFirstName1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }

   public java.lang.String getLastName1() {
      return getString(START_PROPERTY_INDEX + 16);
   }

   public void setLastName1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 16 , value);
   }

   public java.lang.String getEmail1() {
      return getString(START_PROPERTY_INDEX + 17);
   }

   public void setEmail1(java.lang.String value) {
      set(START_PROPERTY_INDEX + 17 , value);
   }

   public java.lang.Integer getEmployeeId1() {
      return new Integer(getInt(START_PROPERTY_INDEX + 18));
   }

   public void setEmployeeId1(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 18 , value);
   }


}

