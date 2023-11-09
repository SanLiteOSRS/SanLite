import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -976192127
	)
	@Export("id")
	int id;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1625341395
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -721134889
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -599280821
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -492864111
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -60638153
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1414464861
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 495860239
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2030426167
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2077576861
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2073616239
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("at")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("ah")
	@Export("x")
	double x;
	@ObfuscatedName("ax")
	@Export("y")
	double y;
	@ObfuscatedName("aa")
	@Export("z")
	double z;
	@ObfuscatedName("au")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ae")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ab")
	@Export("speed")
	double speed;
	@ObfuscatedName("ad")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("ao")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -619535977
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1365581129
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1628887833
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1452171409
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
		int var12 = NPCComposition.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = class135.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var7 * var7 + var5 * var5); // L: 57
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9; // L: 58
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan(0.02454369D * (double)this.slope);
		}

		this.accelerationZ = ((double)var3 - this.z - var5 * this.speedZ) * 2.0D / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljo;",
		garbageValue = "-983173466"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = NPCComposition.SpotAnimationDefinition_get(this.id); // L: 101
		Model var2 = var1.getModel(this.frame); // L: 102
		if (var2 == null) { // L: 103
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1587354661"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += this.speedX * (double)var1; // L: 72
		this.y += this.speedY * (double)var1; // L: 73
		this.z += (double)var1 * this.accelerationZ * 0.5D * (double)var1 + (double)var1 * this.speedZ; // L: 74
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
				int var2 = this.sequenceDefinition.method4074(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}
}
