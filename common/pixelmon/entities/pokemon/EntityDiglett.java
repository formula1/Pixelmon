package pixelmon.entities.pokemon;

import pixelmon.entities.pixelmon.EntityPixelmon;
import net.minecraft.src.*;

public class EntityDiglett extends EntityPixelmon {

	public EntityDiglett(World world) {
		super(world);
		init();
	}

	public void init() {
		super.init("Diglett");
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
		if (lastTickPosX - posX != 0 || lastTickPosZ - posZ != 0) {
			int i = MathHelper.floor_double(posX);
			int j = MathHelper.floor_double(posY - 0.20000000298023224D - (double) yOffset);
			int k = MathHelper.floor_double(posZ);
			int j1 = worldObj.getBlockId(i, j, k);
			if (j1 > 0) {
				worldObj.spawnParticle((new StringBuilder()).append("tilecrack_").append(j1).toString(), posX + ((double) rand.nextFloat() - 0.5D) * (double) width,
						boundingBox.minY + 0.10000000000000001D, posZ + ((double) rand.nextFloat() - 0.5D) * (double) width, -motionX * 4D, 1.5D, -motionZ * 4D);
			}
		}

	}

	public boolean getCanSpawnHere() {
		int var1 = MathHelper.floor_double(this.posX);
		int var2 = MathHelper.floor_double(this.boundingBox.minY);
		int var3 = MathHelper.floor_double(this.posZ);
		return this.worldObj.getBlockId(var1, var2 - 1, var3) == Block.sand.blockID;
	}
}
