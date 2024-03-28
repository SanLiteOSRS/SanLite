import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mw")
public class class332 implements Comparator {
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = 1820050341
	)
	static int field3603;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(
		intValue = -1537214849
	)
	static int field3602;

	class332() {
	} // L: 699

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lmv;Lmv;B)I",
		garbageValue = "0"
	)
	int method6229(class325 var1, class325 var2) {
		return var1.field3555 - var2.field3555; // L: 702
	}

	public int compare(Object var1, Object var2) {
		return this.method6229((class325)var1, (class325)var2); // L: 706
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 710
	}

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIB)V",
		garbageValue = "0"
	)
	static void method6230(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		PendingSpawn var10 = null; // L: 8547

		for (PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8548 8549 8554
			if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) { // L: 8550
				var10 = var11; // L: 8551
				break;
			}
		}

		if (var10 == null) { // L: 8556
			var10 = new PendingSpawn(); // L: 8557
			var10.plane = var0; // L: 8558
			var10.type = var3; // L: 8559
			var10.x = var1; // L: 8560
			var10.y = var2; // L: 8561
			var10.field1192 = -1; // L: 8562
			WorldMapRectangle.method5683(var10); // L: 8563
			Client.pendingSpawns.addFirst(var10); // L: 8564
		}

		var10.field1198 = var4; // L: 8566
		var10.field1191 = var5; // L: 8567
		var10.field1190 = var6; // L: 8568
		var10.delay = var8; // L: 8569
		var10.hitpoints = var9; // L: 8570
		var10.method2387(var7); // L: 8571
	} // L: 8572
}
