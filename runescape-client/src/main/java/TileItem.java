import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("el")
@Implements("TileItem")
public final class TileItem extends Renderable {
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 378381699
	)
	static int field1354;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 385516557
	)
	@Export("id")
	int id;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -235351449
	)
	@Export("quantity")
	int quantity;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -834267111
	)
	int field1351;

	TileItem() {
		this.field1351 = 31; // L: 11
	} // L: 13

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1890606004"
	)
	void method2725(int var1) {
		this.field1351 = var1; // L: 16
	} // L: 17

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Ljr;",
		garbageValue = "63"
	)
	@Export("getModel")
	protected final Model getModel() {
		return class141.ItemComposition_get(this.id).getModel(this.quantity);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-865302395"
	)
	boolean method2729(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 20
			return (this.field1351 & 1 << var1) != 0; // L: 21
		} else {
			return true;
		}
	}

	@ObfuscatedName("aj")
	static boolean method2728(long var0) {
		int var2 = (int)(var0 >>> 14 & 3L); // L: 50
		return var2 == 2; // L: 52
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhm;",
		garbageValue = "30"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 25
			var1 = new StructComposition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 28
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}
}
