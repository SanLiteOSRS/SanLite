import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public class class15 extends class14 {
	@ObfuscatedName("t")
	@Export("ByteArrayPool_alternativeSizes")
	static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("eu")
	@ObfuscatedGetter(
		intValue = 264898961
	)
	static int field133;
	@ObfuscatedName("gx")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("h")
	String field130;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lo;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lo;)V"
	)
	class15(class2 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)V",
		garbageValue = "110401227"
	)
	void vmethod339(Buffer var1) {
		this.field130 = var1.readStringCp1252NullTerminated();
		var1.readInt();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lx;I)V",
		garbageValue = "-1535989118"
	)
	void vmethod338(class11 var1) {
		var1.field91 = this.field130;
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1257540454"
	)
	static final void method228() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var1 = Client.soundEffects[var0];
				if (var1 == null) {
					Object var10000 = null;
					var1 = SoundEffect.readSoundEffect(class14.field129, Client.soundEffectIds[var0], 0);
					if (var1 == null) {
						continue;
					}

					int[] var13 = Client.queuedSoundEffectDelays;
					var13[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1;
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var2;
					if (Client.soundLocations[var0] != 0) {
						int var3 = (Client.soundLocations[var0] & 255) * 128;
						int var4 = Client.soundLocations[var0] >> 16 & 255;
						int var5 = var4 * 128 + 64 - class35.localPlayer.x;
						if (var5 < 0) {
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = var6 * 128 + 64 - class35.localPlayer.y;
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

						var2 = (var3 - var8) * class12.clientPreferences.areaSoundEffectsVolume / var3;
					} else {
						var2 = class12.clientPreferences.soundEffectsVolume;
					}

					if (var2 > 0) {
						RawSound var9 = var1.toRawSound().resample(class3.field31);
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2);
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						FloorOverlayDefinition.pcmStreamMixer.addSubStream(var10);
					}

					Client.queuedSoundEffectDelays[var0] = -100;
				}
			} else {
				--Client.soundEffectCount;

				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) {
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1];
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1];
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1];
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1];
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1];
				}

				--var0;
			}
		}

		if (Client.field866) {
			boolean var12;
			if (class232.musicPlayerStatus != 0) {
				var12 = true;
			} else {
				var12 = class232.midiPcmStream.isReady();
			}

			if (!var12) {
				if (class12.clientPreferences.musicVolume != 0 && Client.currentTrackGroupId != -1) {
					World.method1684(class29.archive6, Client.currentTrackGroupId, 0, class12.clientPreferences.musicVolume, false);
				}

				Client.field866 = false;
			}
		}

	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) {
			Widget var0 = PacketWriter.getWidgetChild(class6.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				class259.runScriptEvent(var1);
			}

			Client.field773 = -1;
			Client.isSpellSelected = false;
			VerticalAlignment.invalidateWidget(var0);
		}
	}
}
