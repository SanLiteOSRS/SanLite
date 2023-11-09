import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("WallObject")
public final class WallObject {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1322040305
	)
	@Export("z")
	int z;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1395173813
	)
	@Export("x")
	int x;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1561329664
	)
	@Export("y")
	int y;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -312981103
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -272343979
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -1669611721957992963L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1298585617
	)
	@Export("flags")
	int flags;

	WallObject() {
		this.tag = 0L; // L: 11
		this.flags = 0; // L: 12
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-149818697"
	)
	public static final synchronized long method5027() {
		long var0 = System.currentTimeMillis(); // L: 14
		if (var0 < class300.field3364) { // L: 15
			class300.field3365 += class300.field3364 - var0; // L: 16
		}

		class300.field3364 = var0; // L: 18
		return var0 + class300.field3365; // L: 19
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)V",
		garbageValue = "190093423"
	)
	static final void method5026(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 8310

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8311 8312 8317
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 8313
				var10 = var11; // L: 8314
				break;
			}
		}

		if (var10 == null) { // L: 8319
			var10 = new PendingSpawn(); // L: 8320
			var10.plane = var0; // L: 8321
			var10.type = var3; // L: 8322
			var10.x = var1; // L: 8323
			var10.y = var2; // L: 8324
			var10.field1143 = -1; // L: 8325
			DirectByteArrayCopier.method6568(var10); // L: 8326
			Client.pendingSpawns.addFirst(var10); // L: 8327
		}

		var10.field1148 = var4; // L: 8329
		var10.field1142 = var5; // L: 8330
		var10.field1141 = var6; // L: 8331
		var10.delay = var8; // L: 8332
		var10.hitpoints = var9; // L: 8333
		var10.method2346(var7); // L: 8334
	} // L: 8335
}
