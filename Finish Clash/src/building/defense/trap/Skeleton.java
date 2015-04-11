package building.defense.trap;

import main.Building;
import main.Building_Trap;
import main.Resource_Type;

public class Skeleton extends Building implements Building_Trap {
	private final int[] upgradeCost  = {};
	private final int[] upgradeTime = {};
	private final int[] maxLevelAt = {};
	private final int[] maxQuantityAt = {};
	private final Resource_Type resourceType = Resource_Type.gold;
	private int reArmCost = 0;
	private final int[] reArmCostAt = {};
	private final Resource_Type reArmResourceType = Resource_Type.gold;
	
	public Skeleton() {
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
