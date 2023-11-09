import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("bf")
	@Export("hasFocus")
	protected static boolean hasFocus;

	AbstractByteArrayCopier() {
	} // L: 4

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-302524425"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1503790515"
	)
	@Export("set")
	abstract void set(byte[] var1);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Lch;",
		garbageValue = "1488073193"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = class126.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = class33.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}
}
