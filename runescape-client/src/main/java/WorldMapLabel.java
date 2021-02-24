import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("b")
	@Export("Tiles_lightness")
	static int[] Tiles_lightness;
	@ObfuscatedName("n")
	@Export("text")
	String text;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1144128527
	)
	@Export("width")
	int width;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -467317487
	)
	@Export("height")
	int height;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lay;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;IILay;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(IIIII)V",
		garbageValue = "-293834504"
	)
	@Export("itemContainerSetItem")
	static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
		ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var4 == null) {
			var4 = new ItemContainer();
			ItemContainer.itemContainers.put(var4, (long)var0);
		}

		if (var4.ids.length <= var1) {
			int[] var5 = new int[var1 + 1];
			int[] var6 = new int[var1 + 1];

			int var7;
			for (var7 = 0; var7 < var4.ids.length; ++var7) {
				var5[var7] = var4.ids[var7];
				var6[var7] = var4.quantities[var7];
			}

			for (var7 = var4.ids.length; var7 < var1; ++var7) {
				var5[var7] = -1;
				var6[var7] = 0;
			}

			var4.ids = var5;
			var4.quantities = var6;
		}

		var4.ids[var1] = var2;
		var4.quantities[var1] = var3;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "1"
	)
	static void method499() {
		if (Login.clearLoginScreen) {
			GrandExchangeOfferNameComparator.titleboxSprite = null;
			InterfaceParent.titlebuttonSprite = null;
			Login.runesSprite = null;
			Login.leftTitleSprite = null;
			Login.rightTitleSprite = null;
			Login.logoSprite = null;
			Login.title_muteSprite = null;
			class69.options_buttons_0Sprite = null;
			Login.options_buttons_2Sprite = null;
			WorldMapID.worldSelectBackSprites = null;
			WorldMapManager.worldSelectFlagSprites = null;
			DevicePcmPlayerProvider.worldSelectArrows = null;
			Occluder.worldSelectStars = null;
			World.field1039 = null;
			class9.loginScreenRunesAnimation.method1926();
			class206.musicPlayerStatus = 1;
			class206.musicTrackArchive = null;
			class206.musicTrackGroupId = -1;
			SoundSystem.musicTrackFileId = -1;
			DevicePcmPlayerProvider.musicTrackVolume = 0;
			class206.musicTrackBoolean = false;
			class7.pcmSampleLength = 2;
			Actor.method1867(true);
			Login.clearLoginScreen = false;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "2132008086"
	)
	static void method501(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		signature = "(S)V",
		garbageValue = "25470"
	)
	static final void method502() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var9 = Client.soundEffects[var0];
				if (var9 == null) {
					Object var10000 = null;
					var9 = SoundEffect.readSoundEffect(WorldMapCacheName.archive4, Client.soundEffectIds[var0], 0);
					if (var9 == null) {
						continue;
					}

					int[] var12 = Client.queuedSoundEffectDelays;
					var12[var0] += var9.calculateDelay();
					Client.soundEffects[var0] = var9;
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var2;
					if (Client.soundLocations[var0] != 0) {
						int var3 = (Client.soundLocations[var0] & 255) * 128;
						int var4 = Client.soundLocations[var0] >> 16 & 255;
						int var5 = var4 * 128 + 64 - UserComparator9.localPlayer.x;
						if (var5 < 0) {
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = var6 * 128 + 64 - UserComparator9.localPlayer.y;
						if (var7 < 0) {
							var7 = -var7;
						}

						int var8 = var5 + var7 - 128;
						if (var8 > var3) {
							Client.queuedSoundEffectDelays[var0] = -100;
							continue;
						}

						if (var8 < 0) {
							var8 = 0;
						}

						var2 = (var3 - var8) * WorldMapSectionType.clientPreferences.areaSoundEffectsVolume / var3;
					} else {
						var2 = WorldMapSectionType.clientPreferences.soundEffectsVolume;
					}

					if (var2 > 0) {
						RawSound var10 = var9.toRawSound().resample(World.decimator);
						RawPcmStream var11 = RawPcmStream.createRawPcmStream(var10, 100, var2);
						var11.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						VarbitComposition.pcmStreamMixer.addSubStream(var11);
					}

					Client.queuedSoundEffectDelays[var0] = -100;
				}
			} else {
				--Client.soundEffectCount;

				for (int var1 = var0; var1 < Client.soundEffectCount; ++var1) {
					Client.soundEffectIds[var1] = Client.soundEffectIds[var1 + 1];
					Client.soundEffects[var1] = Client.soundEffects[var1 + 1];
					Client.queuedSoundEffectLoops[var1] = Client.queuedSoundEffectLoops[var1 + 1];
					Client.queuedSoundEffectDelays[var1] = Client.queuedSoundEffectDelays[var1 + 1];
					Client.soundLocations[var1] = Client.soundLocations[var1 + 1];
				}

				--var0;
			}
		}

		if (Client.field899 && !class4.method56()) {
			if (WorldMapSectionType.clientPreferences.musicVolume != 0 && Client.currentTrackGroupId != -1) {
				ReflectionCheck.method2450(UrlRequester.archive6, Client.currentTrackGroupId, 0, WorldMapSectionType.clientPreferences.musicVolume, false);
			}

			Client.field899 = false;
		}

	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		signature = "(IB)Ljava/lang/String;",
		garbageValue = "42"
	)
	static String method504(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "1224588099"
	)
	static boolean method503(int var0) {
		for (int var1 = 0; var1 < Client.field885; ++var1) {
			if (Client.field738[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
