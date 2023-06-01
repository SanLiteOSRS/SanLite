import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public class class193 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1170540391
	)
	static int field2001;
	@ObfuscatedName("hc")
	static String field2002;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -6159865846472935773L
	)
	public long field2000;
	@ObfuscatedName("an")
	int[] field1997;
	@ObfuscatedName("ar")
	short[] field1998;
	@ObfuscatedName("ab")
	short[] field1999;
	@ObfuscatedName("at")
	public boolean field2004;

	public class193(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.field2004 = false; // L: 8
		this.field2000 = var1; // L: 11
		this.field1997 = var3; // L: 12
		this.field1998 = var4; // L: 13
		this.field1999 = var5; // L: 14
		this.field2004 = var6; // L: 15
	} // L: 16

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldk;",
		garbageValue = "62"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0); // L: 26
		if (var1 != null) { // L: 27
			return var1;
		} else {
			byte[] var2 = FriendsList.archive12.takeFile(var0, 0); // L: 28
			if (var2 == null) { // L: 29
				return null; // L: 30
			} else {
				var1 = ObjectSound.newScript(var2); // L: 32
				Script.Script_cached.put(var1, (long)var0); // L: 33
				return var1; // L: 34
			}
		}
	}
}
