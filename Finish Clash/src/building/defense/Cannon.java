package building.defense;

import main.Building;
import main.Resource_Type;

public class Cannon extends Building {	
	private final int[] upgradeCost  = {250,1000,4000,16000,50000,100000,200000,400000,800000,1600000,3200000,6400000,7500000};
	private final int[] upgradeTime = {1,15,45,120,360,720,1440,2880,4320,5760,7200,8640,11080};
	private final int[] maxLevelAt = {2,3,4,5,6,7,8,10,11,13};
	private final int[] maxQuantityAt = {2,2,2,2,3,3,5,5,5,6};
	private final Resource_Type resourceType = Resource_Type.gold;
	
	public Cannon() {
		setUpgradeCost(upgradeCost);
		setUpgradeTime(upgradeTime);
		setMaxLevelAt(maxLevelAt);
		setMaxQuantityAt(maxQuantityAt);
		setResourceType(resourceType);
	}
}