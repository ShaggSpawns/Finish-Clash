package main;

public abstract class Building {
	private int[] upgradeCost;
	private int[] upgradeTime;
	private int maxLevel;
	private int[] maxLevelAt;
	private int maxQuantity;
	private int[] maxQuantityAt;
	private Resource_Type resourceType;

	// Upgrade Cost
	public void setUpgradeCost(int[] upgradeCost) {
		this.upgradeCost = upgradeCost;
	}
	public int getUpgradeCost(int level) {
		return upgradeCost[level - 1];
	}
	public int getUpgradeCost(int startLevel, int endLevel) {
		int newCost = 0;
		if (startLevel > endLevel)
			return -1;
		for (int i = startLevel; i < endLevel; i++)
			newCost += upgradeCost[i - 1];
		return newCost;
	}
	
	// Upgrade Time
	public void setUpgradeTime(int[] upgradeTime) {
		
		if (upgradeTime[0] == 0 && upgradeTime.length == 1 && !this.upgradeCost.equals(null))
			for (int i = 0; i < upgradeCost.length; i++)
				this.upgradeTime[i] = 0;
		else
			this.upgradeTime = upgradeTime;
	}
	public int getUpgradeTime(int level) {
		return upgradeTime[level - 1];
	}
	public int getUpgradeTime(int startLevel, int endLevel) {
		int newTime = 0;
		if (startLevel > endLevel)
			return -1;
		for (int i = startLevel; i < endLevel; i++)
			newTime += upgradeTime[i - 1];
		return newTime;
	}

	// Max Level
	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}
	public int getMaxLevel() {
		return maxLevel;
	}
	
	// Max Level At [Town Hall]
	public void setMaxLevelAt(int[] maxLevelAt) {
		this.maxLevelAt = maxLevelAt;
		setMaxLevel(maxLevelAt[maxLevelAt.length - 1]);
	}
	public int getMaxLevelAt(int townHall) {
		if (maxLevelAt.length == 1)
			return maxLevel;
		else
			return maxLevelAt[townHall - 1];
	}
	
	// Max Quantity
	public void setMaxQuantity(int maxQuantity) {
		this.maxQuantity = maxQuantity;
	}
	public int getMaxQuantity() {
		return maxQuantity;
	}
	
	// Max Quantity At [Town Hall]
	public void setMaxQuantityAt(int[] maxQuantityAt) {
		this.maxQuantityAt = maxQuantityAt;
		setMaxQuantity(maxQuantityAt[maxQuantityAt.length - 1]);
	}
	public int getMaxQuantityAt(int townHall) {
		return maxQuantityAt[townHall - 1];
	}

	// Resource Type
	public void setResourceType(Resource_Type resourceType) {
		this.resourceType = resourceType;
	}
	public Resource_Type getResourceType() {
		return resourceType;
	}
}
