package Demo;


/*import Demo.EnumLookupHelper;



import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;*/

public enum Gender
{
male("M") ,
female("F"),
other("T");

 public String vals;
 /*private static String name = Gender.class.getSimpleName();

 private static final Map<String, Gender> reverseLookupMap = new HashMap<String,Gender>();
*/
/* static {
     for (Gender promptValueType : EnumSet.allOf(Gender.class)) {
        reverseLookupMap.put(promptValueType.vals, promptValueType);
     }
  }
*/
 Gender(String vals) {
	this.vals = vals;
}

public String getVals() {
	return this.vals;
}
  
/*public static Gender getType (String vals) {
    return reverseLookupMap.get(vals);
 }
*/
/*public static Map<String, Gender> getType() {
	return type;
}
	 */
	   
	  /* public String getDescription () {
		      return EnumLookupHelper.getEnumLookupDescription(name, String.valueOf(this.vals));
		   }*/



      
}
