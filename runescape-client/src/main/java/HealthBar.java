import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("au")
	static String[] field1327;
	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static GameBuild field1325;
	@ObfuscatedName("qd")
	@ObfuscatedSignature(
		descriptor = "Lge;"
	)
	static class176 field1324;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhl;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lhl;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "686447738"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 35

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ldz;",
		garbageValue = "-2125078330"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycle + var2.cycleOffset > var1) { // L: 47
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "987709331"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method7356(); // L: 55
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lsq;",
		garbageValue = "-1783903319"
	)
	public static class470 method2579() {
		synchronized(class470.field4870) { // L: 27
			if (ByteArrayPool.field4688 == 0) { // L: 28
				return new class470();
			} else {
				class470.field4870[--ByteArrayPool.field4688].method8418(); // L: 30
				return class470.field4870[ByteArrayPool.field4688]; // L: 31
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1008757028"
	)
	public static boolean method2576(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) { // L: 45
			return true;
		} else {
			if (var0 != 0) { // L: 46
				char[] var1 = class404.cp1252AsciiExtension; // L: 48

				for (int var2 = 0; var2 < var1.length; ++var2) { // L: 49
					char var3 = var1[var2]; // L: 50
					if (var0 == var3) { // L: 52
						return true; // L: 53
					}
				}
			}

			return false; // L: 59
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "1670480615"
	)
	public static void method2572(ArrayList var0, int var1, int var2, int var3, int var4) {
		class321.field3496.clear(); // L: 169
		class321.field3496.addAll(var0); // L: 170
		WorldMapSection2.method5289(var1, var2, var3, var4); // L: 171
	} // L: 172

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1842701020"
	)
	public static int method2577(int var0) {
		if (var0 > 0) { // L: 198
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 199 200
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "32"
	)
	static final void method2578(int var0, int var1, int var2, int var3) {
		Client.field613 = 0; // L: 5683
		boolean var4 = false; // L: 5684
		int var5 = -1; // L: 5685
		int var6 = -1; // L: 5686
		int var7 = Players.Players_count; // L: 5687
		int[] var8 = Players.Players_indices; // L: 5688

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 5689
			Object var22;
			if (var9 < var7) { // L: 5691
				var22 = Client.players[var8[var9]]; // L: 5692
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 5693
					var4 = true; // L: 5694
					var5 = var9; // L: 5695
					continue;
				}

				if (var22 == class133.localPlayer) { // L: 5698
					var6 = var9; // L: 5699
					continue; // L: 5700
				}
			} else {
				var22 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 5703
			}

			class182.drawActor2d((Actor)var22, var9, var0, var1, var2, var3); // L: 5704
		}

		if (Client.field598 && var6 != -1) { // L: 5706
			class182.drawActor2d(class133.localPlayer, var6, var0, var1, var2, var3); // L: 5707
		}

		if (var4) { // L: 5709
			class182.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 5710
		}

		for (var9 = 0; var9 < Client.field613; ++var9) { // L: 5712
			int var10 = Client.field615[var9]; // L: 5713
			int var11 = Client.field616[var9]; // L: 5714
			int var12 = Client.field604[var9]; // L: 5715
			int var13 = Client.field775[var9]; // L: 5716
			boolean var14 = true; // L: 5717

			while (var14) {
				var14 = false; // L: 5719

				for (int var21 = 0; var21 < var9; ++var21) { // L: 5720
					if (var11 + 2 > Client.field616[var21] - Client.field775[var21] && var11 - var13 < Client.field616[var21] + 2 && var10 - var12 < Client.field604[var21] + Client.field615[var21] && var10 + var12 > Client.field615[var21] - Client.field604[var21] && Client.field616[var21] - Client.field775[var21] < var11) { // L: 5721 5722
						var11 = Client.field616[var21] - Client.field775[var21]; // L: 5723
						var14 = true; // L: 5724
					}
				}
			}

			Client.viewportTempX = Client.field615[var9]; // L: 5729
			Client.viewportTempY = Client.field616[var9] = var11; // L: 5730
			String var15 = Client.field751[var9]; // L: 5731
			if (Client.chatEffects == 0) { // L: 5732
				int var16 = 16776960; // L: 5733
				if (Client.field619[var9] < 6) { // L: 5734
					var16 = Client.field738[Client.field619[var9]];
				}

				if (Client.field619[var9] == 6) { // L: 5735
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field619[var9] == 7) { // L: 5736
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field619[var9] == 8) { // L: 5737
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.field619[var9] == 9) { // L: 5738
					var17 = 150 - Client.field636[var9]; // L: 5739
					if (var17 < 50) { // L: 5740
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 5741
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5742
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.field619[var9] == 10) { // L: 5744
					var17 = 150 - Client.field636[var9]; // L: 5745
					if (var17 < 50) { // L: 5746
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 5747
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5748
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.field619[var9] == 11) { // L: 5750
					var17 = 150 - Client.field636[var9]; // L: 5751
					if (var17 < 50) { // L: 5752
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 5753
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 5754
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				int var18;
				if (Client.field619[var9] == 12 && Client.field779[var9] == null) { // L: 5756 5757
					var17 = var15.length(); // L: 5758
					Client.field779[var9] = new int[var17]; // L: 5759

					for (var18 = 0; var18 < var17; ++var18) { // L: 5760
						int var19 = (int)(64.0F * ((float)var18 / (float)var17)); // L: 5761
						int var20 = var19 << 10 | 896 | 64; // L: 5762
						Client.field779[var9][var18] = class486.field4928[var20]; // L: 5763
					}
				}

				if (Client.field793[var9] == 0) { // L: 5767
					DevicePcmPlayerProvider.fontBold12.method7749(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.field779[var9]);
				}

				if (Client.field793[var9] == 1) { // L: 5768
					DevicePcmPlayerProvider.fontBold12.method7667(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field779[var9]);
				}

				if (Client.field793[var9] == 2) { // L: 5769
					DevicePcmPlayerProvider.fontBold12.method7668(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field779[var9]);
				}

				if (Client.field793[var9] == 3) { // L: 5770
					DevicePcmPlayerProvider.fontBold12.method7669(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.field636[var9], Client.field779[var9]);
				}

				if (Client.field793[var9] == 4) { // L: 5771
					var17 = (150 - Client.field636[var9]) * (DevicePcmPlayerProvider.fontBold12.stringWidth(var15) + 100) / 150; // L: 5772
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5773
					DevicePcmPlayerProvider.fontBold12.method7670(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0, Client.field779[var9]); // L: 5774
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5775
				}

				if (Client.field793[var9] == 5) { // L: 5777
					var17 = 150 - Client.field636[var9]; // L: 5778
					var18 = 0; // L: 5779
					if (var17 < 25) { // L: 5780
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 5781
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - DevicePcmPlayerProvider.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5782
					DevicePcmPlayerProvider.fontBold12.method7749(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0, Client.field779[var9]); // L: 5783
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5784
				}
			} else {
				DevicePcmPlayerProvider.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5788
			}
		}

	} // L: 5791
}
