package building.other;

import main.Building;
import main.Resource_Type;

public class Town_Hall extends Building {
	private final int[] upgradeCost  = {};
	private final int[] upgradeTime = {};
	private final int[] maxLevelAt = {1,2,3,4,5,6,7,8,9,10};
	private final int[] maxQuantityAt = {1,1,1,1,1,1,1,1,1,1};
	private final Resource_Type resourceType = Resource_Type.gold;
	
	public Town_Hall() {
		setUpgradeCost(upgradeCost);
		setUpgradeTime(upgradeTime);
		setMaxLevelAt(maxLevelAt);
		setMaxQuantityAt(maxQuantityAt);
		setResourceType(resourceType);
	}
}
