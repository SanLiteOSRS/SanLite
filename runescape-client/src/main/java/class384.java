import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
public class class384 {
	@ObfuscatedName("ai")
	@Export("cp1252AsciiExtension")
	public static final char[] cp1252AsciiExtension;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'}; // L: 4
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "54223521"
	)
	static void method7207() {
		ByteArrayPool.field4540.clear(); // L: 61
		ByteArrayPool.field4540.add(100); // L: 62
		ByteArrayPool.field4540.add(5000); // L: 63
		ByteArrayPool.field4540.add(10000); // L: 64
		ByteArrayPool.field4540.add(30000); // L: 65
	} // L: 66
}
