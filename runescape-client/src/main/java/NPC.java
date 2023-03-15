import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1448887511
	)
	static int field1282;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1454549187
	)
	static int field1284;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("al")
	String field1277;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -513690733
	)
	int field1278;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsz;"
	)
	class478 field1280;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	class191 field1281;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	class191 field1283;

	static {
		field1282 = 1; // L: 18
		field1284 = 1; // L: 20
	}

	NPC() {
		this.field1277 = ""; // L: 13
		this.field1278 = 31; // L: 15
	} // L: 22

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	void method2619(String var1) {
		this.field1277 = var1 == null ? "" : var1; // L: 25
	} // L: 26

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lix;",
		garbageValue = "-1998422213"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 116
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? Coord.SequenceDefinition_get(super.sequence) : null; // L: 117
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? Coord.SequenceDefinition_get(super.movementSequence) : null; // L: 118
			Model var3 = this.definition.method3669(var1, super.sequenceFrame, var2, super.movementFrame, this.field1281); // L: 119
			if (var3 == null) { // L: 120
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 121
				super.defaultHeight = var3.height; // L: 122
				int var4 = var3.indicesCount; // L: 123
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) { // L: 124
					Model var5 = DevicePcmPlayerProvider.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame); // L: 125
					if (var5 != null) { // L: 126
						var5.offsetBy(0, -super.field1191, 0); // L: 127
						Model[] var6 = new Model[]{var3, var5}; // L: 128
						var3 = new Model(var6, 2); // L: 129
					}
				}

				if (this.definition.size == 1) { // L: 132
					var3.isSingleTile = true;
				}

				if (super.field1206 != 0 && Client.cycle >= super.field1201 && Client.cycle < super.field1159) { // L: 133
					var3.overrideHue = super.field1203; // L: 134
					var3.overrideSaturation = super.field1185; // L: 135
					var3.overrideLuminance = super.field1165; // L: 136
					var3.overrideAmount = super.field1206; // L: 137
					var3.field2725 = (short)var4; // L: 138
				} else {
					var3.overrideAmount = 0; // L: 141
				}

				return var3; // L: 143
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "14"
	)
	void method2570(int var1) {
		this.field1278 = var1; // L: 29
	} // L: 30

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1354169302"
	)
	boolean method2554(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 33
			return (this.field1278 & 1 << var1) != 0; // L: 34
		} else {
			return true; // L: 36
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2016328682"
	)
	final String method2601() {
		if (!this.field1277.isEmpty()) { // L: 40
			return this.field1277; // L: 41
		} else {
			NPCComposition var1 = this.definition; // L: 43
			if (var1.transforms != null) { // L: 44
				var1 = var1.transform(); // L: 45
				if (var1 == null) { // L: 46
					var1 = this.definition; // L: 47
				}
			}

			return var1.name;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILis;B)V",
		garbageValue = "43"
	)
	final void method2556(int var1, class211 var2) {
		int var3 = super.pathX[0]; // L: 54
		int var4 = super.pathY[0]; // L: 55
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) { // L: 65
			--var3;
		}

		if (var1 == 4) { // L: 66
			++var3;
		}

		if (var1 == 5) { // L: 67
			--var3; // L: 68
			--var4; // L: 69
		}

		if (var1 == 6) { // L: 71
			--var4;
		}

		if (var1 == 7) { // L: 72
			++var3; // L: 73
			--var4; // L: 74
		}

		if (super.sequence != -1 && Coord.SequenceDefinition_get(super.sequence).field2255 == 1) { // L: 76
			super.sequence = -1;
		}

		if (super.pathLength < 9) { // L: 77
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) { // L: 78
			super.pathX[var5] = super.pathX[var5 - 1]; // L: 79
			super.pathY[var5] = super.pathY[var5 - 1]; // L: 80
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1]; // L: 81
		}

		super.pathX[0] = var3; // L: 83
		super.pathY[0] = var4; // L: 84
		super.pathTraversed[0] = var2; // L: 85
	} // L: 86

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "693431583"
	)
	final void method2557(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && Coord.SequenceDefinition_get(super.sequence).field2255 == 1) { // L: 89
			super.sequence = -1;
		}

		if (!var3) { // L: 90
			int var4 = var1 - super.pathX[0]; // L: 91
			int var5 = var2 - super.pathY[0]; // L: 92
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) { // L: 93
				if (super.pathLength < 9) { // L: 94
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) { // L: 95
					super.pathX[var6] = super.pathX[var6 - 1]; // L: 96
					super.pathY[var6] = super.pathY[var6 - 1]; // L: 97
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1]; // L: 98
				}

				super.pathX[0] = var1; // L: 100
				super.pathY[0] = var2; // L: 101
				super.pathTraversed[0] = class211.field2332; // L: 102
				return; // L: 103
			}
		}

		super.pathLength = 0; // L: 106
		super.field1215 = 0; // L: 107
		super.field1214 = 0; // L: 108
		super.pathX[0] = var1; // L: 109
		super.pathY[0] = var2; // L: 110
		super.x = super.pathX[0] * 128 + super.field1142 * -1172500480; // L: 111
		super.y = super.pathY[0] * 128 + super.field1142 * -1172500480; // L: 112
	} // L: 113

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1203673251"
	)
	int[] method2560() {
		return this.field1280 != null ? this.field1280.method8882() : this.definition.method3677(); // L: 152 153 155
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "126"
	)
	short[] method2561() {
		return this.field1280 != null ? this.field1280.method8883() : this.definition.method3673(); // L: 159 160 162
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "1445683275"
	)
	void method2562(int var1, int var2, short var3) {
		if (this.field1280 == null) { // L: 166
			this.field1280 = new class478(this.definition); // L: 167
		}

		this.field1280.method8884(var1, var2, var3); // L: 169
	} // L: 170

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "685093659"
	)
	void method2563(int[] var1, short[] var2) {
		if (this.field1280 == null) { // L: 173
			this.field1280 = new class478(this.definition); // L: 174
		}

		this.field1280.method8881(var1, var2); // L: 176
	} // L: 177

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1082576070"
	)
	void method2585() {
		this.field1280 = null; // L: 180
	} // L: 181

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lhj;I)V",
		garbageValue = "-95948932"
	)
	void method2565(class191 var1) {
		this.field1283 = var1; // L: 184
	} // L: 185

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lhj;",
		garbageValue = "295942057"
	)
	class191 method2566() {
		return this.field1283; // L: 188
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lhj;I)V",
		garbageValue = "2106253999"
	)
	void method2567(class191 var1) {
		this.field1281 = var1; // L: 192
	} // L: 193

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1187706422"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 147
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "16"
	)
	void method2589() {
		this.field1283 = null; // L: 196
	} // L: 197

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-36"
	)
	void method2607() {
		this.field1281 = null; // L: 200
	} // L: 201

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "103"
	)
	public static int method2622(int var0) {
		return class435.field4651[var0 & 16383]; // L: 32
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ILne;Ljava/lang/String;Ljava/lang/String;IZB)V",
		garbageValue = "34"
	)
	public static void method2620(int var0, AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		int var6 = var1.getGroupId(var2); // L: 50
		int var7 = var1.getFileId(var6, var3); // L: 51
		method2588(var0, var1, var6, var7, var4, var5); // L: 52
	} // L: 53

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILne;IIIZI)V",
		garbageValue = "-1234060447"
	)
	public static void method2588(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class293.musicPlayerStatus = 1; // L: 56
		class364.musicTrackArchive = var1; // L: 57
		IntHashTable.musicTrackGroupId = var2; // L: 58
		class293.musicTrackFileId = var3; // L: 59
		class368.musicTrackVolume = var4; // L: 60
		class293.musicTrackBoolean = var5; // L: 61
		AbstractRasterProvider.pcmSampleLength = var0; // L: 62
	} // L: 63

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZI)I",
		garbageValue = "-196574713"
	)
	static int method2597(int var0, Script var1, boolean var2) {
		if (var0 == 6754) { // L: 4990
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 4991
			NPCComposition var6 = class188.getNpcDefinition(var5); // L: 4992
			Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : ""; // L: 4993
			return 1; // L: 4994
		} else {
			NPCComposition var3;
			if (var0 == 6764) { // L: 4996
				Interpreter.Interpreter_intStackSize -= 2; // L: 4997
				var3 = class188.getNpcDefinition(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]); // L: 4998
				int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 4999
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3678(var4); // L: 5000
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3700(var4); // L: 5001
				return 1; // L: 5002
			} else if (var0 == 6765) { // L: 5004
				var3 = class188.getNpcDefinition(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 5005
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0; // L: 5006
				return 1; // L: 5007
			} else {
				return 2; // L: 5009
			}
		}
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1695688824"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field696 = 0L; // L: 4319
		if (var0 >= 2) { // L: 4320
			Client.isResizable = true;
		} else {
			Client.isResizable = false; // L: 4321
		}

		if (class7.getWindowedMode() == 1) { // L: 4322
			class392.client.setMaxCanvasSize(765, 503); // L: 4323
		} else {
			class392.client.setMaxCanvasSize(7680, 2160); // L: 4326
		}

		if (Client.gameState >= 25) { // L: 4328
			PacketBufferNode var1 = UserComparator9.getPacketBufferNode(ClientPacket.field3068, Client.packetWriter.isaacCipher); // L: 4330
			var1.packetBuffer.writeByte(class7.getWindowedMode()); // L: 4331
			var1.packetBuffer.writeShort(GameEngine.canvasWidth); // L: 4332
			var1.packetBuffer.writeShort(class143.canvasHeight); // L: 4333
			Client.packetWriter.addNode(var1); // L: 4334
		}

	} // L: 4336

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ljava/lang/String;",
		garbageValue = "24"
	)
	static final String method2569(int var0, int var1) {
		int var2 = var1 - var0; // L: 10015
		if (var2 < -9) { // L: 10016
			return Canvas.colorStartTag(16711680);
		} else if (var2 < -6) { // L: 10017
			return Canvas.colorStartTag(16723968);
		} else if (var2 < -3) { // L: 10018
			return Canvas.colorStartTag(16740352);
		} else if (var2 < 0) {
			return Canvas.colorStartTag(16756736); // L: 10019
		} else if (var2 > 9) { // L: 10020
			return Canvas.colorStartTag(65280);
		} else if (var2 > 6) { // L: 10021
			return Canvas.colorStartTag(4259584);
		} else if (var2 > 3) { // L: 10022
			return Canvas.colorStartTag(8453888);
		} else {
			return var2 > 0 ? Canvas.colorStartTag(12648192) : Canvas.colorStartTag(16776960); // L: 10023 10024
		}
	}
}
