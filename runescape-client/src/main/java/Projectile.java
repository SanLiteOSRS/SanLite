import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 19084173
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -850668143
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1024822263
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -650340219
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1797140989
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -860121869
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2048301599
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1203783373
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1173139343
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1485806481
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 803751093
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ao")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("ax")
	@Export("x")
	double x;
	@ObfuscatedName("ai")
	@Export("y")
	double y;
	@ObfuscatedName("ag")
	@Export("z")
	double z;
	@ObfuscatedName("ah")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("av")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ar")
	@Export("speed")
	double speed;
	@ObfuscatedName("am")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("as")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 650783873
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1585330521
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lha;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -693399445
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 723631841
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 20
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4; // L: 39
		this.sourceZ = var5; // L: 40
		this.cycleStart = var6; // L: 41
		this.cycleEnd = var7; // L: 42
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = ItemContainer.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = ItemContainer.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-335674854"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var7 * var7 + var5 * var5); // L: 57
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
			this.y = (double)this.startHeight * var7 / var9 + (double)this.sourceY; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - this.speedZ * var5) / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Lit;",
		garbageValue = "-112"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ItemContainer.SpotAnimationDefinition_get(this.id); // L: 101
		Model var2 = var1.getModel(this.frame); // L: 102
		if (var2 == null) { // L: 103
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1703494104"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += this.speedX * (double)var1; // L: 72
		this.y += this.speedY * (double)var1; // L: 73
		this.z += this.speedZ * (double)var1 + (double)var1 * 0.5D * this.accelerationZ * (double)var1; // L: 74
		this.speedZ += this.accelerationZ * (double)var1; // L: 75
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047; // L: 76
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047; // L: 77
		if (this.sequenceDefinition != null) { // L: 78
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 79
				this.frameCycle += var1; // L: 80

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 81
								return; // L: 98
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 82
							++this.frame; // L: 83
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 84

						this.frame -= this.sequenceDefinition.frameCount; // L: 85
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 86

					this.frame = 0;
				}
			} else {
				this.frame += var1; // L: 91
				int var2 = this.sequenceDefinition.method4135(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILsg;I)Lgx;",
		garbageValue = "-1162920359"
	)
	public static class179 method2116(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 24
		boolean var3 = (var2 & 1) != 0; // L: 25
		boolean var4 = (var2 & 2) != 0; // L: 26
		class179 var5 = new class179(var0); // L: 27
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) { // L: 28
			var6 = var1.readUnsignedByte(); // L: 29
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1899 != null && var7.length == var5.field1899.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) { // L: 34
				if (var7[var9] != 15) { // L: 35
					var10 = (short)var1.readUnsignedShort(); // L: 36
					if (var8) { // L: 37
						var5.field1899[var7[var9]] = var10; // L: 38
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1898 != null && var7.length == var5.field1898.length; // L: 48

			for (var9 = 0; var9 < 2; ++var9) { // L: 49
				if (var7[var9] != 15) { // L: 50
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1898[var7[var9]] = var10; // L: 53
					}
				}
			}
		}

		return var5; // L: 58
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-678191257"
	)
	static final int method2117() {
		return ViewportMouse.ViewportMouse_x; // L: 108
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-451145787"
	)
	static long method2111() {
		return Client.field613; // L: 2813
	}
}
