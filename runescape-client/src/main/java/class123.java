import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dz")
public class class123 extends class116 {
	@ObfuscatedName("i")
	boolean field1424;
	@ObfuscatedName("w")
	byte field1422;
	@ObfuscatedName("s")
	byte field1423;
	@ObfuscatedName("a")
	byte field1421;
	@ObfuscatedName("o")
	byte field1425;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class123(class119 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		this.field1424 = var1.readUnsignedByte() == 1;
		this.field1422 = var1.readByte();
		this.field1423 = var1.readByte();
		this.field1421 = var1.readByte();
		this.field1425 = var1.readByte();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.allowGuests = this.field1424;
		var1.field1444 = this.field1422;
		var1.field1439 = this.field1423;
		var1.field1446 = this.field1421;
		var1.field1447 = this.field1425;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-776812615"
	)
	public static boolean method2614(int var0) {
		return var0 == WorldMapDecorationType.field3244.id;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1761833612"
	)
	public static void method2616(int var0, int var1) {
		VarbitComposition var2 = class150.method2965(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "988322952"
	)
	public static int method2619(int var0) {
		return class245.field2908[var0];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "2087887808"
	)
	static int method2618(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			class14.Interpreter_intStackSize -= 3;
			class128.queueSoundEffect(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			ModeWhere.playSong(Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			class14.Interpreter_intStackSize -= 2;
			Friend.method6057(Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			int var3;
			int var4;
			if (var0 != 3209 && var0 != 3181 && var0 != 3203 && var0 != 3205 && var0 != 3207) {
				if (var0 != 3210 && var0 != 3182 && var0 != 3204 && var0 != 3206 && var0 != 3208) {
					return var0 == 3211 ? 1 : 2;
				} else {
					var3 = 0;
					var4 = 0;
					if (var0 == 3210) {
						var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
					} else if (var0 == 3182) {
						var3 = 6;
					} else if (var0 == 3204) {
						var3 = 7;
					} else if (var0 == 3206) {
						var3 = 8;
					} else if (var0 == 3208) {
						var3 = 9;
					}

					if (var3 == 6) {
						float var5 = 200.0F * ((float)class408.clientPreferences.brightness - 0.5F);
						var4 = 100 - Math.round(var5);
					} else if (var3 == 7) {
						var4 = Math.round((float)class408.clientPreferences.musicVolume / 2.55F);
					} else if (var3 == 8) {
						var4 = Math.round((float)class408.clientPreferences.soundEffectsVolume / 1.27F);
					} else if (var3 == 9) {
						var4 = Math.round((float)class408.clientPreferences.areaSoundEffectsVolume / 1.27F);
					}

					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = var4;
					return 1;
				}
			} else {
				var3 = 0;
				var4 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				if (var0 == 3209) {
					var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
				} else if (var0 == 3181) {
					var3 = 6;
				} else if (var0 == 3203) {
					var3 = 7;
				} else if (var0 == 3205) {
					var3 = 8;
				} else if (var0 == 3207) {
					var3 = 9;
				}

				if (var3 == 6) {
					var4 = 100 - Math.min(Math.max(var4, 0), 100);
					class354.method6396((double)(0.5F + (float)var4 / 200.0F));
				} else if (var3 == 7) {
					var4 = Math.min(Math.max(var4, 0), 100);
					class14.method178(Math.round(2.55F * (float)var4));
				} else if (var3 == 8) {
					var4 = Math.min(Math.max(var4, 0), 100);
					WorldMapSection1.updateSoundEffectVolume(Math.round((float)var4 * 1.27F));
				} else if (var3 == 9) {
					var4 = Math.min(Math.max(var4, 0), 100);
					ClanChannel.method2825(Math.round((float)var4 * 1.27F));
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "1954387020"
	)
	static int method2608(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) {
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) {
				if (var0 == 6750) {
					Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = "";
					return 1;
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) {
					if (var0 == 6754) {
						int var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
						NPCComposition var4 = ScriptFrame.getNpcDefinition(var3);
						Interpreter.Interpreter_stringStack[++class295.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
						return 1;
					} else {
						return 2;
					}
				} else {
					Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = -1;
					return 1;
				}
			} else {
				--class14.Interpreter_intStackSize;
				return 1;
			}
		} else {
			class14.Interpreter_intStackSize -= 2;
			--class295.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-980124614"
	)
	static final void method2621() {
		int var0 = SpotAnimationDefinition.field1761 * 128 + 64;
		int var1 = BuddyRankComparator.field1333 * 16384 + 64;
		int var2 = class392.getTileHeight(var0, var1, GrandExchangeOfferTotalQuantityComparator.Client_plane) - Renderable.field2442;
		if (WorldMapSectionType.cameraX < var0) {
			WorldMapSectionType.cameraX = (var0 - WorldMapSectionType.cameraX) * Login.field888 / 1000 + WorldMapSectionType.cameraX + UserComparator8.field1305;
			if (WorldMapSectionType.cameraX > var0) {
				WorldMapSectionType.cameraX = var0;
			}
		}

		if (WorldMapSectionType.cameraX > var0) {
			WorldMapSectionType.cameraX -= Login.field888 * (WorldMapSectionType.cameraX - var0) / 1000 + UserComparator8.field1305;
			if (WorldMapSectionType.cameraX < var0) {
				WorldMapSectionType.cameraX = var0;
			}
		}

		if (class174.cameraY < var2) {
			class174.cameraY = (var2 - class174.cameraY) * Login.field888 / 1000 + class174.cameraY + UserComparator8.field1305;
			if (class174.cameraY > var2) {
				class174.cameraY = var2;
			}
		}

		if (class174.cameraY > var2) {
			class174.cameraY -= Login.field888 * (class174.cameraY - var2) / 1000 + UserComparator8.field1305;
			if (class174.cameraY < var2) {
				class174.cameraY = var2;
			}
		}

		if (class65.cameraZ < var1) {
			class65.cameraZ = (var1 - class65.cameraZ) * Login.field888 / 1000 + class65.cameraZ + UserComparator8.field1305;
			if (class65.cameraZ > var1) {
				class65.cameraZ = var1;
			}
		}

		if (class65.cameraZ > var1) {
			class65.cameraZ -= Login.field888 * (class65.cameraZ - var1) / 1000 + UserComparator8.field1305;
			if (class65.cameraZ < var1) {
				class65.cameraZ = var1;
			}
		}

		var0 = UrlRequest.field1298 * 16384 + 64;
		var1 = SoundSystem.field288 * 16384 + 64;
		var2 = class392.getTileHeight(var0, var1, GrandExchangeOfferTotalQuantityComparator.Client_plane) - ArchiveLoader.field985;
		int var3 = var0 - WorldMapSectionType.cameraX;
		int var4 = var2 - class174.cameraY;
		int var5 = var1 - class65.cameraZ;
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
		int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.949D) & 2047;
		int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.949D) & 2047;
		if (var7 < 128) {
			var7 = 128;
		}

		if (var7 > 383) {
			var7 = 383;
		}

		if (class121.cameraPitch < var7) {
			class121.cameraPitch = (var7 - class121.cameraPitch) * TextureProvider.field2484 / 1000 + class121.cameraPitch + class269.field3221;
			if (class121.cameraPitch > var7) {
				class121.cameraPitch = var7;
			}
		}

		if (class121.cameraPitch > var7) {
			class121.cameraPitch -= TextureProvider.field2484 * (class121.cameraPitch - var7) / 1000 + class269.field3221;
			if (class121.cameraPitch < var7) {
				class121.cameraPitch = var7;
			}
		}

		int var9 = var8 - WorldMapRegion.cameraYaw;
		if (var9 > 1024) {
			var9 -= 2048;
		}

		if (var9 < -1024) {
			var9 += 2048;
		}

		if (var9 > 0) {
			WorldMapRegion.cameraYaw = var9 * TextureProvider.field2484 / 1000 + WorldMapRegion.cameraYaw + class269.field3221;
			WorldMapRegion.cameraYaw &= 2047;
		}

		if (var9 < 0) {
			WorldMapRegion.cameraYaw -= -var9 * TextureProvider.field2484 / 1000 + class269.field3221;
			WorldMapRegion.cameraYaw &= 2047;
		}

		int var10 = var8 - WorldMapRegion.cameraYaw;
		if (var10 > 1024) {
			var10 -= 2048;
		}

		if (var10 < -1024) {
			var10 += 2048;
		}

		if (var10 < 0 && var9 > 0 || var10 > 0 && var9 < 0) {
			WorldMapRegion.cameraYaw = var8;
		}

	}
}
