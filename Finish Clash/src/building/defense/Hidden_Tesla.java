package building.defense;

import main.Building;
import main.Resource_Type;

public class Hidden_Tesla extends Building {
	private final int[] upgradeCost  = {1000000,1250000,1500000,2000000,2500000,3000000,5000000};
	private final int[] upgradeTime = {1440,4320,7200,8640,11520,14400,17280,20160};
	private final int[] maxLevelAt = {0,0,0,0,0,0,3,6,7,8};
	private final int[] maxQuantityAt = {0,0,0,0,0,0,2,3,4,4};
	private final Resource_Type resourceType = Resource_Type.gold;
	
	public Hidden_Tesla() {
		setUpgradeCost(upgradeCost);
		setUpgradeTime(upgradeTime);
		setMaxLevelAt(maxLevelAt);
		setMaxQuantityAt(maxQuantityAt);
		setResourceType(resourceType);
	}
}
