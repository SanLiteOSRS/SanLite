import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cu")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lic;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("l")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Ljv;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		signature = "(Lir;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-891370152"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(IB)Lca;",
		garbageValue = "-95"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
				var2.remove();
				var2 = var3;
			}

			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(B)Z",
		garbageValue = "0"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method4945();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(Lec;[Lft;I)V",
		garbageValue = "79338939"
	)
	static final void method2113(Scene var0, CollisionMap[] var1) {
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

		Tiles.field535 += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.field535 < -8) {
			Tiles.field535 = -8;
		}

		if (Tiles.field535 > 8) {
			Tiles.field535 = 8;
		}

		Tiles.field520 += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.field520 < -16) {
			Tiles.field520 = -16;
		}

		if (Tiles.field520 > 16) {
			Tiles.field520 = 16;
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
			byte[][] var42 = class22.field122[var2];
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
					class39.field282[var12][var11] = var19 - var20;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				Tiles.Tiles_hue[var11] = 0;
				Tiles.Tiles_saturation[var11] = 0;
				WorldMapRectangle.Tiles_lightness[var11] = 0;
				WorldMapScaleHandler.Tiles_hueMultiplier[var11] = 0;
				class60.field453[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						var14 = Tiles.field528[var2][var13][var12] & 255;
						if (var14 > 0) {
							var16 = var14 - 1;
							FloorUnderlayDefinition var43 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var16);
							FloorUnderlayDefinition var44;
							if (var43 != null) {
								var44 = var43;
							} else {
								byte[] var45 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var16);
								var43 = new FloorUnderlayDefinition();
								if (var45 != null) {
									var43.decode(new Buffer(var45), var16);
								}

								var43.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var43, (long)var16);
								var44 = var43;
							}

							var10000 = Tiles.Tiles_hue;
							var10000[var12] += var44.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var12] += var44.saturation;
							var10000 = WorldMapRectangle.Tiles_lightness;
							var10000[var12] += var44.lightness;
							var10000 = WorldMapScaleHandler.Tiles_hueMultiplier;
							var10000[var12] += var44.hueMultiplier;
							var10002 = class60.field453[var12]++;
						}
					}

					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						var15 = Tiles.field528[var2][var14][var12] & 255;
						if (var15 > 0) {
							var17 = var15 - 1;
							FloorUnderlayDefinition var52 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var17);
							FloorUnderlayDefinition var46;
							if (var52 != null) {
								var46 = var52;
							} else {
								byte[] var47 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var17);
								var52 = new FloorUnderlayDefinition();
								if (var47 != null) {
									var52.decode(new Buffer(var47), var17);
								}

								var52.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var52, (long)var17);
								var46 = var52;
							}

							var10000 = Tiles.Tiles_hue;
							var10000[var12] -= var46.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var12] -= var46.saturation;
							var10000 = WorldMapRectangle.Tiles_lightness;
							var10000[var12] -= var46.lightness;
							var10000 = WorldMapScaleHandler.Tiles_hueMultiplier;
							var10000[var12] -= var46.hueMultiplier;
							var10002 = class60.field453[var12]--;
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
							var12 += Tiles.Tiles_hue[var18];
							var13 += Tiles.Tiles_saturation[var18];
							var14 += WorldMapRectangle.Tiles_lightness[var18];
							var15 += WorldMapScaleHandler.Tiles_hueMultiplier[var18];
							var16 += class60.field453[var18];
						}

						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= Tiles.Tiles_hue[var19];
							var13 -= Tiles.Tiles_saturation[var19];
							var14 -= WorldMapRectangle.Tiles_lightness[var19];
							var15 -= WorldMapScaleHandler.Tiles_hueMultiplier[var19];
							var16 -= class60.field453[var19];
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.field528[var2][var11][var17] & 255;
							int var21 = Tiles.field521[var2][var11][var17] & 255;
							if (var20 > 0 || var21 > 0) {
								int var22 = Tiles.Tiles_heights[var2][var11][var17];
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var26 = class39.field282[var11][var17];
								int var27 = class39.field282[var11 + 1][var17];
								int var28 = class39.field282[var11 + 1][var17 + 1];
								int var29 = class39.field282[var11][var17 + 1];
								int var30 = -1;
								int var31 = -1;
								int var32;
								int var33;
								if (var20 > 0) {
									var32 = var12 * 256 / var15;
									var33 = var13 / var16;
									int var34 = var14 / var16;
									var30 = class60.hslToRgb(var32, var33, var34);
									var32 = var32 + Tiles.field535 & 255;
									var34 += Tiles.field520;
									if (var34 < 0) {
										var34 = 0;
									} else if (var34 > 255) {
										var34 = 255;
									}

									var31 = class60.hslToRgb(var32, var33, var34);
								}

								if (var2 > 0) {
									boolean var50 = true;
									if (var20 == 0 && class297.field3668[var2][var11][var17] != 0) {
										var50 = false;
									}

									if (var21 > 0 && !SoundSystem.method2594(var21 - 1).hideUnderlay) {
										var50 = false;
									}

									if (var50 && var23 == var22 && var22 == var24 && var22 == var25) {
										var10000 = class204.field2421[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0;
								if (var31 != -1) {
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[PendingSpawn.method1795(var31, 96)];
								}

								if (var21 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, PendingSpawn.method1795(var30, var26), PendingSpawn.method1795(var30, var27), PendingSpawn.method1795(var30, var28), PendingSpawn.method1795(var30, var29), 0, 0, 0, 0, var32, 0);
								} else {
									var33 = class297.field3668[var2][var11][var17] + 1;
									byte var51 = class171.field2049[var2][var11][var17];
									FloorOverlayDefinition var35 = SoundSystem.method2594(var21 - 1);
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
										var37 = class60.hslToRgb(var35.hue, var35.saturation, var35.lightness);
										var39 = var35.hue + Tiles.field535 & 255;
										var40 = var35.lightness + Tiles.field520;
										if (var40 < 0) {
											var40 = 0;
										} else if (var40 > 255) {
											var40 = 255;
										}

										var38 = class60.hslToRgb(var39, var35.saturation, var40);
									}

									var39 = 0;
									if (var38 != -2) {
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[Coord.method4083(var38, 96)];
									}

									if (var35.secondaryRgb != -1) {
										var40 = var35.secondaryHue + Tiles.field535 & 255;
										int var41 = var35.secondaryLightness + Tiles.field520;
										if (var41 < 0) {
											var41 = 0;
										} else if (var41 > 255) {
											var41 = 255;
										}

										var38 = class60.hslToRgb(var40, var35.secondarySaturation, var41);
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[Coord.method4083(var38, 96)];
									}

									var0.addTile(var2, var11, var17, var33, var51, var36, var22, var23, var24, var25, PendingSpawn.method1795(var30, var26), PendingSpawn.method1795(var30, var27), PendingSpawn.method1795(var30, var28), PendingSpawn.method1795(var30, var29), Coord.method4083(var37, var26), Coord.method4083(var37, var27), Coord.method4083(var37, var28), Coord.method4083(var37, var29), var32, var39);
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

			Tiles.field528[var2] = null;
			Tiles.field521[var2] = null;
			class297.field3668[var2] = null;
			class171.field2049[var2] = null;
			class22.field122[var2] = null;
		}

		var0.method3219(-50, -10, -50);

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
						if ((class204.field2421[var6][var8][var7] & var2) != 0) {
							var9 = var7;
							var10 = var7;
							var11 = var6;

							for (var12 = var6; var9 > 0 && (class204.field2421[var6][var8][var9 - 1] & var2) != 0; --var9) {
							}

							while (var10 < 104 && (class204.field2421[var6][var8][var10 + 1] & var2) != 0) {
								++var10;
							}

							label490:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class204.field2421[var11 - 1][var8][var13] & var2) == 0) {
										break label490;
									}
								}

								--var11;
							}

							label479:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class204.field2421[var12 + 1][var8][var13] & var2) == 0) {
										break label479;
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
										var10000 = class204.field2421[var17][var8];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class204.field2421[var6][var8][var7] & var3) != 0) {
							var9 = var8;
							var10 = var8;
							var11 = var6;

							for (var12 = var6; var9 > 0 && (class204.field2421[var6][var9 - 1][var7] & var3) != 0; --var9) {
							}

							while (var10 < 104 && (class204.field2421[var6][var10 + 1][var7] & var3) != 0) {
								++var10;
							}

							label543:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class204.field2421[var11 - 1][var13][var7] & var3) == 0) {
										break label543;
									}
								}

								--var11;
							}

							label532:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class204.field2421[var12 + 1][var13][var7] & var3) == 0) {
										break label532;
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
										var10000 = class204.field2421[var17][var18];
										var10000[var7] &= ~var3;
									}
								}
							}
						}

						if ((class204.field2421[var6][var8][var7] & var4) != 0) {
							var9 = var8;
							var10 = var8;
							var11 = var7;

							for (var12 = var7; var11 > 0 && (class204.field2421[var6][var8][var11 - 1] & var4) != 0; --var11) {
							}

							while (var12 < 104 && (class204.field2421[var6][var8][var12 + 1] & var4) != 0) {
								++var12;
							}

							label596:
							while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((class204.field2421[var6][var9 - 1][var13] & var4) == 0) {
										break label596;
									}
								}

								--var9;
							}

							label585:
							while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((class204.field2421[var6][var10 + 1][var13] & var4) == 0) {
										break label585;
									}
								}

								++var10;
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var6][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = class204.field2421[var6][var14];
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(II)I",
		garbageValue = "-2034460378"
	)
	@Export("Messages_getNextChatID")
	static int Messages_getNextChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		signature = "(ILcy;ZB)I",
		garbageValue = "-51"
	)
	static int method2112(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].type();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].id;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].unitPrice;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].totalQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentQuantity;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.grandExchangeOffers[var3].currentPrice;
			return 1;
		} else {
			int var12;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				var12 = Client.grandExchangeOffers[var3].status();
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var13;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (WorldMapSection1.grandExchangeEvents != null) {
						WorldMapSection1.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_nameComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (WorldMapSection1.grandExchangeEvents != null) {
						WorldMapSection1.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_priceComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					Interpreter.Interpreter_intStackSize -= 2;
					var13 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == 1;
					boolean var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
					if (WorldMapSection1.grandExchangeEvents != null) {
						Client.GrandExchangeEvents_worldComparator.filterWorlds = var4;
						WorldMapSection1.grandExchangeEvents.sort(Client.GrandExchangeEvents_worldComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (WorldMapSection1.grandExchangeEvents != null) {
						WorldMapSection1.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_ageComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var13 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
					if (WorldMapSection1.grandExchangeEvents != null) {
						WorldMapSection1.grandExchangeEvents.sort(GrandExchangeEvents.GrandExchangeEvents_quantityComparator, var13);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapSection1.grandExchangeEvents == null ? 0 : WorldMapSection1.grandExchangeEvents.events.size();
					return 1;
				} else {
					GrandExchangeEvent var11;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.world;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var11.getOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var11.getPreviousOfferName();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3);
						long var5 = PacketWriter.currentTimeMillis() - ItemContainer.field553 - var11.age;
						int var7 = (int)(var5 / 3600000L);
						int var8 = (int)((var5 - (long)(var7 * 3600000)) / 60000L);
						int var9 = (int)((var5 - (long)(var7 * 3600000) - (long)(var8 * 60000)) / 1000L);
						String var10 = var7 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10;
						Interpreter.Interpreter_stringStack[++Varps.Interpreter_stringStackSize - 1] = var10;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.totalQuantity;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.unitPrice;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var11 = (GrandExchangeEvent)WorldMapSection1.grandExchangeEvents.events.get(var3);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var11.grandExchangeOffer.id;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		signature = "(IIIILlp;Lhz;I)V",
		garbageValue = "728555201"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method6262(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
