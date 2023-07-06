import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1900545315
	)
	static int field1281;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1255118391
	)
	static int field1289;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	static IndexedSprite field1290;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("av")
	String field1285;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1885920599
	)
	int field1284;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lte;"
	)
	class501 field1286;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	class193 field1287;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	class193 field1288;

	static {
		field1281 = 1; // L: 17
		field1289 = 1; // L: 19
	}

	NPC() {
		this.field1285 = ""; // L: 12
		this.field1284 = 31; // L: 14
	} // L: 21

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1715187311"
	)
	void method2555(String var1) {
		this.field1285 = var1 == null ? "" : var1; // L: 24
	} // L: 25

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljd;",
		garbageValue = "-1953039490"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) { // L: 115
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapLabelSize.SequenceDefinition_get(super.sequence) : null; // L: 116
			SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : WorldMapLabelSize.SequenceDefinition_get(super.movementSequence); // L: 117
			Model var3 = null; // L: 118
			if (this.field1287 != null && this.field1287.field1990) { // L: 119
				var3 = Projectile.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 120
			} else {
				var3 = this.definition.method3691(var1, super.sequenceFrame, var2, super.movementFrame, this.field1287); // L: 123
			}

			if (var3 == null) { // L: 125
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 126
				super.defaultHeight = var3.height; // L: 127
				int var4 = var3.indicesCount; // L: 128
				var3 = this.method2366(var3); // L: 129
				if (this.definition.size == 1) { // L: 130
					var3.isSingleTile = true;
				}

				if (super.field1217 != 0 && Client.cycle >= super.field1170 && Client.cycle < super.field1213) { // L: 131
					var3.overrideHue = super.field1164; // L: 132
					var3.overrideSaturation = super.field1215; // L: 133
					var3.overrideLuminance = super.field1196; // L: 134
					var3.overrideAmount = super.field1217; // L: 135
					var3.field2761 = (short)var4; // L: 136
				} else {
					var3.overrideAmount = 0; // L: 139
				}

				return var3; // L: 141
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-27"
	)
	void method2615(int var1) {
		this.field1284 = var1; // L: 28
	} // L: 29

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1165032246"
	)
	boolean method2577(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 32
			return (this.field1284 & 1 << var1) != 0; // L: 33
		} else {
			return true; // L: 35
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "73"
	)
	final String method2558() {
		if (!this.field1285.isEmpty()) { // L: 39
			return this.field1285; // L: 40
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILie;I)V",
		garbageValue = "-1245339497"
	)
	final void method2559(int var1, class216 var2) {
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

		if (super.sequence != -1 && WorldMapLabelSize.SequenceDefinition_get(super.sequence).field2274 == 1) { // L: 75
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-977903962"
	)
	final void method2557(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && WorldMapLabelSize.SequenceDefinition_get(super.sequence).field2274 == 1) { // L: 88
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
				super.pathTraversed[0] = class216.field2395; // L: 101
				return; // L: 102
			}
		}

		super.pathLength = 0; // L: 105
		super.field1226 = 0; // L: 106
		super.field1225 = 0; // L: 107
		super.pathX[0] = var1; // L: 108
		super.pathY[0] = var2; // L: 109
		super.x = super.field1155 * -1321988096 + super.pathX[0] * 128; // L: 110
		super.y = super.field1155 * -1321988096 + super.pathY[0] * 128; // L: 111
	} // L: 112

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "1212"
	)
	int[] method2563() {
		return this.field1286 != null ? this.field1286.method9160() : this.definition.method3699(); // L: 150 151 153
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[S",
		garbageValue = "-1461252941"
	)
	short[] method2564() {
		return this.field1286 != null ? this.field1286.method9161() : this.definition.method3706(); // L: 157 158 160
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IISB)V",
		garbageValue = "20"
	)
	void method2565(int var1, int var2, short var3) {
		if (this.field1286 == null) { // L: 164
			this.field1286 = new class501(this.definition); // L: 165
		}

		this.field1286.method9168(var1, var2, var3); // L: 167
	} // L: 168

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "-80"
	)
	void method2566(int[] var1, short[] var2) {
		if (this.field1286 == null) { // L: 171
			this.field1286 = new class501(this.definition); // L: 172
		}

		this.field1286.method9163(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-157831765"
	)
	void method2567() {
		this.field1286 = null; // L: 178
	} // L: 179

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)V",
		garbageValue = "-1965176620"
	)
	void method2579(class193 var1) {
		this.field1288 = var1; // L: 182
	} // L: 183

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lhs;",
		garbageValue = "-1700618787"
	)
	class193 method2586() {
		return this.field1288; // L: 186
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lhs;I)V",
		garbageValue = "933852691"
	)
	void method2570(class193 var1) {
		this.field1287 = var1; // L: 190
	} // L: 191

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "11"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 145
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1679673754"
	)
	void method2571() {
		this.field1288 = null; // L: 194
	} // L: 195

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "91"
	)
	void method2572() {
		this.field1287 = null; // L: 198
	} // L: 199

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "([BI)[B",
		garbageValue = "469671388"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0); // L: 364
		int var2 = var1.readUnsignedByte(); // L: 365
		int var3 = var1.readInt(); // L: 366
		if (var3 < 0 || AbstractArchive.field4265 != 0 && var3 > AbstractArchive.field4265) { // L: 367
			throw new RuntimeException(); // L: 368
		} else if (var2 == 0) { // L: 370
			byte[] var6 = new byte[var3]; // L: 371
			var1.readBytes(var6, 0, var3); // L: 372
			return var6; // L: 373
		} else {
			int var4 = var1.readInt(); // L: 376
			if (var4 >= 0 && (AbstractArchive.field4265 == 0 || var4 <= AbstractArchive.field4265)) { // L: 377
				byte[] var5 = new byte[var4]; // L: 380
				if (var2 == 1) { // L: 381
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5); // L: 382
				}

				return var5; // L: 383
			} else {
				throw new RuntimeException(); // L: 378
			}
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2119265268"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class406.friendsChatManager != null) { // L: 12561
			PacketBufferNode var1 = ObjectComposition.getPacketBufferNode(ClientPacket.field3133, Client.packetWriter.isaacCipher); // L: 12562
			var1.packetBuffer.writeByte(Widget.stringCp1252NullTerminatedByteSize(var0)); // L: 12563
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12564
			Client.packetWriter.addNode(var1); // L: 12565
		}
	} // L: 12566
}
