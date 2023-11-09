import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
public class class128 implements Callable {
	@ObfuscatedName("db")
	@ObfuscatedSignature(
		descriptor = "Ltj;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	final class129 field1502;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class130 field1496;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class131 field1497;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 498098769
	)
	final int field1499;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class136 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;Leq;Lfg;Lfa;I)V"
	)
	class128(class136 var1, class129 var2, class130 var3, class131 var4, int var5) {
		this.this$0 = var1; // L: 269
		this.field1502 = var2; // L: 270
		this.field1496 = var3; // L: 271
		this.field1497 = var4; // L: 272
		this.field1499 = var5; // L: 273
	} // L: 274

	public Object call() {
		this.field1502.method2986(); // L: 278
		class129[][] var1;
		if (this.field1496 == class130.field1529) { // L: 280
			var1 = this.this$0.field1584; // L: 281
		} else {
			var1 = this.this$0.field1583; // L: 284
		}

		var1[this.field1499][this.field1497.method3017()] = this.field1502; // L: 286
		return null; // L: 287
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-709369885"
	)
	public static int method2970(int var0) {
		--var0; // L: 52
		var0 |= var0 >>> 1; // L: 53
		var0 |= var0 >>> 2; // L: 54
		var0 |= var0 >>> 4; // L: 55
		var0 |= var0 >>> 8; // L: 56
		var0 |= var0 >>> 16; // L: 57
		return var0 + 1; // L: 58
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "11"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[Clock.Client_plane][var0][var1]; // L: 8595
		if (var2 == null) { // L: 8596
			class36.scene.removeGroundItemPile(Clock.Client_plane, var0, var1); // L: 8597
		} else {
			long var3 = -99999999L; // L: 8600
			TileItem var5 = null; // L: 8601

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8602 8603 8613
				ItemComposition var7 = class300.ItemComposition_get(var6.id); // L: 8604
				long var11 = (long)var7.price; // L: 8605
				if (var7.isStackable == 1) { // L: 8606
					var11 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity; // L: 8607
				}

				if (var11 > var3) { // L: 8609
					var3 = var11; // L: 8610
					var5 = var6; // L: 8611
				}
			}

			if (var5 == null) { // L: 8615
				class36.scene.removeGroundItemPile(Clock.Client_plane, var0, var1); // L: 8616
			} else {
				var2.addLast(var5); // L: 8619
				TileItem var13 = null; // L: 8620
				TileItem var8 = null; // L: 8621

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8622 8623 8628
					if (var6.id != var5.id) { // L: 8624
						if (var13 == null) { // L: 8625
							var13 = var6;
						}

						if (var13.id != var6.id && var8 == null) { // L: 8626
							var8 = var6;
						}
					}
				}

				long var9 = class394.calculateTag(var0, var1, 3, false, 0); // L: 8630
				class36.scene.newGroundItemPile(Clock.Client_plane, var0, var1, Renderable.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, Clock.Client_plane), var5, var9, var13, var8); // L: 8631
			}
		}
	} // L: 8598 8617 8632
}
