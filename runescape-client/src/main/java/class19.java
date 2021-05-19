import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class19 {
	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 5670921231287266957L
	)
	long field166;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -3093921605955443203L
	)
	long field159;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	IterableNodeDeque field160;

	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	public class19(Buffer var1) {
		this.field159 = -1L;
		this.field160 = new IterableNodeDeque();
		this.method262(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "-2004671532"
	)
	void method262(Buffer var1) {
		this.field166 = var1.readLong();
		this.field159 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class12(this);
			} else if (var2 == 4) {
				var3 = new class7(this);
			} else if (var2 == 3) {
				var3 = new class5(this);
			} else if (var2 == 2) {
				var3 = new class20(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class25(this);
			}

			((class16)var3).vmethod326(var1);
			this.field160.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lg;I)V",
		garbageValue = "1435583032"
	)
	public void method263(class3 var1) {
		if (this.field166 == var1.key && this.field159 == var1.field34) {
			for (class16 var2 = (class16)this.field160.last(); var2 != null; var2 = (class16)this.field160.previous()) {
				var2.vmethod314(var1);
			}

			++var1.field34;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(
		descriptor = "(Lhh;B)V",
		garbageValue = "114"
	)
	static final void method267(class225 var0) {
		PacketBuffer var1 = Client.packetWriter.packetBuffer;
		int var3;
		int var4;
		int var6;
		int var7;
		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		if (class225.field2675 == var0) {
			byte var2 = var1.readByte();
			var3 = var1.method6486();
			var4 = var1.method6620();
			byte var5 = var1.method6530();
			var6 = var1.readUnsignedShort();
			var7 = var1.method6620();
			byte var8 = var1.method6480();
			var9 = var1.method6478();
			var10 = (var9 >> 4 & 7) + class7.field66;
			var11 = (var9 & 7) + VarpDefinition.field1542;
			var12 = var1.method6476();
			var13 = var12 >> 2;
			var14 = var12 & 3;
			int var15 = Client.field677[var13];
			byte var16 = var1.readByte();
			Player var17;
			if (var6 == Client.localPlayerIndex) {
				var17 = class35.localPlayer;
			} else {
				var17 = Client.players[var6];
			}

			if (var17 != null) {
				ObjectComposition var18 = AttackOption.getObjectDefinition(var3);
				int var19;
				int var20;
				if (var14 != 1 && var14 != 3) {
					var19 = var18.sizeX;
					var20 = var18.sizeY;
				} else {
					var19 = var18.sizeY;
					var20 = var18.sizeX;
				}

				int var21 = var10 + (var19 >> 1);
				int var22 = var10 + (var19 + 1 >> 1);
				int var23 = var11 + (var20 >> 1);
				int var24 = var11 + (var20 + 1 >> 1);
				int[][] var25 = Tiles.Tiles_heights[ParamComposition.Client_plane];
				int var26 = var25[var21][var23] + var25[var22][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
				int var27 = (var10 << 7) + (var19 << 6);
				int var28 = (var11 << 7) + (var20 << 6);
				Model var29 = var18.getModel(var13, var14, var25, var27, var26, var28);
				if (var29 != null) {
					class280.updatePendingSpawn(ParamComposition.Client_plane, var10, var11, var15, -1, 0, 0, var4 + 1, var7 + 1);
					var17.animationCycleStart = var4 + Client.cycle;
					var17.animationCycleEnd = var7 + Client.cycle;
					var17.model0 = var29;
					var17.field1174 = var10 * 128 + var19 * 64;
					var17.field1172 = var11 * 128 + var20 * 64;
					var17.tileHeight2 = var26;
					byte var30;
					if (var16 > var5) {
						var30 = var16;
						var16 = var5;
						var5 = var30;
					}

					if (var2 > var8) {
						var30 = var2;
						var2 = var8;
						var8 = var30;
					}

					var17.minX = var10 + var16;
					var17.maxX = var10 + var5;
					var17.minY = var11 + var2;
					var17.maxY = var11 + var8;
				}
			}
		}

		int var37;
		int var38;
		int var40;
		if (class225.field2681 == var0) {
			var37 = var1.method6620();
			var3 = var1.method6478();
			var4 = var3 >> 2;
			var38 = var3 & 3;
			var6 = Client.field677[var4];
			var7 = var1.method6476();
			var40 = (var7 >> 4 & 7) + class7.field66;
			var9 = (var7 & 7) + VarpDefinition.field1542;
			if (var40 >= 0 && var9 >= 0 && var40 < 104 && var9 < 104) {
				class280.updatePendingSpawn(ParamComposition.Client_plane, var40, var9, var6, var37, var4, var38, 0, -1);
			}

		} else if (class225.field2679 == var0) {
			var37 = var1.method6490();
			var3 = var1.method6476() * 4;
			byte var39 = var1.method6526();
			var38 = var1.method6477() * 4;
			var6 = var1.method6478();
			var7 = (var6 >> 4 & 7) + class7.field66;
			var40 = (var6 & 7) + VarpDefinition.field1542;
			var9 = var1.method6478();
			var10 = var1.method6486();
			byte var41 = var1.method6526();
			var12 = var1.method6648();
			var13 = var1.readUnsignedShort();
			var14 = var1.method6476();
			var11 = var41 + var7;
			var4 = var39 + var40;
			if (var7 >= 0 && var40 >= 0 && var7 < 104 && var40 < 104 && var11 >= 0 && var4 >= 0 && var11 < 104 && var4 < 104 && var13 != 65535) {
				var7 = var7 * 128 + 64;
				var40 = var40 * 128 + 64;
				var11 = var11 * 128 + 64;
				var4 = var4 * 128 + 64;
				Projectile var36 = new Projectile(var13, ParamComposition.Client_plane, var7, var40, SceneTilePaint.getTileHeight(var7, var40, ParamComposition.Client_plane) - var3, var12 + Client.cycle, var10 + Client.cycle, var9, var14, var37, var38);
				var36.setDestination(var11, var4, SceneTilePaint.getTileHeight(var11, var4, ParamComposition.Client_plane) - var38, var12 + Client.cycle);
				Client.projectiles.addFirst(var36);
			}

		} else if (class225.field2674 == var0) {
			var37 = var1.method6620();
			var3 = var1.method6486();
			var4 = var1.method6620();
			var38 = var1.readUnsignedByte();
			var6 = (var38 >> 4 & 7) + class7.field66;
			var7 = (var38 & 7) + VarpDefinition.field1542;
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
				NodeDeque var42 = Client.groundItems[ParamComposition.Client_plane][var6][var7];
				if (var42 != null) {
					for (TileItem var35 = (TileItem)var42.last(); var35 != null; var35 = (TileItem)var42.previous()) {
						if ((var4 & 32767) == var35.id && var3 == var35.quantity) {
							var35.quantity = var37;
							break;
						}
					}

					Varcs.updateItemPile(var6, var7);
				}
			}

		} else {
			if (class225.field2678 == var0) {
				var37 = var1.method6476();
				var3 = (var37 >> 4 & 7) + class7.field66;
				var4 = (var37 & 7) + VarpDefinition.field1542;
				var38 = var1.method6476();
				var6 = var1.readUnsignedByte();
				var7 = var6 >> 4 & 15;
				var40 = var6 & 7;
				var9 = var1.method6620();
				if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
					var10 = var7 + 1;
					if (class35.localPlayer.pathX[0] >= var3 - var10 && class35.localPlayer.pathX[0] <= var3 + var10 && class35.localPlayer.pathY[0] >= var4 - var10 && class35.localPlayer.pathY[0] <= var10 + var4 && class12.clientPreferences.areaSoundEffectsVolume != 0 && var40 > 0 && Client.soundEffectCount < 50) {
						Client.soundEffectIds[Client.soundEffectCount] = var9;
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var40;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = var38;
						Client.soundEffects[Client.soundEffectCount] = null;
						Client.soundLocations[Client.soundEffectCount] = var7 + (var4 << 8) + (var3 << 16);
						++Client.soundEffectCount;
					}
				}
			}

			if (class225.field2680 == var0) {
				var37 = var1.method6477();
				var3 = (var37 >> 4 & 7) + class7.field66;
				var4 = (var37 & 7) + VarpDefinition.field1542;
				var38 = var1.method6648();
				var6 = var1.method6478();
				var7 = var6 >> 2;
				var40 = var6 & 3;
				var9 = Client.field677[var7];
				if (var3 >= 0 && var4 >= 0 && var3 < 103 && var4 < 103) {
					if (var9 == 0) {
						BoundaryObject var34 = class5.scene.method3960(ParamComposition.Client_plane, var3, var4);
						if (var34 != null) {
							var11 = class6.Entity_unpackID(var34.tag);
							if (var7 == 2) {
								var34.renderable1 = new DynamicObject(var11, 2, var40 + 4, ParamComposition.Client_plane, var3, var4, var38, false, var34.renderable1);
								var34.renderable2 = new DynamicObject(var11, 2, var40 + 1 & 3, ParamComposition.Client_plane, var3, var4, var38, false, var34.renderable2);
							} else {
								var34.renderable1 = new DynamicObject(var11, var7, var40, ParamComposition.Client_plane, var3, var4, var38, false, var34.renderable1);
							}
						}
					}

					if (var9 == 1) {
						WallDecoration var43 = class5.scene.method3924(ParamComposition.Client_plane, var3, var4);
						if (var43 != null) {
							var11 = class6.Entity_unpackID(var43.tag);
							if (var7 != 4 && var7 != 5) {
								if (var7 == 6) {
									var43.renderable1 = new DynamicObject(var11, 4, var40 + 4, ParamComposition.Client_plane, var3, var4, var38, false, var43.renderable1);
								} else if (var7 == 7) {
									var43.renderable1 = new DynamicObject(var11, 4, (var40 + 2 & 3) + 4, ParamComposition.Client_plane, var3, var4, var38, false, var43.renderable1);
								} else if (var7 == 8) {
									var43.renderable1 = new DynamicObject(var11, 4, var40 + 4, ParamComposition.Client_plane, var3, var4, var38, false, var43.renderable1);
									var43.renderable2 = new DynamicObject(var11, 4, (var40 + 2 & 3) + 4, ParamComposition.Client_plane, var3, var4, var38, false, var43.renderable2);
								}
							} else {
								var43.renderable1 = new DynamicObject(var11, 4, var40, ParamComposition.Client_plane, var3, var4, var38, false, var43.renderable1);
							}
						}
					}

					if (var9 == 2) {
						GameObject var44 = class5.scene.method3925(ParamComposition.Client_plane, var3, var4);
						if (var7 == 11) {
							var7 = 10;
						}

						if (var44 != null) {
							var44.renderable = new DynamicObject(class6.Entity_unpackID(var44.tag), var7, var40, ParamComposition.Client_plane, var3, var4, var38, false, var44.renderable);
						}
					}

					if (var9 == 3) {
						FloorDecoration var45 = class5.scene.getFloorDecoration(ParamComposition.Client_plane, var3, var4);
						if (var45 != null) {
							var45.renderable = new DynamicObject(class6.Entity_unpackID(var45.tag), 22, var40, ParamComposition.Client_plane, var3, var4, var38, false, var45.renderable);
						}
					}
				}

			} else {
				TileItem var32;
				if (class225.field2677 == var0) {
					var37 = var1.method6648();
					var3 = var1.readUnsignedShort();
					var4 = var1.readUnsignedByte();
					var38 = (var4 >> 4 & 7) + class7.field66;
					var6 = (var4 & 7) + VarpDefinition.field1542;
					if (var38 >= 0 && var6 >= 0 && var38 < 104 && var6 < 104) {
						var32 = new TileItem();
						var32.id = var3;
						var32.quantity = var37;
						if (Client.groundItems[ParamComposition.Client_plane][var38][var6] == null) {
							Client.groundItems[ParamComposition.Client_plane][var38][var6] = new NodeDeque();
						}

						Client.groundItems[ParamComposition.Client_plane][var38][var6].addFirst(var32);
						Varcs.updateItemPile(var38, var6);
					}

				} else if (class225.field2673 == var0) {
					var37 = var1.method6476();
					var3 = var37 >> 2;
					var4 = var37 & 3;
					var38 = Client.field677[var3];
					var6 = var1.method6476();
					var7 = (var6 >> 4 & 7) + class7.field66;
					var40 = (var6 & 7) + VarpDefinition.field1542;
					if (var7 >= 0 && var40 >= 0 && var7 < 104 && var40 < 104) {
						class280.updatePendingSpawn(ParamComposition.Client_plane, var7, var40, var38, -1, var3, var4, 0, -1);
					}

				} else if (class225.field2682 == var0) {
					var37 = var1.readUnsignedShort();
					var3 = var1.method6476();
					var4 = var1.method6476();
					var38 = (var4 >> 4 & 7) + class7.field66;
					var6 = (var4 & 7) + VarpDefinition.field1542;
					var7 = var1.method6648();
					if (var38 >= 0 && var6 >= 0 && var38 < 104 && var6 < 104) {
						var38 = var38 * 128 + 64;
						var6 = var6 * 128 + 64;
						GraphicsObject var33 = new GraphicsObject(var37, ParamComposition.Client_plane, var38, var6, SceneTilePaint.getTileHeight(var38, var6, ParamComposition.Client_plane) - var3, var7, Client.cycle);
						Client.graphicsObjects.addFirst(var33);
					}

				} else if (class225.field2687 == var0) {
					var37 = var1.readUnsignedShort();
					var3 = var1.method6476();
					var4 = (var3 >> 4 & 7) + class7.field66;
					var38 = (var3 & 7) + VarpDefinition.field1542;
					if (var4 >= 0 && var38 >= 0 && var4 < 104 && var38 < 104) {
						NodeDeque var31 = Client.groundItems[ParamComposition.Client_plane][var4][var38];
						if (var31 != null) {
							for (var32 = (TileItem)var31.last(); var32 != null; var32 = (TileItem)var31.previous()) {
								if ((var37 & 32767) == var32.id) {
									var32.remove();
									break;
								}
							}

							if (var31.last() == null) {
								Client.groundItems[ParamComposition.Client_plane][var4][var38] = null;
							}

							Varcs.updateItemPile(var4, var38);
						}
					}

				}
			}
		}
	}
}
