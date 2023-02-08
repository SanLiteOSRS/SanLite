import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
public class class284 {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 335675507
	)
	public static int field3321;

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(ILln;IIIZI)V",
		garbageValue = "2064487710"
	)
	public static void method5566(int var0, AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		class290.musicPlayerStatus = 1; // L: 54
		class6.musicTrackArchive = var1; // L: 55
		class20.musicTrackGroupId = var2; // L: 56
		class161.musicTrackFileId = var3; // L: 57
		class290.musicTrackVolume = var4; // L: 58
		class423.musicTrackBoolean = var5; // L: 59
		class203.pcmSampleLength = var0; // L: 60
	} // L: 61
}
