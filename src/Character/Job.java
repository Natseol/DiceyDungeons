package Character;

public class Job extends Player {	
	String[] jobList = {"전사","도적"};
	String job;	
	
	public String getJob() {
		return job;
	}
	
	public void setJob(int index) {
		job = jobList[index];
	}
}
