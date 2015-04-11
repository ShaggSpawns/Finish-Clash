package building.defense;

import main.Building;
import main.Resource_Type;

public class Archer_Tower extends Building {
	private final int[] upgradeCost  = {1000,2000,5000,20000,80000,180000,360000,720000,1500000,2500000,4500000,6500000,7500000};
	private final int[] upgradeTime = {15,30,45,240,720,1440,2880,4320,5760,7200,8640,11080,11520};
	private final int[] maxLevelAt = {0,2,3,4,5,6,7,10,11,13};
	private final int[] maxQuantityAt = {0,1,1,2,3,3,4,5,6,7};
	private final Resource_Type resourceType = Resource_Type.gold;
	
	public Archer_Tower() {
		setUpgradeCost(upgradeCost);
		setUpgradeTime(upgradeTime);
		setMaxLevelAt(maxLevelAt);
		setMaxQuantityAt(maxQuantityAt);
		setResourceType(resourceType);
	}
}
