package configmgr;

public class Domains {

	private String id;
	
	private int highestVersion;
	
	private int synchDate;
	
	private boolean outOfSynch;
	
	private int quiesceTimeout;
	
	private String syncMode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getHighestVersion() {
		return highestVersion;
	}

	public void setHighestVersion(int highestVersion) {
		this.highestVersion = highestVersion;
	}

	public int getSynchDate() {
		return synchDate;
	}

	public void setSynchDate(int synchDate) {
		this.synchDate = synchDate;
	}

	public boolean isOutOfSynch() {
		return outOfSynch;
	}

	public void setOutOfSynch(boolean outOfSynch) {
		this.outOfSynch = outOfSynch;
	}

	public int getQuiesceTimeout() {
		return quiesceTimeout;
	}

	public void setQuiesceTimeout(int quiesceTimeout) {
		this.quiesceTimeout = quiesceTimeout;
	}

	public String getSyncMode() {
		return syncMode;
	}

	public void setSyncMode(String syncMode) {
		this.syncMode = syncMode;
	}
}
