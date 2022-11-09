import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class268 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IS)Ljava/lang/String;",
		garbageValue = "-4529"
	)
	static String method5367(int var0) {
		return "<img=" + var0 + ">"; // L: 18
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "1303230308"
	)
	public static byte[] method5365(CharSequence var0) {
		int var1 = var0.length(); // L: 68
		byte[] var2 = new byte[var1]; // L: 69

		for (int var3 = 0; var3 < var1; ++var3) { // L: 70
			char var4 = var0.charAt(var3); // L: 71
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) { // L: 72
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) { // L: 73
				var2[var3] = -128;
			} else if (var4 == 8218) { // L: 74
				var2[var3] = -126;
			} else if (var4 == 402) { // L: 75
				var2[var3] = -125;
			} else if (var4 == 8222) { // L: 76
				var2[var3] = -124;
			} else if (var4 == 8230) { // L: 77
				var2[var3] = -123;
			} else if (var4 == 8224) { // L: 78
				var2[var3] = -122;
			} else if (var4 == 8225) { // L: 79
				var2[var3] = -121;
			} else if (var4 == 710) { // L: 80
				var2[var3] = -120;
			} else if (var4 == 8240) { // L: 81
				var2[var3] = -119;
			} else if (var4 == 352) { // L: 82
				var2[var3] = -118;
			} else if (var4 == 8249) { // L: 83
				var2[var3] = -117;
			} else if (var4 == 338) { // L: 84
				var2[var3] = -116;
			} else if (var4 == 381) { // L: 85
				var2[var3] = -114;
			} else if (var4 == 8216) { // L: 86
				var2[var3] = -111;
			} else if (var4 == 8217) { // L: 87
				var2[var3] = -110;
			} else if (var4 == 8220) { // L: 88
				var2[var3] = -109;
			} else if (var4 == 8221) { // L: 89
				var2[var3] = -108;
			} else if (var4 == 8226) { // L: 90
				var2[var3] = -107;
			} else if (var4 == 8211) { // L: 91
				var2[var3] = -106;
			} else if (var4 == 8212) { // L: 92
				var2[var3] = -105;
			} else if (var4 == 732) { // L: 93
				var2[var3] = -104;
			} else if (var4 == 8482) { // L: 94
				var2[var3] = -103;
			} else if (var4 == 353) { // L: 95
				var2[var3] = -102;
			} else if (var4 == 8250) {
				var2[var3] = -101; // L: 96
			} else if (var4 == 339) { // L: 97
				var2[var3] = -100;
			} else if (var4 == 382) { // L: 98
				var2[var3] = -98;
			} else if (var4 == 376) { // L: 99
				var2[var3] = -97;
			} else {
				var2[var3] = 63; // L: 100
			}
		}

		return var2; // L: 102
	}

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "87"
	)
	static final void method5364(int var0) {
		int[] var1 = Calendar.sceneMinimapSprite.pixels; // L: 5991
		int var2 = var1.length; // L: 5992

		int var3;
		for (var3 = 0; var3 < var2; ++var3) { // L: 5993
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) { // L: 5994
			var4 = (103 - var3) * 2048 + 24628; // L: 5995

			for (var5 = 1; var5 < 103; ++var5) { // L: 5996
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) { // L: 5997
					class139.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) { // L: 5998
					class139.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4; // L: 5999
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10); // L: 6002
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16; // L: 6003
		Calendar.sceneMinimapSprite.setRaster(); // L: 6004

		int var6;
		for (var5 = 1; var5 < 103; ++var5) { // L: 6005
			for (var6 = 1; var6 < 103; ++var6) { // L: 6006
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) { // L: 6007
					class140.drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) { // L: 6008
					class140.drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0; // L: 6011

		for (var5 = 0; var5 < 104; ++var5) { // L: 6012
			for (var6 = 0; var6 < 104; ++var6) { // L: 6013
				long var7 = class139.scene.getGroundObjectTag(ApproximateRouteStrategy.Client_plane, var5, var6); // L: 6014
				if (0L != var7) { // L: 6015
					int var9 = AttackOption.Entity_unpackID(var7); // L: 6016
					int var10 = InterfaceParent.getObjectDefinition(var9).mapIconId; // L: 6017
					if (var10 >= 0 && Actor.WorldMapElement_get(var10).field1871) { // L: 6018 6019
						Client.mapIcons[Client.mapIconCount] = Actor.WorldMapElement_get(var10).getSpriteBool(false); // L: 6022
						Client.field691[Client.mapIconCount] = var5; // L: 6023
						Client.field744[Client.mapIconCount] = var6; // L: 6024
						++Client.mapIconCount; // L: 6025
					}
				}
			}
		}

		class1.rasterProvider.apply(); // L: 6030
	} // L: 6031

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Lkn;II)I",
		garbageValue = "650734400"
	)
	static final int method5366(Widget var0, int var1) {
		if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) { // L: 11016
			try {
				int[] var2 = var0.cs1Instructions[var1]; // L: 11018
				int var3 = 0; // L: 11019
				int var4 = 0; // L: 11020
				byte var5 = 0; // L: 11021

				while (true) {
					int var6 = var2[var4++]; // L: 11023
					int var7 = 0; // L: 11024
					byte var8 = 0; // L: 11025
					if (var6 == 0) { // L: 11026
						return var3;
					}

					if (var6 == 1) { // L: 11027
						var7 = Client.currentLevels[var2[var4++]];
					}

					if (var6 == 2) { // L: 11028
						var7 = Client.levels[var2[var4++]];
					}

					if (var6 == 3) { // L: 11029
						var7 = Client.experience[var2[var4++]];
					}

					int var9;
					Widget var10;
					int var11;
					int var12;
					if (var6 == 4) { // L: 11030
						var9 = var2[var4++] << 16; // L: 11031
						var9 += var2[var4++]; // L: 11032
						var10 = class281.getWidget(var9); // L: 11033
						var11 = var2[var4++]; // L: 11034
						if (var11 != -1 && (!MidiPcmStream.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11035
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11036
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11037
									var7 += var10.itemQuantities[var12];
								}
							}
						}
					}

					if (var6 == 5) { // L: 11041
						var7 = Varps.Varps_main[var2[var4++]];
					}

					if (var6 == 6) { // L: 11042
						var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
					}

					if (var6 == 7) { // L: 11043
						var7 = Varps.Varps_main[var2[var4++]] * 100 / 46875;
					}

					if (var6 == 8) { // L: 11044
						var7 = class296.localPlayer.combatLevel;
					}

					if (var6 == 9) { // L: 11045
						for (var9 = 0; var9 < 25; ++var9) { // L: 11046
							if (Skills.Skills_enabled[var9]) { // L: 11047
								var7 += Client.levels[var9];
							}
						}
					}

					if (var6 == 10) { // L: 11050
						var9 = var2[var4++] << 16; // L: 11051
						var9 += var2[var4++]; // L: 11052
						var10 = class281.getWidget(var9); // L: 11053
						var11 = var2[var4++]; // L: 11054
						if (var11 != -1 && (!MidiPcmStream.ItemComposition_get(var11).isMembersOnly || Client.isMembersWorld)) { // L: 11055
							for (var12 = 0; var12 < var10.itemIds.length; ++var12) { // L: 11056
								if (var11 + 1 == var10.itemIds[var12]) { // L: 11057
									var7 = 999999999; // L: 11058
									break; // L: 11059
								}
							}
						}
					}

					if (var6 == 11) { // L: 11064
						var7 = Client.runEnergy;
					}

					if (var6 == 12) { // L: 11065
						var7 = Client.weight;
					}

					if (var6 == 13) { // L: 11066
						var9 = Varps.Varps_main[var2[var4++]]; // L: 11067
						int var13 = var2[var4++]; // L: 11068
						var7 = (var9 & 1 << var13) != 0 ? 1 : 0; // L: 11069
					}

					if (var6 == 14) { // L: 11071
						var9 = var2[var4++]; // L: 11072
						var7 = Login.getVarbit(var9); // L: 11073
					}

					if (var6 == 15) { // L: 11075
						var8 = 1;
					}

					if (var6 == 16) { // L: 11076
						var8 = 2;
					}

					if (var6 == 17) { // L: 11077
						var8 = 3;
					}

					if (var6 == 18) { // L: 11078
						var7 = class26.baseX * 64 + (class296.localPlayer.x >> 7);
					}

					if (var6 == 19) { // L: 11079
						var7 = class158.baseY * 64 + (class296.localPlayer.y >> 7);
					}

					if (var6 == 20) { // L: 11080
						var7 = var2[var4++];
					}

					if (var8 == 0) { // L: 11081
						if (var5 == 0) { // L: 11082
							var3 += var7;
						}

						if (var5 == 1) { // L: 11083
							var3 -= var7;
						}

						if (var5 == 2 && var7 != 0) { // L: 11084
							var3 /= var7;
						}

						if (var5 == 3) { // L: 11085
							var3 *= var7;
						}

						var5 = 0; // L: 11086
					} else {
						var5 = var8; // L: 11088
					}
				}
			} catch (Exception var14) { // L: 11091
				return -1; // L: 11092
			}
		} else {
			return -2;
		}
	}
}
