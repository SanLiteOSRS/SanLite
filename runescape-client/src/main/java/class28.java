import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public class class28 implements class31 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;)Lnt;"
	)
	public Buffer vmethod381(Buffer var1) {
		Buffer var2 = new Buffer(100);
		this.method367(var1, var2);
		return var2;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lnt;Lnt;)V"
	)
	void method367(Buffer var1, Buffer var2) {
		class36 var3 = new class36(var1);
		class33 var4 = new class33(var3);

		long var5;
		for (var5 = 0L; !var4.method389(var3.method430(), var3.method425(), var5); ++var5) {
		}

		var2.writeLong(var5);
	}
}
