package hr.sdo.bootcamp.model.views.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class SdoDepartmentsViewSDOImpl extends SDODataObject implements SdoDepartmentsViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 8;

   public SdoDepartmentsViewSDOImpl() {}

   public java.lang.Integer getDepartmentId() {
      return new Integer(getInt(START_PROPERTY_INDEX + 0));
   }

   public void setDepartmentId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getDepartmentName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setDepartmentName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.Integer getLocationId() {
      return new Integer(getInt(START_PROPERTY_INDEX + 2));
   }

   public void setLocationId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.lang.Integer getManagerId() {
      return new Integer(getInt(START_PROPERTY_INDEX + 3));
   }

   public void setManagerId(java.lang.Integer value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.lang.Long getTotalSallary() {
      return getLong(START_PROPERTY_INDEX + 4);
   }

   public void setTotalSallary(java.lang.Long value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.Long getEmployeeCount() {
      return getLong(START_PROPERTY_INDEX + 5);
   }

   public void setEmployeeCount(java.lang.Long value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.lang.Long getMaxSalary() {
      return getLong(START_PROPERTY_INDEX + 6);
   }

   public void setMaxSalary(java.lang.Long value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.lang.Long getMinSalary() {
      return getLong(START_PROPERTY_INDEX + 7);
   }

   public void setMinSalary(java.lang.Long value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.util.List getSdoEmployeesView() {
      return getList(START_PROPERTY_INDEX + 8);
   }

   public void setSdoEmployeesView(java.util.List value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }


}

