package building.other;

import main.Building;
import main.Resource_Type;

public class Altar_Archer_Queen extends Building {
	private final int[] upgradeCost  = {};
	private final int[] upgradeTime = {};
	private final int[] maxLevelAt = {};
	private final int[] maxQuantityAt = {};
	private final Resource_Type resourceType = Resource_Type.dark_elixir;
	
	public Altar_Archer_Queen() {
		setUpgradeCost(upgradeCost);
		setUpgradeTime(upgradeTime);
		setMaxLevelAt(maxLevelAt);
		setMaxQuantityAt(maxQuantityAt);
		setResourceType(resourceType);
	}
}
