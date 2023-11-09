import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
public class class362 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltt;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lbr;I)V",
		garbageValue = "1046499280"
	)
	public static final void method6857(class51 var0) {
		PcmPlayer.pcmPlayerProvider = var0; // L: 45
	} // L: 46
}
