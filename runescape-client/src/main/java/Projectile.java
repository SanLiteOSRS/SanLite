import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ji")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	static Widget field1039;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -21466483
	)
	@Export("id")
	int id;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1714458595
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1769020129
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1326029017
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1321727169
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1233167489
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1994273251
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -818433303
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -502302855
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1531548715
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 274415859
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("x")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("k")
	@Export("x")
	double x;
	@ObfuscatedName("r")
	@Export("y")
	double y;
	@ObfuscatedName("p")
	@Export("z")
	double z;
	@ObfuscatedName("a")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("e")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("d")
	@Export("speed")
	double speed;
	@ObfuscatedName("u")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("m")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -631589541
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -2003697543
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 1278263155
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 2141182287
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false;
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
		this.plane = var2;
		this.sourceX = var3;
		this.sourceY = var4;
		this.sourceZ = var5;
		this.cycleStart = var6;
		this.cycleEnd = var7;
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = Friend.SpotAnimationDefinition_get(this.id).sequence;
		if (var12 != -1) {
			this.sequenceDefinition = Player.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-228325121"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			this.x = var5 * (double)this.startHeight / var9 + (double)this.sourceX;
			this.y = (double)this.startHeight * var7 / var9 + (double)this.sourceY;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - this.speedZ * var5) / (var5 * var5);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lgj;",
		garbageValue = "-220627570"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Friend.SpotAnimationDefinition_get(this.id);
		Model var2 = var1.getModel(this.frame);
		if (var2 == null) {
			return null;
		} else {
			var2.rotateZ(this.pitch);
			return var2;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "982624616"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true;
		this.x += (double)var1 * this.speedX;
		this.y += this.speedY * (double)var1;
		this.z += (double)var1 * (double)var1 * 0.5D * this.accelerationZ + (double)var1 * this.speedZ;
		this.speedZ += (double)var1 * this.accelerationZ;
		this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949D) + 1024 & 2047;
		this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949D) & 2047;
		if (this.sequenceDefinition != null) {
			this.frameCycle += var1;

			while (true) {
				do {
					do {
						if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
							return;
						}

						this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
						++this.frame;
					} while(this.frame < this.sequenceDefinition.frameIds.length);

					this.frame -= this.sequenceDefinition.frameCount;
				} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

				this.frame = 0;
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "7028"
	)
	static void method1996() {
		Players.Players_count = 0;

		for (int var0 = 0; var0 < 2048; ++var0) {
			Players.field1346[var0] = null;
			Players.field1345[var0] = 1;
		}

	}
}
