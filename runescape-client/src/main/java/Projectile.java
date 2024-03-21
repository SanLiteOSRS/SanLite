import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cr")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ii")
	@ObfuscatedGetter(
		intValue = -2067025143
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("so")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	@Export("friendsChatManager")
	static FriendsChatManager friendsChatManager;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1340568521
	)
	@Export("id")
	int id;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1339285629
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1488219019
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1783553383
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 791763453
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1909972809
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1247501669
	)
	int field1008;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -455196585
	)
	int field987;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 393695049
	)
	int field988;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 897375107
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1089229095
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -20042567
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -130381619
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -658550749
	)
	int field993;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -103533343
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("an")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("ag")
	@Export("x")
	double x;
	@ObfuscatedName("am")
	@Export("y")
	double y;
	@ObfuscatedName("ad")
	@Export("z")
	double z;
	@ObfuscatedName("at")
	double field999;
	@ObfuscatedName("ay")
	double field1000;
	@ObfuscatedName("ae")
	double field990;
	@ObfuscatedName("ac")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("ab")
	double field1003;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 706671827
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1722955333
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1382456271
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -263190565
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
		int var12 = VarbitComposition.SpotAnimationDefinition_get(this.id).sequence; // L: 52
		if (var12 != -1) { // L: 53
			this.sequenceDefinition = MilliClock.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 54
		}

	} // L: 55

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var11, var12); // L: 58
		this.field993 = var10; // L: 59
	} // L: 60

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1651218961"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		this.field1008 = var1; // L: 63
		this.field987 = var2; // L: 64
		this.field988 = var3; // L: 65
		double var5;
		if (!this.isMoving) { // L: 66
			var5 = (double)(this.field1008 - this.sourceX); // L: 67
			double var7 = (double)(this.field987 - this.sourceY); // L: 68
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 69
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX; // L: 70
			this.y = (double)this.startHeight * var7 / var9 + (double)this.sourceY; // L: 71
			this.z = (double)this.sourceZ; // L: 72
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 74
		this.field999 = ((double)this.field1008 - this.x) / var5; // L: 75
		this.field1000 = ((double)this.field987 - this.y) / var5; // L: 76
		this.field990 = Math.sqrt(this.field999 * this.field999 + this.field1000 * this.field1000); // L: 77
		if (!this.isMoving) { // L: 78
			this.speedZ = -this.field990 * Math.tan(0.02454369D * (double)this.slope);
		}

		this.field1003 = ((double)this.field988 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5); // L: 79
	} // L: 80

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "1036754463"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = VarbitComposition.SpotAnimationDefinition_get(this.id); // L: 113
		Model var2 = var1.getModel(this.frame); // L: 114
		if (var2 == null) { // L: 115
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 116
			return var2; // L: 117
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1114851198"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 83
		this.x += this.field999 * (double)var1; // L: 84
		this.y += this.field1000 * (double)var1; // L: 85
		this.z += (double)var1 * 0.5D * this.field1003 * (double)var1 + (double)var1 * this.speedZ; // L: 86
		this.speedZ += (double)var1 * this.field1003; // L: 87
		this.yaw = (int)(Math.atan2(this.field999, this.field1000) * 325.949D) + 1024 & 2047; // L: 88
		this.pitch = (int)(Math.atan2(this.speedZ, this.field990) * 325.949D) & 2047; // L: 89
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
				int var2 = this.sequenceDefinition.method4065(); // L: 104
				if (this.frame >= var2) { // L: 105
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 106
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "-367754772"
	)
	static SpritePixels method2214() {
		SpritePixels var0 = new SpritePixels(); // L: 153
		var0.width = class548.SpriteBuffer_spriteWidth; // L: 154
		var0.height = class548.SpriteBuffer_spriteHeight; // L: 155
		var0.xOffset = class548.SpriteBuffer_xOffsets[0]; // L: 156
		var0.yOffset = class548.SpriteBuffer_yOffsets[0]; // L: 157
		var0.subWidth = class235.SpriteBuffer_spriteWidths[0]; // L: 158
		var0.subHeight = class548.SpriteBuffer_spriteHeights[0]; // L: 159
		int var1 = var0.subHeight * var0.subWidth; // L: 160
		byte[] var2 = class548.SpriteBuffer_pixels[0]; // L: 161
		var0.pixels = new int[var1]; // L: 162

		for (int var3 = 0; var3 < var1; ++var3) { // L: 163
			var0.pixels[var3] = AbstractSocket.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class548.SpriteBuffer_xOffsets = null; // L: 165
		class548.SpriteBuffer_yOffsets = null; // L: 166
		class235.SpriteBuffer_spriteWidths = null; // L: 167
		class548.SpriteBuffer_spriteHeights = null; // L: 168
		AbstractSocket.SpriteBuffer_spritePalette = null; // L: 169
		class548.SpriteBuffer_pixels = null; // L: 170
		return var0; // L: 172
	}
}
