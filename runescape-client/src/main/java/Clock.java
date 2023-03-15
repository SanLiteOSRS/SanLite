import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("archive11")
	static Archive archive11;

	Clock() {
	} // L: 4

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1425086968"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1465993621"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "95"
	)
	public static int method3535(int var0) {
		return (var0 & class473.field4887) - 1; // L: 26
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsy;[II)[Ljava/lang/Object;",
		garbageValue = "1953692546"
	)
	static Object[] method3525(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart(); // L: 30
		Object[] var3 = new Object[var1.length * var2]; // L: 31

		for (int var4 = 0; var4 < var2; ++var4) { // L: 32
			for (int var5 = 0; var5 < var1.length; ++var5) { // L: 33
				int var6 = var1.length * var4 + var5; // L: 34
				class467 var7 = class458.method8343(var1[var5]); // L: 35
				var3[var6] = var7.method8465(var0); // L: 36
			}
		}

		return var3; // L: 39
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1193424580"
	)
	public static boolean method3534(int var0) {
		return (var0 >> 21 & 1) != 0; // L: 21
	}
}
