package building.defense;

import main.Building;
import main.Resource_Type;

public class Wizard_Tower extends Building {
	private final int[] upgradeCost  = {180000,360000,720000,1280000,1960000,2680000,5360000,6480000};
	private final int[] upgradeTime = {720,1440,2880,4320,5760,7200,10080,14400};
	private final int[] maxLevelAt = {0,0,0,0,2,3,4,6,7,8};
	private final int[] maxQuantityAt = {0,0,0,0,1,2,2,3,4,4};
	private final Resource_Type resourceType = Resource_Type.gold;
	
	public Wizard_Tower() {
		setUpgradeCost(upgradeCost);
		setUpgradeTime(upgradeTime);
		setMaxLevelAt(maxLevelAt);
		setMaxQuantityAt(maxQuantityAt);
		setResourceType(resourceType);
	}
}
