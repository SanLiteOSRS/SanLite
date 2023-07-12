import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class152 extends class142 {
	@ObfuscatedName("ar")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = 1005126467
	)
	@Export("cameraY")
	static int cameraY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1108833623
	)
	int field1683;
	@ObfuscatedName("an")
	String field1680;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class152(class145 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;B)V",
		garbageValue = "59"
	)
	void vmethod3381(Buffer var1) {
		this.field1683 = var1.readInt(); // L: 326
		this.field1680 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfs;B)V",
		garbageValue = "-72"
	)
	void vmethod3382(ClanSettings var1) {
		var1.method3219(this.field1683, this.field1680); // L: 331
	} // L: 332

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-987"
	)
	public static int method3196(int var0) {
		return var0 >>> 12; // L: 18
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsl;",
		garbageValue = "1"
	)
	public static class493 method3191(int var0) {
		class493 var1 = (class493)class493.DBTableType_cache.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = class493.field4983.takeFile(39, var0); // L: 25
			var1 = new class493(); // L: 26
			if (var2 != null) { // L: 27
				var1.method8792(new Buffer(var2));
			}

			var1.method8787(); // L: 28
			class493.DBTableType_cache.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1415834229"
	)
	static final void method3194(boolean var0) {
		if (var0) { // L: 3091
			Client.field677 = Login.field942 ? class138.field1606 : class138.field1609; // L: 3092
		} else {
			Client.field677 = class10.clientPreferences.method2484(Login.Login_username) ? class138.field1607 : class138.field1608; // L: 3095
		}

	} // L: 3097

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1622212855"
	)
	static final void method3199(int var0, int var1, int var2, int var3) {
		Client.field755 = 0; // L: 5656
		boolean var4 = false; // L: 5657
		int var5 = -1; // L: 5658
		int var6 = -1; // L: 5659
		int var7 = Players.Players_count; // L: 5660
		int[] var8 = Players.Players_indices; // L: 5661

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 5662
			Object var21;
			if (var9 < var7) { // L: 5664
				var21 = Client.players[var8[var9]]; // L: 5665
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 5666
					var4 = true; // L: 5667
					var5 = var9; // L: 5668
					continue;
				}

				if (var21 == Projectile.localPlayer) { // L: 5671
					var6 = var9; // L: 5672
					continue; // L: 5673
				}
			} else {
				var21 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 5676
			}

			class322.drawActor2d((Actor)var21, var9, var0, var1, var2, var3); // L: 5677
		}

		if (Client.field751 && var6 != -1) { // L: 5679
			class322.drawActor2d(Projectile.localPlayer, var6, var0, var1, var2, var3); // L: 5680
		}

		if (var4) { // L: 5682
			class322.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 5683
		}

		for (var9 = 0; var9 < Client.field755; ++var9) { // L: 5685
			int var10 = Client.field608[var9]; // L: 5686
			int var11 = Client.field609[var9]; // L: 5687
			int var12 = Client.field611[var9]; // L: 5688
			int var13 = Client.field610[var9]; // L: 5689
			boolean var14 = true; // L: 5690

			while (var14) {
				var14 = false; // L: 5692

				for (int var20 = 0; var20 < var9; ++var20) { // L: 5693
					if (var11 + 2 > Client.field609[var20] - Client.field610[var20] && var11 - var13 < Client.field609[var20] + 2 && var10 - var12 < Client.field608[var20] + Client.field611[var20] && var10 + var12 > Client.field608[var20] - Client.field611[var20] && Client.field609[var20] - Client.field610[var20] < var11) { // L: 5694 5695
						var11 = Client.field609[var20] - Client.field610[var20]; // L: 5696
						var14 = true; // L: 5697
					}
				}
			}

			Client.viewportTempX = Client.field608[var9]; // L: 5702
			Client.viewportTempY = Client.field609[var9] = var11; // L: 5703
			String var15 = Client.field616[var9]; // L: 5704
			if (Client.chatEffects == 0) { // L: 5705
				int var16 = 16776960; // L: 5706
				if (Client.field696[var9] < 6) { // L: 5707
					var16 = Client.field577[Client.field696[var9]];
				}

				if (Client.field696[var9] == 6) { // L: 5708
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field696[var9] == 7) { // L: 5709
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field696[var9] == 8) { // L: 5710
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.field696[var9] == 9) { // L: 5711
					var17 = 150 - Client.field528[var9]; // L: 5712
					if (var17 < 50) { // L: 5713
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 5714
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5715
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.field696[var9] == 10) { // L: 5717
					var17 = 150 - Client.field528[var9]; // L: 5718
					if (var17 < 50) { // L: 5719
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 5720
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5721
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.field696[var9] == 11) { // L: 5723
					var17 = 150 - Client.field528[var9]; // L: 5724
					if (var17 < 50) { // L: 5725
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 5726
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 5727
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				int var18;
				if (Client.field696[var9] == 12 && Client.field614[var9] == null) { // L: 5729 5730
					var17 = var15.length(); // L: 5731
					Client.field614[var9] = new int[var17]; // L: 5732

					for (var18 = 0; var18 < var17; ++var18) { // L: 5733
						int var19 = (int)((float)var18 / (float)var17 * 64.0F); // L: 5734
						Client.field614[var9][var18] = class454.field4744[var19 << 10 | 896 | 64]; // L: 5735
					}
				}

				if (Client.field543[var9] == 0) { // L: 5739
					class166.fontBold12.method7416(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.field614[var9]);
				}

				if (Client.field543[var9] == 1) { // L: 5740
					class166.fontBold12.method7433(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field614[var9]);
				}

				if (Client.field543[var9] == 2) { // L: 5741
					class166.fontBold12.method7434(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field614[var9]);
				}

				if (Client.field543[var9] == 3) { // L: 5742
					class166.fontBold12.method7488(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.field528[var9], Client.field614[var9]);
				}

				if (Client.field543[var9] == 4) { // L: 5743
					var17 = (150 - Client.field528[var9]) * (class166.fontBold12.stringWidth(var15) + 100) / 150; // L: 5744
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5745
					class166.fontBold12.method7435(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0, Client.field614[var9]); // L: 5746
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5747
				}

				if (Client.field543[var9] == 5) { // L: 5749
					var17 = 150 - Client.field528[var9]; // L: 5750
					var18 = 0; // L: 5751
					if (var17 < 25) {
						var18 = var17 - 25; // L: 5752
					} else if (var17 > 125) { // L: 5753
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class166.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5754
					class166.fontBold12.method7416(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0, Client.field614[var9]); // L: 5755
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5756
				}
			} else {
				class166.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5760
			}
		}

	} // L: 5763
}
