import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jc")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1860851959
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 40257399
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1667175185
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 890568309
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 412494011
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("ab")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2143818661
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsg;B)Ljava/lang/String;",
		garbageValue = "98"
	)
	public static String method4911(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart(); // L: 29
			if (var2 > 32767) { // L: 30
				var2 = 32767;
			}

			byte[] var3 = new byte[var2]; // L: 31
			var0.offset += class319.huffman.decompress(var0.array, var0.offset, var3, 0, var2); // L: 32
			String var4 = Buffer.decodeStringCp1252(var3, 0, var2); // L: 33
			var1 = var4; // L: 34
		} catch (Exception var6) { // L: 36
			var1 = "Cabbage"; // L: 37
		}

		return var1; // L: 40
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ILch;ZB)I",
		garbageValue = "115"
	)
	static int method4910(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 == ScriptOpcodes.IF_GETINVOBJECT) { // L: 1814
			var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1815
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1816
			return 1; // L: 1817
		} else if (var0 == ScriptOpcodes.IF_GETINVCOUNT) { // L: 1819
			var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1820
			if (var3.itemId != -1) { // L: 1821
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1822
			}

			return 1; // L: 1823
		} else if (var0 == ScriptOpcodes.IF_HASSUB) { // L: 1825
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1826
			InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var5); // L: 1827
			if (var4 != null) { // L: 1828
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1829
			}

			return 1; // L: 1830
		} else if (var0 == ScriptOpcodes.IF_GETTOP) { // L: 1832
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.rootInterface; // L: 1833
			return 1; // L: 1834
		} else if (var0 == 2707) { // L: 1836
			var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1837
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6382() ? 1 : 0; // L: 1838
			return 1; // L: 1839
		} else if (var0 == 2708) { // L: 1841
			var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1842
			return BufferedSource.method8029(var3); // L: 1843
		} else if (var0 == 2709) { // L: 1845
			var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1846
			return class4.method22(var3); // L: 1847
		} else {
			return 2; // L: 1849
		}
	}

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZB)V",
		garbageValue = "18"
	)
	static final void method4912(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) { // L: 9651
			if (Client.menuOptionsCount < 500) { // L: 9652
				Client.menuActions[Client.menuOptionsCount] = var0; // L: 9653
				Client.menuTargets[Client.menuOptionsCount] = var1; // L: 9654
				Client.menuOpcodes[Client.menuOptionsCount] = var2; // L: 9655
				Client.menuIdentifiers[Client.menuOptionsCount] = var3; // L: 9656
				Client.menuArguments1[Client.menuOptionsCount] = var4; // L: 9657
				Client.menuArguments2[Client.menuOptionsCount] = var5; // L: 9658
				Client.field637[Client.menuOptionsCount] = var6; // L: 9659
				Client.menuShiftClick[Client.menuOptionsCount] = var7; // L: 9660
				++Client.menuOptionsCount; // L: 9661
			}

		}
	} // L: 9663
}
