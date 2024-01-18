import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("po")
public class class414 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	class410 field4575;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1185274461
	)
	int field4572;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1184796903
	)
	int field4577;

	@ObfuscatedSignature(
		descriptor = "(Lpx;II)V"
	)
	class414(class410 var1, int var2, int var3) {
		this.field4572 = 0; // L: 7
		this.field4577 = 0; // L: 8
		this.field4575 = var1; // L: 11
		this.field4572 = var2; // L: 12
		this.field4577 = var3; // L: 13
	} // L: 14

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2110295444"
	)
	public String method7883() {
		if (this.method7882()) { // L: 17
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7895()); // L: 18

			for (int var2 = this.field4572; var2 < this.field4577; ++var2) { // L: 19
				class412 var3 = this.field4575.method7603(var2); // L: 20
				var1.append(var3.field4545); // L: 21
			}

			return var1.toString(); // L: 23
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-109"
	)
	boolean method7881(int var1) {
		return this.field4575.method7699() == 2 || this.field4575.method7699() == 1 && (!this.field4575.field4538 || this.field4577 - 1 != var1); // L: 27
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	public boolean method7882() {
		return this.field4572 == this.field4577; // L: 31
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method7895() {
		return this.field4577 - this.field4572; // L: 35
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpc;I)Z",
		garbageValue = "906618451"
	)
	boolean method7884(class412 var1) {
		if (this.field4575.field4528 == 2) { // L: 39
			return true;
		} else if (this.field4575.field4528 == 0) { // L: 40
			return false;
		} else {
			return this.field4575.method7604() != var1; // L: 41
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1764486864"
	)
	int method7885() {
		if (this.method7882()) { // L: 46
			return 0;
		} else {
			class412 var1 = this.field4575.method7603(this.field4577 - 1); // L: 47
			if (var1.field4545 == '\n') { // L: 48
				return 0;
			} else if (this.method7884(var1)) {
				return this.field4575.field4529.advances[42]; // L: 49
			} else {
				int var2 = this.field4575.field4529.advances[var1.field4545]; // L: 50
				if (var2 == 0) { // L: 51
					return var1.field4545 == '\t' ? this.field4575.field4529.advances[32] * 3 : this.field4575.field4529.advances[32]; // L: 53 56
				} else {
					return var2; // L: 60
				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ltg;",
		garbageValue = "-1070745654"
	)
	public class501 method7886() {
		if (this.method7882()) { // L: 65
			return new class501(0, 0); // L: 66
		} else {
			class412 var1 = this.field4575.method7603(this.field4577 - 1); // L: 68
			return new class501(var1.field4544 + this.method7885(), var1.field4546); // L: 69
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Lpc;",
		garbageValue = "2023584422"
	)
	public class412 method7902(int var1) {
		return var1 >= 0 && var1 < this.method7895() ? this.field4575.method7603(this.field4572 + var1) : null; // L: 73 74
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Z",
		garbageValue = "2022025665"
	)
	static boolean method7910(String var0, int var1) {
		return KeyHandler.method428(var0, var1, "openjs"); // L: 52
	}

	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "13540"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) { // L: 10186
			class385.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3); // L: 10187
		}

		long var4 = -1L; // L: 10190
		long var6 = -1L; // L: 10191

		int var8;
		for (var8 = 0; var8 < class407.method7558(); ++var8) { // L: 10192
			long var25 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10195
			if (var6 != var25) { // L: 10198
				var6 = var25; // L: 10199
				long var15 = ViewportMouse.ViewportMouse_entityTags[var8]; // L: 10203
				int var14 = (int)(var15 >>> 0 & 127L); // L: 10205
				var14 = var14; // L: 10209
				int var29 = class93.method2439(var8); // L: 10210
				int var16 = SequenceDefinition.method4123(ViewportMouse.ViewportMouse_entityTags[var8]); // L: 10213
				int var18 = class156.method3433(var8); // L: 10216
				int var22;
				if (var16 == 2 && GrandExchangeOfferOwnWorldComparator.scene.getObjectFlags(class113.Client_plane, var14, var29, var25) >= 0) { // L: 10217 10218
					ObjectComposition var19 = class137.getObjectDefinition(var18); // L: 10219
					if (var19.transforms != null) { // L: 10220
						var19 = var19.transform();
					}

					if (var19 == null) { // L: 10221
						continue;
					}

					PendingSpawn var20 = null; // L: 10222

					for (PendingSpawn var21 = (PendingSpawn)Client.pendingSpawns.last(); var21 != null; var21 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 10223
						if (var21.plane == class113.Client_plane && var14 == var21.x && var29 == var21.y && var18 == var21.field1164) { // L: 10224
							var20 = var21; // L: 10225
							break;
						}
					}

					if (Client.isItemSelected == 1) { // L: 10229
						class385.insertMenuItemNoShift("Use", Client.field664 + " " + "->" + " " + class208.colorStartTag(65535) + var19.name, 1, var18, var14, var29); // L: 10230
					} else if (Client.isSpellSelected) { // L: 10233
						if ((class60.field431 & 4) == 4) { // L: 10234
							class385.insertMenuItemNoShift(Client.field668, Client.field669 + " " + "->" + " " + class208.colorStartTag(65535) + var19.name, 2, var18, var14, var29); // L: 10235
						}
					} else {
						String[] var37 = var19.actions; // L: 10240
						if (var37 != null) { // L: 10241
							for (var22 = 4; var22 >= 0; --var22) { // L: 10242
								if ((var20 == null || var20.method2442(var22)) && var37[var22] != null) { // L: 10243 10244
									short var23 = 0; // L: 10245
									if (var22 == 0) { // L: 10246
										var23 = 3;
									}

									if (var22 == 1) { // L: 10247
										var23 = 4;
									}

									if (var22 == 2) { // L: 10248
										var23 = 5;
									}

									if (var22 == 3) { // L: 10249
										var23 = 6;
									}

									if (var22 == 4) { // L: 10250
										var23 = 1001;
									}

									class385.insertMenuItemNoShift(var37[var22], class208.colorStartTag(65535) + var19.name, var23, var18, var14, var29); // L: 10251
								}
							}
						}

						class385.insertMenuItemNoShift("Examine", class208.colorStartTag(65535) + var19.name, 1002, var19.id, var14, var29); // L: 10256
					}
				}

				int var30;
				Player var31;
				NPC var38;
				int[] var39;
				if (var16 == 1) { // L: 10261
					NPC var33 = Client.npcs[var18]; // L: 10262
					if (var33 == null) { // L: 10263
						continue;
					}

					if (var33.definition.size == 1 && (var33.x & 127) == 64 && (var33.y & 127) == 64) { // L: 10264
						for (var30 = 0; var30 < Client.npcCount; ++var30) { // L: 10265
							var38 = Client.npcs[Client.npcIndices[var30]]; // L: 10266
							if (var38 != null && var33 != var38 && var38.definition.size == 1 && var38.x == var33.x && var38.y == var33.y) { // L: 10267
								class133.addNpcToMenu(var38, Client.npcIndices[var30], var14, var29);
							}
						}

						var30 = Players.Players_count; // L: 10269
						var39 = Players.Players_indices; // L: 10270

						for (var22 = 0; var22 < var30; ++var22) { // L: 10271
							var31 = Client.players[var39[var22]]; // L: 10272
							if (var31 != null && var31.x == var33.x && var33.y == var31.y) { // L: 10273
								class435.addPlayerToMenu(var31, var39[var22], var14, var29);
							}
						}
					}

					class133.addNpcToMenu(var33, var18, var14, var29); // L: 10276
				}

				if (var16 == 0) { // L: 10278
					Player var34 = Client.players[var18]; // L: 10279
					if (var34 == null) { // L: 10280
						continue;
					}

					if ((var34.x & 127) == 64 && (var34.y & 127) == 64) { // L: 10281
						for (var30 = 0; var30 < Client.npcCount; ++var30) { // L: 10282
							var38 = Client.npcs[Client.npcIndices[var30]]; // L: 10283
							if (var38 != null && var38.definition.size == 1 && var38.x == var34.x && var38.y == var34.y) { // L: 10284
								class133.addNpcToMenu(var38, Client.npcIndices[var30], var14, var29);
							}
						}

						var30 = Players.Players_count; // L: 10286
						var39 = Players.Players_indices; // L: 10287

						for (var22 = 0; var22 < var30; ++var22) { // L: 10288
							var31 = Client.players[var39[var22]]; // L: 10289
							if (var31 != null && var34 != var31 && var34.x == var31.x && var31.y == var34.y) { // L: 10290
								class435.addPlayerToMenu(var31, var39[var22], var14, var29);
							}
						}
					}

					if (var18 != Client.combatTargetPlayerIndex) { // L: 10293
						class435.addPlayerToMenu(var34, var18, var14, var29);
					} else {
						var4 = var25; // L: 10294
					}
				}

				if (var16 == 3) { // L: 10296
					NodeDeque var35 = Client.groundItems[class113.Client_plane][var14][var29]; // L: 10297
					if (var35 != null) { // L: 10298
						for (TileItem var36 = (TileItem)var35.first(); var36 != null; var36 = (TileItem)var35.next()) { // L: 10299 10300 10334
							ItemComposition var40 = class341.ItemComposition_get(var36.id); // L: 10301
							if (Client.isItemSelected == 1) { // L: 10302
								class385.insertMenuItemNoShift("Use", Client.field664 + " " + "->" + " " + class208.colorStartTag(16748608) + var40.name, 16, var36.id, var14, var29); // L: 10303
							} else if (Client.isSpellSelected) { // L: 10306
								if ((class60.field431 & 1) == 1) { // L: 10307
									class385.insertMenuItemNoShift(Client.field668, Client.field669 + " " + "->" + " " + class208.colorStartTag(16748608) + var40.name, 17, var36.id, var14, var29); // L: 10308
								}
							} else {
								String[] var32 = var40.groundActions; // L: 10313

								for (int var41 = 4; var41 >= 0; --var41) { // L: 10314
									if (var36.method2751(var41)) { // L: 10315
										if (var32 != null && var32[var41] != null) { // L: 10316
											byte var24 = 0; // L: 10317
											if (var41 == 0) { // L: 10318
												var24 = 18;
											}

											if (var41 == 1) { // L: 10319
												var24 = 19;
											}

											if (var41 == 2) { // L: 10320
												var24 = 20;
											}

											if (var41 == 3) { // L: 10321
												var24 = 21;
											}

											if (var41 == 4) { // L: 10322
												var24 = 22;
											}

											class385.insertMenuItemNoShift(var32[var41], class208.colorStartTag(16748608) + var40.name, var24, var36.id, var14, var29); // L: 10323
										} else if (var41 == 2) { // L: 10326
											class385.insertMenuItemNoShift("Take", class208.colorStartTag(16748608) + var40.name, 20, var36.id, var14, var29); // L: 10327
										}
									}
								}

								class385.insertMenuItemNoShift("Examine", class208.colorStartTag(16748608) + var40.name, 1004, var36.id, var14, var29); // L: 10331
							}
						}
					}
				}
			}
		}

		if (var4 != -1L) { // L: 10339
			var8 = (int)(var4 >>> 0 & 127L); // L: 10342
			int var10 = class135.method3149(var4); // L: 10345
			Player var11 = Client.players[Client.combatTargetPlayerIndex]; // L: 10346
			class435.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10); // L: 10347
		}

	} // L: 10349
}
