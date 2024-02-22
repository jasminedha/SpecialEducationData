import java.util.ArrayList;

import core.data.*;

public class SpecialEducationData {
   public static void main(String[] args) {
      String county = "Alameda";
      DataSource ds = DataSource.connect("https://dq.cde.ca.gov/dataquest/" + county + ".xml"); 
      ds.setCacheTimeout(15 * 60);  
      ds.load();
      //ds.printUsageString();
      
      float enrollment = ds.fetchFloat("Special Education Enrollment");
String regularClass80 = ds.fetchString("Regular Class 80 Percent or More of the Day");
String regularClass40To79 = ds.fetchString("Regular Class 40 to 79 Percent of the Day");
String regularClass39OrLess = ds.fetchString("Regular Class 39 Percent or Less of the Day");
String separateSchoolAndOtherSettings = ds.fetchString("Separate School & Other Settings");
String preschoolSetting = ds.fetchString("Preschool Setting");

countyDataList.add(new CountyData(county, enrollment, regularClass80,
regularClass40To79, regularClass39OrLess, separateSchoolAndOtherSettings, preschoolSetting));

System.out.println("Special Education Enrollment: " + enrollment);
System.out.println("Regular Class 80 Percent or More of the Day: " + regularClass80);
System.out.println("Regular Class 40 to 79 Percent of the Day: " + regularClass40To79);
System.out.println("Regular Class 39 Percent or Less of the Day: " + regularClass39OrLess);
System.out.println("Separate School & Other Settings: " + separateSchoolAndOtherSettings);
System.out.println("Preschool Setting: " + preschoolSetting);

   }
}
