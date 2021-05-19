import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bc")
@Implements("World")
public class World {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -287203745
	)
	@Export("World_count")
	static int World_count;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -886714627
	)
	@Export("World_listCount")
	static int World_listCount;
	@ObfuscatedName("v")
	@Export("World_sortOption2")
	static int[] World_sortOption2;
	@ObfuscatedName("b")
	@Export("World_sortOption1")
	static int[] World_sortOption1;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("World_request")
	static UrlRequest World_request;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1193469645
	)
	@Export("id")
	int id;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 1795384885
	)
	@Export("properties")
	int properties;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1923976783
	)
	@Export("population")
	int population;
	@ObfuscatedName("r")
	@Export("host")
	String host;
	@ObfuscatedName("p")
	@Export("activity")
	String activity;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -1414521915
	)
	@Export("location")
	int location;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -2013336123
	)
	@Export("index")
	int index;

	static {
		World_count = 0;
		World_listCount = 0;
		World_sortOption2 = new int[]{1, 1, 1, 1};
		World_sortOption1 = new int[]{0, 1, 2, 3};
	}

	World() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-8093"
	)
	@Export("isMembersOnly")
	boolean isMembersOnly() {
		return (1 & this.properties) != 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1692154963"
	)
	boolean method1722() {
		return (2 & this.properties) != 0;
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1903102242"
	)
	@Export("isPvp")
	boolean isPvp() {
		return (4 & this.properties) != 0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1999947926"
	)
	boolean method1686() {
		return (8 & this.properties) != 0;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-399759618"
	)
	@Export("isDeadman")
	boolean isDeadman() {
		return (536870912 & this.properties) != 0;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1001248152"
	)
	@Export("isBeta")
	boolean isBeta() {
		return (33554432 & this.properties) != 0;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	boolean method1689() {
		return (1073741824 & this.properties) != 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "1"
	)
	static void method1728(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.field926 * 16384) {
					var5 += var1 - var4.field926 * 16384;
				} else if (var1 < var4.x * 16384) {
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.field927 * 16384) {
					var5 += var2 - var4.field927 * 16384;
				} else if (var2 < var4.y * 128) {
					var5 += var4.y * 128 - var2;
				}

				if (var5 - 64 <= var4.field929 && class12.clientPreferences.areaSoundEffectsVolume != 0 && var0 == var4.plane) {
					var5 -= 64;
					if (var5 < 0) {
						var5 = 0;
					}

					int var6 = (var4.field929 - var5) * class12.clientPreferences.areaSoundEffectsVolume / var4.field929;
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var7 = SoundEffect.readSoundEffect(class14.field129, var4.soundEffectId, 0);
							if (var7 != null) {
								RawSound var8 = var7.toRawSound().resample(class3.decimator);
								RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
								var9.setNumLoops(-1);
								FloorOverlayDefinition.pcmStreamMixer.addSubStream(var9);
								var4.stream1 = var9;
							}
						}
					} else {
						var4.stream1.method888(var6);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field923 -= var3) <= 0) {
							int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var12 = SoundEffect.readSoundEffect(class14.field129, var4.soundEffectIds[var11], 0);
							if (var12 != null) {
								RawSound var13 = var12.toRawSound().resample(class3.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
								var10.setNumLoops(0);
								FloorOverlayDefinition.pcmStreamMixer.addSubStream(var10);
								var4.stream2 = var10;
								var4.field923 = var4.field934 + (int)(Math.random() * (double)(var4.field932 - var4.field934));
							}
						}
					} else {
						var4.stream2.method888(var6);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						FloorOverlayDefinition.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						FloorOverlayDefinition.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljp;IIIZI)V",
		garbageValue = "1369105170"
	)
	public static void method1684(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class232.musicPlayerStatus = 1;
		JagexCache.musicTrackArchive = var0;
		class232.musicTrackGroupId = var1;
		class232.musicTrackFileId = var2;
		LoginPacket.musicTrackVolume = var3;
		VarpDefinition.musicTrackBoolean = var4;
		class232.pcmSampleLength = 10000;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ILci;ZI)I",
		garbageValue = "306511777"
	)
	static int method1713(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			WorldMapCacheName.Interpreter_intStackSize -= 3;
			class69.queueSoundEffect(Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize], Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			FontName.playSong(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			WorldMapCacheName.Interpreter_intStackSize -= 2;
			class311.method5486(Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize], Interpreter.Interpreter_intStack[WorldMapCacheName.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			int var3;
			if (var0 == 3203) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize], 0), 100);
				class23.method306(Math.round(2.55F * (float)var3));
				return 1;
			} else if (var0 == 3204) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Math.round((float)class12.clientPreferences.musicVolume / 2.55F);
				return 1;
			} else if (var0 == 3205) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize], 0), 100);
				class20.updateSoundEffectVolume(Math.round((float)var3 * 1.27F));
				return 1;
			} else if (var0 == 3206) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Math.round((float)class12.clientPreferences.soundEffectsVolume / 1.27F);
				return 1;
			} else if (var0 == 3207) {
				var3 = Math.min(Math.max(Interpreter.Interpreter_intStack[--WorldMapCacheName.Interpreter_intStackSize], 0), 100);
				Occluder.method4088(Math.round(1.27F * (float)var3));
				return 1;
			} else if (var0 == 3208) {
				Interpreter.Interpreter_intStack[++WorldMapCacheName.Interpreter_intStackSize - 1] = Math.round((float)class12.clientPreferences.areaSoundEffectsVolume / 1.27F);
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)Liv;",
		garbageValue = "-1947834223"
	)
	static Widget method1731(Widget var0) {
		Widget var1 = HorizontalAlignment.method2731(var0);
		if (var1 == null) {
			var1 = var0.parent;
		}

		return var1;
	}
}
