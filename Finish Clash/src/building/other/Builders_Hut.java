package building.other;

import main.Building;
import main.Resource_Type;

public class Builders_Hut extends Building {
	private final int[] upgradeCost  = {};
	private final int[] upgradeTime = {0};
	private final int[] maxLevelAt = {1,1,1,1,1,1,1,1,1,1};
	private final int[] maxQuantityAt = {5,5,5,5,5,5,5,5,5,5};
	private final Resource_Type resourceType = Resource_Type.gem;
	
	public Builders_Hut() {
		setUpgradeCost(upgradeCost);
		setUpgradeTime(upgradeTime);
		setMaxLevelAt(maxLevelAt);
		setMaxQuantityAt(maxQuantityAt);
		setResourceType(resourceType);
	}
}
