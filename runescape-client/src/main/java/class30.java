import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("be")
public class class30 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	@Export("FloorOverlayDefinition_archive")
	static AbstractArchive FloorOverlayDefinition_archive;

	static {
		ImageIO.setUseCache(false); // L: 12
	} // L: 13

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)[Lnq;",
		garbageValue = "-42"
	)
	static class360[] method445() {
		return new class360[]{class360.field3904, class360.field3906}; // L: 35
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ltp;ILjava/lang/String;B)Ljava/lang/String;",
		garbageValue = "42"
	)
	static String method448(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) { // L: 41
			return var2;
		} else {
			ObjectNode var3 = (ObjectNode)var0.get((long)var1); // L: 42
			return var3 == null ? var2 : (String)var3.obj; // L: 43 44
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lsz;",
		garbageValue = "-651272604"
	)
	static class468[] method449() {
		return new class468[]{class468.field4805, class468.field4811, class468.field4806, class468.field4808}; // L: 16
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "2111489575"
	)
	static int method447(int var0, Script var1, boolean var2) {
		Widget var3 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1647
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1648
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x; // L: 1649
			return 1; // L: 1650
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1652
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y; // L: 1653
			return 1; // L: 1654
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1656
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width; // L: 1657
			return 1; // L: 1658
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1660
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height; // L: 1661
			return 1; // L: 1662
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1664
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1665
			return 1; // L: 1666
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1668
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId; // L: 1669
			return 1; // L: 1670
		} else {
			return 2; // L: 1672
		}
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "106"
	)
	static void method446() {
		if (class434.worldMap != null) { // L: 4583
			class434.worldMap.method8664(class87.Client_plane, class20.baseX * 64 + (TextureProvider.localPlayer.x >> 7), class19.baseY * 64 + (TextureProvider.localPlayer.y >> 7), false); // L: 4584
			class434.worldMap.loadCache(); // L: 4585
		}

	} // L: 4587

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1209602899"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[class87.Client_plane][var0][var1]; // L: 8778
		if (var2 == null) { // L: 8779
			class10.scene.removeGroundItemPile(class87.Client_plane, var0, var1); // L: 8780
		} else {
			long var3 = -99999999L; // L: 8783
			TileItem var5 = null; // L: 8784

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8785 8786 8796
				ItemComposition var7 = class214.ItemComposition_get(var6.id); // L: 8787
				long var11 = (long)var7.price; // L: 8788
				if (var7.isStackable == 1) { // L: 8789
					var11 *= var6.quantity < Integer.MAX_VALUE ? (long)(var6.quantity + 1) : (long)var6.quantity; // L: 8790
				}

				if (var11 > var3) { // L: 8792
					var3 = var11; // L: 8793
					var5 = var6; // L: 8794
				}
			}

			if (var5 == null) { // L: 8798
				class10.scene.removeGroundItemPile(class87.Client_plane, var0, var1); // L: 8799
			} else {
				var2.addLast(var5); // L: 8802
				TileItem var13 = null; // L: 8803
				TileItem var8 = null; // L: 8804

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) { // L: 8805 8806 8811
					if (var5.id != var6.id) { // L: 8807
						if (var13 == null) { // L: 8808
							var13 = var6;
						}

						if (var6.id != var13.id && var8 == null) { // L: 8809
							var8 = var6;
						}
					}
				}

				long var9 = GrandExchangeOfferAgeComparator.calculateTag(var0, var1, 3, false, 0); // L: 8813
				class10.scene.newGroundItemPile(class87.Client_plane, var0, var1, class115.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, class87.Client_plane), var5, var9, var13, var8); // L: 8814
			}
		}
	} // L: 8781 8800 8815
}
