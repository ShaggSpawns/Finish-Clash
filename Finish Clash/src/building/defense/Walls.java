package building.defense;

import main.Building;
import main.Resource_Type;

public class Walls extends Building {
	private final int[] upgradeCost  = {200,1000,5000,10000,30000,75000,200000,500000,1000000,3000000,4000000};
	private final int[] upgradeTime = {0};
	private final int[] maxLevelAt = {0,2,3,4,5,6,7,8,10,11};
	private final int[] maxQuantityAt = {0,25,50,75,100,125,175,225,250,250};
	private final Resource_Type resourceType = Resource_Type.gold;
	
	public Walls() {
		setUpgradeCost(upgradeCost);
		setUpgradeTime(upgradeTime);
		setMaxLevelAt(maxLevelAt);
		setMaxQuantityAt(maxQuantityAt);
		setResourceType(resourceType);
	}
}
