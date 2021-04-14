import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class157 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lfy;"
	)
	static final class157 field1732;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lfy;"
	)
	static final class157 field1733;
	@ObfuscatedName("k")
	@Export("SpriteBuffer_spriteHeights")
	static int[] SpriteBuffer_spriteHeights;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive5")
	static Archive archive5;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -2045645693
	)
	@Export("value")
	final int value;

	static {
		field1732 = new class157(0);
		field1733 = new class157(1);
	}

	class157(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "([BIIIIIIILfu;[Lel;I)V",
		garbageValue = "-1535300065"
	)
	static final void method3114(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.method6595();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.readUShortSmart();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					ObjectComposition var21 = class19.getObjectDefinition(var11);
					int var24 = var16 & 7;
					int var25 = var15 & 7;
					int var27 = var21.sizeX;
					int var28 = var21.sizeY;
					int var29;
					if ((var20 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var7 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var24;
					} else if (var26 == 1) {
						var23 = var25;
					} else if (var26 == 2) {
						var23 = 7 - var24 - (var27 - 1);
					} else {
						var23 = 7 - var25 - (var28 - 1);
					}

					var29 = var2 + var23;
					int var32 = var16 & 7;
					int var33 = var15 & 7;
					int var35 = var21.sizeX;
					int var36 = var21.sizeY;
					int var37;
					if ((var20 & 1) == 1) {
						var37 = var35;
						var35 = var36;
						var36 = var37;
					}

					int var34 = var7 & 3;
					int var31;
					if (var34 == 0) {
						var31 = var33;
					} else if (var34 == 1) {
						var31 = 7 - var32 - (var35 - 1);
					} else if (var34 == 2) {
						var31 = 7 - var33 - (var36 - 1);
					} else {
						var31 = var32;
					}

					var37 = var31 + var3;
					if (var29 > 0 && var37 > 0 && var29 < 103 && var37 < 103) {
						int var38 = var1;
						if ((Tiles.Tiles_renderFlags[1][var29][var37] & 2) == 2) {
							var38 = var1 - 1;
						}

						CollisionMap var39 = null;
						if (var38 >= 0) {
							var39 = var9[var38];
						}

						method3115(var1, var29, var37, var11, var20 + var7 & 3, var19, var8, var39);
					}
				}
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(IIIIIILfu;Lel;B)V",
		garbageValue = "26"
	)
	static final void method3115(int var0, int var1, int var2, int var3, int var4, int var5, Scene var6, CollisionMap var7) {
		if (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var1][var2] & 2) != 0 || (Tiles.Tiles_renderFlags[var0][var1][var2] & 16) == 0) {
			if (var0 < Tiles.Tiles_minPlane) {
				Tiles.Tiles_minPlane = var0;
			}

			ObjectComposition var8 = class19.getObjectDefinition(var3);
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
			int var16 = var15[var12][var13] + var15[var11][var13] + var15[var11][var14] + var15[var12][var14] >> 2;
			int var17 = (var1 << 7) + (var9 << 6);
			int var18 = (var2 << 7) + (var10 << 6);
			long var19 = AttackOption.calculateTag(var1, var2, 2, var8.int1 == 0, var3);
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

				var22.field916 = (var23 + var1) * 16384;
				var22.field917 = (var24 + var2) * 128;
				var22.soundEffectId = var8.ambientSoundId;
				var22.field918 = var8.int4 * 128;
				var22.field921 = var8.int5;
				var22.field922 = var8.int6;
				var22.soundEffectIds = var8.soundEffectIds;
				if (var8.transforms != null) {
					var22.obj = var8;
					var22.set();
				}

				ObjectSound.objectSounds.addFirst(var22);
				if (var22.soundEffectIds != null) {
					var22.field924 = var22.field921 + (int)(Math.random() * (double)(var22.field922 - var22.field921));
				}
			}

			Object var34;
			if (var5 == 22) {
				if (!Client.isLowDetail || var8.int1 != 0 || var8.interactType == 1 || var8.boolean2) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(22, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 22, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
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
						var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
					}

					var6.method3445(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
					if (var5 >= 12 && var5 <= 17 && var5 != 13 && var0 > 0) {
						var10000 = MidiPcmStream.field2489[var0][var1];
						var10000[var2] |= 2340;
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
					}

				} else if (var5 == 0) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(0, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 0, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1094[var4], 0, var19, var21);
					if (var4 == 0) {
						if (var8.clipped) {
							SecureRandomCallable.field1106[var0][var1][var2] = 50;
							SecureRandomCallable.field1106[var0][var1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = MidiPcmStream.field2489[var0][var1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 1) {
						if (var8.clipped) {
							SecureRandomCallable.field1106[var0][var1][var2 + 1] = 50;
							SecureRandomCallable.field1106[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = MidiPcmStream.field2489[var0][var1];
							var10000[1 + var2] |= 1170;
						}
					} else if (var4 == 2) {
						if (var8.clipped) {
							SecureRandomCallable.field1106[var0][var1 + 1][var2] = 50;
							SecureRandomCallable.field1106[var0][var1 + 1][var2 + 1] = 50;
						}

						if (var8.modelClipped) {
							var10000 = MidiPcmStream.field2489[var0][var1 + 1];
							var10000[var2] |= 585;
						}
					} else if (var4 == 3) {
						if (var8.clipped) {
							SecureRandomCallable.field1106[var0][var1][var2] = 50;
							SecureRandomCallable.field1106[var0][var1 + 1][var2] = 50;
						}

						if (var8.modelClipped) {
							var10000 = MidiPcmStream.field2489[var0][var1];
							var10000[var2] |= 1170;
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.method2613(var1, var2, var5, var4, var8.boolean1);
					}

					if (var8.int2 != 16) {
						var6.method3538(var0, var1, var2, var8.int2);
					}

				} else if (var5 == 1) {
					if (var8.animationId == -1 && var8.transforms == null) {
						var34 = var8.getEntity(1, var4, var15, var17, var16, var18);
					} else {
						var34 = new DynamicObject(var3, 1, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
					}

					var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1098[var4], 0, var19, var21);
					if (var8.clipped) {
						if (var4 == 0) {
							SecureRandomCallable.field1106[var0][var1][var2 + 1] = 50;
						} else if (var4 == 1) {
							SecureRandomCallable.field1106[var0][var1 + 1][var2 + 1] = 50;
						} else if (var4 == 2) {
							SecureRandomCallable.field1106[var0][var1 + 1][var2] = 50;
						} else if (var4 == 3) {
							SecureRandomCallable.field1106[var0][var1][var2] = 50;
						}
					}

					if (var8.interactType != 0 && var7 != null) {
						var7.method2613(var1, var2, var5, var4, var8.boolean1);
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
							var29 = new DynamicObject(var3, 2, var4 + 4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
							var30 = new DynamicObject(var3, 2, var28, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var29, (Renderable)var30, Tiles.field1094[var4], Tiles.field1094[var28], var19, var21);
						if (var8.modelClipped) {
							if (var4 == 0) {
								var10000 = MidiPcmStream.field2489[var0][var1];
								var10000[var2] |= 585;
								var10000 = MidiPcmStream.field2489[var0][var1];
								var10000[1 + var2] |= 1170;
							} else if (var4 == 1) {
								var10000 = MidiPcmStream.field2489[var0][var1];
								var10000[1 + var2] |= 1170;
								var10000 = MidiPcmStream.field2489[var0][var1 + 1];
								var10000[var2] |= 585;
							} else if (var4 == 2) {
								var10000 = MidiPcmStream.field2489[var0][var1 + 1];
								var10000[var2] |= 585;
								var10000 = MidiPcmStream.field2489[var0][var1];
								var10000[var2] |= 1170;
							} else if (var4 == 3) {
								var10000 = MidiPcmStream.field2489[var0][var1];
								var10000[var2] |= 1170;
								var10000 = MidiPcmStream.field2489[var0][var1];
								var10000[var2] |= 585;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method2613(var1, var2, var5, var4, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method3538(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 3) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(3, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 3, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
						}

						var6.newBoundaryObject(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1098[var4], 0, var19, var21);
						if (var8.clipped) {
							if (var4 == 0) {
								SecureRandomCallable.field1106[var0][var1][var2 + 1] = 50;
							} else if (var4 == 1) {
								SecureRandomCallable.field1106[var0][var1 + 1][var2 + 1] = 50;
							} else if (var4 == 2) {
								SecureRandomCallable.field1106[var0][var1 + 1][var2] = 50;
							} else if (var4 == 3) {
								SecureRandomCallable.field1106[var0][var1][var2] = 50;
							}
						}

						if (var8.interactType != 0 && var7 != null) {
							var7.method2613(var1, var2, var5, var4, var8.boolean1);
						}

					} else if (var5 == 9) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(var5, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, var5, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
						}

						var6.method3445(var0, var1, var2, var16, 1, 1, (Renderable)var34, 0, var19, var21);
						if (var8.interactType != 0 && var7 != null) {
							var7.addGameObject(var1, var2, var9, var10, var8.boolean1);
						}

						if (var8.int2 != 16) {
							var6.method3538(var0, var1, var2, var8.int2);
						}

					} else if (var5 == 4) {
						if (var8.animationId == -1 && var8.transforms == null) {
							var34 = var8.getEntity(4, var4, var15, var17, var16, var18);
						} else {
							var34 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
						}

						var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, Tiles.field1094[var4], 0, 0, 0, var19, var21);
					} else {
						long var31;
						Object var33;
						if (var5 == 5) {
							var28 = 16;
							var31 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (0L != var31) {
								var28 = class19.getObjectDefinition(WorldMapSection1.Entity_unpackID(var31)).int2;
							}

							if (var8.animationId == -1 && var8.transforms == null) {
								var33 = var8.getEntity(4, var4, var15, var17, var16, var18);
							} else {
								var33 = new DynamicObject(var3, 4, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var33, (Renderable)null, Tiles.field1094[var4], 0, var28 * Tiles.field1097[var4], var28 * Tiles.field1100[var4], var19, var21);
						} else if (var5 == 6) {
							var28 = 8;
							var31 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (var31 != 0L) {
								var28 = class19.getObjectDefinition(WorldMapSection1.Entity_unpackID(var31)).int2 / 2;
							}

							if (var8.animationId == -1 && var8.transforms == null) {
								var33 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
							} else {
								var33 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var33, (Renderable)null, 256, var4, var28 * Tiles.field1101[var4], var28 * Tiles.field1099[var4], var19, var21);
						} else if (var5 == 7) {
							var23 = var4 + 2 & 3;
							if (var8.animationId == -1 && var8.transforms == null) {
								var34 = var8.getEntity(4, var23 + 4, var15, var17, var16, var18);
							} else {
								var34 = new DynamicObject(var3, 4, var23 + 4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var34, (Renderable)null, 256, var23, 0, 0, var19, var21);
						} else if (var5 == 8) {
							var28 = 8;
							var31 = var6.getBoundaryObjectTag(var0, var1, var2);
							if (var31 != 0L) {
								var28 = class19.getObjectDefinition(WorldMapSection1.Entity_unpackID(var31)).int2 / 2;
							}

							int var27 = var4 + 2 & 3;
							Object var26;
							if (var8.animationId == -1 && var8.transforms == null) {
								var33 = var8.getEntity(4, var4 + 4, var15, var17, var16, var18);
								var26 = var8.getEntity(4, var27 + 4, var15, var17, var16, var18);
							} else {
								var33 = new DynamicObject(var3, 4, var4 + 4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
								var26 = new DynamicObject(var3, 4, var27 + 4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
							}

							var6.newWallDecoration(var0, var1, var2, var16, (Renderable)var33, (Renderable)var26, 256, var4, var28 * Tiles.field1101[var4], var28 * Tiles.field1099[var4], var19, var21);
						}
					}
				}
			} else {
				if (var8.animationId == -1 && var8.transforms == null) {
					var34 = var8.getEntity(10, var4, var15, var17, var16, var18);
				} else {
					var34 = new DynamicObject(var3, 10, var4, var0, var1, var2, var8.animationId, var8.field3621, (Renderable)null);
				}

				if (var34 != null && var6.method3445(var0, var1, var2, var16, var9, var10, (Renderable)var34, var5 == 11 ? 256 : 0, var19, var21) && var8.clipped) {
					var23 = 15;
					if (var34 instanceof Model) {
						var23 = ((Model)var34).method3673() / 4;
						if (var23 > 30) {
							var23 = 30;
						}
					}

					for (var24 = 0; var24 <= var9; ++var24) {
						for (int var25 = 0; var25 <= var10; ++var25) {
							if (var23 > SecureRandomCallable.field1106[var0][var24 + var1][var25 + var2]) {
								SecureRandomCallable.field1106[var0][var24 + var1][var25 + var2] = (byte)var23;
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "1"
	)
	static final void method3113() {
		Object var10000 = null;
		String var0 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
		class69.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "1812084217"
	)
	@Export("FriendSystem_invalidateFriends")
	static final void FriendSystem_invalidateFriends() {
		for (int var0 = 0; var0 < Players.Players_count; ++var0) {
			Player var1 = Client.players[Players.Players_indices[var0]];
			var1.clearIsInClanChat();
		}

	}
}
