import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("Projectile")
public final class Projectile extends Renderable {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 251394351
	)
	@Export("id")
	int id;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 335846275
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -728775885
	)
	@Export("sourceX")
	int sourceX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -415717997
	)
	@Export("sourceY")
	int sourceY;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -822093379
	)
	@Export("sourceZ")
	int sourceZ;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1617929179
	)
	@Export("endHeight")
	int endHeight;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 711061639
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -1324925051
	)
	@Export("cycleEnd")
	int cycleEnd;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 494881873
	)
	@Export("slope")
	int slope;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1000853405
	)
	@Export("startHeight")
	int startHeight;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 469129851
	)
	@Export("targetIndex")
	int targetIndex;
	@ObfuscatedName("r")
	@Export("isMoving")
	boolean isMoving;
	@ObfuscatedName("b")
	@Export("x")
	double x;
	@ObfuscatedName("m")
	@Export("y")
	double y;
	@ObfuscatedName("t")
	@Export("z")
	double z;
	@ObfuscatedName("h")
	@Export("speedX")
	double speedX;
	@ObfuscatedName("p")
	@Export("speedY")
	double speedY;
	@ObfuscatedName("o")
	@Export("speed")
	double speed;
	@ObfuscatedName("u")
	@Export("speedZ")
	double speedZ;
	@ObfuscatedName("x")
	@Export("accelerationZ")
	double accelerationZ;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1551462227
	)
	@Export("yaw")
	int yaw;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1109608205
	)
	@Export("pitch")
	int pitch;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1012909031
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = -999189837
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
		this.cycleStart = var6; // L: 41
		this.cycleEnd = var7; // L: 42
		this.slope = var8;
		this.startHeight = var9;
		this.targetIndex = var10;
		this.endHeight = var11;
		this.isMoving = false;
		int var12 = MouseRecorder.SpotAnimationDefinition_get(this.id).sequence; // L: 48
		if (var12 != -1) {
			this.sequenceDefinition = class85.SequenceDefinition_get(var12);
		} else {
			this.sequenceDefinition = null;
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1751077990"
	)
	@Export("setDestination")
	final void setDestination(int var1, int var2, int var3, int var4) {
		double var5;
		if (!this.isMoving) {
			var5 = (double)(var1 - this.sourceX);
			double var7 = (double)(var2 - this.sourceY); // L: 56
			double var9 = Math.sqrt(var7 * var7 + var5 * var5); // L: 57
			this.x = var5 * (double)this.startHeight / var9 + (double)this.sourceX;
			this.y = var7 * (double)this.startHeight / var9 + (double)this.sourceY;
			this.z = (double)this.sourceZ;
		}

		var5 = (double)(this.cycleEnd + 1 - var4);
		this.speedX = ((double)var1 - this.x) / var5;
		this.speedY = ((double)var2 - this.y) / var5; // L: 64
		this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
		if (!this.isMoving) { // L: 66
			this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369D);
		}

		this.accelerationZ = 2.0D * ((double)var3 - this.z - var5 * this.speedZ) / (var5 * var5); // L: 67
	} // L: 68

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lhs;",
		garbageValue = "922199662"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = MouseRecorder.SpotAnimationDefinition_get(this.id); // L: 101
		Model var2 = var1.getModel(this.frame); // L: 102
		if (var2 == null) { // L: 103
			return null;
		} else {
			var2.rotateZ(this.pitch); // L: 104
			return var2; // L: 105
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-15"
	)
	@Export("advance")
	final void advance(int var1) {
		this.isMoving = true; // L: 71
		this.x += this.speedX * (double)var1; // L: 72
		this.y += this.speedY * (double)var1; // L: 73
		this.z += (double)var1 * this.accelerationZ * 0.5D * (double)var1 + this.speedZ * (double)var1; // L: 74
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
				int var2 = this.sequenceDefinition.method4055(); // L: 92
				if (this.frame >= var2) { // L: 93
					this.frame = var2 - this.sequenceDefinition.frameCount; // L: 94
				}
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lmn;B)I",
		garbageValue = "13"
	)
	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length(); // L: 11
		int var4 = var1.length(); // L: 12
		int var5 = 0; // L: 13
		int var6 = 0; // L: 14
		char var7 = 0; // L: 15
		char var8 = 0; // L: 16

		while (var5 - var7 < var3 || var6 - var8 < var4) { // L: 18
			if (var5 - var7 >= var3) { // L: 19
				return -1;
			}

			if (var6 - var8 >= var4) { // L: 20
				return 1;
			}

			char var9;
			if (var7 != 0) { // L: 23
				var9 = var7; // L: 24
				boolean var14 = false; // L: 25
			} else {
				var9 = var0.charAt(var5++); // L: 27
			}

			char var10;
			if (var8 != 0) { // L: 28
				var10 = var8; // L: 29
				boolean var15 = false; // L: 30
			} else {
				var10 = var1.charAt(var6++); // L: 32
			}

			var7 = class81.method2306(var9); // L: 33
			var8 = class81.method2306(var10); // L: 34
			var9 = WorldMapDecoration.standardizeChar(var9, var2); // L: 35
			var10 = WorldMapDecoration.standardizeChar(var10, var2); // L: 36
			if (var9 != var10 && Character.toUpperCase(var9) != Character.toUpperCase(var10)) { // L: 37
				var9 = Character.toLowerCase(var9); // L: 38
				var10 = Character.toLowerCase(var10); // L: 39
				if (var9 != var10) { // L: 40
					return WorldMapEvent.lowercaseChar(var9, var2) - WorldMapEvent.lowercaseChar(var10, var2);
				}
			}
		}

		int var16 = Math.min(var3, var4); // L: 43

		char var12;
		int var17;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = var3 - 1 - var17;
				var6 = var4 - 1 - var17; // L: 47
			} else {
				var6 = var17; // L: 49
				var5 = var17;
			}

			char var11 = var0.charAt(var5); // L: 50
			var12 = var1.charAt(var6); // L: 51
			if (var12 != var11 && Character.toUpperCase(var11) != Character.toUpperCase(var12)) { // L: 52
				var11 = Character.toLowerCase(var11); // L: 53
				var12 = Character.toLowerCase(var12); // L: 54
				if (var12 != var11) {
					return WorldMapEvent.lowercaseChar(var11, var2) - WorldMapEvent.lowercaseChar(var12, var2); // L: 55
				}
			}
		}

		var17 = var3 - var4; // L: 58
		if (var17 != 0) { // L: 59
			return var17;
		} else {
			for (int var18 = 0; var18 < var16; ++var18) { // L: 60
				var12 = var0.charAt(var18); // L: 61
				char var13 = var1.charAt(var18); // L: 62
				if (var12 != var13) { // L: 63
					return WorldMapEvent.lowercaseChar(var12, var2) - WorldMapEvent.lowercaseChar(var13, var2);
				}
			}

			return 0; // L: 65
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-49"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0); // L: 44
		return var1 == null ? 0 : var1.size(); // L: 45 46
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2085895323"
	)
	static final void method2173(boolean var0) {
		HorizontalAlignment.playPcmPlayers(); // L: 5965
		++Client.packetWriter.pendingWrites; // L: 5966
		if (Client.packetWriter.pendingWrites >= 50 || var0) { // L: 5967
			Client.packetWriter.pendingWrites = 0; // L: 5968
			if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) { // L: 5969
				PacketBufferNode var1 = Renderable.getPacketBufferNode(ClientPacket.field3098, Client.packetWriter.isaacCipher); // L: 5971
				Client.packetWriter.addNode(var1); // L: 5972

				try {
					Client.packetWriter.flush(); // L: 5974
				} catch (IOException var3) { // L: 5976
					Client.hadNetworkError = true; // L: 5977
				}
			}

		}
	} // L: 5980
}
