import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class148 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 516388591765987837L
	)
	long field1690;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -932184463
	)
	public int field1686;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	IterableNodeDeque field1684;

	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public class148(Buffer var1) {
		this.field1686 = -1; // L: 9
		this.field1684 = new IterableNodeDeque(); // L: 10
		this.method3250(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1872970638"
	)
	void method3250(Buffer var1) {
		this.field1690 = var1.readLong();
		this.field1686 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class167(this);
			} else if (var2 == 1) {
				var3 = new class143(this);
			} else if (var2 == 13) {
				var3 = new class160(this);
			} else if (var2 == 4) {
				var3 = new class152(this);
			} else if (var2 == 6) {
				var3 = new class159(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class144(this);
			} else if (var2 == 2) {
				var3 = new class149(this);
			} else if (var2 == 7) {
				var3 = new class142(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class146(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class163(this);
			} else if (var2 == 9) {
				var3 = new class169(this);
			} else if (var2 == 10) {
				var3 = new class155(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class150(this);
			} else if (var2 == 12) {
				var3 = new class154(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class164(this);
			}

			((class145)var3).vmethod3512(var1);
			this.field1684.addFirst((Node)var3); // L: 54
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "-137780697"
	)
	public void method3245(ClanSettings var1) {
		if (var1.field1744 == this.field1690 && this.field1686 == var1.field1754) {
			for (class145 var2 = (class145)this.field1684.last(); var2 != null; var2 = (class145)this.field1684.previous()) { // L: 61
				var2.vmethod3513(var1);
			}

			++var1.field1754;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1271412777"
	)
	public static int method3252(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2; // L: 33
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FI)I",
		garbageValue = "-176509577"
	)
	public static int method3244(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F; // L: 15

		for (int var8 = 0; var8 < var1 + 1; ++var8) { // L: 16
			var7 += Math.abs(var0[var8]); // L: 17
		}

		float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class128.field1512; // L: 19
		if (var7 <= var44) { // L: 20
			return -1; // L: 21
		} else {
			float[] var9 = new float[var1 + 1];

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) {
				var9[var10] = 1.0F / var7 * var0[var10];
			}

			while (Math.abs(var9[var1]) < var44) {
				--var1;
			}

			var10 = 0; // L: 30
			if (var1 == 0) { // L: 31
				return var10; // L: 32
			} else if (var1 == 1) { // L: 34
				var6[0] = -var9[0] / var9[1]; // L: 35
				boolean var42 = var3 ? var2 < var6[0] + var44 : var2 < var6[0] - var44; // L: 36
				boolean var43 = var5 ? var4 > var6[0] - var44 : var4 > var6[0] + var44; // L: 37
				var10 = var42 && var43 ? 1 : 0; // L: 38
				if (var10 > 0) { // L: 39
					if (var3 && var6[0] < var2) { // L: 40
						var6[0] = var2; // L: 41
					} else if (var5 && var6[0] > var4) { // L: 43
						var6[0] = var4; // L: 44
					}
				}

				return var10; // L: 47
			} else {
				class471 var11 = new class471(var9, var1); // L: 50
				float[] var12 = new float[var1 + 1]; // L: 51

				for (int var13 = 1; var13 <= var1; ++var13) { // L: 52
					var12[var13 - 1] = var9[var13] * (float)var13; // L: 53
				}

				float[] var41 = new float[var1 + 1]; // L: 55
				int var14 = method3244(var12, var1 - 1, var2, false, var4, false, var41); // L: 56
				if (var14 == -1) { // L: 57
					return 0; // L: 58
				} else {
					boolean var15 = false; // L: 60
					float var17 = 0.0F; // L: 62
					float var18 = 0.0F; // L: 63
					float var19 = 0.0F; // L: 64

					for (int var20 = 0; var20 <= var14; ++var20) { // L: 65
						if (var10 > var1) { // L: 66
							return var10;
						}

						float var16;
						if (var20 == 0) { // L: 67
							var16 = var2; // L: 68
							var18 = class361.method6995(var9, var1, var2); // L: 69
							if (Math.abs(var18) <= var44 && var3) { // L: 70
								var6[var10++] = var2;
							}
						} else {
							var16 = var19; // L: 73
							var18 = var17; // L: 74
						}

						if (var14 == var20) { // L: 76
							var19 = var4; // L: 77
							var15 = false; // L: 78
						} else {
							var19 = var41[var20]; // L: 81
						}

						var17 = class361.method6995(var9, var1, var19); // L: 83
						if (var15) { // L: 84
							var15 = false; // L: 85
						} else if (Math.abs(var17) < var44) { // L: 88
							if (var14 != var20 || var5) { // L: 89
								var6[var10++] = var19; // L: 90
								var15 = true; // L: 91
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) { // L: 94
							int var22 = var10++; // L: 96
							float var24 = var16; // L: 98
							float var25 = var19; // L: 99
							float var26 = class361.method6995(var11.field4861, var11.field4860, var16); // L: 101
							float var23;
							if (Math.abs(var26) < class128.field1512) { // L: 102
								var23 = var16; // L: 103
							} else {
								float var27 = class361.method6995(var11.field4861, var11.field4860, var19); // L: 106
								if (Math.abs(var27) < class128.field1512) { // L: 107
									var23 = var19; // L: 108
								} else {
									float var28 = 0.0F; // L: 111
									float var29 = 0.0F; // L: 112
									float var30 = 0.0F; // L: 113
									float var35 = 0.0F; // L: 118
									boolean var36 = true; // L: 119
									boolean var37 = false; // L: 120

									do {
										var37 = false; // L: 122
										if (var36) { // L: 123
											var28 = var24; // L: 124
											var35 = var26; // L: 125
											var29 = var25 - var24; // L: 126
											var30 = var29; // L: 127
											var36 = false; // L: 128
										}

										if (Math.abs(var35) < Math.abs(var27)) { // L: 130
											var24 = var25; // L: 131
											var25 = var28; // L: 132
											var28 = var24; // L: 133
											var26 = var27; // L: 134
											var27 = var35; // L: 135
											var35 = var26; // L: 136
										}

										float var38 = class128.field1519 * Math.abs(var25) + 0.0F; // L: 138
										float var39 = 0.5F * (var28 - var25); // L: 139
										boolean var40 = Math.abs(var39) > var38 && var27 != 0.0F; // L: 140
										if (var40) { // L: 141
											if (Math.abs(var30) >= var38 && Math.abs(var26) > Math.abs(var27)) { // L: 142
												float var34 = var27 / var26; // L: 147
												float var31;
												float var32;
												if (var24 == var28) { // L: 148
													var31 = var39 * 2.0F * var34; // L: 149
													var32 = 1.0F - var34; // L: 150
												} else {
													var32 = var26 / var35; // L: 153
													float var33 = var27 / var35; // L: 154
													var31 = (var32 * 2.0F * var39 * (var32 - var33) - (var33 - 1.0F) * (var25 - var24)) * var34; // L: 155
													var32 = (var32 - 1.0F) * (var33 - 1.0F) * (var34 - 1.0F); // L: 156
												}

												if ((double)var31 > 0.0D) { // L: 158
													var32 = -var32;
												} else {
													var31 = -var31; // L: 159
												}

												var34 = var30; // L: 160
												var30 = var29; // L: 161
												if (2.0F * var31 < var39 * 3.0F * var32 - Math.abs(var32 * var38) && var31 < Math.abs(0.5F * var34 * var32)) { // L: 162
													var29 = var31 / var32; // L: 163
												} else {
													var29 = var39; // L: 166
													var30 = var39; // L: 167
												}
											} else {
												var29 = var39; // L: 143
												var30 = var39; // L: 144
											}

											var24 = var25; // L: 170
											var26 = var27; // L: 171
											if (Math.abs(var29) > var38) { // L: 172
												var25 += var29;
											} else if ((double)var39 > 0.0D) { // L: 173
												var25 += var38;
											} else {
												var25 -= var38; // L: 174
											}

											var27 = class361.method6995(var11.field4861, var11.field4860, var25); // L: 175
											if ((double)(var27 * (var35 / Math.abs(var35))) > 0.0D) { // L: 176
												var36 = true; // L: 177
												var37 = true; // L: 178
											} else {
												var37 = true; // L: 181
											}
										}
									} while(var37);

									var23 = var25; // L: 185
								}
							}

							var6[var22] = var23; // L: 187
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var44) { // L: 188
								var6[var10 - 2] = (var6[var10 - 2] + var6[var10 - 1]) * 0.5F; // L: 189
								--var10; // L: 190
							}
						}
					}

					return var10; // L: 196
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgf;",
		garbageValue = "-117"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0); // L: 25
			var1 = new VarpDefinition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0); // L: 28
			return var1; // L: 29
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1867819672"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class193.client.method1214() && !class193.client.isOtlTokenRequesterInitialized() && !class193.client.method1215()) { // L: 1247
			Login.Login_response1 = ""; // L: 1251
			Login.Login_response2 = "Enter your username/email & password."; // L: 1252
			Login.Login_response3 = ""; // L: 1253
			JagexCache.method4224(2); // L: 1254
			if (var0) { // L: 1255
				Login.Login_password = "";
			}

			class143.method3203(); // L: 1256
			Message.method1182(); // L: 1257
		} else {
			JagexCache.method4224(10); // L: 1248
		}
	} // L: 1249 1258

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1677901050"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) { // L: 5048
			var2 = 1;
		}

		if (var3 < 1) { // L: 5049
			var3 = 1;
		}

		int var5 = var3 - 334; // L: 5050
		int var6;
		if (var5 < 0) { // L: 5052
			var6 = Client.field724;
		} else if (var5 >= 100) { // L: 5053
			var6 = Client.field803;
		} else {
			var6 = (Client.field803 - Client.field724) * var5 / 100 + Client.field724; // L: 5054
		}

		int var7 = var3 * var6 * 512 / (var2 * 334); // L: 5055
		int var8;
		int var9;
		short var14;
		if (var7 < Client.field722) { // L: 5056
			var14 = Client.field722; // L: 5057
			var6 = var14 * var2 * 334 / (var3 * 512); // L: 5058
			if (var6 > Client.field807) { // L: 5059
				var6 = Client.field807; // L: 5060
				var8 = var3 * var6 * 512 / (var14 * 334); // L: 5061
				var9 = (var2 - var8) / 2; // L: 5062
				if (var4) { // L: 5063
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5064
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216); // L: 5065
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216); // L: 5066
				}

				var0 += var9; // L: 5068
				var2 -= var9 * 2; // L: 5069
			}
		} else if (var7 > Client.field809) { // L: 5072
			var14 = Client.field809; // L: 5073
			var6 = var14 * var2 * 334 / (var3 * 512); // L: 5074
			if (var6 < Client.field806) { // L: 5075
				var6 = Client.field806; // L: 5076
				var8 = var14 * var2 * 334 / (var6 * 512); // L: 5077
				var9 = (var3 - var8) / 2; // L: 5078
				if (var4) { // L: 5079
					Rasterizer2D.Rasterizer2D_resetClip(); // L: 5080
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216); // L: 5081
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216); // L: 5082
				}

				var1 += var9; // L: 5084
				var3 -= var9 * 2; // L: 5085
			}
		}

		Client.viewportZoom = var3 * var6 / 334; // L: 5088
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) { // L: 5089
			int[] var13 = new int[9]; // L: 5091

			for (var9 = 0; var9 < var13.length; ++var9) { // L: 5092
				int var10 = var9 * 32 + 15 + 128; // L: 5093
				int var11 = WorldMapCacheName.method5111(var10); // L: 5094
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10]; // L: 5095
				var11 = class127.method2998(var11, var3); // L: 5096
				var13[var9] = var12 * var11 >> 16; // L: 5097
			}

			Scene.Scene_buildVisiblityMap(var13, 500, 800, var2 * 334 / var3, 334); // L: 5099
		}

		Client.viewportOffsetX = var0; // L: 5102
		Client.viewportOffsetY = var1; // L: 5103
		Client.viewportWidth = var2; // L: 5104
		Client.viewportHeight = var3; // L: 5105
	} // L: 5106
}
