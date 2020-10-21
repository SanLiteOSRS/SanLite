import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("o")
public class class5 implements class12 {
	class5() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lkf;)Lkf;"
	)
	public Buffer vmethod127(Buffer var1) {
		Buffer var2 = new Buffer(100);
		this.method78(var1, var2);
		return var2;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(Lkf;Lkf;)V"
	)
	void method78(Buffer var1, Buffer var2) {
		class10 var3 = new class10(var1);
		class6 var4 = new class6(var3);

		long var5;
		for (var5 = 0L; !var4.method80(var3.method125(), var3.method126(), var5); ++var5) {
		}

		var2.writeLong(var5);
	}
}
