import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
public class class17 extends class14 {
	@ObfuscatedName("ie")
	@ObfuscatedGetter(
		intValue = 769722653
	)
	static int field148;
	@ObfuscatedName("v")
	boolean field146;
	@ObfuscatedName("n")
	byte field143;
	@ObfuscatedName("f")
	byte field144;
	@ObfuscatedName("y")
	byte field145;
	@ObfuscatedName("p")
	byte field147;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lf;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lf;)V"
	)
	class17(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;I)V",
		garbageValue = "-1281352827"
	)
	void vmethod276(Buffer var1) {
		this.field146 = var1.readUnsignedByte() == 1;
		this.field143 = var1.readByte();
		this.field144 = var1.readByte();
		this.field145 = var1.readByte();
		this.field147 = var1.readByte();
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ll;B)V",
		garbageValue = "29"
	)
	void vmethod281(class11 var1) {
		var1.field97 = this.field146;
		var1.field103 = this.field143;
		var1.field113 = this.field144;
		var1.field98 = this.field145;
		var1.field96 = this.field147;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)Ley;",
		garbageValue = "113"
	)
	public static FloorUnderlayDefinition method204(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lgt;[Lfz;I)V",
		garbageValue = "-1580902995"
	)
	static final void method210(Scene var0, CollisionMap[] var1) {
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

		Tiles.field1130 += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.field1130 < -8) {
			Tiles.field1130 = -8;
		}

		if (Tiles.field1130 > 8) {
			Tiles.field1130 = 8;
		}

		Tiles.field1131 += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.field1131 < -16) {
			Tiles.field1131 = -16;
		}

		if (Tiles.field1131 > 16) {
			Tiles.field1131 = 16;
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
			byte[][] var42 = class372.field4123[var2];
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
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96;
					var20 = (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11 + 1] >> 3) + (var42[var12][var11] >> 1);
					class229.field2813[var12][var11] = var19 - var20;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				ChatChannel.Tiles_hue[var11] = 0;
				class23.Tiles_saturation[var11] = 0;
				Tiles.Tiles_lightness[var11] = 0;
				ParamComposition.Tiles_hueMultiplier[var11] = 0;
				DefaultsGroup.field3894[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						var14 = Tiles.field1120[var2][var13][var12] & 255;
						if (var14 > 0) {
							FloorUnderlayDefinition var44 = method204(var14 - 1);
							var10000 = ChatChannel.Tiles_hue;
							var10000[var12] += var44.hue;
							var10000 = class23.Tiles_saturation;
							var10000[var12] += var44.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var12] += var44.lightness;
							var10000 = ParamComposition.Tiles_hueMultiplier;
							var10000[var12] += var44.hueMultiplier;
							var10002 = DefaultsGroup.field3894[var12]++;
						}
					}

					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						var15 = Tiles.field1120[var2][var14][var12] & 255;
						if (var15 > 0) {
							FloorUnderlayDefinition var45 = method204(var15 - 1);
							var10000 = ChatChannel.Tiles_hue;
							var10000[var12] -= var45.hue;
							var10000 = class23.Tiles_saturation;
							var10000[var12] -= var45.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var12] -= var45.lightness;
							var10000 = ParamComposition.Tiles_hueMultiplier;
							var10000[var12] -= var45.hueMultiplier;
							var10002 = DefaultsGroup.field3894[var12]--;
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
							var12 += ChatChannel.Tiles_hue[var18];
							var13 += class23.Tiles_saturation[var18];
							var14 += Tiles.Tiles_lightness[var18];
							var15 += ParamComposition.Tiles_hueMultiplier[var18];
							var16 += DefaultsGroup.field3894[var18];
						}

						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= ChatChannel.Tiles_hue[var19];
							var13 -= class23.Tiles_saturation[var19];
							var14 -= Tiles.Tiles_lightness[var19];
							var15 -= ParamComposition.Tiles_hueMultiplier[var19];
							var16 -= DefaultsGroup.field3894[var19];
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.field1120[var2][var11][var17] & 255;
							int var21 = class253.field3130[var2][var11][var17] & 255;
							if (var20 > 0 || var21 > 0) {
								int var22 = Tiles.Tiles_heights[var2][var11][var17];
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var26 = class229.field2813[var11][var17];
								int var27 = class229.field2813[var11 + 1][var17];
								int var28 = class229.field2813[var11 + 1][var17 + 1];
								int var29 = class229.field2813[var11][var17 + 1];
								int var30 = -1;
								int var31 = -1;
								int var32;
								int var33;
								if (var20 > 0) {
									var32 = var12 * 256 / var15;
									var33 = var13 / var16;
									int var34 = var14 / var16;
									var30 = WorldMapElement.hslToRgb(var32, var33, var34);
									var32 = var32 + Tiles.field1130 & 255;
									var34 += Tiles.field1131;
									if (var34 < 0) {
										var34 = 0;
									} else if (var34 > 255) {
										var34 = 255;
									}

									var31 = WorldMapElement.hslToRgb(var32, var33, var34);
								}

								if (var2 > 0) {
									boolean var47 = true;
									if (var20 == 0 && class20.field182[var2][var11][var17] != 0) {
										var47 = false;
									}

									if (var21 > 0 && !SoundSystem.method807(var21 - 1).hideUnderlay) {
										var47 = false;
									}

									if (var47 && var22 == var23 && var24 == var22 && var25 == var22) {
										var10000 = UrlRequester.field1419[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0;
								if (var31 != -1) {
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[HealthBarDefinition.method2728(var31, 96)];
								}

								if (var21 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, HealthBarDefinition.method2728(var30, var26), HealthBarDefinition.method2728(var30, var27), HealthBarDefinition.method2728(var30, var28), HealthBarDefinition.method2728(var30, var29), 0, 0, 0, 0, var32, 0);
								} else {
									var33 = class20.field182[var2][var11][var17] + 1;
									byte var48 = DirectByteArrayCopier.field3128[var2][var11][var17];
									FloorOverlayDefinition var35 = SoundSystem.method807(var21 - 1);
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
										var37 = WorldMapElement.hslToRgb(var35.hue, var35.saturation, var35.lightness);
										var39 = var35.hue + Tiles.field1130 & 255;
										var40 = var35.lightness + Tiles.field1131;
										if (var40 < 0) {
											var40 = 0;
										} else if (var40 > 255) {
											var40 = 255;
										}

										var38 = WorldMapElement.hslToRgb(var39, var35.saturation, var40);
									}

									var39 = 0;
									if (var38 != -2) {
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[class26.method272(var38, 96)];
									}

									if (var35.secondaryRgb != -1) {
										var40 = var35.secondaryHue + Tiles.field1130 & 255;
										int var41 = var35.secondaryLightness + Tiles.field1131;
										if (var41 < 0) {
											var41 = 0;
										} else if (var41 > 255) {
											var41 = 255;
										}

										var38 = WorldMapElement.hslToRgb(var40, var35.secondarySaturation, var41);
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[class26.method272(var38, 96)];
									}

									var0.addTile(var2, var11, var17, var33, var48, var36, var22, var23, var24, var25, HealthBarDefinition.method2728(var30, var26), HealthBarDefinition.method2728(var30, var27), HealthBarDefinition.method2728(var30, var28), HealthBarDefinition.method2728(var30, var29), class26.method272(var37, var26), class26.method272(var37, var27), class26.method272(var37, var28), class26.method272(var37, var29), var32, var39);
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

			Tiles.field1120[var2] = null;
			class253.field3130[var2] = null;
			class20.field182[var2] = null;
			DirectByteArrayCopier.field3128[var2] = null;
			class372.field4123[var2] = null;
		}

		var0.method3955(-50, -10, -50);

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
						short var46;
						if ((UrlRequester.field1419[var6][var8][var7] & var2) != 0) {
							var9 = var7;
							var10 = var7;
							var11 = var6;

							for (var12 = var6; var9 > 0 && (UrlRequester.field1419[var6][var8][var9 - 1] & var2) != 0; --var9) {
							}

							while (var10 < 104 && (UrlRequester.field1419[var6][var8][var10 + 1] & var2) != 0) {
								++var10;
							}

							label438:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((UrlRequester.field1419[var11 - 1][var8][var13] & var2) == 0) {
										break label438;
									}
								}

								--var11;
							}

							label427:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((UrlRequester.field1419[var12 + 1][var8][var13] & var2) == 0) {
										break label427;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var46 = 240;
								var15 = Tiles.Tiles_heights[var12][var8][var9] - var46;
								var16 = Tiles.Tiles_heights[var11][var8][var9];
								Scene.Scene_addOccluder(var5, 1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = UrlRequester.field1419[var17][var8];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((UrlRequester.field1419[var6][var8][var7] & var3) != 0) {
							var9 = var8;
							var10 = var8;
							var11 = var6;

							for (var12 = var6; var9 > 0 && (UrlRequester.field1419[var6][var9 - 1][var7] & var3) != 0; --var9) {
							}

							while (var10 < 104 && (UrlRequester.field1419[var6][var10 + 1][var7] & var3) != 0) {
								++var10;
							}

							label491:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((UrlRequester.field1419[var11 - 1][var13][var7] & var3) == 0) {
										break label491;
									}
								}

								--var11;
							}

							label480:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((UrlRequester.field1419[var12 + 1][var13][var7] & var3) == 0) {
										break label480;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var46 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var7] - var46;
								var16 = Tiles.Tiles_heights[var11][var9][var7];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var7 * 128, var7 * 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = UrlRequester.field1419[var17][var18];
										var10000[var7] &= ~var3;
									}
								}
							}
						}

						if ((UrlRequester.field1419[var6][var8][var7] & var4) != 0) {
							var9 = var8;
							var10 = var8;
							var11 = var7;

							for (var12 = var7; var11 > 0 && (UrlRequester.field1419[var6][var8][var11 - 1] & var4) != 0; --var11) {
							}

							while (var12 < 104 && (UrlRequester.field1419[var6][var8][var12 + 1] & var4) != 0) {
								++var12;
							}

							label544:
							while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((UrlRequester.field1419[var6][var9 - 1][var13] & var4) == 0) {
										break label544;
									}
								}

								--var9;
							}

							label533:
							while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((UrlRequester.field1419[var6][var10 + 1][var13] & var4) == 0) {
										break label533;
									}
								}

								++var10;
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var6][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = UrlRequester.field1419[var6][var14];
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1692198232"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "12"
	)
	static void method209(int var0, int var1) {
		int[] var2 = new int[9];

		for (int var3 = 0; var3 < var2.length; ++var3) {
			int var4 = var3 * 32 + 15 + 128;
			int var5 = SecureRandomFuture.method1980(var4);
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4];
			var5 = WorldMapDecoration.method3627(var5, var1);
			var2[var3] = var6 * var5 >> 16;
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334);
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lcu;",
		garbageValue = "1899538302"
	)
	static final InterfaceParent method208(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		class21.Widget_resetModelFrames(var1);
		Widget var4 = Frames.getWidget(var0);
		WorldMapCacheName.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			WorldMapCacheName.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		class7.method68();
		class313.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var0 >> 16], var4, false);
		FloorDecoration.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			Login.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
