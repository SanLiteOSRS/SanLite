import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bo")
public class class69 {
	@ObfuscatedName("qa")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("reflectionChecks")
	static IterableNodeDeque reflectionChecks;
	@ObfuscatedName("d")
	public static short[][] field568;
	@ObfuscatedName("hj")
	@ObfuscatedGetter(
		intValue = 370652147
	)
	@Export("cameraPitch")
	static int cameraPitch;

	static {
		reflectionChecks = new IterableNodeDeque();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-22894005"
	)
	static final boolean method1222(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label71:
		while (true) {
			int var6 = var4.method6628();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUShortSmart();
					if (var9 == 0) {
						continue label71;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectComposition var15 = Tiles.getObjectDefinition(var5);
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
							if (!var15.needsModelFiles()) {
								++Client.field742;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.readUShortSmart();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-109"
	)
	public static void method1224() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "83"
	)
	static void method1208() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lgp;[Lfl;B)V",
		garbageValue = "22"
	)
	static final void method1225(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) {
			for (var3 = 0; var3 < 104; ++var3) {
				for (var4 = 0; var4 < 104; ++var4) {
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) {
						var5 = var2;
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
							var5 = var2 - 1;
						}

						if (var5 >= 0) {
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.field1108 += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.field1108 < -8) {
			Tiles.field1108 = -8;
		}

		if (Tiles.field1108 > 8) {
			Tiles.field1108 = 8;
		}

		Tiles.field1109 += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.field1109 < -16) {
			Tiles.field1109 = -16;
		}

		if (Tiles.field1109 > 16) {
			Tiles.field1109 = 16;
		}

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		for (var2 = 0; var2 < 4; ++var2) {
			byte[][] var42 = class43.field307[var2];
			var9 = (int)Math.sqrt(5100.0D);
			var10 = var9 * 768 >> 8;

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
					var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96;
					var20 = (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11 + 1] >> 3) + (var42[var12][var11] >> 1);
					NPC.field1328[var12][var11] = var19 - var20;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				class230.Tiles_hue[var11] = 0;
				Tiles.Tiles_saturation[var11] = 0;
				AbstractByteArrayCopier.Tiles_lightness[var11] = 0;
				WorldMapSectionType.Tiles_hueMultiplier[var11] = 0;
				Tiles.field1095[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						var14 = AccessFile.field4098[var2][var13][var12] & 255;
						if (var14 > 0) {
							var16 = var14 - 1;
							FloorUnderlayDefinition var44 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var16);
							FloorUnderlayDefinition var46;
							if (var44 != null) {
								var46 = var44;
							} else {
								byte[] var45 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var16);
								var44 = new FloorUnderlayDefinition();
								if (var45 != null) {
									var44.decode(new Buffer(var45), var16);
								}

								var44.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var44, (long)var16);
								var46 = var44;
							}

							var10000 = class230.Tiles_hue;
							var10000[var12] += var46.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var12] += var46.saturation;
							var10000 = AbstractByteArrayCopier.Tiles_lightness;
							var10000[var12] += var46.lightness;
							var10000 = WorldMapSectionType.Tiles_hueMultiplier;
							var10000[var12] += var46.hueMultiplier;
							var10002 = Tiles.field1095[var12]++;
						}
					}

					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						var15 = AccessFile.field4098[var2][var14][var12] & 255;
						if (var15 > 0) {
							var17 = var15 - 1;
							FloorUnderlayDefinition var52 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var17);
							FloorUnderlayDefinition var48;
							if (var52 != null) {
								var48 = var52;
							} else {
								byte[] var47 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var17);
								var52 = new FloorUnderlayDefinition();
								if (var47 != null) {
									var52.decode(new Buffer(var47), var17);
								}

								var52.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var52, (long)var17);
								var48 = var52;
							}

							var10000 = class230.Tiles_hue;
							var10000[var12] -= var48.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var12] -= var48.saturation;
							var10000 = AbstractByteArrayCopier.Tiles_lightness;
							var10000[var12] -= var48.lightness;
							var10000 = WorldMapSectionType.Tiles_hueMultiplier;
							var10000[var12] -= var48.hueMultiplier;
							var10002 = Tiles.field1095[var12]--;
						}
					}
				}

				if (var11 >= 1 && var11 < 103) {
					var12 = 0;
					var13 = 0;
					var14 = 0;
					var15 = 0;
					var16 = 0;

					for (var17 = -5; var17 < 109; ++var17) {
						var18 = var17 + 5;
						if (var18 >= 0 && var18 < 104) {
							var12 += class230.Tiles_hue[var18];
							var13 += Tiles.Tiles_saturation[var18];
							var14 += AbstractByteArrayCopier.Tiles_lightness[var18];
							var15 += WorldMapSectionType.Tiles_hueMultiplier[var18];
							var16 += Tiles.field1095[var18];
						}

						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= class230.Tiles_hue[var19];
							var13 -= Tiles.Tiles_saturation[var19];
							var14 -= AbstractByteArrayCopier.Tiles_lightness[var19];
							var15 -= WorldMapSectionType.Tiles_hueMultiplier[var19];
							var16 -= Tiles.field1095[var19];
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							var20 = AccessFile.field4098[var2][var11][var17] & 255;
							int var21 = Tiles.field1111[var2][var11][var17] & 255;
							if (var20 > 0 || var21 > 0) {
								int var22 = Tiles.Tiles_heights[var2][var11][var17];
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var26 = NPC.field1328[var11][var17];
								int var27 = NPC.field1328[var11 + 1][var17];
								int var28 = NPC.field1328[var11 + 1][var17 + 1];
								int var29 = NPC.field1328[var11][var17 + 1];
								int var30 = -1;
								int var31 = -1;
								int var32;
								int var33;
								if (var20 > 0) {
									var32 = var12 * 256 / var15;
									var33 = var13 / var16;
									int var34 = var14 / var16;
									var30 = class125.hslToRgb(var32, var33, var34);
									var32 = var32 + Tiles.field1108 & 255;
									var34 += Tiles.field1109;
									if (var34 < 0) {
										var34 = 0;
									} else if (var34 > 255) {
										var34 = 255;
									}

									var31 = class125.hslToRgb(var32, var33, var34);
								}

								if (var2 > 0) {
									boolean var50 = true;
									if (var20 == 0 && class22.field186[var2][var11][var17] != 0) {
										var50 = false;
									}

									if (var21 > 0 && !WorldMapSectionType.method3677(var21 - 1).hideUnderlay) {
										var50 = false;
									}

									if (var50 && var23 == var22 && var24 == var22 && var22 == var25) {
										var10000 = Tiles.field1101[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0;
								if (var31 != -1) {
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[class378.method6550(var31, 96)];
								}

								if (var21 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, class378.method6550(var30, var26), class378.method6550(var30, var27), class378.method6550(var30, var28), class378.method6550(var30, var29), 0, 0, 0, 0, var32, 0);
								} else {
									var33 = class22.field186[var2][var11][var17] + 1;
									byte var51 = class16.field132[var2][var11][var17];
									FloorOverlayDefinition var35 = WorldMapSectionType.method3677(var21 - 1);
									int var36 = var35.texture;
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) {
										var38 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var36);
										var37 = -1;
									} else if (var35.primaryRgb == 16711935) {
										var37 = -2;
										var36 = -1;
										var38 = -2;
									} else {
										var37 = class125.hslToRgb(var35.hue, var35.saturation, var35.lightness);
										var39 = var35.hue + Tiles.field1108 & 255;
										var40 = var35.lightness + Tiles.field1109;
										if (var40 < 0) {
											var40 = 0;
										} else if (var40 > 255) {
											var40 = 255;
										}

										var38 = class125.hslToRgb(var39, var35.saturation, var40);
									}

									var39 = 0;
									if (var38 != -2) {
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapID.method3716(var38, 96)];
									}

									if (var35.secondaryRgb != -1) {
										var40 = var35.secondaryHue + Tiles.field1108 & 255;
										int var41 = var35.secondaryLightness + Tiles.field1109;
										if (var41 < 0) {
											var41 = 0;
										} else if (var41 > 255) {
											var41 = 255;
										}

										var38 = class125.hslToRgb(var40, var35.secondarySaturation, var41);
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[WorldMapID.method3716(var38, 96)];
									}

									var0.addTile(var2, var11, var17, var33, var51, var36, var22, var23, var24, var25, class378.method6550(var30, var26), class378.method6550(var30, var27), class378.method6550(var30, var28), class378.method6550(var30, var29), WorldMapID.method3716(var37, var26), WorldMapID.method3716(var37, var27), WorldMapID.method3716(var37, var28), WorldMapID.method3716(var37, var29), var32, var39);
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) {
						var17 = 0;
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) {
						var17 = var2 - 1;
					} else {
						var17 = var2;
					}

					var0.setTileMinPlane(var2, var12, var11, var17);
				}
			}

			AccessFile.field4098[var2] = null;
			Tiles.field1111[var2] = null;
			class22.field186[var2] = null;
			class16.field132[var2] = null;
			class43.field307[var2] = null;
		}

		var0.method4067(-50, -10, -50);

		for (var2 = 0; var2 < 104; ++var2) {
			for (var3 = 0; var3 < 104; ++var3) {
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1;
		var3 = 2;
		var4 = 4;

		for (var5 = 0; var5 < 4; ++var5) {
			if (var5 > 0) {
				var2 <<= 3;
				var3 <<= 3;
				var4 <<= 3;
			}

			for (int var6 = 0; var6 <= var5; ++var6) {
				for (int var7 = 0; var7 <= 104; ++var7) {
					for (int var8 = 0; var8 <= 104; ++var8) {
						short var49;
						if ((Tiles.field1101[var6][var8][var7] & var2) != 0) {
							var9 = var7;
							var10 = var7;
							var11 = var6;

							for (var12 = var6; var9 > 0 && (Tiles.field1101[var6][var8][var9 - 1] & var2) != 0; --var9) {
							}

							while (var10 < 104 && (Tiles.field1101[var6][var8][var10 + 1] & var2) != 0) {
								++var10;
							}

							label456:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((Tiles.field1101[var11 - 1][var8][var13] & var2) == 0) {
										break label456;
									}
								}

								--var11;
							}

							label445:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((Tiles.field1101[var12 + 1][var8][var13] & var2) == 0) {
										break label445;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var49 = 240;
								var15 = Tiles.Tiles_heights[var12][var8][var9] - var49;
								var16 = Tiles.Tiles_heights[var11][var8][var9];
								Scene.Scene_addOccluder(var5, 1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = Tiles.field1101[var17][var8];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((Tiles.field1101[var6][var8][var7] & var3) != 0) {
							var9 = var8;
							var10 = var8;
							var11 = var6;

							for (var12 = var6; var9 > 0 && (Tiles.field1101[var6][var9 - 1][var7] & var3) != 0; --var9) {
							}

							while (var10 < 104 && (Tiles.field1101[var6][var10 + 1][var7] & var3) != 0) {
								++var10;
							}

							label509:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((Tiles.field1101[var11 - 1][var13][var7] & var3) == 0) {
										break label509;
									}
								}

								--var11;
							}

							label498:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((Tiles.field1101[var12 + 1][var13][var7] & var3) == 0) {
										break label498;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var49 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var7] - var49;
								var16 = Tiles.Tiles_heights[var11][var9][var7];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var7 * 128, var7 * 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = Tiles.field1101[var17][var18];
										var10000[var7] &= ~var3;
									}
								}
							}
						}

						if ((Tiles.field1101[var6][var8][var7] & var4) != 0) {
							var9 = var8;
							var10 = var8;
							var11 = var7;

							for (var12 = var7; var11 > 0 && (Tiles.field1101[var6][var8][var11 - 1] & var4) != 0; --var11) {
							}

							while (var12 < 104 && (Tiles.field1101[var6][var8][var12 + 1] & var4) != 0) {
								++var12;
							}

							label562:
							while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((Tiles.field1101[var6][var9 - 1][var13] & var4) == 0) {
										break label562;
									}
								}

								--var9;
							}

							label551:
							while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((Tiles.field1101[var6][var10 + 1][var13] & var4) == 0) {
										break label551;
									}
								}

								++var10;
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var6][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = Tiles.field1101[var6][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "457904488"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = "";
		Login.Login_response2 = "Enter your username/email & password.";
		Login.Login_response3 = "";
		Login.loginIndex = 2;
		if (var0) {
			Login.Login_password = "";
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class4.clientPreferences.rememberedUsername != null) {
				Login.Login_username = class4.clientPreferences.rememberedUsername;
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}

		GameObject.method4433();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgi;",
		garbageValue = "42"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = class15.method240(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1;
		}
	}
}
