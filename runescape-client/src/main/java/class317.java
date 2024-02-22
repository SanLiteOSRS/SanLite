import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
public final class class317 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 4265980981988299735L
	)
	static long field3452;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -862621412235294415L
	)
	static long field3451;
	@ObfuscatedName("iq")
	@ObfuscatedGetter(
		intValue = 263905059
	)
	static int field3456;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = -766053417
	)
	@Export("cameraZ")
	static int cameraZ;

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(Luh;B)Ljava/lang/Object;",
		garbageValue = "0"
	)
	static Object method6067(class521 var0) {
		if (var0 == null) { // L: 5378
			throw new IllegalStateException("popValueOfType() failure - null baseVarType"); // L: 5379
		} else {
			switch(var0.field5127) { // L: 5381
			case 0:
				return Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize]; // L: 5385
			case 1:
				return Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 5383
			default:
				throw new IllegalStateException("popValueOfType() failure - unsupported type"); // L: 5387
			}
		}
	}

	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "910821399"
	)
	static final void method6071(int var0, int var1, int var2, int var3) {
		Client.field629 = 0; // L: 5645
		boolean var4 = false; // L: 5646
		int var5 = -1; // L: 5647
		int var6 = -1; // L: 5648
		int var7 = Players.Players_count; // L: 5649
		int[] var8 = Players.Players_indices; // L: 5650

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) { // L: 5651
			Object var22;
			if (var9 < var7) { // L: 5653
				var22 = Client.players[var8[var9]]; // L: 5654
				if (var8[var9] == Client.combatTargetPlayerIndex) { // L: 5655
					var4 = true; // L: 5656
					var5 = var9; // L: 5657
					continue;
				}

				if (var22 == VarpDefinition.localPlayer) { // L: 5660
					var6 = var9; // L: 5661
					continue; // L: 5662
				}
			} else {
				var22 = Client.npcs[Client.npcIndices[var9 - var7]]; // L: 5665
			}

			Occluder.drawActor2d((Actor)var22, var9, var0, var1, var2, var3); // L: 5666
		}

		if (Client.field656 && var6 != -1) { // L: 5668
			Occluder.drawActor2d(VarpDefinition.localPlayer, var6, var0, var1, var2, var3); // L: 5669
		}

		if (var4) { // L: 5671
			Occluder.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3); // L: 5672
		}

		for (var9 = 0; var9 < Client.field629; ++var9) { // L: 5674
			int var10 = Client.field631[var9]; // L: 5675
			int var11 = Client.field796[var9]; // L: 5676
			int var12 = Client.field562[var9]; // L: 5677
			int var13 = Client.field633[var9]; // L: 5678
			boolean var14 = true; // L: 5679

			while (var14) {
				var14 = false; // L: 5681

				for (int var21 = 0; var21 < var9; ++var21) { // L: 5682
					if (var11 + 2 > Client.field796[var21] - Client.field633[var21] && var11 - var13 < Client.field796[var21] + 2 && var10 - var12 < Client.field631[var21] + Client.field562[var21] && var10 + var12 > Client.field631[var21] - Client.field562[var21] && Client.field796[var21] - Client.field633[var21] < var11) { // L: 5683 5684
						var11 = Client.field796[var21] - Client.field633[var21]; // L: 5685
						var14 = true; // L: 5686
					}
				}
			}

			Client.viewportTempX = Client.field631[var9]; // L: 5691
			Client.viewportTempY = Client.field796[var9] = var11; // L: 5692
			String var15 = Client.field769[var9]; // L: 5693
			if (Client.chatEffects == 0) { // L: 5694
				int var16 = 16776960; // L: 5695
				if (Client.field635[var9] < 6) { // L: 5696
					var16 = Client.field758[Client.field635[var9]];
				}

				if (Client.field635[var9] == 6) { // L: 5697
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.field635[var9] == 7) { // L: 5698
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.field635[var9] == 8) { // L: 5699
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.field635[var9] == 9) { // L: 5700
					var17 = 150 - Client.field638[var9]; // L: 5701
					if (var17 < 50) { // L: 5702
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) { // L: 5703
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5704
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.field635[var9] == 10) { // L: 5706
					var17 = 150 - Client.field638[var9]; // L: 5707
					if (var17 < 50) { // L: 5708
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) { // L: 5709
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) { // L: 5710
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.field635[var9] == 11) { // L: 5712
					var17 = 150 - Client.field638[var9]; // L: 5713
					if (var17 < 50) { // L: 5714
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) { // L: 5715
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) { // L: 5716
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				int var18;
				if (Client.field635[var9] == 12 && Client.field637[var9] == null) { // L: 5718 5719
					var17 = var15.length(); // L: 5720
					Client.field637[var9] = new int[var17]; // L: 5721

					for (var18 = 0; var18 < var17; ++var18) { // L: 5722
						int var19 = (int)((float)var18 / (float)var17 * 64.0F); // L: 5723
						int var20 = var19 << 10 | 896 | 64; // L: 5724
						Client.field637[var9][var18] = class485.field4904[var20]; // L: 5725
					}
				}

				if (Client.field636[var9] == 0) { // L: 5729
					class166.fontBold12.method7917(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.field637[var9]);
				}

				if (Client.field636[var9] == 1) { // L: 5730
					class166.fontBold12.method7850(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field637[var9]);
				}

				if (Client.field636[var9] == 2) { // L: 5731
					class166.fontBold12.method7883(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field637[var9]);
				}

				if (Client.field636[var9] == 3) { // L: 5732
					class166.fontBold12.method7852(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.field638[var9], Client.field637[var9]);
				}

				if (Client.field636[var9] == 4) { // L: 5733
					var17 = (150 - Client.field638[var9]) * (class166.fontBold12.stringWidth(var15) + 100) / 150; // L: 5734
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1); // L: 5735
					class166.fontBold12.method7854(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0, Client.field637[var9]); // L: 5736
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5737
				}

				if (Client.field636[var9] == 5) { // L: 5739
					var17 = 150 - Client.field638[var9]; // L: 5740
					var18 = 0; // L: 5741
					if (var17 < 25) { // L: 5742
						var18 = var17 - 25;
					} else if (var17 > 125) { // L: 5743
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class166.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5); // L: 5744
					class166.fontBold12.method7917(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0, Client.field637[var9]); // L: 5745
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1); // L: 5746
				}
			} else {
				class166.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0); // L: 5750
			}
		}

	} // L: 5753

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "921272258"
	)
	static final void method6072() {
		boolean var0 = false; // L: 10235

		while (!var0) { // L: 10236
			var0 = true; // L: 10237

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 10238
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 10239
					String var2 = Client.menuTargets[var1]; // L: 10240
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 10241
					Client.menuTargets[var1 + 1] = var2; // L: 10242
					String var3 = Client.menuActions[var1]; // L: 10243
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 10244
					Client.menuActions[var1 + 1] = var3; // L: 10245
					int var4 = Client.menuOpcodes[var1]; // L: 10246
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 10247
					Client.menuOpcodes[var1 + 1] = var4; // L: 10248
					var4 = Client.menuArguments1[var1]; // L: 10249
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 10250
					Client.menuArguments1[var1 + 1] = var4; // L: 10251
					var4 = Client.menuArguments2[var1]; // L: 10252
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 10253
					Client.menuArguments2[var1 + 1] = var4; // L: 10254
					var4 = Client.menuIdentifiers[var1]; // L: 10255
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 10256
					Client.menuIdentifiers[var1 + 1] = var4; // L: 10257
					var4 = Client.field680[var1]; // L: 10258
					Client.field680[var1] = Client.field680[var1 + 1]; // L: 10259
					Client.field680[var1 + 1] = var4; // L: 10260
					boolean var5 = Client.menuShiftClick[var1]; // L: 10261
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 10262
					Client.menuShiftClick[var1 + 1] = var5; // L: 10263
					var0 = false; // L: 10264
				}
			}
		}

	} // L: 10268

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "96"
	)
	static String method6073(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://"; // L: 12792
		if (Client.gameBuild == 1) { // L: 12793
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) { // L: 12794
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) { // L: 12795
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) { // L: 12796
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) { // L: 12797
			var0 = "local";
		}

		String var3 = ""; // L: 12798
		if (class106.field1372 != null) { // L: 12799
			var3 = "/p=" + class106.field1372;
		}

		String var4 = "runescape.com"; // L: 12800
		return var2 + var0 + "." + var4 + "/l=" + WorldMapCacheName.clientLanguage + "/a=" + class403.field4531 + var3 + "/"; // L: 12801
	}
}
