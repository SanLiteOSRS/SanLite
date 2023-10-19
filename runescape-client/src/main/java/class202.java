import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hx")
public class class202 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	static EvictingDualNodeHashTable field2026;
	@ObfuscatedName("ch")
	@ObfuscatedGetter(
		intValue = -1153223597
	)
	static int field2025;

	static {
		field2026 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhb;",
		garbageValue = "163265038"
	)
	static HorizontalAlignment[] method3767() {
		return new HorizontalAlignment[]{HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field2032, HorizontalAlignment.field2027}; // L: 14
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "1725894118"
	)
	static int method3766(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class416.scriptDotWidget : class306.field3131; // L: 1534
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1535
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1536
			return 1; // L: 1537
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1539
			if (var3.itemId != -1) { // L: 1540
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1541
			}

			return 1; // L: 1542
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1544
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1545
			return 1; // L: 1546
		} else if (var0 == 1707) { // L: 1548
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6604() ? 1 : 0; // L: 1549
			return 1; // L: 1550
		} else if (var0 == 1708) { // L: 1552
			return class110.method2752(var3); // L: 1553
		} else {
			return var0 == 1709 ? Canvas.method320(var3) : 2; // L: 1555 1556 1558
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(IZZZZI)Lok;",
		garbageValue = "-1284352202"
	)
	@Export("newArchive")
	static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		ArchiveDisk var5 = null; // L: 2043
		if (JagexCache.JagexCache_dat2File != null) { // L: 2044
			var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, UserComparator8.JagexCache_idxFiles[var0], 1000000); // L: 2045
		}

		return new Archive(var5, UserComparator10.field1480, class59.field452, var0, var1, var2, var3, var4, false); // L: 2047
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "976879674"
	)
	static void method3764(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) { // L: 3892
			int var5 = (Integer)var0.get(0); // L: 3895
			if (var5 == -1 && !Client.playingJingle) { // L: 3896
				ItemComposition.method4136(0, 0); // L: 3897
			} else if (var5 != -1) { // L: 3899
				boolean var6;
				if (class319.field3440.isEmpty()) { // L: 3902
					var6 = false; // L: 3907
				} else {
					class331 var7 = (class331)class319.field3440.get(0); // L: 3903
					var6 = var7 != null && var5 == var7.field3539; // L: 3904
				}

				if (!var6 && class91.clientPreferences.method2515() != 0) { // L: 3909 3910
					ArrayList var9 = new ArrayList(); // L: 3911

					for (int var8 = 0; var8 < var0.size(); ++var8) { // L: 3912
						var9.add(new class331(CollisionMap.field2392, (Integer)var0.get(var8), 0, class91.clientPreferences.method2515(), false)); // L: 3913
					}

					if (Client.playingJingle) { // L: 3915
						class275.method5562(var9, var1, var2, var3, var4); // L: 3916
					} else {
						class148.method3166(var9, var1, var2, var3, var4, false); // L: 3919
					}
				}
			}

		}
	} // L: 3893 3924
}
