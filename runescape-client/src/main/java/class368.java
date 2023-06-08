import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public class class368 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	static final class368 field4337;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	static final class368 field4335;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	static final class368 field4336;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	static final class368 field4334;

	static {
		field4337 = new class368(); // L: 4
		field4335 = new class368(); // L: 5
		field4336 = new class368(); // L: 6
		field4334 = new class368(); // L: 7
	}

	class368() {
	} // L: 9

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lnq;IIIZI)V",
		garbageValue = "2096300363"
	)
	public static void method6892(AbstractArchive var0, int var1, int var2, int var3, boolean var4) {
		class304.musicPlayerStatus = 1; // L: 53
		UserComparator9.musicTrackArchive = var0; // L: 54
		VarbitComposition.musicTrackGroupId = var1; // L: 55
		class304.musicTrackFileId = var2; // L: 56
		class304.musicTrackVolume = var3; // L: 57
		class132.musicTrackBoolean = var4; // L: 58
		class157.pcmSampleLength = 10000; // L: 59
	} // L: 60
}
