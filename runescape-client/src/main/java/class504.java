import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
public final class class504 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IZII)V",
		garbageValue = "-1433824975"
	)
	public static final void method8936(int var0, boolean var1, int var2) {
		if (var0 >= 8000 && var0 <= 48000) { // L: 45
			PcmPlayer.field293 = var0; // L: 46
			PcmPlayer.PcmPlayer_stereo = var1; // L: 47
			PcmPlayer.field296 = var2; // L: 48
		} else {
			throw new IllegalArgumentException();
		}
	} // L: 49
}
