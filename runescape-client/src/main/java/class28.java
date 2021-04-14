import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public class class28 implements class31 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;)Lnu;"
	)
	public Buffer vmethod389(Buffer var1) {
		Buffer var2 = new Buffer(100);
		this.method384(var1, var2);
		return var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lnu;Lnu;)V"
	)
	void method384(Buffer var1, Buffer var2) {
		class36 var3 = new class36(var1);
		class33 var4 = new class33(var3);

		long var5;
		for (var5 = 0L; !var4.method396(var3.method436(), var3.method437(), var5); ++var5) {
		}

		var2.writeLong(var5);
	}
}
