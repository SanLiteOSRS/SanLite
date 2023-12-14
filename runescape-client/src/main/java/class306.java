import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
public class class306 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3232;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3226;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3228;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3230;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3225;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3234;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3231;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3227;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3233;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3229;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3235;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3236;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lly;"
	)
	public static final class306 field3237;

	static {
		field3232 = new class306(4); // L: 5
		field3226 = new class306(5); // L: 6
		field3228 = new class306(20); // L: 7
		field3230 = new class306(4); // L: 8
		field3225 = new class306(16); // L: 9
		field3234 = new class306(6); // L: 10
		field3231 = new class306(14); // L: 11
		field3227 = new class306(14); // L: 12
		field3233 = new class306(5); // L: 13
		field3229 = new class306(7); // L: 14
		field3235 = new class306(19); // L: 15
		field3236 = new class306(11); // L: 16
		field3237 = new class306(2); // L: 17
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "4"
	)
	class306(int var1) {
	} // L: 23

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILuj;I)Lgx;",
		garbageValue = "-485620123"
	)
	public static class169 method5914(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 24
		boolean var3 = (var2 & 1) != 0; // L: 25
		boolean var4 = (var2 & 2) != 0; // L: 26
		class169 var5 = new class169(var0); // L: 27
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) { // L: 28
			var6 = var1.readUnsignedByte(); // L: 29
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1792 != null && var7.length == var5.field1792.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) {
				if (var7[var9] != 15) {
					var10 = (short)var1.readUnsignedShort();
					if (var8) {
						var5.field1792[var7[var9]] = var10;
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1793 != null && var7.length == var5.field1793.length; // L: 48

			for (var9 = 0; var9 < 2; ++var9) { // L: 49
				if (var7[var9] != 15) { // L: 50
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1793[var7[var9]] = var10; // L: 53
					}
				}
			}
		}

		return var5; // L: 58
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "744218081"
	)
	public static void method5910(int var0, int var1) {
		VarbitComposition var2 = ClientPreferences.method2644(var0); // L: 34
		int var3 = var2.baseVar; // L: 35
		int var4 = var2.startBit; // L: 36
		int var5 = var2.endBit; // L: 37
		int var6 = Varps.Varps_masks[var5 - var4]; // L: 38
		if (var1 < 0 || var1 > var6) { // L: 39
			var1 = 0;
		}

		var6 <<= var4; // L: 40
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6; // L: 41
	} // L: 42

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-373898981"
	)
	public static int method5916(int var0) {
		return var0 >>> 4 & class520.field5087; // L: 22
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lnn;IIS)V",
		garbageValue = "-21324"
	)
	public static void method5915(Widget var0, int var1, int var2) {
		var0.field3717.bodyColors[var1] = var2; // L: 1024
		var0.field3717.method6323(); // L: 1025
	} // L: 1026

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "56799465"
	)
	static final int method5913() {
		if (WorldMapIcon_1.clientPreferences.method2541()) { // L: 5111
			return ItemLayer.Client_plane;
		} else {
			int var0 = 3; // L: 5112
			if (Varcs.cameraPitch < 310) { // L: 5113
				label169: {
					int var1;
					int var2;
					if (Client.titleLoadingStage == 1) { // L: 5116
						var1 = LoginScreenAnimation.oculusOrbFocalPointX >> 7; // L: 5117
						var2 = ScriptFrame.oculusOrbFocalPointY >> 7; // L: 5118
					} else {
						var1 = class229.localPlayer.x >> 7; // L: 5121
						var2 = class229.localPlayer.y >> 7; // L: 5122
					}

					int var3 = ViewportMouse.cameraX >> 7; // L: 5124
					int var4 = class36.cameraZ >> 7; // L: 5125
					if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) { // L: 5126
						if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) { // L: 5127
							if ((Tiles.Tiles_renderFlags[ItemLayer.Client_plane][var3][var4] & 4) != 0) { // L: 5128
								var0 = ItemLayer.Client_plane;
							}

							int var5;
							if (var1 > var3) { // L: 5130
								var5 = var1 - var3;
							} else {
								var5 = var3 - var1; // L: 5131
							}

							int var6;
							if (var2 > var4) { // L: 5133
								var6 = var2 - var4;
							} else {
								var6 = var4 - var2; // L: 5134
							}

							int var7;
							int var8;
							if (var5 > var6) { // L: 5135
								var7 = var6 * 65536 / var5; // L: 5136
								var8 = 32768; // L: 5137

								while (true) {
									if (var1 == var3) { // L: 5138
										break label169;
									}

									if (var3 < var1) { // L: 5139
										++var3;
									} else if (var3 > var1) { // L: 5140
										--var3;
									}

									if ((Tiles.Tiles_renderFlags[ItemLayer.Client_plane][var3][var4] & 4) != 0) { // L: 5141
										var0 = ItemLayer.Client_plane;
									}

									var8 += var7; // L: 5142
									if (var8 >= 65536) { // L: 5143
										var8 -= 65536; // L: 5144
										if (var4 < var2) { // L: 5145
											++var4;
										} else if (var4 > var2) { // L: 5146
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[ItemLayer.Client_plane][var3][var4] & 4) != 0) { // L: 5147
											var0 = ItemLayer.Client_plane;
										}
									}
								}
							} else {
								if (var6 > 0) { // L: 5151
									var7 = var5 * 65536 / var6; // L: 5152
									var8 = 32768; // L: 5153

									while (var2 != var4) { // L: 5154
										if (var4 < var2) { // L: 5155
											++var4;
										} else if (var4 > var2) { // L: 5156
											--var4;
										}

										if ((Tiles.Tiles_renderFlags[ItemLayer.Client_plane][var3][var4] & 4) != 0) { // L: 5157
											var0 = ItemLayer.Client_plane;
										}

										var8 += var7; // L: 5158
										if (var8 >= 65536) { // L: 5159
											var8 -= 65536; // L: 5160
											if (var3 < var1) { // L: 5161
												++var3;
											} else if (var3 > var1) { // L: 5162
												--var3;
											}

											if ((Tiles.Tiles_renderFlags[ItemLayer.Client_plane][var3][var4] & 4) != 0) { // L: 5163
												var0 = ItemLayer.Client_plane;
											}
										}
									}
								}
								break label169;
							}
						}

						return ItemLayer.Client_plane;
					}

					return ItemLayer.Client_plane;
				}
			}

			if (class229.localPlayer.x >= 0 && class229.localPlayer.y >= 0 && class229.localPlayer.x < 13312 && class229.localPlayer.y < 13312) { // L: 5168
				if ((Tiles.Tiles_renderFlags[ItemLayer.Client_plane][class229.localPlayer.x >> 7][class229.localPlayer.y >> 7] & 4) != 0) { // L: 5169
					var0 = ItemLayer.Client_plane;
				}

				return var0; // L: 5170
			} else {
				return ItemLayer.Client_plane;
			}
		}
	}
}
