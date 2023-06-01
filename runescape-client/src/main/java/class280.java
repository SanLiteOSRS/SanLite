import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
public abstract class class280 implements class282 {
	@ObfuscatedName("ui")
	@ObfuscatedGetter(
		intValue = -1463657481
	)
	static int field3075;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("NetCache_responseArchiveBuffer")
	public static Buffer NetCache_responseArchiveBuffer;
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -747134993
	)
	protected int field3079;

	@ObfuscatedSignature(
		descriptor = "(Lnp;Lor;I)V"
	)
	protected class280(StudioGame var1, Language var2, int var3) {
		this.field3079 = var3; // L: 10
	} // L: 11

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IS)Lhn;",
		garbageValue = "-26436"
	)
	public static VarbitComposition method5641(int var0) {
		VarbitComposition var1 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0); // L: 32
		if (var1 != null) { // L: 33
			return var1;
		} else {
			byte[] var2 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0); // L: 34
			var1 = new VarbitComposition(); // L: 35
			if (var2 != null) { // L: 36
				var1.decode(new Buffer(var2));
			}

			VarbitComposition.VarbitDefinition_cached.put(var1, (long)var0); // L: 37
			return var1; // L: 38
		}
	}
}
