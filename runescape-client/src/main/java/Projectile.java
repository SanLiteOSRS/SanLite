import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -549374795
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1311387965
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1087687777
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1807665337
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1307089547
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -171002147
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1921111453
	)
	int field978;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 31638363
	)
	int field979;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1267075461
	)
	int field980;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1420572405
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 855194403
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1543991229
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 48542785
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1710661901
	)
	int field988;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -731923483
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ab")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("ag")
	@Export("x")
	double x;
	@ObfuscatedName("am")
	@Export("y")
	double y;
	@ObfuscatedName("ax")
	@Export("z")
	double z;
	@ObfuscatedName("ah")
	double field991;
	@ObfuscatedName("as")
	double field992;
	@ObfuscatedName("ay")
	double field993;
	@ObfuscatedName("aj")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("av")
	double field984;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -556808089
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -600416715
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1245655713
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 832169
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 24
		this.frame = 0; // L: 36
		this.frameCycle = 0;
		this.id = var1; // L: 40
		this.plane = var2; // L: 41
		this.sourceX = var3; // L: 42
		this.sourceY = var4; // L: 43
		this.sourceZ = var5; // L: 44
		this.cycleStart = var6; // L: 45
		this.cycleEnd = var7; // L: 46
		this.slope = var8; // L: 47
		this.startHeight = var9; // L: 48
		this.targetIndex = var10; // L: 49
		this.endHeight = var11; // L: 50
		this.isMoving = false; // L: 51
		int var12 = StructComposition.SpotAnimationDefinition_get(this.id).sequence; // L: 52
		if (var12 != -1) { // L: 53
			this.sequenceDefinition = EnumComposition.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 54
		}

	} // L: 55

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12); // L: 58
		this.field988 = var10; // L: 59
	} // L: 60

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-912424366"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field978 = var1; // L: 63
		this.field979 = var2; // L: 64
		this.field980 = var3; // L: 65
		double var5;
		if (!this.isMoving) { // L: 66
			var5 = (double)(this.field978 - this.sourceX); // L: 67
			double var7 = (double)(this.field979 - this.sourceY); // L: 68
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 69
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9; // L: 70
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9; // L: 71
			this.z = (double)this.sourceZ; // L: 72
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 74
		this.field991 = ((double)this.field978 - this.x) / var5; // L: 75
		this.field992 = ((double)this.field979 - this.y) / var5; // L: 76
		this.field993 = Math.sqrt(this.field992 * this.field992 + this.field991 * this.field991); // L: 77
		if (!this.isMoving) { // L: 78
			this.speedZ = -this.field993 * Math.tan((double)this.slope * 0.02454369D);
		}

		this.field984 = ((double)this.field980 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5); // L: 79
	} // L: 80

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljr;",
		garbageValue = "798227647"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = StructComposition.SpotAnimationDefinition_get(this.id); // L: 113
		Model var2 = var1.getModel(this.frame); // L: 114
		if (var2 == null) { // L: 115
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 116
			return var2; // L: 117
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "30"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 83
		this.x += this.field991 * (double)var1; // L: 84
		this.y += (double)var1 * this.field992; // L: 85
		this.z += 0.5D * this.field984 * (double)var1 * (double)var1 + (double)var1 * this.speedZ; // L: 86
		this.speedZ += this.field984 * (double)var1; // L: 87
		this.yaw = (int)(Math.atan2(this.field991, this.field992) * 325.949D) + 1024 & 2047; // L: 88
		this.pitch = (int)(Math.atan2(this.speedZ, this.field993) * 325.949D) & 2047; // L: 89
		if (this.sequenceDefinition != null) { // L: 90
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 91
				this.frameCycle += var1; // L: 92

				while (true) {
					do {
						do {
							if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) { // L: 93
								return; // L: 110
							}

							this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 94
							++this.frame; // L: 95
						} while(this.frame < this.sequenceDefinition.frameIds.length); // L: 96

						this.frame -= this.sequenceDefinition.frameCount; // L: 97
					} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length); // L: 98

					this.frame = 0;
				}
			} else {
				this.frame += var1; // L: 103
				int var2 = this.sequenceDefinition.method4034(); // L: 104
				if (this.frame >= var2) { // L: 105
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 106
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "992783271"
	)
	public static int method2147(int var0) {
		return class303.field3386[var0]; // L: 37
	}
}
