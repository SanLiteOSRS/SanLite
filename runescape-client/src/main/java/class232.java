import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public enum class232 implements Enumerated {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lhm;"
	)
	field2809(0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lhm;"
	)
	field2805(1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		signature = "Lhm;"
	)
	field2807(2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "Lhm;"
	)
	field2808(3),
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "Lhm;"
	)
	field2811(4);

	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1140153863
	)
	@Export("gameCyclesToDo")
	protected static int gameCyclesToDo;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1125471863
	)
	final int field2810;

	class232(int var3) {
		this.field2810 = var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1000839247"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2810;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-692759541"
	)
	public static void method4360() {
		class210.midiPcmStream.clear();
		class210.musicPlayerStatus = 1;
		class210.musicTrackArchive = null;
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		signature = "(Lkw;IIII)V",
		garbageValue = "393437031"
	)
	static void method4364(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && Login.clientPreferences.areaSoundEffectsVolume != 0) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length) {
				int var4 = var0.soundEffects[var1];
				if (var4 != 0) {
					int var5 = var4 >> 8;
					int var6 = var4 >> 4 & 7;
					int var7 = var4 & 15;
					Client.soundEffectIds[Client.soundEffectCount] = var5;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
					Client.soundEffects[Client.soundEffectCount] = null;
					int var8 = (var2 - 64) / 128;
					int var9 = (var3 - 64) / 128;
					Client.soundLocations[Client.soundEffectCount] = var7 + (var9 << 8) + (var8 << 16);
					++Client.soundEffectCount;
				}
			}
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Lhu;I)Ljava/lang/String;",
		garbageValue = "-2066634190"
	)
	static String method4363(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}

					var0 = var0.substring(0, var3) + WorldMapSection2.method2726(WorldMapSection0.method3036(var1, var2 - 1)) + var0.substring(var3 + 2);
				}
			}
		}

		return var0;
	}
}
