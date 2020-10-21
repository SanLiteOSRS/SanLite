import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("NPC")
public final class NPC extends Actor {
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1244171609
	)
	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("z")
	static byte[][][] field1161;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Ljn;"
	)
	@Export("definition")
	NPCComposition definition;

	NPC() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(IBI)V",
		garbageValue = "-522302894"
	)
	final void method2150(int var1, byte var2) {
		int var3 = super.pathX[0];
		int var4 = super.pathY[0];
		if (var1 == 0) {
			--var3;
			++var4;
		}

		if (var1 == 1) {
			++var4;
		}

		if (var1 == 2) {
			++var3;
			++var4;
		}

		if (var1 == 3) {
			--var3;
		}

		if (var1 == 4) {
			++var3;
		}

		if (var1 == 5) {
			--var3;
			--var4;
		}

		if (var1 == 6) {
			--var4;
		}

		if (var1 == 7) {
			++var3;
			--var4;
		}

		if (super.sequence != -1 && class105.SequenceDefinition_get(super.sequence).field3550 == 1) {
			super.sequence = -1;
		}

		if (super.pathLength < 9) {
			++super.pathLength;
		}

		for (int var5 = super.pathLength; var5 > 0; --var5) {
			super.pathX[var5] = super.pathX[var5 - 1];
			super.pathY[var5] = super.pathY[var5 - 1];
			super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
		}

		super.pathX[0] = var3;
		super.pathY[0] = var4;
		super.pathTraversed[0] = var2;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(IIZB)V",
		garbageValue = "124"
	)
	final void method2144(int var1, int var2, boolean var3) {
		if (super.sequence != -1 && class105.SequenceDefinition_get(super.sequence).field3550 == 1) {
			super.sequence = -1;
		}

		if (!var3) {
			int var4 = var1 - super.pathX[0];
			int var5 = var2 - super.pathY[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (super.pathLength < 9) {
					++super.pathLength;
				}

				for (int var6 = super.pathLength; var6 > 0; --var6) {
					super.pathX[var6] = super.pathX[var6 - 1];
					super.pathY[var6] = super.pathY[var6 - 1];
					super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
				}

				super.pathX[0] = var1;
				super.pathY[0] = var2;
				super.pathTraversed[0] = 1;
				return;
			}
		}

		super.pathLength = 0;
		super.field1034 = 0;
		super.field978 = 0;
		super.pathX[0] = var1;
		super.pathY[0] = var2;
		super.x = super.field1011 * 64 + super.pathX[0] * 128;
		super.y = super.field1011 * 64 + super.pathY[0] * 128;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "(I)Leh;",
		garbageValue = "-2070677844"
	)
	@Export("getModel")
	protected final Model getModel() {
		if (this.definition == null) {
			return null;
		} else {
			SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class105.SequenceDefinition_get(super.sequence) : null;
			SequenceDefinition var2 = super.movementSequence != -1 && (super.readySequence != super.movementSequence || var1 == null) ? class105.SequenceDefinition_get(super.movementSequence) : null;
			Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
			if (var3 == null) {
				return null;
			} else {
				var3.calculateBoundsCylinder();
				super.defaultHeight = var3.height;
				if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
					Model var4 = HealthBarUpdate.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
					if (var4 != null) {
						var4.offsetBy(0, -super.field1016, 0);
						Model[] var5 = new Model[]{var3, var4};
						var3 = new Model(var5, 2);
					}
				}

				if (this.definition.size == 1) {
					var3.isSingleTile = true;
				}

				return var3;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "2035007323"
	)
	@Export("isVisible")
	final boolean isVisible() {
		return this.definition != null;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1437281786"
	)
	public static void method2146() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(IIIIIILef;Lfh;I)V",
		garbageValue = "1419271309"
	)
	static final void method2160(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = ScriptEvent.getObjectDefinition(var3);
			int var9;
			int var10;
			if (var4 != 1 && var4 != 3) {
				var9 = var8.sizeX;
				var10 = var8.sizeY;
			} else {
				var9 = var8.sizeY;
				var10 = var8.sizeX;
			}

			int var11;
			int var12;
			if (var9 + var1 <= 104) {
				var11 = (var9 >> 1) + var1;
				var12 = (var9 + 1 >> 1) + var1;
			} else {
				var11 = var1;
				var12 = var1 + 1;
			}

			int var13;
			int var14;
			if (var10 + var2 <= 104) {
				var13 = (var10 >> 1) + var2;
				var14 = var2 + (var10 + 1 >> 1);
			} else {
				var13 = var2;
				var14 = var2 + 1;
			}

			int[][] var15 = Tiles.Tiles_heights[var0];
			int var16 = var15[var11][var13] + var15[var12][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = GrandExchangeOfferOwnWorldComparator.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
			int var21 = var5 + (var4 << 6);
			if (var8.int3 == 1) {
				var21 += 256;
			}

			int var23;
			int var24;
			if (var8.hasSound()) {
				ObjectSound var22 = new ObjectSound();
				var22.plane = var0;
				var22.x = var1 * 16384;
				var22.y = var2 * 16384;
				var23 = var8.sizeX;
				var24 = var8.sizeY;
				if (var4 == 1 || var4 == 3) {
					var23 = var8.sizeY;
					var24 = var8.sizeX;
				}

				var22.field1103 = (var23 + var1) * 128;
				var22.field1112 = (var24 + var2) * 16384;
				var22.soundEffectId = var8.ambientSoundId;
				var22.field1104 = var8.int4 * 128;
				var22.field1107 = var8.int5;
				var22.field1109 = var8.int6;
				var22.soundEffectIds = var8.soundEffectIds;
				if (var8.transforms != null) {
					var22.obj = var8;
					var22.set();
				}

				ObjectSound.objectSounds.addFirst(var22);
				if (var22.soundEffectIds != null) {
					var22.field1108 = var22.field1107 + (int)(Math.random() * (double)(var22.field1109 - var22.field1107));
				}
			}

			Object var34;
			if (var5 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
					}

					var6.newFloorDecoration(var0, var1, var2, var16, (Renderable)var34, var19, var21);
					if (var8.interactType == 1 && var7 != null) {
						var7.setBlockedByFloorDec(var1, var2);
					}

				}
			} else if (var5 != 10 && var5 != 11) {
				int[] var10000;
				if (var5 >= 12) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
					}

					var6.method3227(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
						var10000 = UserComparator10.field2000[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field533[var4], 0, var19, var21);
					if (var4 == 0) {
						if (var8.clipped) {
							class299.field3679[var0][var1][var2] = 50;
							class299.field3679[var0][var1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = UserComparator10.field2000[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) {
						if (var8.clipped) {
							class299.field3679[var0][var1][var2 + 1] = 50;
							class299.field3679[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = UserComparator10.field2000[var0][var1];
							var10000[var2 + 1] |= 1170;
						}
					} else if (var4 == 2) {
						if (var8.clipped) {
							class299.field3679[var0][var1 + 1][var2] = 50;
							class299.field3679[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = UserComparator10.field2000[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) {
						if (var8.clipped) {
							class299.field3679[var0][var1][var2] = 50;
							class299.field3679[var0][var1 + 1][var2] = 50;
						}

						if (var8.modelClipped) {
							var10000 = UserComparator10.field2000[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.method3683(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) {
						var6.method3233(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field534[var4], 0, var19, var21);
					if (var8.clipped) {
						if (var4 == 0) {
							class299.field3679[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) {
							class299.field3679[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) {
							class299.field3679[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) {
							class299.field3679[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.method3683(var1, var2, var5, var4, var8.boolean1);
					}

				} else {
					int var28;
					if (var5 == 2) {
						var28 = var4 + 1 & 3;
						Object var29;
						Object var30;
						if (var8.animationId == -1 && var8.transforms == null) {
							var29 = var8.getEntity(2, var4 + 4, var15, var17, var16, var18);
							var30 = var8.getEntity(2, var28, var15, var17, var16, var18);
						} else {
							var29 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
							var30 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, true, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)var30, Tiles.field533[var4], Tiles.field533[var28], var19, var21);
						if (var8.modelClipped) {
							if (var4 == 0) {
								var10000 = UserComparator10.field2000[var0][var1];
								var10000[var2] |= 585;
								var10000 = UserComparator10.field2000[var0][var1];
								var10000[var2 + 1] |= 1170;
							} else if (var4 == 1) {
								var10000 = UserComparator10.field2000[var0][var1];
								var10000[1 + var2] |= 1170;
								var10000 = UserComparator10.field2000[var0][var1 + 1];
								var10000[var2] |= 585;
							} else if (var4 == 2) {
								var10000 = UserComparator10.field2000[var0][var1 + 1];
								var10000[var2] |= 585;
								var10000 = UserComparator10.field2000[var0][var1];
								var10000[var2] |= 1170;
							} else if (var4 == 3) {
								var10000 = UserComparator10.field2000[var0][var1];
								var10000[var2] |= 1170;
								var10000 = UserComparator10.field2000[var0][var1];
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3683(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method3233(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field534[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								class299.field3679[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								class299.field3679[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								class299.field3679[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								class299.field3679[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method3683(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
						}

						var6.method3227(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method3233(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
						}

						var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field533[var4], 0, 0, 0, var19, var21);
					} else {
						long var31;
						Object var33;
						if (var5 == 5) {
							var28 = 16;
							var31 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (var31 != 0L) {
								var28 = ScriptEvent.getObjectDefinition(ObjectSound.Entity_unpackID(var31)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) {
								var33 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var33 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var33, (Renderable)null, Tiles.field533[var4], 0, var28 * Tiles.field528[var4], var28 * Tiles.field536[var4], var19, var21);
						} else if (var5 == 6) {
							var28 = 8;
							var31 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (0L != var31) {
								var28 = ScriptEvent.getObjectDefinition(ObjectSound.Entity_unpackID(var31)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) {
								var33 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var33 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var33, (Renderable)null, 256, var4, var28 * Tiles.field535[var4], var28 * Tiles.field529[var4], var19, var21);
						} else if (var5 == 7) {
							var23 = var4 + 2 & 3;
							if (var8.animationId == -1 && var8.transforms == null) {
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21);
						} else if (var5 == 8) {
							var28 = 8;
							var31 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (var31 != 0L) {
								var28 = ScriptEvent.getObjectDefinition(ObjectSound.Entity_unpackID(var31)).int2 / 2;
							}

							int var27 = var4 + 2 & 3;
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) {
								var33 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
							} else {
								var33 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, true, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var33, (Renderable)var26, 256, var4, var28 * Tiles.field535[var4], var28 * Tiles.field529[var4], var19, var21);
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) {
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, true, (Renderable)null);
				}

				if (var34 != null && var6.method3227(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
					var23 = 15;
					if (var34 instanceof Model) {
						var23 = ((Model)var34).method3013() / 4;
						if (var23 > 30) {
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) {
						for (int var25 = 0; var25 <= var10; ++var25) {
							if (var23 > class299.field3679[var0][var24 + var1][var25 + var2]) {
								class299.field3679[var0][var24 + var1][var25 + var2] = (byte)var23;
							}
						}
					}
				}

				if (var8.interactType != 0 && var7 != null) {
					var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
				}

			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "750977522"
	)
	static int method2158(int var0, Script var1, boolean var2) {
		String var3;
		if (var0 == ScriptOpcodes.MES) {
			var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
			DevicePcmPlayerProvider.addGameMessage(0, "", var3);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			MilliClock.Interpreter_intStackSize -= 2;
			Varps.performPlayerAnimation(PlayerType.localPlayer, Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize], Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!Interpreter.field1128) {
				Interpreter.field1130 = true;
			}

			return 1;
		} else {
			int var10;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
				var10 = 0;
				if (class195.isNumber(var3)) {
					var10 = ObjectSound.parseInt(var3);
				}

				PacketBufferNode var12 = class4.getPacketBufferNode(ClientPacket.field2268, Client.packetWriter.isaacCipher);
				var12.packetBuffer.writeInt(var10);
				Client.packetWriter.addNode(var12);
				return 1;
			} else {
				PacketBufferNode var14;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
					var14 = class4.getPacketBufferNode(ClientPacket.field2241, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(var3.length() + 1);
					var14.packetBuffer.writeStringCp1252NullTerminated(var3);
					Client.packetWriter.addNode(var14);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
					var14 = class4.getPacketBufferNode(ClientPacket.field2270, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeByte(var3.length() + 1);
					var14.packetBuffer.writeStringCp1252NullTerminated(var3);
					Client.packetWriter.addNode(var14);
					return 1;
				} else {
					String var7;
					int var15;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var15 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
						FontName.method5458(var15, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						MilliClock.Interpreter_intStackSize -= 3;
						var15 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
						var10 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
						int var9 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 2];
						Widget var13 = UserComparator4.getWidget(var9);
						class228.clickWidget(var13, var15, var10);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						MilliClock.Interpreter_intStackSize -= 2;
						var15 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
						var10 = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
						Widget var11 = var2 ? MouseRecorder.field621 : Interpreter.field1122;
						class228.clickWidget(var11, var15, var10);
						return 1;
					} else if (var0 == ScriptOpcodes.MOUSECAM) {
						MusicPatchNode.mouseCam = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.clientPreferences.roofsHidden ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						GrandExchangeOfferAgeComparator.clientPreferences.roofsHidden = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
						Tile.savePreferences();
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var3 = Interpreter.Interpreter_stringStack[--UrlRequester.Interpreter_stringStackSize];
						boolean var4 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
						Skeleton.openURL(var3, var4, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var15 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						var14 = class4.getPacketBufferNode(ClientPacket.field2316, Client.packetWriter.isaacCipher);
						var14.packetBuffer.writeShort(var15);
						Client.packetWriter.addNode(var14);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var15 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						UrlRequester.Interpreter_stringStackSize -= 2;
						var7 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize];
						String var5 = Interpreter.Interpreter_stringStack[UrlRequester.Interpreter_stringStackSize + 1];
						if (var7.length() > 500) {
							return 1;
						} else if (var5.length() > 500) {
							return 1;
						} else {
							PacketBufferNode var6 = class4.getPacketBufferNode(ClientPacket.field2310, Client.packetWriter.isaacCipher);
							var6.packetBuffer.writeShort(1 + SpriteMask.stringCp1252NullTerminatedByteSize(var7) + SpriteMask.stringCp1252NullTerminatedByteSize(var5));
							var6.packetBuffer.writeStringCp1252NullTerminated(var5);
							var6.packetBuffer.writeByte(var15);
							var6.packetBuffer.writeStringCp1252NullTerminated(var7);
							Client.packetWriter.addNode(var6);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						Client.shiftClickDrop = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						Client.showMouseOverText = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						Client.renderSelf = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == 3120) {
						if (Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 1;
						} else {
							Client.drawPlayerNames &= -2;
						}

						return 1;
					} else if (var0 == 3121) {
						if (Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 2;
						} else {
							Client.drawPlayerNames &= -3;
						}

						return 1;
					} else if (var0 == 3122) {
						if (Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 4;
						} else {
							Client.drawPlayerNames &= -5;
						}

						return 1;
					} else if (var0 == 3123) {
						if (Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1) {
							Client.drawPlayerNames |= 8;
						} else {
							Client.drawPlayerNames &= -9;
						}

						return 1;
					} else if (var0 == 3124) {
						Client.drawPlayerNames = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						Client.showMouseCross = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						Client.showLoadingMessages = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						Huffman.setTapToDrop(Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ModeWhere.getTapToDrop() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETOCULUSORBSPEED) {
						MilliClock.Interpreter_intStackSize -= 2;
						Client.oculusOrbNormalSpeed = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize];
						Client.oculusOrbSlowedSpeed = Interpreter.Interpreter_intStack[MilliClock.Interpreter_intStackSize + 1];
						return 1;
					} else if (var0 == 3130) {
						MilliClock.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3131) {
						--MilliClock.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = ItemContainer.canvasWidth;
						Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = HealthBar.canvasHeight;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--MilliClock.Interpreter_intStackSize;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						MilliClock.Interpreter_intStackSize -= 2;
						return 1;
					} else if (var0 == 3136) {
						Client.field843 = 3;
						Client.field844 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3137) {
						Client.field843 = 2;
						Client.field844 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize];
						return 1;
					} else if (var0 == 3138) {
						Client.field843 = 0;
						return 1;
					} else if (var0 == 3139) {
						Client.field843 = 1;
						return 1;
					} else if (var0 == 3140) {
						Client.field843 = 3;
						Client.field844 = var2 ? MouseRecorder.field621.id : Interpreter.field1122.id;
						return 1;
					} else {
						boolean var8;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var8 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							GrandExchangeOfferAgeComparator.clientPreferences.hideUsername = var8;
							Tile.savePreferences();
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.clientPreferences.hideUsername ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var8 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							Client.Login_isUsernameRemembered = var8;
							if (!var8) {
								GrandExchangeOfferAgeComparator.clientPreferences.rememberedUsername = "";
								Tile.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Client.Login_isUsernameRemembered ? 1 : 0;
							return 1;
						} else if (var0 == 3145) {
							return 1;
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICENABLED) {
							var8 = Interpreter.Interpreter_intStack[--MilliClock.Interpreter_intStackSize] == 1;
							if (var8 == GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled) {
								GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled = !var8;
								Tile.savePreferences();
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICENABLED) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.clientPreferences.titleMusicDisabled ? 0 : 1;
							return 1;
						} else if (var0 == 3148) {
							return 1;
						} else if (var0 == 3149) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3150) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3151) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3152) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3153) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = Login.Login_loadingPercent;
							return 1;
						} else if (var0 == 3154) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = GraphicsObject.method2122();
							return 1;
						} else if (var0 == 3155) {
							--UrlRequester.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3156) {
							return 1;
						} else if (var0 == 3157) {
							MilliClock.Interpreter_intStackSize -= 2;
							return 1;
						} else if (var0 == 3158) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3159) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3160) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3161) {
							--MilliClock.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3162) {
							--MilliClock.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3163) {
							--UrlRequester.Interpreter_stringStackSize;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3164) {
							--MilliClock.Interpreter_intStackSize;
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3165) {
							--MilliClock.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3166) {
							MilliClock.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3167) {
							MilliClock.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3168) {
							MilliClock.Interpreter_intStackSize -= 2;
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++UrlRequester.Interpreter_stringStackSize - 1] = "";
							return 1;
						} else if (var0 == 3169) {
							return 1;
						} else if (var0 == 3170) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3171) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3172) {
							--MilliClock.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3173) {
							--MilliClock.Interpreter_intStackSize;
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3174) {
							--MilliClock.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 3175) {
							Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = 0;
							return 1;
						} else if (var0 == 3176) {
							return 1;
						} else if (var0 == 3177) {
							return 1;
						} else if (var0 == 3178) {
							--UrlRequester.Interpreter_stringStackSize;
							return 1;
						} else if (var0 == 3179) {
							return 1;
						} else if (var0 == 3180) {
							--UrlRequester.Interpreter_stringStackSize;
							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;ZI)Ljava/lang/String;",
		garbageValue = "-1211610671"
	)
	static String method2157(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (WorldMapRegion.field281 != null) {
			var3 = "/p=" + WorldMapRegion.field281;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + FontName.clientLanguage + "/a=" + TextureProvider.field1561 + var3 + "/";
	}
}
