package hr.sdo.bootcamp.model.views.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class SdoJobsViewSDOImpl extends SDODataObject implements SdoJobsViewSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 1;

   public SdoJobsViewSDOImpl() {}

   public java.lang.String getJobTitle() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setJobTitle(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getJobId() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setJobId(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }


}

