import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fi")
public class class163 extends class139 {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1391357531
	)
	int field1811;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = -3892957661762122141L
	)
	long field1812;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	final class142 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lex;)V"
	)
	class163(class142 var1) {
		this.this$0 = var1; // L: 307
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lrd;S)V",
		garbageValue = "-5782"
	)
	void vmethod3394(Buffer var1) {
		this.field1811 = var1.readInt(); // L: 310
		this.field1812 = var1.readLong(); // L: 311
	} // L: 312

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Leb;B)V",
		garbageValue = "-26"
	)
	void vmethod3393(ClanSettings var1) {
		var1.method3241(this.field1811, this.field1812); // L: 315
	} // L: 316

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lrd;B)Ljava/lang/String;",
		garbageValue = "-120"
	)
	public static String method3398(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 63
			if (var2 > 32767) { // L: 64
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 65
			var0.offset += class312.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 66
			String var4 = class101.decodeStringCp1252(var3, 0, var2); // L: 67
			var1 = var4; // L: 68
		} catch (Exception var6) { // L: 70
			var1 = "Cabbage"; // L: 71
		}

		return var1; // L: 74
	}
}
