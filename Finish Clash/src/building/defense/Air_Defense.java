package building.defense;

import main.Building;
import main.Resource_Type;

public class Air_Defense extends Building {
	private final int[] upgradeCost  = {22500,90000,270000,540000,1080000,2160000,4320000,7560000};
	private final int[] upgradeTime = {300,1440,4320,5760,7200,8640,11520,14400,17280};
	private final int[] maxLevelAt = {0,0,0,2,3,4,5,6,7,8};
	private final int[] maxQuantityAt = {0,0,0,1,1,1,2,3,4,4};
	private final Resource_Type resourceType = Resource_Type.gold;
	
	public Air_Defense() {
		setUpgradeCost(upgradeCost);
		setUpgradeTime(upgradeTime);
		setMaxLevelAt(maxLevelAt);
		setMaxQuantityAt(maxQuantityAt);
		setResourceType(resourceType);
	}
}
