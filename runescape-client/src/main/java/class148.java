import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class148 extends class143 {
	@ObfuscatedName("aj")
	@Export("ItemComposition_inMembersWorld")
	public static boolean ItemComposition_inMembersWorld;
	@ObfuscatedName("bk")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("ds")
	@ObfuscatedSignature(
		descriptor = "[Lty;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1997929403
	)
	int field1656;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -28516569
	)
	int field1654;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1046611261
	)
	int field1658;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -720209075
	)
	int field1655;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class148(class146 var1) {
		this.this$0 = var1; // L: 289
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltc;B)V",
		garbageValue = "1"
	)
	void vmethod3345(Buffer var1) {
		this.field1656 = var1.readInt(); // L: 292
		this.field1655 = var1.readInt(); // L: 293
		this.field1654 = var1.readUnsignedByte(); // L: 294
		this.field1658 = var1.readUnsignedByte(); // L: 295
	} // L: 296

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lfb;I)V",
		garbageValue = "-621392079"
	)
	void vmethod3346(ClanSettings var1) {
		var1.method3229(this.field1656, this.field1655, this.field1654, this.field1658); // L: 299
	} // L: 300

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZB)Ltt;",
		garbageValue = "-83"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) { // L: 375
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) { // L: 376
			var4 = 1;
		}

		long var6 = ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var4 << 40) + ((long)var3 << 42); // L: 377
		SpritePixels var8;
		if (!var5) { // L: 379
			var8 = (SpritePixels)ItemComposition.ItemComposition_cachedSprites.get(var6); // L: 380
			if (var8 != null) { // L: 381
				return var8;
			}
		}

		ItemComposition var9 = class230.ItemComposition_get(var0); // L: 383
		if (var1 > 1 && var9.countobj != null) { // L: 384
			int var10 = -1; // L: 385

			for (int var11 = 0; var11 < 10; ++var11) { // L: 386
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) { // L: 387
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) { // L: 389
				var9 = class230.ItemComposition_get(var10);
			}
		}

		Model var20 = var9.getModel(1); // L: 391
		if (var20 == null) { // L: 392
			return null;
		} else {
			SpritePixels var21 = null; // L: 393
			if (var9.noteTemplate != -1) { // L: 394
				var21 = getItemSprite(var9.note, 10, 1, 0, 0, true); // L: 395
				if (var21 == null) { // L: 396
					return null;
				}
			} else if (var9.notedId != -1) { // L: 398
				var21 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false); // L: 399
				if (var21 == null) { // L: 400
					return null;
				}
			} else if (var9.placeholderTemplate != -1) { // L: 402
				var21 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false); // L: 403
				if (var21 == null) { // L: 404
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels; // L: 406
			int var13 = Rasterizer2D.Rasterizer2D_width; // L: 407
			int var14 = Rasterizer2D.Rasterizer2D_height; // L: 408
			float[] var15 = Rasterizer2D.field5086; // L: 409
			int[] var16 = new int[4]; // L: 410
			Rasterizer2D.Rasterizer2D_getClipArray(var16); // L: 411
			var8 = new SpritePixels(36, 32); // L: 412
			Rasterizer3D.method4331(var8.pixels, 36, 32, (float[])null); // L: 413
			Rasterizer2D.Rasterizer2D_clear(); // L: 414
			Rasterizer3D.method4319(); // L: 415
			Rasterizer3D.method4335(16, 16); // L: 416
			Rasterizer3D.field2512.field2797 = false; // L: 417
			if (var9.placeholderTemplate != -1) { // L: 418
				var21.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d; // L: 419
			if (var5) { // L: 420
				var17 = (int)((double)var17 * 1.5D);
			} else if (var2 == 2) { // L: 421
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16; // L: 422
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16; // L: 423
			var20.calculateBoundsCylinder(); // L: 424
			var20.method4773(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var20.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d); // L: 425
			if (var9.notedId != -1) { // L: 426
				var21.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) { // L: 427
				var8.outline(1);
			}

			if (var2 >= 2) { // L: 428
				var8.outline(16777215);
			}

			if (var3 != 0) { // L: 429
				var8.shadow(var3);
			}

			Rasterizer3D.method4331(var8.pixels, 36, 32, (float[])null); // L: 430
			if (var9.noteTemplate != -1) { // L: 431
				var21.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) { // L: 432
				class167.ItemComposition_fontPlain11.draw(PacketWriter.method2775(var1), 0, 9, 16776960, 1); // L: 433
			}

			if (!var5) { // L: 435
				ItemComposition.ItemComposition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method4331(var12, var13, var14, var15); // L: 436
			Rasterizer2D.Rasterizer2D_setClipArray(var16); // L: 437
			Rasterizer3D.method4319(); // L: 438
			Rasterizer3D.field2512.field2797 = true; // L: 439
			return var8; // L: 440
		}
	}

	@ObfuscatedName("lb")
	@ObfuscatedSignature(
		descriptor = "(Ldr;IIII)V",
		garbageValue = "-1908542081"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (HitSplatDefinition.localPlayer != var0) { // L: 10208
			if (Client.menuOptionsCount < 400) { // L: 10209
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 10211
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 10212
					var7 = var0.combatLevel; // L: 10214
					int var8 = HitSplatDefinition.localPlayer.combatLevel; // L: 10215
					int var9 = var8 - var7; // L: 10217
					String var6;
					if (var9 < -9) { // L: 10218
						var6 = class396.colorStartTag(16711680); // L: 10219
					} else if (var9 < -6) { // L: 10222
						var6 = class396.colorStartTag(16723968); // L: 10223
					} else if (var9 < -3) { // L: 10226
						var6 = class396.colorStartTag(16740352); // L: 10227
					} else if (var9 < 0) { // L: 10230
						var6 = class396.colorStartTag(16756736); // L: 10231
					} else if (var9 > 9) { // L: 10234
						var6 = class396.colorStartTag(65280); // L: 10235
					} else if (var9 > 6) { // L: 10238
						var6 = class396.colorStartTag(4259584); // L: 10239
					} else if (var9 > 3) { // L: 10242
						var6 = class396.colorStartTag(8453888); // L: 10243
					} else if (var9 > 0) { // L: 10246
						var6 = class396.colorStartTag(12648192); // L: 10247
					} else {
						var6 = class396.colorStartTag(16776960); // L: 10250
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 10252
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 10254
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 10255
					class388.insertMenuItemNoShift("Use", Client.field644 + " " + "->" + " " + class396.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 10256
				} else if (Client.isSpellSelected) { // L: 10259
					if ((SoundCache.selectedSpellFlags & 8) == 8) { // L: 10260
						class388.insertMenuItemNoShift(Client.field543, Client.field649 + " " + "->" + " " + class396.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 10261
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 10266
						if (Client.playerMenuActions[var10] != null) { // L: 10267
							short var11 = 0; // L: 10268
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 10269
								if (Client.playerAttackOption == AttackOption.AttackOption_hidden) { // L: 10270
									continue;
								}

								if (Client.playerAttackOption == AttackOption.AttackOption_alwaysRightClick || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > HitSplatDefinition.localPlayer.combatLevel) { // L: 10271
									var11 = 2000; // L: 10272
								}

								if (HitSplatDefinition.localPlayer.team != 0 && var0.team != 0) { // L: 10274
									if (var0.team == HitSplatDefinition.localPlayer.team) { // L: 10275
										var11 = 2000;
									} else {
										var11 = 0; // L: 10276
									}
								} else if (AttackOption.field1305 == Client.playerAttackOption && var0.isClanMember()) { // L: 10278
									var11 = 2000; // L: 10279
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 10282
								var11 = 2000;
							}

							boolean var12 = false; // L: 10283
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 10284
							class388.insertMenuItemNoShift(Client.playerMenuActions[var10], class396.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 10285
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 10290
					if (Client.menuOpcodes[var10] == 23) { // L: 10291
						Client.menuTargets[var10] = class396.colorStartTag(16777215) + var4; // L: 10292
						break;
					}
				}

			}
		}
	} // L: 10296

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(Lmo;B)Z",
		garbageValue = "-39"
	)
	static final boolean method3145(Widget var0) {
		int var1 = var0.contentType; // L: 12218
		if (var1 == 205) { // L: 12219
			Client.logoutTimer = 250; // L: 12220
			return true; // L: 12221
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12223
				var2 = (var1 - 300) / 2; // L: 12224
				var3 = var1 & 1; // L: 12225
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12226
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12228
				var2 = (var1 - 314) / 2; // L: 12229
				var3 = var1 & 1; // L: 12230
				Client.playerAppearance.method6107(var2, var3 == 1); // L: 12231
			}

			if (var1 == 324) { // L: 12233
				Client.playerAppearance.method6108(0);
			}

			if (var1 == 325) { // L: 12234
				Client.playerAppearance.method6108(1);
			}

			if (var1 == 326) { // L: 12235
				PacketBufferNode var4 = class251.getPacketBufferNode(ClientPacket.field3130, Client.packetWriter.isaacCipher); // L: 12237
				Client.playerAppearance.write(var4.packetBuffer); // L: 12238
				Client.packetWriter.addNode(var4); // L: 12239
				return true; // L: 12240
			} else {
				return false; // L: 12242
			}
		}
	}
}
