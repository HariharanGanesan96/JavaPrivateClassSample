package Player;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class PlayerClass {
    private String name,skill,nationality;
    private Date dateOfBirth;
    private int numberOfMatches,Runs,Wickets;
    private double powerRating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	public int getRuns() {
		return Runs;
	}
	public void setRuns(int runs) {
		Runs = runs;
	}
	public int getWickets() {
		return Wickets;
	}
	public void setWickets(int wickets) {
		Wickets = wickets;
	}
	public double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}
	public PlayerClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlayerClass(String name, Date dateOfBirth,String skill, int numberOfMatches,int runs,int wickets, String nationality,
			 double powerRating) {
		super();
		this.name = name;
		this.skill = skill;
		this.nationality = nationality;
		this.dateOfBirth = dateOfBirth;
		this.numberOfMatches = numberOfMatches;
		Runs = runs;
		Wickets = wickets;
		this.powerRating = powerRating;
	}
	@Override
	public String toString() {
		SimpleDateFormat formet=new SimpleDateFormat("dd-MM-yyyy");
		formet.format(dateOfBirth);
		return "name=" + name +
				"\ndateOfBirth="+ dateOfBirth +
				"\nskill=" + skill +	
				"\nnumberOfMatches=" + numberOfMatches +
				"\nRuns=" + Runs +
				"\nWickets=" + Wickets+
				"\nnationality=" + nationality +
				"\npowerRating=" + powerRating;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Runs, Wickets, dateOfBirth, name, nationality, numberOfMatches, powerRating, skill);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayerClass other = (PlayerClass) obj;
		return Runs == other.Runs && Wickets == other.Wickets && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Objects.equals(name, other.name) && Objects.equals(nationality, other.nationality)
				&& numberOfMatches == other.numberOfMatches
				&& Double.doubleToLongBits(powerRating) == Double.doubleToLongBits(other.powerRating)
				&& Objects.equals(skill, other.skill);
	}
    
	
}
