package building.defense;

import main.Building;
import main.Resource_Type;

public class Mortar extends Building {
	private final int[] upgradeCost  = {8000,32000,120000,400000,800000,1600000,3200000,6400000};
	private final int[] upgradeTime = {480,720,1440,2880,6760,7200,11080,14400};
	private final int[] maxLevelAt = {0,0,1,2,3,3,4,5,6,6};
	private final int[] maxQuantityAt = {0,0,1,1,1,2,3,4,4,4};
	private final Resource_Type resourceType = Resource_Type.gold;
	
	public Mortar() {
		setUpgradeCost(upgradeCost);
		setUpgradeTime(upgradeTime);
		setMaxLevelAt(maxLevelAt);
		setMaxQuantityAt(maxQuantityAt);
		setResourceType(resourceType);
	}
}
