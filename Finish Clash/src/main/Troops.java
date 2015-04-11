package main;

public interface Troops {
	public int getUpgradeCost(int level);
	public int getUpgradeCost(int startLevel, int endLevel);
	public int getMaxLevel();
	public int getMaxLevelAt(int townHall);
	public int getUpgradeTime(int level);
	public int getUpgradeTime(int startLevel, int endLevel);
	public int getBuildCost(int level);
	public int getBuildCost(int level, int quantity);
	public Resource_Type getResourceType();
}
