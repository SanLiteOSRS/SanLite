import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("musicTrack")
	public static MusicTrack musicTrack;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	static Widget field1223;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1908074347
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 11116483
	)
	@Export("health")
	int health;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1347663599
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1243117035
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1; // L: 12
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1074804997"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		Decimator.addChatMessage(var0, var1, var2, (String)null);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[SIIB)V",
		garbageValue = "-127"
	)
	@Export("sortItemsByName")
	static void sortItemsByName(String[] var0, short[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 13
			int var4 = (var3 + var2) / 2; // L: 14
			int var5 = var2; // L: 15
			String var6 = var0[var4]; // L: 16
			var0[var4] = var0[var3]; // L: 17
			var0[var3] = var6; // L: 18
			short var7 = var1[var4]; // L: 19
			var1[var4] = var1[var3]; // L: 20
			var1[var3] = var7; // L: 21

			for (int var8 = var2; var8 < var3; ++var8) { // L: 22
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 23
					String var9 = var0[var8]; // L: 24
					var0[var8] = var0[var5]; // L: 25
					var0[var5] = var9; // L: 26
					short var10 = var1[var8]; // L: 27
					var1[var8] = var1[var5]; // L: 28
					var1[var5++] = var10; // L: 29
				}
			}

			var0[var3] = var0[var5]; // L: 33
			var0[var5] = var6; // L: 34
			var1[var3] = var1[var5]; // L: 35
			var1[var5] = var7; // L: 36
			sortItemsByName(var0, var1, var2, var5 - 1); // L: 37
			sortItemsByName(var0, var1, var5 + 1, var3); // L: 38
		}

	} // L: 40

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ler;FFFFFFFFI)V",
		garbageValue = "-47311106"
	)
	static void method2387(class129 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) { // L: 284
			var0.field1511 = var1; // L: 287
			float var9 = var4 - var1; // L: 288
			float var10 = var8 - var5; // L: 289
			float var11 = var2 - var1; // L: 290
			float var12 = 0.0F; // L: 291
			float var13 = 0.0F; // L: 292
			if (0.0D != (double)var11) { // L: 293
				var12 = (var6 - var5) / var11; // L: 294
			}

			var11 = var4 - var3; // L: 296
			if (0.0D != (double)var11) { // L: 297
				var13 = (var8 - var7) / var11; // L: 298
			}

			float var14 = 1.0F / (var9 * var9); // L: 300
			float var15 = var12 * var9; // L: 301
			float var16 = var13 * var9; // L: 302
			var0.field1526 = var14 * (var16 + var15 - var10 - var10) / var9; // L: 303
			var0.field1514 = var14 * (var10 + var10 + var10 - var15 - var15 - var16); // L: 304
			var0.field1515 = var12; // L: 305
			var0.field1516 = var5; // L: 306
		}
	} // L: 285 307

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lir;B)V",
		garbageValue = "-72"
	)
	static final void method2391(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 90
			for (var7 = 0; var7 < 64; ++var7) { // L: 91
				for (var8 = 0; var8 < 64; ++var8) { // L: 92
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 93
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var12 = new Buffer(var0); // L: 97

		for (var7 = 0; var7 < 4; ++var7) { // L: 98
			for (var8 = 0; var8 < 64; ++var8) { // L: 99
				for (int var9 = 0; var9 < 64; ++var9) { // L: 100
					int var10 = var8 + var1; // L: 101
					int var11 = var9 + var2; // L: 102
					class157.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0); // L: 103
				}
			}
		}

	} // L: 107

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1230227693"
	)
	public static void method2392() {
		Widget.Widget_cachedSprites.clear(); // L: 701
		Widget.Widget_cachedModels.clear(); // L: 702
		Widget.Widget_cachedFonts.clear(); // L: 703
		Widget.Widget_cachedSpriteMasks.clear(); // L: 704
	} // L: 705

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(ZLtn;I)V",
		garbageValue = "-822566460"
	)
	static final void method2390(boolean var0, PacketBuffer var1) {
		while (true) {
			byte var2 = 16; // L: 8504
			int var3 = 1 << var2; // L: 8505
			if (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= var2 + 12) { // L: 8506
				int var4 = var1.readBits(var2); // L: 8507
				if (var4 != var3 - 1) { // L: 8508
					boolean var5 = false; // L: 8509
					if (Client.npcs[var4] == null) { // L: 8510
						Client.npcs[var4] = new NPC(); // L: 8511
						var5 = true; // L: 8512
					}

					NPC var6 = Client.npcs[var4]; // L: 8514
					Client.npcIndices[++Client.npcCount - 1] = var4; // L: 8515
					var6.npcCycle = Client.cycle; // L: 8516
					var6.definition = class407.getNpcDefinition(var1.readBits(14)); // L: 8520
					int var7 = var1.readBits(1); // L: 8521
					int var10 = Client.field634[var1.readBits(3)]; // L: 8522
					if (var5) { // L: 8523
						var6.orientation = var6.rotation = var10;
					}

					int var8;
					if (var0) { // L: 8524
						var8 = var1.readBits(8); // L: 8525
						if (var8 > 127) { // L: 8526
							var8 -= 256;
						}
					} else {
						var8 = var1.readBits(5); // L: 8529
						if (var8 > 15) { // L: 8530
							var8 -= 32;
						}
					}

					boolean var11 = var1.readBits(1) == 1; // L: 8532
					if (var11) { // L: 8533
						var1.readBits(32); // L: 8534
					}

					int var9;
					if (var0) { // L: 8536
						var9 = var1.readBits(8); // L: 8537
						if (var9 > 127) { // L: 8538
							var9 -= 256;
						}
					} else {
						var9 = var1.readBits(5); // L: 8541
						if (var9 > 15) { // L: 8542
							var9 -= 32;
						}
					}

					int var12 = var1.readBits(1); // L: 8544
					if (var12 == 1) { // L: 8545
						Client.field512[++Client.field542 - 1] = var4;
					}

					DevicePcmPlayerProvider.method299(var6); // L: 8546
					if (var6.field1209 == 0) { // L: 8547
						var6.rotation = 0;
					}

					var6.method2572(HitSplatDefinition.localPlayer.pathX[0] + var8, HitSplatDefinition.localPlayer.pathY[0] + var9, var7 == 1); // L: 8548
					continue; // L: 8549
				}
			}

			var1.exportIndex(); // L: 8550
			return; // L: 8551
		}
	}
}
