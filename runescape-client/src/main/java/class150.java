import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class150 extends class160 {
	@ObfuscatedName("te")
	@ObfuscatedGetter(
		intValue = -1394714240
	)
	static int field1714;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 332451705
	)
	int field1712;
	@ObfuscatedName("ah")
	byte field1708;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1037364917
	)
	int field1709;
	@ObfuscatedName("at")
	String field1711;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgt;)V"
	)
	class150(class161 var1) {
		this.this$0 = var1;
		this.field1712 = -1; // L: 103
	} // L: 108

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "33"
	)
	void vmethod3414(Buffer var1) {
		this.field1712 = var1.readUnsignedShort();
		this.field1708 = var1.readByte();
		this.field1709 = var1.readUnsignedShort(); // L: 113
		var1.readLong(); // L: 114
		this.field1711 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgi;B)V",
		garbageValue = "18"
	)
	void vmethod3413(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1712);
		var2.rank = this.field1708;
		var2.world = this.field1709; // L: 121
		var2.username = new Username(this.field1711); // L: 122
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)Ljava/lang/String;",
		garbageValue = "-1195308716"
	)
	static String method3199(Buffer var0, int var1) {
		try {
			int var2 = var0.readUShortSmart(); // L: 69
			if (var2 > var1) { // L: 70
				var2 = var1;
			}

			byte[] var3 = new byte[var2]; // L: 71
			var0.offset += class352.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 72
			String var4 = Tiles.decodeStringCp1252(var3, 0, var2); // L: 73
			return var4; // L: 74
		} catch (Exception var6) { // L: 76
			return "Cabbage"; // L: 77
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Lix;B)V",
		garbageValue = "22"
	)
	static final void method3200(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) { // L: 110
			for (var12 = 0; var12 < 8; ++var12) { // L: 111
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) { // L: 112
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var3 + var12] &= -16777217;
				}
			}
		}

		Buffer var24 = new Buffer(var0); // L: 115

		for (var12 = 0; var12 < 4; ++var12) { // L: 116
			for (int var13 = 0; var13 < 64; ++var13) { // L: 117
				for (int var14 = 0; var14 < 64; ++var14) { // L: 118
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) { // L: 119
						int var15 = var2 + GameEngine.method621(var13 & 7, var14 & 7, var7); // L: 120
						int var18 = var13 & 7; // L: 123
						int var19 = var14 & 7; // L: 124
						int var20 = var7 & 3; // L: 127
						int var17;
						if (var20 == 0) { // L: 128
							var17 = var19; // L: 129
						} else if (var20 == 1) { // L: 132
							var17 = 7 - var18; // L: 133
						} else if (var20 == 2) { // L: 136
							var17 = 7 - var19; // L: 137
						} else {
							var17 = var18; // L: 140
						}

						int var21 = var17 + var3; // L: 142
						int var22 = (var13 & 7) + var8 + var2; // L: 143
						int var23 = var3 + (var14 & 7) + var9; // L: 144
						FriendSystem.loadTerrain(var24, var1, var15, var21, var22, var23, var7); // L: 145
					} else {
						FriendSystem.loadTerrain(var24, 0, -1, -1, 0, 0, 0); // L: 147
					}
				}
			}
		}

	} // L: 151

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1804184647"
	)
	static void method3201() {
		GroundObject.field2556 = null; // L: 1294
		class315.redHintArrowSprite = null; // L: 1295
		CollisionMap.mapSceneSprites = null; // L: 1296
		class91.field1118 = null; // L: 1297
		class334.field3621 = null; // L: 1298
		class137.field1630 = null; // L: 1299
		class33.field164 = null; // L: 1300
		class286.field3130 = null; // L: 1301
		class25.field115 = null; // L: 1302
		FriendSystem.scrollBarSprites = null; // L: 1303
		class168.field1834 = null; // L: 1304
	} // L: 1305
}
