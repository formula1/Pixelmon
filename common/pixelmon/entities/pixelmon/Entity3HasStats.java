package pixelmon.entities.pixelmon;

import java.util.ArrayList;

import pixelmon.RandomHelper;
import pixelmon.database.BaseStats;
import pixelmon.database.DatabaseStats;
import pixelmon.database.PixelmonIVStore;
import pixelmon.database.Stats;
import pixelmon.entities.pixelmon.helpers.*;
import pixelmon.enums.EnumType;
import net.minecraft.src.ModelBase;
import net.minecraft.src.NBTTagCompound;
import net.minecraft.src.World;

public abstract class Entity3HasStats extends Entity2HasModel {

	private LevelHelper level;
	public Stats stats;
	public BaseStats baseStats;
	public ArrayList<EnumType> type = new ArrayList<EnumType>();
	public boolean doesHover = false;
	public float hoverHeight =0f;
	protected float length;
	public Entity3HasStats(World par1World) {
		super(par1World);
		stats = new Stats();
		level = new LevelHelper((EntityPixelmon)this);
		dataWatcher.addObject(18, ""); //LvlString
		setSize(baseStats.Width, baseStats.Height + hoverHeight);
		length = baseStats.Length;
	}
	
	@Override
	protected void init(String name) {
		super.init(name);
		baseStats = DatabaseStats.GetBaseStats(name);
		stats.IVs = PixelmonIVStore.CreateNewIVs();
		type.add(baseStats.Type1);
		if (baseStats.Type2 != EnumType.Mystery)
			type.add(baseStats.Type2);
		
		if (rand.nextInt(100) < baseStats.MalePercent)
			isMale = true;
		else
			isMale = false;
	}
	
	@Override
	public void setPosition(double par1, double par3, double par5) {
		this.posX = par1;
		this.posY = par3;
		this.posZ = par5;
		float halfWidth = this.width / 2.0F;
		float halfLength = this.length / 2.0F;
		if (baseStats != null)
			this.boundingBox.setBounds(par1 - (double) halfWidth, par3 - (double) this.yOffset + (double) this.ySize, par5 - (double) halfLength, par1 + (double) halfWidth, par3
					- (double) this.yOffset + (double) this.ySize + (double) height + hoverHeight, par5 + (double) halfLength);
		else
			this.boundingBox.setBounds(par1 - (double) halfWidth, par3 - (double) this.yOffset + (double) this.ySize, par5 - (double) halfLength, par1 + (double) halfWidth, par3
					- (double) this.yOffset + (double) this.ySize + (double) height, par5 + (double) halfLength);
	}
	
	public void updateStats() {
		stats.setLevelStats(baseStats, level.getLevel());
	}
		
	@Override
	public void onUpdate() {
		super.onUpdate();
	}

	public LevelHelper getLvl() {
		if (level == null) {
			level = new LevelHelper((EntityPixelmon)this);
			level.setLevel(RandomHelper.getRandomNumberBetween(baseStats.SpawnLevel, baseStats.SpawnLevel + baseStats.SpawnLevelRange));
			setEntityHealth(stats.HP);
		}
		return level;
	}
	
	public void setLvlString(String string) {
		dataWatcher.updateObject(18, string);
	}

	public String getLvlString() {
		return dataWatcher.getWatchableObjectString(18);
	}
	
	@Override
	public void writeEntityToNBT(NBTTagCompound nbt) {
		super.writeEntityToNBT(nbt);
		stats.writeToNBT(nbt);
		level.writeToNBT(nbt);
	}
	
	@Override
	public void readEntityFromNBT(NBTTagCompound nbt) {
		super.readEntityFromNBT(nbt);
		stats.readFromNBT(nbt);
		level.readFromNBT(nbt);
	}
}
