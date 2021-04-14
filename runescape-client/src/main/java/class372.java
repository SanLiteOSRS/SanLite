import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ns")
final class class372 implements class369 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lir;"
	)
	@Export("musicSamplesArchive")
	public static AbstractArchive musicSamplesArchive;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;Lnu;B)V",
		garbageValue = "32"
	)
	public void vmethod6493(Object var1, Buffer var2) {
		this.method6461((Long)var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lnu;I)Ljava/lang/Object;",
		garbageValue = "-2127791785"
	)
	public Object vmethod6492(Buffer var1) {
		return var1.readLong();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Long;Lnu;I)V",
		garbageValue = "-1776493604"
	)
	void method6461(Long var1, Buffer var2) {
		var2.writeLong(var1);
	}
}
