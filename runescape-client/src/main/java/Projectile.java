import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("co")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 59502035
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 196308761
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -870236101
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1303442269
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 557108907
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -912888721
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2100606847
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -376528065
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1398584319
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -963724339
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1472029191
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("aa")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("aj")
	@Export("x")
	double x;
	@ObfuscatedName("ad")
	@Export("y")
	double y;
	@ObfuscatedName("ac")
	@Export("z")
	double z;
	@ObfuscatedName("ag")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ar")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ah")
	@Export("speed")
	double speed;
	@ObfuscatedName("az")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("au")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1262474269
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1772954643
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhy;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -639302281
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1911018365
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
		int var12 = class53.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = WorldMapLabelSize.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-109"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 57
			this.x = var5 * (double)this.startHeight / var9 + (double)this.sourceX; // L: 58
			this.y = (double)this.sourceY + var7 * (double)this.startHeight / var9; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)var3 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-1953039490"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class53.SpotAnimationDefinition_get(this.id); // L: 101
		Model var2 = var1.getModel(this.frame); // L: 102
		if (var2 == null) { // L: 103
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-124"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += this.speedX * (double)var1; // L: 72
		this.y += (double)var1 * this.speedY; // L: 73
		this.z += (double)var1 * (double)var1 * 0.5D * this.accelerationZ + (double)var1 * this.speedZ; // L: 74
		this.speedZ += (double)var1 * this.accelerationZ; // L: 75
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
				int var2 = this.sequenceDefinition.method4084(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "([Lmb;Lmb;ZB)V",
		garbageValue = "-44"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 11057
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 11058
		class104.resizeInterface(var0, var1.id, var3, var4, var2); // L: 11059
		if (var1.children != null) {
			class104.resizeInterface(var1.children, var1.id, var3, var4, var2); // L: 11060
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 11061
		if (var5 != null) { // L: 11062
			class13.method170(var5.group, var3, var4, var2);
		}

		if (var1.contentType == 1337) { // L: 11063
		}

	} // L: 11064
}
