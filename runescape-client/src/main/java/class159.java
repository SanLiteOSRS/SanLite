import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public abstract class class159 extends Node {
	@ObfuscatedName("qw")
	@ObfuscatedGetter(
		intValue = -689880895
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;

	class159() {
	} // L: 51

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "1"
	)
	abstract void vmethod3333(Buffer var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "831405774"
	)
	abstract void vmethod3332(ClanChannel var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Ltc;",
		garbageValue = "-2141629898"
	)
	public static class507 method3272(int var0) {
		class507 var1 = (class507)class507.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class507.field5053.takeFile(38, var0);
			var1 = new class507();
			if (var2 != null) {
				var1.method8970(new Buffer(var2));
			}

			var1.method8959();
			class507.DBRowType_cache.put(var1, (long)var0);
			return var1; // L: 31
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Ltk;",
		garbageValue = "44"
	)
	public static class505 method3273(int var0) {
		class505 var1 = (class505)class505.DBTableType_cache.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = class505.field5042.takeFile(39, var0); // L: 25
			var1 = new class505(); // L: 26
			if (var2 != null) { // L: 27
				var1.method8938(new Buffer(var2));
			}

			var1.method8943(); // L: 28
			class505.DBTableType_cache.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}
}
