import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class51 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	public static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("ck")
	@ObfuscatedGetter(
		intValue = -2077856489
	)
	static int field105;

	DevicePcmPlayerProvider() {
	} // L: 7

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lbr;",
		garbageValue = "21"
	)
	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer(); // L: 11
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "1626454505"
	)
	static int method335(int var0, Script var1, boolean var2) {
		return 2; // L: 3238
	}
}
