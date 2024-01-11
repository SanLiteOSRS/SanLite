import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cx")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 700528583
	)
	@Export("id")
	int id;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -761584125
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -838146967
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 943535563
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -851542771
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -103232621
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -379262501
	)
	int field960;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1036585231
	)
	int field953;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1418066721
	)
	int field954;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 46659225
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -439806533
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1822804607
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -649327269
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1211752233
	)
	int field959;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1771820289
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("az")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("av")
	@Export("x")
	double x;
	@ObfuscatedName("ak")
	@Export("y")
	double y;
	@ObfuscatedName("ay")
	@Export("z")
	double z;
	@ObfuscatedName("as")
	double field970;
	@ObfuscatedName("ab")
	double field966;
	@ObfuscatedName("ah")
	double field949;
	@ObfuscatedName("ai")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("ac")
	double field969;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -815183487
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1470974707
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1596674159
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -1171655123
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 24
		this.frame = 0; // L: 36
		this.frameCycle = 0; // L: 37
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
		int var12 = class151.SpotAnimationDefinition_get(this.id).sequence; // L: 52
		if (var12 != -1) { // L: 53
			this.sequenceDefinition = class9.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 54
		}

	} // L: 55

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12); // L: 58
		this.field959 = var10; // L: 59
	} // L: 60

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1385844103"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field960 = var1; // L: 63
		this.field953 = var2; // L: 64
		this.field954 = var3; // L: 65
		double var5;
		if (!this.isMoving) { // L: 66
			var5 = (double)(this.field960 - this.sourceX); // L: 67
			double var7 = (double)(this.field953 - this.sourceY); // L: 68
			double var9 = Math.sqrt(var7 * var7 + var5 * var5); // L: 69
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX; // L: 70
			this.y = var7 * (double)this.startHeight / var9 + (double)this.sourceY; // L: 71
			this.z = (double)this.sourceZ; // L: 72
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 74
		this.field970 = ((double)this.field960 - this.x) / var5; // L: 75
		this.field966 = ((double)this.field953 - this.y) / var5; // L: 76
		this.field949 = Math.sqrt(this.field970 * this.field970 + this.field966 * this.field966); // L: 77
		if (!this.isMoving) { // L: 78
			this.speedZ = -this.field949 * Math.tan(0.02454369D * (double)this.slope);
		}

		this.field969 = 2.0D * ((double)this.field954 - this.z - this.speedZ * var5) / (var5 * var5); // L: 79
	} // L: 80

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lko;",
		garbageValue = "-714420560"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class151.SpotAnimationDefinition_get(this.id); // L: 113
		Model var2 = var1.getModel(this.frame); // L: 114
		if (var2 == null) { // L: 115
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 116
			return var2; // L: 117
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 83
		this.x += this.field970 * (double)var1; // L: 84
		this.y += this.field966 * (double)var1; // L: 85
		this.z += (double)var1 * this.speedZ + (double)var1 * 0.5D * this.field969 * (double)var1; // L: 86
		this.speedZ += this.field969 * (double)var1; // L: 87
		this.yaw = (int)(Math.atan2(this.field970, this.field966) * 325.949D) + 1024 & 2047; // L: 88
		this.pitch = (int)(Math.atan2(this.speedZ, this.field949) * 325.949D) & 2047; // L: 89
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
				int var2 = this.sequenceDefinition.method4106(); // L: 104
				if (this.frame >= var2) { // L: 105
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 106
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Lnd;",
		garbageValue = "1117733101"
	)
	public static StudioGame[] method2222() {
		return new StudioGame[]{StudioGame.stellardawn, StudioGame.game4, StudioGame.oldscape, StudioGame.runescape, StudioGame.game3, StudioGame.game5}; // L: 17
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1483530457"
	)
	static final void method2221(String var0) {
		Canvas.method334(var0 + " is already on your ignore list"); // L: 160
	} // L: 161
}
