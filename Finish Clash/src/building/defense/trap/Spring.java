package building.defense.trap;

import main.Building;
import main.Building_Trap;
import main.Resource_Type;

public class Spring extends Building implements Building_Trap {
	private final int[] upgradeCost  = {0,0,0,0,0,0,0,0,0,0};
	private final int[] upgradeTime = {0,0,0,0,0,0,0,0,0,0};
	private final int[] maxLevelAt = {1,1,1,1,1,1,1,1,1,1};
	private final int[] maxQuantityAt = {};
	private final Resource_Type resourceType = Resource_Type.gold;
	private int reArmCost = 0;
	private final int[] reArmCostAt = {};
	private final Resource_Type reArmResourceType = Resource_Type.gold;
	
	public Spring() {
		setUpgradeCost(upgradeCost);
		setUpgradeTime(upgradeTime);
		setMaxLevelAt(maxLevelAt);
		setMaxQuantityAt(maxQuantityAt);
		setResourceType(resourceType);
	}
	
	@Override
	public int getReArmCost() {
		return reArmCost;
	}

	@Override
	public int getReArmCostAt(int level) {
		return reArmCostAt[level - 1];
	}
	@Override
	public Resource_Type getReArmResourceType() {
		return reArmResourceType;
	}
}
