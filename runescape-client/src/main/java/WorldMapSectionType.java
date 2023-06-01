import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(0, (byte)0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(3, (byte)1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lks;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(2, (byte)3);

	@ObfuscatedName("od")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	static Widget field2979;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 2119974615
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ax")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3; // L: 17
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id; // L: 23
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-591660938"
	)
	static void method5452() {
		ItemContainer.itemContainers = new NodeHashTable(32); // L: 78
	} // L: 79

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Lct;",
		garbageValue = "-108"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class20.World_worlds[++World.World_listCount - 1] : null; // L: 252 253
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "2"
	)
	static final int method5447(int var0, int var1) {
		int var2 = var1 * 57 + var0; // L: 955
		var2 ^= var2 << 13; // L: 956
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE; // L: 957
		return var3 >> 19 & 255; // L: 958
	}

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(Lmo;I)V",
		garbageValue = "-994314090"
	)
	static final void method5451(Widget var0) {
		int var1 = var0.contentType; // L: 12120
		if (var1 == 324) { // L: 12121
			if (Client.field737 == -1) { // L: 12122
				Client.field737 = var0.spriteId2; // L: 12123
				Client.field768 = var0.spriteId; // L: 12124
			}

			if (Client.playerAppearance.field3543 == 1) { // L: 12126
				var0.spriteId2 = Client.field737;
			} else {
				var0.spriteId2 = Client.field768; // L: 12127
			}

		} else if (var1 == 325) { // L: 12130
			if (Client.field737 == -1) { // L: 12131
				Client.field737 = var0.spriteId2; // L: 12132
				Client.field768 = var0.spriteId; // L: 12133
			}

			if (Client.playerAppearance.field3543 == 1) { // L: 12135
				var0.spriteId2 = Client.field768;
			} else {
				var0.spriteId2 = Client.field737; // L: 12136
			}

		} else if (var1 == 327) { // L: 12139
			var0.modelAngleX = 150; // L: 12140
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12141
			var0.modelType = 5; // L: 12142
			var0.modelId = 0; // L: 12143
		} else if (var1 == 328) { // L: 12146
			var0.modelAngleX = 150; // L: 12147
			var0.modelAngleY = (int)(Math.sin((double)Client.cycle / 40.0D) * 256.0D) & 2047; // L: 12148
			var0.modelType = 5; // L: 12149
			var0.modelId = 1; // L: 12150
		}
	} // L: 12128 12137 12144 12151 12153
}
