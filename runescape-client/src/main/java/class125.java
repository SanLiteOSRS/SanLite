import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class125 {
	@ObfuscatedName("ad")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "Lgw;"
	)
	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1040105663
	)
	int field1489;
	@ObfuscatedName("aj")
	float field1485;
	@ObfuscatedName("ac")
	float field1484;
	@ObfuscatedName("aw")
	float field1487;
	@ObfuscatedName("ay")
	float field1482;
	@ObfuscatedName("ap")
	float field1486;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	class125 field1488;

	class125() {
		this.field1484 = Float.MAX_VALUE; // L: 8
		this.field1487 = Float.MAX_VALUE; // L: 9
		this.field1482 = Float.MAX_VALUE; // L: 10
		this.field1486 = Float.MAX_VALUE; // L: 11
	} // L: 14

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ltl;II)V",
		garbageValue = "437601030"
	)
	void method2987(Buffer var1, int var2) {
		this.field1489 = var1.readShort(); // L: 17
		this.field1485 = var1.method9065(); // L: 18
		this.field1484 = var1.method9065(); // L: 19
		this.field1487 = var1.method9065(); // L: 20
		this.field1482 = var1.method9065(); // L: 21
		this.field1486 = var1.method9065(); // L: 22
	} // L: 23

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lig;B)V",
		garbageValue = "102"
	)
	static final void method2988(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 90
			for (var7 = 0; var7 < 64; ++var7) { // L: 91
				for (var8 = 0; var8 < 64; ++var8) { // L: 92
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 93
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var8 + var2] &= -16777217;
					}
				}
			}
		}

		Buffer var12 = new Buffer(var0); // L: 97

		for (var7 = 0; var7 < 4; ++var7) { // L: 98
			for (var8 = 0; var8 < 64; ++var8) { // L: 99
				for (int var9 = 0; var9 < 64; ++var9) { // L: 100
					int var10 = var8 + var1; // L: 101
					int var11 = var9 + var2; // L: 102
					class60.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0); // L: 103
				}
			}
		}

	} // L: 107
}
