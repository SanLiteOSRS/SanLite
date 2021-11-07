import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lkn;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1369151761
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -820509613
	)
	int field767;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 933801989
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -215846053
	)
	@Export("y")
	int y;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 21963904
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -269879271
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1161490471
	)
	int field773;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -588798073
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -418020261
	)
	int field776;
	@ObfuscatedName("y")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -668144329
	)
	int field779;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lfe;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1086941780"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field773 = var2.int7 * 128;
			this.field767 = var2.int5;
			this.field776 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field773 = 0;
			this.field767 = 0;
			this.field776 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			BuddyRankComparator.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(II)Lfd;",
		garbageValue = "1754222612"
	)
	public static HealthBarDefinition method1772(int var0) {
		HealthBarDefinition var1 = (HealthBarDefinition)HealthBarDefinition.HealthBarDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HealthBarDefinition.HealthBarDefinition_archive.takeFile(33, var0);
			var1 = new HealthBarDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HealthBarDefinition.HealthBarDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lbp;",
		garbageValue = "1477696022"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = LoginScreenAnimation.method2220(var1, var0);
		Script var5 = (Script)Script.Script_cached.get((long)(var3 << 16));
		Script var4;
		if (var5 != null) {
			var4 = var5;
		} else {
			String var6 = String.valueOf(var3);
			int var7 = class14.archive12.getGroupId(var6);
			if (var7 == -1) {
				var4 = null;
			} else {
				label59: {
					byte[] var8 = class14.archive12.takeFileFlat(var7);
					if (var8 != null) {
						if (var8.length <= 1) {
							var4 = null;
							break label59;
						}

						var5 = class87.newScript(var8);
						if (var5 != null) {
							Script.Script_cached.put(var5, (long)(var3 << 16));
							var4 = var5;
							break label59;
						}
					}

					var4 = null;
				}
			}
		}

		if (var4 != null) {
			return var4;
		} else {
			int var12 = (-3 - var2 << 8) + var0;
			Script var14 = (Script)Script.Script_cached.get((long)(var12 << 16));
			Script var13;
			if (var14 != null) {
				var13 = var14;
			} else {
				String var9 = String.valueOf(var12);
				int var10 = class14.archive12.getGroupId(var9);
				if (var10 == -1) {
					var13 = null;
				} else {
					byte[] var11 = class14.archive12.takeFileFlat(var10);
					if (var11 != null) {
						if (var11.length <= 1) {
							var13 = null;
							return var13 != null ? var13 : null;
						}

						var14 = class87.newScript(var11);
						if (var14 != null) {
							Script.Script_cached.put(var14, (long)(var12 << 16));
							var13 = var14;
							return var13 != null ? var13 : null;
						}
					}

					var13 = null;
				}
			}

			return var13 != null ? var13 : null;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([Lbw;II[I[II)V",
		garbageValue = "1465012672"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var11 != var12) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "34"
	)
	public static byte[] method1771() {
		byte[] var0 = new byte[24];

		try {
			JagexCache.JagexCache_randomDat.seek(0L);
			JagexCache.JagexCache_randomDat.readFully(var0);

			int var1;
			for (var1 = 0; var1 < 24 && var0[var1] == 0; ++var1) {
			}

			if (var1 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var2 = 0; var2 < 24; ++var2) {
				var0[var2] = -1;
			}
		}

		return var0;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1222610870"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}
}
