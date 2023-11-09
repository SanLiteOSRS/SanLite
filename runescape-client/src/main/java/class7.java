import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("al")
public class class7 {
	@ObfuscatedName("gm")
	@ObfuscatedGetter(
		intValue = -1894298815
	)
	static int field27;
	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("af")
	ExecutorService field30;
	@ObfuscatedName("an")
	Future field28;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	final Buffer field24;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lac;"
	)
	final class3 field26;

	@ObfuscatedSignature(
		descriptor = "(Lsg;Lac;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field30 = Executors.newSingleThreadExecutor(); // L: 10
		this.field24 = var1; // L: 16
		this.field26 = var2; // L: 17
		this.method51(); // L: 18
	} // L: 19

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-571674084"
	)
	public boolean method58() {
		return this.field28.isDone(); // L: 22
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "47"
	)
	public void method49() {
		this.field30.shutdown(); // L: 26
		this.field30 = null; // L: 27
	} // L: 28

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lsg;",
		garbageValue = "1213555586"
	)
	public Buffer method50() {
		try {
			return (Buffer)this.field28.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "32199"
	)
	void method51() {
		this.field28 = this.field30.submit(new class1(this, this.field24, this.field26)); // L: 40
	} // L: 41

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(DIII)V",
		garbageValue = "-1907908914"
	)
	@Export("Rasterizer3D_buildPalette")
	static void Rasterizer3D_buildPalette(double var0, int var2, int var3) {
		int var4 = var2 * 128; // L: 49

		for (int var5 = var2; var5 < var3; ++var5) { // L: 50
			double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D; // L: 51
			double var8 = 0.0625D + (double)(var5 & 7) / 8.0D; // L: 52

			for (int var10 = 0; var10 < 128; ++var10) { // L: 53
				double var11 = (double)var10 / 128.0D; // L: 54
				double var13 = var11; // L: 55
				double var15 = var11; // L: 56
				double var17 = var11; // L: 57
				if (var8 != 0.0D) { // L: 58
					double var19;
					if (var11 < 0.5D) { // L: 60
						var19 = var11 * (1.0D + var8);
					} else {
						var19 = var8 + var11 - var8 * var11; // L: 61
					}

					double var21 = var11 * 2.0D - var19; // L: 62
					double var23 = var6 + 0.3333333333333333D; // L: 63
					if (var23 > 1.0D) { // L: 64
						--var23;
					}

					double var27 = var6 - 0.3333333333333333D; // L: 66
					if (var27 < 0.0D) { // L: 67
						++var27;
					}

					if (var23 * 6.0D < 1.0D) { // L: 68
						var13 = var23 * 6.0D * (var19 - var21) + var21;
					} else if (2.0D * var23 < 1.0D) { // L: 69
						var13 = var19;
					} else if (var23 * 3.0D < 2.0D) { // L: 70
						var13 = var21 + 6.0D * (0.6666666666666666D - var23) * (var19 - var21);
					} else {
						var13 = var21; // L: 71
					}

					if (var6 * 6.0D < 1.0D) { // L: 72
						var15 = var21 + (var19 - var21) * 6.0D * var6;
					} else if (var6 * 2.0D < 1.0D) { // L: 73
						var15 = var19;
					} else if (var6 * 3.0D < 2.0D) { // L: 74
						var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
					} else {
						var15 = var21; // L: 75
					}

					if (6.0D * var27 < 1.0D) { // L: 76
						var17 = var27 * (var19 - var21) * 6.0D + var21;
					} else if (var27 * 2.0D < 1.0D) { // L: 77
						var17 = var19;
					} else if (3.0D * var27 < 2.0D) { // L: 78
						var17 = 6.0D * (var19 - var21) * (0.6666666666666666D - var27) + var21;
					} else {
						var17 = var21; // L: 79
					}
				}

				int var29 = (int)(256.0D * var13); // L: 81
				int var20 = (int)(256.0D * var15); // L: 82
				int var30 = (int)(256.0D * var17); // L: 83
				int var22 = var30 + (var20 << 8) + (var29 << 16); // L: 84
				var22 = UrlRequest.Rasterizer3D_brighten(var22, var0); // L: 85
				if (var22 == 0) { // L: 86
					var22 = 1;
				}

				Rasterizer3D.Rasterizer3D_colorPalette[var4++] = var22; // L: 87
			}
		}

	} // L: 90

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lmq;I[B[BI)V",
		garbageValue = "1887295232"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3645 == null) { // L: 1197
			if (var2 == null) { // L: 1198
				return; // L: 1204
			}

			var0.field3645 = new byte[11][]; // L: 1199
			var0.field3646 = new byte[11][]; // L: 1200
			var0.field3627 = new int[11]; // L: 1201
			var0.field3670 = new int[11]; // L: 1202
		}

		var0.field3645[var1] = var2; // L: 1206
		if (var2 != null) {
			var0.field3581 = true; // L: 1207
		} else {
			var0.field3581 = false; // L: 1209

			for (int var4 = 0; var4 < var0.field3645.length; ++var4) { // L: 1210
				if (var0.field3645[var4] != null) { // L: 1211
					var0.field3581 = true; // L: 1212
					break;
				}
			}
		}

		var0.field3646[var1] = var3; // L: 1217
	} // L: 1218

	@ObfuscatedName("md")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2026496728"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		ClientPacket.method5688(); // L: 11684
		class18.method283(); // L: 11685
		int var1 = GraphicsDefaults.VarpDefinition_get(var0).type; // L: 11686
		if (var1 != 0) { // L: 11687
			int var2 = Varps.Varps_main[var0]; // L: 11688
			if (var1 == 1) { // L: 11689
				if (var2 == 1) { // L: 11690
					ScriptFrame.method1164(0.9D);
				}

				if (var2 == 2) { // L: 11691
					ScriptFrame.method1164(0.8D);
				}

				if (var2 == 3) { // L: 11692
					ScriptFrame.method1164(0.7D);
				}

				if (var2 == 4) { // L: 11693
					ScriptFrame.method1164(0.6D);
				}
			}

			if (var1 == 3) { // L: 11695
				if (var2 == 0) { // L: 11696
					class86.method2286(255);
				}

				if (var2 == 1) { // L: 11697
					class86.method2286(192);
				}

				if (var2 == 2) { // L: 11698
					class86.method2286(128);
				}

				if (var2 == 3) { // L: 11699
					class86.method2286(64);
				}

				if (var2 == 4) { // L: 11700
					class86.method2286(0);
				}
			}

			if (var1 == 4) { // L: 11702
				if (var2 == 0) { // L: 11703
					class130.method3125(127);
				}

				if (var2 == 1) { // L: 11704
					class130.method3125(96);
				}

				if (var2 == 2) { // L: 11705
					class130.method3125(64);
				}

				if (var2 == 3) { // L: 11706
					class130.method3125(32);
				}

				if (var2 == 4) { // L: 11707
					class130.method3125(0);
				}
			}

			if (var1 == 5) { // L: 11709
				Client.field630 = var2 == 1;
			}

			if (var1 == 6) { // L: 11710
				Client.chatEffects = var2;
			}

			if (var1 == 9) { // L: 11711
			}

			if (var1 == 10) { // L: 11712
				if (var2 == 0) { // L: 11713
					class135.method3182(127);
				}

				if (var2 == 1) { // L: 11714
					class135.method3182(96);
				}

				if (var2 == 2) { // L: 11715
					class135.method3182(64);
				}

				if (var2 == 3) { // L: 11716
					class135.method3182(32);
				}

				if (var2 == 4) { // L: 11717
					class135.method3182(0);
				}
			}

			if (var1 == 17) { // L: 11719
				Client.followerIndex = var2 & 65535; // L: 11720
			}

			if (var1 == 18) { // L: 11722
				Client.playerAttackOption = (AttackOption)StructComposition.findEnumerated(UserComparator4.method2885(), var2); // L: 11723
				if (Client.playerAttackOption == null) { // L: 11724
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 11726
				if (var2 == -1) { // L: 11727
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 11728
				}
			}

			if (var1 == 22) { // L: 11730
				Client.npcAttackOption = (AttackOption)StructComposition.findEnumerated(UserComparator4.method2885(), var2); // L: 11731
				if (Client.npcAttackOption == null) { // L: 11732
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 11734
}
