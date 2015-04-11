package building.other;

import main.Building;
import main.Resource_Type;

public class Clan_Castle extends Building {
	private final int[] upgradeCost  = {};
	private final int[] upgradeTime = {};
	private final int[] maxLevelAt = {};
	private final int[] maxQuantityAt = {};
	private final Resource_Type resourceType = Resource_Type.gold;
	
	public Clan_Castle() {
		setUpgradeCost(upgradeCost);
		setUpgradeTime(upgradeTime);
		setMaxLevelAt(maxLevelAt);
		setMaxQuantityAt(maxQuantityAt);
		setResourceType(resourceType);
	}
}
