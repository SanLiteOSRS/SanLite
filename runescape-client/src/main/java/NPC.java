import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1907913849
	)
	static int field1336;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1186841139
	)
	static int field1338;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("aw")
	String field1331;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1087694615
	)
	int field1333;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	class534 field1335;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	class188 field1334;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	class188 field1337;

	static {
		field1336 = 1; // L: 17
		field1338 = 1; // L: 19
	}

	NPC() {
		this.field1331 = ""; // L: 12
		this.field1333 = 31; // L: 14
	} // L: 21

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1862297226"
	)
	void method2655(String var1) {
		this.field1331 = var1 == null ? "" : var1; // L: 24
	} // L: 25

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "1036754463"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 115
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? MilliClock.SequenceDefinition_get(super.sequence) : null; // L: 116
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? MilliClock.SequenceDefinition_get(super.movementSequence) : null; // L: 117
			Model var3 = null; // L: 118
			if (this.field1334 != null && this.field1334.field1956) { // L: 119
				var3 = VarpDefinition.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 120
			} else {
				var3 = this.definition.method3701(var1, super.sequenceFrame, var2, super.movementFrame, this.field1334); // L: 123
			}

			if (var3 == null) { // L: 125
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 126
				super.defaultHeight = var3.height; // L: 127
				int var4 = var3.indicesCount; // L: 128
				var3 = this.method2469(var3); // L: 129
				if (this.definition.size == 1) { // L: 130
					var3.isSingleTile = true;
				}

				if (super.field1255 != 0 && Client.cycle >= super.field1262 && Client.cycle < super.field1278) { // L: 131
					var3.overrideHue = super.field1268; // L: 132
					var3.overrideSaturation = super.field1269; // L: 133
					var3.overrideLuminance = super.field1276; // L: 134
					var3.overrideAmount = super.field1255; // L: 135
					var3.field3059 = (short)var4; // L: 136
				} else {
					var3.overrideAmount = 0; // L: 139
				}

				return var3; // L: 141
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "10"
	)
	void method2656(int var1) {
		this.field1333 = var1; // L: 28
	} // L: 29

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1259360590"
	)
	boolean method2663(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 32
			return (this.field1333 & 1 << var1) != 0; // L: 33
		} else {
			return true; // L: 35
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/lang/String;",
		garbageValue = "-10354"
	)
	final String method2670() {
		if (!this.field1331.isEmpty()) { // L: 39
			return this.field1331; // L: 40
		} else {
			NPCComposition var1 = this.definition; // L: 42
			if (var1.transforms != null) { // L: 43
				var1 = var1.transform(); // L: 44
				if (var1 == null) { // L: 45
					var1 = this.definition; // L: 46
				}
			}

			return var1.name; // L: 49
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILip;B)V",
		garbageValue = "-37"
	)
	final void method2659(int var1, class233 var2) {
		int var3 = super.pathX[0]; // L: 53
		int var4 = super.pathY[0]; // L: 54
		if (var1 == 0) { // L: 55
			--var3; // L: 56
			++var4; // L: 57
		}

		if (var1 == 1) { // L: 59
			++var4;
		}

		if (var1 == 2) { // L: 60
			++var3; // L: 61
			++var4; // L: 62
		}

		if (var1 == 3) { // L: 64
			--var3;
		}

		if (var1 == 4) { // L: 65
			++var3;
		}

		if (var1 == 5) { // L: 66
			--var3; // L: 67
			--var4; // L: 68
		}

		if (var1 == 6) { // L: 70
			--var4;
		}

		if (var1 == 7) { // L: 71
			++var3; // L: 72
			--var4; // L: 73
		}

		if (super.sequence != -1 && MilliClock.SequenceDefinition_get(super.sequence).field2273 == 1) { // L: 75
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 76
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 77
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 78
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 79
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 80
		}

		super.pathX[0] = var3; // L: 82
		super.pathY[0] = var4; // L: 83
		super.pathTraversed[0] = var2; // L: 84
	} // L: 85

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-36"
	)
	final void method2654(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && MilliClock.SequenceDefinition_get(super.sequence).field2273 == 1) { // L: 88
			super.sequence = -1;
		}

		if (!var3) { // L: 89
			int var4 = var1 - super.pathX[0]; // L: 90
			int var5 = var2 - super.pathY[0]; // L: 91
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 92
				if (super.pathLength < 9) { // L: 93
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 94
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 95
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 96
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 97
				}

				super.pathX[0] = var1; // L: 99
				super.pathY[0] = var2; // L: 100
				super.pathTraversed[0] = class233.field2470; // L: 101
				return; // L: 102
			}
		}

		super.pathLength = 0; // L: 105
		super.field1280 = 0; // L: 106
		super.field1279 = 0; // L: 107
		super.pathX[0] = var1; // L: 108
		super.pathY[0] = var2; // L: 109
		super.x = super.field1212 * 64 + super.pathX[0] * 128; // L: 110
		super.y = super.field1212 * 64 + super.pathY[0] * 128; // L: 111
	} // L: 112

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1562647560"
	)
	int[] method2715() {
		return this.field1335 != null ? this.field1335.method9715() : this.definition.method3700(); // L: 150 151 153
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-1297485115"
	)
	short[] method2722() {
		return this.field1335 != null ? this.field1335.method9708() : this.definition.method3743(); // L: 157 158 160
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-475468119"
	)
	void method2665(int var1, int var2, short var3) {
		if (this.field1335 == null) { // L: 164
			this.field1335 = new class534(this.definition); // L: 165
		}

		this.field1335.method9709(var1, var2, var3); // L: 167
	} // L: 168

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "-1715910336"
	)
	void method2666(int[] var1, short[] var2) {
		if (this.field1335 == null) { // L: 171
			this.field1335 = new class534(this.definition); // L: 172
		}

		this.field1335.method9710(var1, var2);
	} // L: 175

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-733260413"
	)
	void method2667() {
		this.field1335 = null; // L: 178
	} // L: 179

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "1917572256"
	)
	void method2713(class188 var1) {
		this.field1337 = var1; // L: 182
	} // L: 183

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Lht;",
		garbageValue = "0"
	)
	class188 method2669() {
		return this.field1337; // L: 186
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lht;B)V",
		garbageValue = "-29"
	)
	void method2703(class188 var1) {
		this.field1334 = var1; // L: 190
	} // L: 191

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "16409"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 145
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-661178984"
	)
	void method2671() {
		this.field1337 = null; // L: 194
	} // L: 195

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1024972526"
	)
	void method2672() {
		this.field1334 = null; // L: 198
	} // L: 199

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-7"
	)
	static final void method2711() {
		SecureRandomCallable.method2319("You can't add yourself to your own ignore list"); // L: 173
	} // L: 174

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "63808758"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3910
			class30.clientPreferences.method2530(!class30.clientPreferences.method2635()); // L: 3911
			if (class30.clientPreferences.method2635()) { // L: 3912
				class209.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3913
			} else {
				class209.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3916
			}
		}

		if (var0.startsWith("zbuf")) { // L: 3919
			boolean var1 = class129.method3066(var0.substring(5).trim()) == 1; // L: 3920
			class193.client.method471(var1); // L: 3921
			Rasterizer3D.method5278(var1); // L: 3922
		}

		if (var0.equalsIgnoreCase("z")) { // L: 3924
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3925
			class30.clientPreferences.method2631();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3926
			Client.field656 = !Client.field656;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3927
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3928
			if (var0.equalsIgnoreCase("errortest")) { // L: 3929
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3930
				Tiles.worldMap.field5043 = !Tiles.worldMap.field5043;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3931
				class30.clientPreferences.method2563(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3932
				class30.clientPreferences.method2563(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3933
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3934
				Huffman.method6966();
			}
		}

		PacketBufferNode var2 = ViewportMouse.getPacketBufferNode(ClientPacket.field3180, Client.packetWriter.isaacCipher); // L: 3937
		var2.packetBuffer.writeByte(var0.length() + 1); // L: 3938
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3939
		Client.packetWriter.addNode(var2); // L: 3940
	} // L: 3941
}
