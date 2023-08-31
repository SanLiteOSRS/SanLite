import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1282067951
	)
	static int field1325;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -643167983
	)
	static int field1333;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhw;"
	)
	@Export("definition")
	NPCComposition definition;
	@ObfuscatedName("ae")
	String field1330;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -111138695
	)
	int field1328;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	class515 field1329;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	class194 field1331;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhq;"
	)
	class194 field1332;

	static {
		field1325 = 1; // L: 17
		field1333 = 1; // L: 19
	}

	NPC() {
		this.field1330 = ""; // L: 12
		this.field1328 = 31; // L: 14
	} // L: 21

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1576222812"
	)
	void method2569(String var1) {
		this.field1330 = var1 == null ? "" : var1; // L: 24
	} // L: 25

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljr;",
		garbageValue = "798227647"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? EnumComposition.SequenceDefinition_get(super.sequence) : null; // L: 116
			SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? EnumComposition.SequenceDefinition_get(super.movementSequence) : null; // L: 117
			Model var3 = null;
			if (this.field1331 != null && this.field1331.field2028) {
				var3 = VarbitComposition.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame); // L: 120
			} else {
				var3 = this.definition.method3691(var1, super.sequenceFrame, var2, super.movementFrame, this.field1331); // L: 123
			}

			if (var3 == null) { // L: 125
				return null;
			} else {
				var3.calculateBoundsCylinder(); // L: 126
				super.defaultHeight = var3.height; // L: 127
				int var4 = var3.indicesCount; // L: 128
				var3 = this.method2379(var3); // L: 129
				if (this.definition.size == 1) { // L: 130
					var3.isSingleTile = true;
				}

				if (super.field1250 != 0 && Client.cycle >= super.field1258 && Client.cycle < super.field1200) { // L: 131
					var3.overrideHue = super.field1260; // L: 132
					var3.overrideSaturation = super.field1218; // L: 133
					var3.overrideLuminance = super.field1212; // L: 134
					var3.overrideAmount = super.field1250; // L: 135
					var3.field2778 = (short)var4; // L: 136
				} else {
					var3.overrideAmount = 0; // L: 139
				}

				return var3; // L: 141
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-979887943"
	)
	void method2570(int var1) {
		this.field1328 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1720448953"
	)
	boolean method2571(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field1328 & 1 << var1) != 0;
		} else {
			return true; // L: 35
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1406418583"
	)
	final String method2572() {
		if (!this.field1330.isEmpty()) { // L: 39
			return this.field1330; // L: 40
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILin;I)V",
		garbageValue = "1389933188"
	)
	final void method2573(int var1, class217 var2) {
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

		if (super.sequence != -1 && EnumComposition.SequenceDefinition_get(super.sequence).field2326 == 1) { // L: 75
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-2120679358"
	)
	final void method2574(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && EnumComposition.SequenceDefinition_get(super.sequence).field2326 == 1) { // L: 88
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
				super.pathTraversed[0] = class217.field2410; // L: 101
				return; // L: 102
			}
		}

		super.pathLength = 0; // L: 105
		super.field1261 = 0; // L: 106
		super.field1271 = 0; // L: 107
		super.pathX[0] = var1; // L: 108
		super.pathY[0] = var2; // L: 109
		super.x = super.field1201 * -876008384 + super.pathX[0] * 128;
		super.y = super.field1201 * -876008384 + super.pathY[0] * 128; // L: 111
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "2108949560"
	)
	int[] method2577() {
		return this.field1329 != null ? this.field1329.method9299() : this.definition.method3698(); // L: 150 151 153
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)[S",
		garbageValue = "17216"
	)
	short[] method2597() {
		return this.field1329 != null ? this.field1329.method9300() : this.definition.method3700(); // L: 157 158 160
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-1331637163"
	)
	void method2623(int var1, int var2, short var3) {
		if (this.field1329 == null) { // L: 164
			this.field1329 = new class515(this.definition); // L: 165
		}

		this.field1329.method9301(var1, var2, var3); // L: 167
	} // L: 168

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([I[SI)V",
		garbageValue = "1783936038"
	)
	void method2580(int[] var1, short[] var2) {
		if (this.field1329 == null) { // L: 171
			this.field1329 = new class515(this.definition); // L: 172
		}

		this.field1329.method9302(var1, var2); // L: 174
	} // L: 175

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "707622194"
	)
	void method2581() {
		this.field1329 = null; // L: 178
	} // L: 179

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lhq;I)V",
		garbageValue = "244947071"
	)
	void method2608(class194 var1) {
		this.field1332 = var1; // L: 182
	} // L: 183

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lhq;",
		garbageValue = "1386769503"
	)
	class194 method2583() {
		return this.field1332; // L: 186
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lhq;B)V",
		garbageValue = "-37"
	)
	void method2584(class194 var1) {
		this.field1331 = var1; // L: 190
	} // L: 191

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "381940201"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null; // L: 145
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1283231682"
	)
	void method2582() {
		this.field1332 = null; // L: 194
	} // L: 195

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	void method2586() {
		this.field1331 = null; // L: 198
	} // L: 199

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1698780109"
	)
	public static int method2636(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) { // L: 26 27 30
			if ((var1 & 1) != 0) {
				var2 = var0 * var2; // L: 28
			}

			var0 *= var0; // L: 29
		}

		if (var1 == 1) { // L: 32
			return var0 * var2;
		} else {
			return var2; // L: 33
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IIB)V",
		garbageValue = "-51"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args; // L: 110
		Script var4;
		if (class406.isWorldMapEvent(var0.type)) { // L: 112
			GrandExchangeOfferOwnWorldComparator.worldMapEvent = (WorldMapEvent)var3[0]; // L: 113
			WorldMapElement var6 = class138.WorldMapElement_get(GrandExchangeOfferOwnWorldComparator.worldMapEvent.mapElement); // L: 114
			var4 = GrandExchangeOfferWorldComparator.getWorldMapScript(var0.type, var6.objectId, var6.category); // L: 115
		} else {
			int var5 = (Integer)var3[0]; // L: 118
			var4 = class133.getScript(var5); // L: 119
		}

		if (var4 != null) { // L: 121
			class147.method3132(var0, var4, var1, var2); // L: 122
		}

	} // L: 124

	@ObfuscatedName("on")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-59"
	)
	public static void method2637(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3134, Client.packetWriter.isaacCipher); // L: 12825
		var4.packetBuffer.method9291(var2); // L: 12826
		var4.packetBuffer.writeShort(var1); // L: 12827
		var4.packetBuffer.method9112(var3 ? Client.field626 : 0); // L: 12828
		var4.packetBuffer.method9213(var0); // L: 12829
		Client.packetWriter.addNode(var4); // L: 12830
	} // L: 12831
}
