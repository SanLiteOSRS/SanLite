import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aj")
public class class7 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -668998519
	)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;
	@ObfuscatedName("jk")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("ay")
	ExecutorService field23;
	@ObfuscatedName("an")
	Future field18;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	final Buffer field19;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	final class3 field20;

	@ObfuscatedSignature(
		descriptor = "(Ltc;Lab;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field23 = Executors.newSingleThreadExecutor(); // L: 10
		this.field19 = var1; // L: 16
		this.field20 = var2; // L: 17
		this.method52(); // L: 18
	} // L: 19

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1943420713"
	)
	public boolean method49() {
		return this.field18.isDone(); // L: 22
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2083270974"
	)
	public void method50() {
		this.field23.shutdown(); // L: 26
		this.field23 = null; // L: 27
	} // L: 28

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ltc;",
		garbageValue = "-78"
	)
	public Buffer method51() {
		try {
			return (Buffer)this.field18.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	void method52() {
		this.field18 = this.field23.submit(new class1(this, this.field19, this.field20)); // L: 40
	} // L: 41

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ILdk;ZI)I",
		garbageValue = "-1668187715"
	)
	static int method54(int var0, Script var1, boolean var2) {
		Widget var3 = ArchiveDiskActionHandler.getWidget(Interpreter.Interpreter_intStack[--class336.Interpreter_intStackSize]); // L: 1632
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1633
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.x; // L: 1634
			return 1; // L: 1635
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1637
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.y; // L: 1638
			return 1; // L: 1639
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1641
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.width; // L: 1642
			return 1; // L: 1643
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1645
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.height; // L: 1646
			return 1; // L: 1647
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1649
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1650
			return 1; // L: 1651
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1653
			Interpreter.Interpreter_intStack[++class336.Interpreter_intStackSize - 1] = var3.parentId; // L: 1654
			return 1; // L: 1655
		} else {
			return 2; // L: 1657
		}
	}
}
