import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		signature = "Lkf;"
	)
	@Export("NetCache_reference")
	static Buffer NetCache_reference;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1817310685
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -670222051
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 1502625343
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("t")
	@Export("action")
	String action;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 691220539
	)
	@Export("identifier")
	int identifier;

	MenuAction() {
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIIB)J",
		garbageValue = "0"
	)
	static long method2139(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "([BZB)Ljava/lang/Object;",
		garbageValue = "117"
	)
	public static Object method2140(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}
}
