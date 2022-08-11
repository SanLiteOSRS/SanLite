import java.util.Comparator;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
class class18 implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("huffman")
	public static Huffman huffman;
	@ObfuscatedName("fn")
	@ObfuscatedGetter(
		intValue = 2076836845
	)
	@Export("worldPort")
	static int worldPort;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	final class10 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ld;)V"
	)
	class18(class10 var1) {
		this.this$0 = var1; // L: 42
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;S)I",
		garbageValue = "-13980"
	)
	int method266(Entry var1, Entry var2) {
		return ((Float)var2.getValue()).compareTo((Float)var1.getValue()); // L: 44
	}

	public int compare(Object var1, Object var2) {
		return this.method266((Entry)var1, (Entry)var2); // L: 48
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 52
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Float;Ljava/lang/Float;B)V",
		garbageValue = "-87"
	)
	static void method270(Float var0, Float var1) {
		if (var0 + class114.field1399 < 1.3333334F) { // L: 310
			float var2 = var0 - 2.0F; // L: 311
			float var3 = var0 - 1.0F; // L: 312
			float var4 = (float)Math.sqrt((double)(var2 * var2 - var3 * var3 * 4.0F)); // L: 313
			float var5 = (var4 + -var2) * 0.5F; // L: 314
			if (var1 + class114.field1399 > var5) { // L: 315
				var1 = var5 - class114.field1399; // L: 316
			} else {
				var5 = (-var2 - var4) * 0.5F; // L: 319
				if (var1 < class114.field1399 + var5) { // L: 320
					var1 = class114.field1399 + var5; // L: 321
				}
			}
		} else {
			var0 = 1.3333334F - class114.field1399; // L: 326
			var1 = 0.33333334F - class114.field1399; // L: 327
		}

	} // L: 329

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "737086376"
	)
	static final void method265(int var0, int var1, boolean var2) {
		if (!var2 || var0 != WorldMapCacheName.field2868 || SoundSystem.field319 != var1) { // L: 5720
			WorldMapCacheName.field2868 = var0; // L: 5723
			SoundSystem.field319 = var1; // L: 5724
			class82.updateGameState(25); // L: 5725
			class273.drawLoadingMessage("Loading - please wait.", true); // L: 5726
			int var3 = class300.baseX * 64; // L: 5727
			int var4 = Message.baseY * 64; // L: 5728
			class300.baseX = (var0 - 6) * 8; // L: 5729
			Message.baseY = (var1 - 6) * 8; // L: 5730
			int var5 = class300.baseX * 64 - var3; // L: 5731
			int var6 = Message.baseY * 64 - var4; // L: 5732
			var3 = class300.baseX * 64; // L: 5733
			var4 = Message.baseY * 64; // L: 5734

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5735
				NPC var19 = Client.npcs[var7]; // L: 5736
				if (var19 != null) { // L: 5737
					for (var9 = 0; var9 < 10; ++var9) { // L: 5738
						var10000 = var19.pathX; // L: 5739
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5740
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5742
					var19.y -= var6 * 128; // L: 5743
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5746
				Player var22 = Client.players[var7]; // L: 5747
				if (var22 != null) { // L: 5748
					for (var9 = 0; var9 < 10; ++var9) { // L: 5749
						var10000 = var22.pathX; // L: 5750
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5751
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5753
					var22.y -= var6 * 128; // L: 5754
				}
			}

			byte var20 = 0; // L: 5757
			byte var8 = 104; // L: 5758
			byte var21 = 1; // L: 5759
			if (var5 < 0) { // L: 5760
				var20 = 103; // L: 5761
				var8 = -1; // L: 5762
				var21 = -1; // L: 5763
			}

			byte var10 = 0; // L: 5765
			byte var11 = 104; // L: 5766
			byte var12 = 1; // L: 5767
			if (var6 < 0) { // L: 5768
				var10 = 103; // L: 5769
				var11 = -1; // L: 5770
				var12 = -1; // L: 5771
			}

			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) { // L: 5773
				for (var14 = var10; var11 != var14; var14 += var12) { // L: 5774
					int var15 = var5 + var13; // L: 5775
					int var16 = var14 + var6; // L: 5776

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5777
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5778
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5779
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5783 5784 5788
				var18.x -= var5; // L: 5785
				var18.y -= var6; // L: 5786
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5787
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5790
				Client.destinationX -= var5; // L: 5791
				Client.destinationY -= var6; // L: 5792
			}

			Client.soundEffectCount = 0; // L: 5794
			Client.isCameraLocked = false; // L: 5795
			WorldMapLabelSize.cameraX -= var5 << 7; // L: 5796
			Widget.cameraZ -= var6 << 7; // L: 5797
			ObjectSound.oculusOrbFocalPointX -= var5 << 7; // L: 5798
			class306.oculusOrbFocalPointY -= var6 << 7; // L: 5799
			Client.field518 = -1; // L: 5800
			Client.graphicsObjects.clear(); // L: 5801
			Client.projectiles.clear(); // L: 5802

			for (var14 = 0; var14 < 4; ++var14) { // L: 5803
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5721 5804
}
