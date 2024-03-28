import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sm")
public abstract class class477 implements class296 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	class522 field4903;

	class477(int var1) {
	} // L: 13

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-470314678"
	)
	abstract void vmethod8516(Buffer var1, int var2);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "103"
	)
	public void method8515(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 17
			if (var2 == 0) { // L: 18
				return; // L: 39
			}

			class473 var3 = (class473)KitDefinition.findEnumerated(Friend.method8100(), var2); // L: 19
			if (var3 != null) { // L: 20
				switch(var3.field4897) { // L: 21
				case 0:
					KitDefinition.findEnumerated(class147.method3171(), var1.readUnsignedByte()); // L: 25
					break;
				case 1:
					int var4 = var1.readUnsignedByte(); // L: 31
					this.field4903 = class211.method3931(var4); // L: 32
					if (this.field4903 != null) { // L: 33
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var4);
				case 2:
					var1.readStringCp1252NullCircumfixed(); // L: 28
					break; // L: 29
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var3); // L: 23
				}
			} else {
				this.vmethod8516(var1, var2); // L: 37
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "255316021"
	)
	boolean method8525() {
		return this.field4903 != null; // L: 44
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/Object;",
		garbageValue = "-1106969167"
	)
	Object method8517() {
		if (this.field4903 == class522.field5158) { // L: 48
			return 0; // L: 49
		} else if (this.field4903 == class522.field5160) { // L: 51
			return -1L; // L: 52
		} else {
			return this.field4903 == class522.field5155 ? "" : null; // L: 54 55 57
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-655053707"
	)
	static void method8529(int var0, int var1, int var2) {
		NodeDeque var3 = Client.groundItems[var0][var1][var2]; // L: 8752
		if (var3 == null) { // L: 8753
			LoginType.scene.method4845(var0, var1, var2); // L: 8754
		} else {
			long var4 = -99999999L; // L: 8757
			TileItem var6 = null; // L: 8758

			TileItem var7;
			for (var7 = (TileItem)var3.last(); var7 != null; var7 = (TileItem)var3.previous()) { // L: 8759 8760 8770
				ItemComposition var8 = class10.ItemComposition_get(var7.id); // L: 8761
				long var12 = (long)var8.price; // L: 8762
				if (var8.isStackable == 1) { // L: 8763
					var12 *= var7.quantity < Integer.MAX_VALUE ? (long)(var7.quantity + 1) : (long)var7.quantity; // L: 8764
				}

				if (var12 > var4) { // L: 8766
					var4 = var12; // L: 8767
					var6 = var7; // L: 8768
				}
			}

			if (var6 == null) { // L: 8772
				LoginType.scene.method4845(var0, var1, var2); // L: 8773
			} else {
				var3.addLast(var6); // L: 8776
				TileItem var14 = null; // L: 8777
				TileItem var9 = null; // L: 8778

				for (var7 = (TileItem)var3.last(); var7 != null; var7 = (TileItem)var3.previous()) { // L: 8779 8780 8785
					if (var6.id != var7.id) { // L: 8781
						if (var14 == null) { // L: 8782
							var14 = var7;
						}

						if (var14.id != var7.id && var9 == null) { // L: 8783
							var9 = var7;
						}
					}
				}

				long var10 = class154.calculateTag(var1, var2, 3, false, 0); // L: 8787
				LoginType.scene.newGroundItemPile(var0, var1, var2, Canvas.getTileHeight(var1 * 128 + 64, var2 * 128 + 64, var0), var6, var10, var14, var9); // L: 8788
			}
		}
	} // L: 8755 8774 8789
}
