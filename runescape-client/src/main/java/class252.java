import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
public class class252 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1632670199
	)
	static int field2868;

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1851826137"
	)
	static final int method5135() {
		float var0 = 200.0F * ((float)ScriptFrame.clientPreferences.method2514() - 0.5F); // L: 12178
		return 100 - Math.round(var0); // L: 12179
	}
}
