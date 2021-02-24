import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class194 {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lgs;"
	)
	public static final class194 field2348;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lgs;"
	)
	public static final class194 field2354;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lgs;"
	)
	public static final class194 field2347;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lgs;"
	)
	public static final class194 field2356;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lgs;"
	)
	public static final class194 field2350;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lgs;"
	)
	public static final class194 field2351;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lgs;"
	)
	public static final class194 field2352;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "Lgs;"
	)
	public static final class194 field2353;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "Lgs;"
	)
	public static final class194 field2346;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "Lgs;"
	)
	public static final class194 field2355;

	static {
		field2348 = new class194(3);
		field2354 = new class194(4);
		field2347 = new class194(6);
		field2356 = new class194(5);
		field2350 = new class194(14);
		field2351 = new class194(7);
		field2352 = new class194(15);
		field2353 = new class194(4);
		field2346 = new class194(5);
		field2355 = new class194(2);
	}

	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "3"
	)
	class194(int var1) {
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-921891961"
	)
	static final void method3820(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != WorldMapSectionType.clientPreferences.musicVolume) {
			if (WorldMapSectionType.clientPreferences.musicVolume == 0 && Client.currentTrackGroupId != -1) {
				ReflectionCheck.method2450(UrlRequester.archive6, Client.currentTrackGroupId, 0, var0, false);
				Client.field899 = false;
			} else if (var0 == 0) {
				ScriptEvent.method1272();
				Client.field899 = false;
			} else if (class206.musicPlayerStatus != 0) {
				DevicePcmPlayerProvider.musicTrackVolume = var0;
			} else {
				VertexNormal.midiPcmStream.setPcmStreamVolume(var0);
			}

			WorldMapSectionType.clientPreferences.musicVolume = var0;
			class23.savePreferences();
		}

	}
}
