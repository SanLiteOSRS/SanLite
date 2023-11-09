import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Lat;",
		garbageValue = "776593126"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lbc;",
		garbageValue = "1455168874"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = WorldMapDecorationType.method5755(var1, var0); // L: 38
		Script var4 = Client.method1636(var3, var0); // L: 39
		if (var4 != null) { // L: 40
			return var4; // L: 41
		} else {
			var3 = class271.method5244(var2, var0); // L: 43
			var4 = Client.method1636(var3, var0); // L: 44
			return var4 != null ? var4 : null; // L: 45 48
		}
	}
}
