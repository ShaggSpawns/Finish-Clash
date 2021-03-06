package building.defense;

import main.Building;
import main.Building_Trap;
import main.Resource_Type;

public class X_Bow extends Building implements Building_Trap {
	private final int[] upgradeCost  = {3000000,5000000,7000000,8000000};
	private final int[] upgradeTime = {10080,14400,20160,20160};
	private final int[] maxLevelAt = {0,0,0,0,0,0,0,0,2,3};
	private final int[] maxQuantityAt = {0,0,0,0,0,0,0,0,3,4};
	private final Resource_Type resourceType = Resource_Type.gold;
	private int reArmCost = 0;
	private final int[] reArmCostAt = {};
	private final Resource_Type reArmResourceType = Resource_Type.elixir;
	
	public X_Bow() {
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
