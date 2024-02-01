import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public class class1 implements Callable {
	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static StudioGame field3;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	final Buffer field1;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	final class3 field0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	final class7 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lao;Luk;Laj;)V"
	)
	class1(class7 var1, Buffer var2, class3 var3) {
		this.this$0 = var1; // L: 47
		this.field1 = var2; // L: 48
		this.field0 = var3; // L: 49
	} // L: 50

	public Object call() {
		return this.field0.vmethod15(this.field1); // L: 54
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Lde;",
		garbageValue = "800016326"
	)
	static class90[] method6() {
		return new class90[]{class90.field1087, class90.field1090, class90.field1092, class90.field1091, class90.field1096, class90.field1089}; // L: 17
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "762793489"
	)
	static int method10(int var0, Script var1, boolean var2) {
		return 2; // L: 5141
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(Ldk;B)V",
		garbageValue = "1"
	)
	static final void method12(PendingSpawn var0) {
		long var1 = 0L; // L: 8549
		int var3 = -1; // L: 8550
		int var4 = 0; // L: 8551
		int var5 = 0; // L: 8552
		if (var0.type == 0) { // L: 8553
			var1 = GrandExchangeOfferOwnWorldComparator.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 8554
			var1 = GrandExchangeOfferOwnWorldComparator.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 8555
			var1 = GrandExchangeOfferOwnWorldComparator.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = GrandExchangeOfferOwnWorldComparator.scene.getGroundObjectTag(var0.plane, var0.x, var0.y); // L: 8556
		}

		if (0L != var1) { // L: 8557
			int var6 = GrandExchangeOfferOwnWorldComparator.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 8558
			var3 = class167.Entity_unpackID(var1); // L: 8559
			var4 = var6 & 31; // L: 8560
			var5 = var6 >> 6 & 3; // L: 8561
		}

		var0.objectId = var3; // L: 8563
		var0.field1163 = var4; // L: 8564
		var0.field1162 = var5; // L: 8565
	} // L: 8566
}
