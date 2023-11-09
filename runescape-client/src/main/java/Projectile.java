import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 153118227
	)
	static int field950;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1810979149
	)
	@Export("id")
	int id;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1665661611
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 105962367
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -1970661863
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -306056339
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -200216133
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -841508573
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 1627558581
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1009125805
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1309967939
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = 1040117169
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("n")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("x")
	@Export("x")
	double x;
	@ObfuscatedName("g")
	@Export("y")
	double y;
	@ObfuscatedName("p")
	@Export("z")
	double z;
	@ObfuscatedName("b")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("l")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("y")
	@Export("speed")
	double speed;
	@ObfuscatedName("k")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("v")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2064407807
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = 1115887141
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1746247029
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = 1355003211
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
		int var12 = class13.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) { // L: 49
			this.sequenceDefinition = class14.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null; // L: 50
		}

	} // L: 51

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "24"
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
		this.speedX = ((double)var1 - this.x) / var5; // L: 63
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY); // L: 65
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = ((double)var3 - this.z - this.speedZ * var5) * 2.0D / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Lhd;",
		garbageValue = "-842208187"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class13.SpotAnimationDefinition_get(this.id); // L: 101
		Model var2 = var1.getModel(this.frame); // L: 102
		if (var2 == null) { // L: 103
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1090995262"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += this.speedX * (double)var1; // L: 72
		this.y += this.speedY * (double)var1; // L: 73
		this.z += this.speedZ * (double)var1 + 0.5D * this.accelerationZ * (double)var1 * (double)var1; // L: 74
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
				int var2 = this.sequenceDefinition.method3812(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}

	@ObfuscatedName("ia")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-52657202"
	)
	static void method2008(int var0, String var1) {
		int var2 = Players.Players_count; // L: 9383
		int[] var3 = Players.Players_indices; // L: 9384
		boolean var4 = false; // L: 9385
		Username var5 = new Username(var1, class162.loginType); // L: 9386

		for (int var6 = 0; var6 < var2; ++var6) { // L: 9387
			Player var7 = Client.players[var3[var6]]; // L: 9388
			if (var7 != null && var7 != class28.localPlayer && var7.username != null && var7.username.equals(var5)) { // L: 9389
				PacketBufferNode var8;
				if (var0 == 1) { // L: 9390
					var8 = class433.getPacketBufferNode(ClientPacket.field2947, Client.packetWriter.isaacCipher); // L: 9392
					var8.packetBuffer.method7764(0); // L: 9393
					var8.packetBuffer.method7969(var3[var6]); // L: 9394
					Client.packetWriter.addNode(var8); // L: 9395
				} else if (var0 == 4) { // L: 9397
					var8 = class433.getPacketBufferNode(ClientPacket.field2961, Client.packetWriter.isaacCipher); // L: 9399
					var8.packetBuffer.method7969(var3[var6]); // L: 9400
					var8.packetBuffer.method7764(0); // L: 9401
					Client.packetWriter.addNode(var8); // L: 9402
				} else if (var0 == 6) { // L: 9404
					var8 = class433.getPacketBufferNode(ClientPacket.field2946, Client.packetWriter.isaacCipher); // L: 9406
					var8.packetBuffer.method7762(0); // L: 9407
					var8.packetBuffer.method7969(var3[var6]); // L: 9408
					Client.packetWriter.addNode(var8); // L: 9409
				} else if (var0 == 7) { // L: 9411
					var8 = class433.getPacketBufferNode(ClientPacket.field3002, Client.packetWriter.isaacCipher); // L: 9413
					var8.packetBuffer.writeByte(0); // L: 9414
					var8.packetBuffer.writeIntME(var3[var6]); // L: 9415
					Client.packetWriter.addNode(var8); // L: 9416
				}

				var4 = true; // L: 9418
				break;
			}
		}

		if (!var4) { // L: 9422
			FileSystem.addGameMessage(4, "", "Unable to find " + var1);
		}

	} // L: 9423
}
