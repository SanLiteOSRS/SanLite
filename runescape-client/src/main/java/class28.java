import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ab")
public class class28 implements class31 {
	class28() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lnd;)Lnd;"
	)
	public Buffer vmethod297(Buffer var1) {
		Buffer var2 = new Buffer(100);
		this.method285(var1, var2);
		return var2;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;)V"
	)
	void method285(Buffer var1, Buffer var2) {
		class36 var3 = new class36(var1);
		class33 var4 = new class33(var3);

		long var5;
		for (var5 = 0L; !var4.method307(var3.method346(), var3.method345(), var5); ++var5) {
		}

		var2.writeLong(var5);
	}
}
