import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
public abstract class class499 extends class500 {
	class499(int var1, int var2) {
		super(var1, var2); // L: 5
	} // L: 6

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "126"
	)
	public abstract int vmethod8668();

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "72"
	)
	public abstract int vmethod8669();

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-723802647"
	)
	public abstract int vmethod8674();

	@ObfuscatedName("az")
	public static final void method8677(long var0) {
		if (var0 > 0L) { // L: 9
			if (var0 % 10L == 0L) { // L: 10
				long var2 = var0 - 1L; // L: 11

				try {
					Thread.sleep(var2); // L: 14
				} catch (InterruptedException var8) { // L: 16
				}

				try {
					Thread.sleep(1L); // L: 20
				} catch (InterruptedException var7) { // L: 22
				}
			} else {
				try {
					Thread.sleep(var0); // L: 27
				} catch (InterruptedException var6) { // L: 29
				}
			}

		}
	} // L: 31

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIZS)V",
		garbageValue = "18179"
	)
	static void method8670(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		TileItem var10 = new TileItem(); // L: 8482
		var10.id = var3; // L: 8483
		var10.quantity = var4; // L: 8484
		var10.method2680(var5); // L: 8485
		if (Client.groundItems[var0][var1][var2] == null) { // L: 8486
			Client.groundItems[var0][var1][var2] = new NodeDeque(); // L: 8487
		}

		Client.groundItems[var0][var1][var2].addFirst(var10); // L: 8489
		class477.method8529(var0, var1, var2); // L: 8490
	} // L: 8491
}
