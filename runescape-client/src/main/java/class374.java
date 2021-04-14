import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
final class class374 implements class369 {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/Object;Lnu;B)V",
		garbageValue = "32"
	)
	public void vmethod6493(Object var1, Buffer var2) {
		this.method6496((String)var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lnu;I)Ljava/lang/Object;",
		garbageValue = "-2127791785"
	)
	public Object vmethod6492(Buffer var1) {
		return var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Lnu;B)V",
		garbageValue = "-29"
	)
	void method6496(String var1, Buffer var2) {
		var2.writeStringCp1252NullTerminated(var1);
	}
}
