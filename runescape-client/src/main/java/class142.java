import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class142 extends class143 {
	@ObfuscatedName("ga")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field1632;
	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "[Luc;"
	)
	static SpritePixels[] field1634;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 200458123
	)
	int field1633;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class142(class146 var1) {
		this.this$0 = var1;
		this.field1633 = -1; // L: 114
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1633 = var1.readUnsignedShort();
	} // L: 120

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3410(this.field1633);
	} // L: 124

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIII)V",
		garbageValue = "-1945568953"
	)
	@Export("sortItemsByName")
	public static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 9
			int var4 = (var3 + var2) / 2; // L: 10
			int var5 = var2; // L: 11
			String var6 = var0[var4]; // L: 12
			var0[var4] = var0[var3]; // L: 13
			var0[var3] = var6; // L: 14
			short var7 = var1[var4]; // L: 15
			var1[var4] = var1[var3]; // L: 16
			var1[var3] = var7; // L: 17

			for (int var8 = var2; var8 < var3; ++var8) { // L: 18
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 19
					String var9 = var0[var8]; // L: 20
					var0[var8] = var0[var5]; // L: 21
					var0[var5] = var9; // L: 22
					short var10 = var1[var8]; // L: 23
					var1[var8] = var1[var5]; // L: 24
					var1[var5++] = var10; // L: 25
				}
			}

			var0[var3] = var0[var5]; // L: 29
			var0[var5] = var6; // L: 30
			var1[var3] = var1[var5]; // L: 31
			var1[var5] = var7; // L: 32
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 33
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 34
		}

	} // L: 36

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Lii;I)V",
		garbageValue = "-1564534428"
	)
	static final void method3226(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) { // L: 110
			for (var12 = 0; var12 < 8; ++var12) { // L: 111
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) { // L: 112
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var12 + var3] &= -16777217;
				}
			}
		}

		Buffer var24 = new Buffer(var0); // L: 115

		for (var12 = 0; var12 < 4; ++var12) { // L: 116
			for (int var13 = 0; var13 < 64; ++var13) { // L: 117
				for (int var14 = 0; var14 < 64; ++var14) { // L: 118
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) { // L: 119
						int var17 = var13 & 7; // L: 122
						int var18 = var14 & 7; // L: 123
						int var19 = var7 & 3; // L: 126
						int var16;
						if (var19 == 0) { // L: 127
							var16 = var17; // L: 128
						} else if (var19 == 1) { // L: 131
							var16 = var18; // L: 132
						} else if (var19 == 2) { // L: 135
							var16 = 7 - var17; // L: 136
						} else {
							var16 = 7 - var18; // L: 139
						}

						int var20 = var2 + var16; // L: 141
						int var21 = var3 + class412.method7750(var13 & 7, var14 & 7, var7); // L: 142
						int var22 = (var13 & 7) + var8 + var2; // L: 143
						int var23 = var3 + (var14 & 7) + var9; // L: 144
						class136.loadTerrain(var24, var1, var20, var21, var22, var23, var7); // L: 145
					} else {
						class136.loadTerrain(var24, 0, -1, -1, 0, 0, 0); // L: 147
					}
				}
			}
		}

	} // L: 151

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1732088671"
	)
	public static int method3221(int var0, int var1) {
		int var2 = var0 >>> 31; // L: 97
		return (var0 + var2) / var1 - var2; // L: 98
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-405183426"
	)
	public static void method3224() {
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 423
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 424
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 425
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 426
	} // L: 427

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "603647012"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0; // L: 1937
		Login.Login_response2 = var1; // L: 1938
		Login.Login_response3 = var2; // L: 1939
	} // L: 1940

	@ObfuscatedName("la")
	@ObfuscatedSignature(
		descriptor = "(Lds;I)V",
		garbageValue = "718617854"
	)
	static void method3229(NPC var0) {
		var0.field1175 = var0.definition.size * 64; // L: 9061
		var0.field1240 = var0.definition.rotation; // L: 9062
		var0.walkSequence = var0.definition.walkSequence; // L: 9063
		var0.walkBackSequence = var0.definition.walkBackSequence; // L: 9064
		var0.walkLeftSequence = var0.definition.walkLeftSequence; // L: 9065
		var0.walkRightSequence = var0.definition.walkRightSequence; // L: 9066
		var0.idleSequence = var0.definition.idleSequence; // L: 9067
		var0.field1236 = var0.definition.turnLeftSequence; // L: 9068
		var0.field1179 = var0.definition.turnRightSequence; // L: 9069
		var0.runSequence = var0.definition.field1962; // L: 9070
		var0.field1187 = var0.definition.field1963; // L: 9071
		var0.field1186 = var0.definition.field1964; // L: 9072
		var0.field1218 = var0.definition.field1965; // L: 9073
		var0.field1188 = var0.definition.field1974; // L: 9074
		var0.field1178 = var0.definition.field1967; // L: 9075
		var0.field1190 = var0.definition.field1968; // L: 9076
		var0.field1191 = var0.definition.field1969; // L: 9077
	} // L: 9078
}
