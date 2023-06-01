import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cj")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1657768759
	)
	@Export("id")
	int id;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 425532361
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -44012081
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1387544337
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2045433985
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 680042919
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 2070351735
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1194623675
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1587092941
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -785699191
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1882587133
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("aw")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("ae")
	@Export("x")
	double x;
	@ObfuscatedName("ah")
	@Export("y")
	double y;
	@ObfuscatedName("ap")
	@Export("z")
	double z;
	@ObfuscatedName("as")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("am")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("ao")
	@Export("speed")
	double speed;
	@ObfuscatedName("af")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("av")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 504142213
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 34496409
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhg;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 330798561
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 721699835
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
		int var12 = class155.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = class149.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-577067234"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) { // L: 54
			var5 = (double)(var1 - this.sourceX); // L: 55
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var5 * var5 + var7 * var7); // L: 57
			this.x = (double)this.startHeight * var5 / var9 + (double)this.sourceX; // L: 58
			this.y = (double)this.sourceY + (double)this.startHeight * var7 / var9; // L: 59
			this.z = (double)this.sourceZ; // L: 60
		}

		var5 = (double)(this.cycleEnd + 1 - var4); // L: 62
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5;
		this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
		if (!this.isMoving) {
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - this.speedZ * var5) / (var5 * var5);
	} // L: 68

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljh;",
		garbageValue = "4"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class155.SpotAnimationDefinition_get(this.id); // L: 101
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
		descriptor = "(IB)V",
		garbageValue = "-24"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += this.speedX * (double)var1; // L: 72
		this.y += this.speedY * (double)var1; // L: 73
		this.z += (double)var1 * (double)var1 * this.accelerationZ * 0.5D + this.speedZ * (double)var1; // L: 74
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
				int var2 = this.sequenceDefinition.method4006(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ltc;J)V"
	)
	static void method2102(Buffer var0, long var1) {
		var1 /= 10L; // L: 63
		if (var1 < 0L) { // L: 64
			var1 = 0L;
		} else if (var1 > 65535L) { // L: 65
			var1 = 65535L;
		}

		var0.writeShort((int)var1); // L: 66
	} // L: 67

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "160"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (BZip2State.friendsChatManager != null) { // L: 12393
			PacketBufferNode var1 = class251.getPacketBufferNode(ClientPacket.field3113, Client.packetWriter.isaacCipher); // L: 12394
			var1.packetBuffer.writeByte(class298.stringCp1252NullTerminatedByteSize(var0)); // L: 12395
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12396
			Client.packetWriter.addNode(var1); // L: 12397
		}
	} // L: 12398

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "47552392"
	)
	static final void method2098(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : UserComparator4.guestClanChannel; // L: 12417
		if (var2 != null && var1 >= 0 && var1 < var2.method3316()) { // L: 12418
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12419
			if (var3.rank == -1) { // L: 12420
				String var4 = var3.username.getName(); // L: 12421
				PacketBufferNode var5 = class251.getPacketBufferNode(ClientPacket.field3124, Client.packetWriter.isaacCipher); // L: 12422
				var5.packetBuffer.writeByte(3 + class298.stringCp1252NullTerminatedByteSize(var4)); // L: 12423
				var5.packetBuffer.writeByte(var0); // L: 12424
				var5.packetBuffer.writeShort(var1); // L: 12425
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12426
				Client.packetWriter.addNode(var5); // L: 12427
			}
		}
	} // L: 12428
}
