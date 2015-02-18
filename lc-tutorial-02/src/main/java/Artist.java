

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties (ignoreUnknown = true)

public
class
Artist {private int birthYear;
@JsonProperty("fc")
private String fullName;
private String gender;
private int totalWorks;
private int id;


public String toString() {
String artistAsString ="Name: "+fullName
+ "\nBorn: " + birthYear + "\nGender: " + gender + "\nTotal Works: " + totalWorks + "\n ID:" + id;
	

return
artistAsString
;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getTotalWorks() {
	return totalWorks;
}

public void setTotalWorks(int totalWorks) {
	this.totalWorks = totalWorks;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public int getBirthYear() {
return birthYear
;
}
public void setBirthYear(
int birthYear
) 
{
this.birthYear=birthYear;
}

public String getFullName() {
return fullName;
}
public void setFullName(String fullName) {
this.fullName=fullName;
}
}
