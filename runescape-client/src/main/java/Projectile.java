import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "Lds;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 595172913
	)
	@Export("id")
	int id;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -5998967
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 690031167
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 283085205
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 608529881
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -631008697
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -887941297
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1493959093
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -564297443
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -1973645943
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1207313733
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("s")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("p")
	@Export("x")
	double x;
	@ObfuscatedName("b")
	@Export("y")
	double y;
	@ObfuscatedName("o")
	@Export("z")
	double z;
	@ObfuscatedName("u")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("z")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("t")
	@Export("speed")
	double speed;
	@ObfuscatedName("w")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("m")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1240153
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 154218097
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -1988816403
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1177008613
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 20
		this.frame = 0; // L: 32
		this.frameCycle = 0; // L: 33
		this.id = var1; // L: 36
		this.plane = var2; // L: 37
		this.sourceX = var3; // L: 38
		this.sourceY = var4; // L: 39
		this.sourceZ = var5; // L: 40
		this.cycleStart = var6; // L: 41
		this.cycleEnd = var7; // L: 42
		this.slope = var8; // L: 43
		this.startHeight = var9; // L: 44
		this.targetIndex = var10; // L: 45
		this.endHeight = var11; // L: 46
		this.isMoving = false; // L: 47
		int var12 = ReflectionCheck.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = WorldMapElement.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2016917672"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var7 * var7 + var5 * var5); // L: 57
			this.x = (double)this.sourceX + var5 * (double)this.startHeight / var9; // L: 58
			this.y = var7 * (double)this.startHeight / var9 + (double)this.sourceY; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)var3 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Lha;",
		garbageValue = "-157507070"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = ReflectionCheck.SpotAnimationDefinition_get(this.id); // L: 101
		Model var2 = var1.getModel(this.frame); // L: 102
		if (var2 == null) { // L: 103
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2128904402"
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
				int var2 = this.sequenceDefinition.method3876(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "258452239"
	)
	static final void method2096() {
		for (PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8053 8054 8060
			if (var0.hitpoints == -1) { // L: 8055
				var0.delay = 0; // L: 8056
				EnumComposition.method3528(var0); // L: 8057
			} else {
				var0.remove(); // L: 8059
			}
		}

	} // L: 8062
}
