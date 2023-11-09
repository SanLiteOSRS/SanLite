import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cz")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 768185325
	)
	@Export("id")
	int id;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2146734777
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1878927029
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1718118817
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1903068655
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -351472893
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 928186515
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 377321233
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 294917651
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1548409315
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1018181187
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("ao")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("as")
	@Export("x")
	double x;
	@ObfuscatedName("am")
	@Export("y")
	double y;
	@ObfuscatedName("ag")
	@Export("z")
	double z;
	@ObfuscatedName("aa")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("ar")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ad")
	@Export("speed")
	double speed;
	@ObfuscatedName("at")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("af")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 800946117
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -582134321
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -645529689
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -115281105
	)
	@Export("frameCycle")
	int frameCycle;

	Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.isMoving = false; // L: 20
		this.frame = 0;
		this.frameCycle = 0;
		this.id = var1;
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
		int var12 = TextureProvider.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = class140.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-119"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 57
			this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9; // L: 58
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - this.speedZ * var5) / (var5 * var5); // L: 67
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljr;",
		garbageValue = "63"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = TextureProvider.SpotAnimationDefinition_get(this.id); // L: 101
		Model var2 = var1.getModel(this.frame); // L: 102
		if (var2 == null) { // L: 103
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-47"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += (double)var1 * this.speedX; // L: 72
		this.y += (double)var1 * this.speedY; // L: 73
		this.z += (double)var1 * this.accelerationZ * 0.5D * (double)var1 + (double)var1 * this.speedZ; // L: 74
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
				int var2 = this.sequenceDefinition.method4174(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-62"
	)
	@Export("addChatMessage")
	static void addChatMessage(int var0, String var1, String var2, String var3) {
		ChatChannel var4 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 27
		if (var4 == null) { // L: 28
			var4 = new ChatChannel(); // L: 29
			Messages.Messages_channels.put(var0, var4); // L: 30
		}

		Message var5 = var4.addMessage(var0, var1, var2, var3); // L: 32
		Messages.Messages_hashTable.put(var5, (long)var5.count); // L: 33
		Messages.Messages_queue.add(var5); // L: 34
		Client.chatCycle = Client.cycleCntr; // L: 35
	} // L: 36

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfl;",
		garbageValue = "544083818"
	)
	static class132[] method2155() {
		return new class132[]{class132.field1581, class132.field1582, class132.field1564, class132.field1565, class132.field1569, class132.field1567, class132.field1568, class132.field1572, class132.field1563, class132.field1571, class132.field1562, class132.field1573, class132.field1574, class132.field1575, class132.field1576, class132.field1577, class132.field1578}; // L: 68
	}
}
