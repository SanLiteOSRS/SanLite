import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ns")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("cf")
	@Export("otp")
	static String otp;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -977723823
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("ac")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ILcv;ZB)I",
		garbageValue = "81"
	)
	static int method6429(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1564
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1581
				var7 = var2 ? GameObject.scriptDotWidget : SoundSystem.field319; // L: 1582
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1583
				if (var4 >= 1 && var4 <= 10) { // L: 1584
					class99 var8 = new class99(var4, var7.id, var7.childIndex, var7.itemId); // L: 1587
					Interpreter.field837.add(var8); // L: 1588
					return 1; // L: 1589
				} else {
					throw new RuntimeException(); // L: 1585
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1591
				Interpreter.Interpreter_intStackSize -= 3; // L: 1592
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1593
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1594
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1595
				if (var5 >= 1 && var5 <= 10) { // L: 1596
					class99 var6 = new class99(var5, var3, var4, WorldMapSection1.getWidget(var3).itemId); // L: 1599
					Interpreter.field837.add(var6); // L: 1600
					return 1; // L: 1601
				} else {
					throw new RuntimeException(); // L: 1597
				}
			} else {
				return 2; // L: 1603
			}
		} else if (Interpreter.field838 >= 10) { // L: 1565
			throw new RuntimeException(); // L: 1566
		} else {
			if (var0 >= 2000) { // L: 1569
				var7 = WorldMapSection1.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1570
			} else {
				var7 = var2 ? GameObject.scriptDotWidget : SoundSystem.field319; // L: 1572
			}

			if (var7.onResize == null) { // L: 1573
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1574
				var9.widget = var7; // L: 1575
				var9.args = var7.onResize; // L: 1576
				var9.field1051 = Interpreter.field838 + 1; // L: 1577
				Client.scriptEvents.addFirst(var9); // L: 1578
				return 1; // L: 1579
			}
		}
	}
}
