import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fu")
public class class141 extends class144 {
	@ObfuscatedName("ep")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -377447235
	)
	int field1664;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -419301065
	)
	int field1667;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2114631391
	)
	int field1665;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -19255889
	)
	int field1666;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class141(class147 var1) {
		this.this$0 = var1;
		this.field1664 = -1; // L: 158
	} // L: 163

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1664 = var1.readUnsignedShort(); // L: 166
		this.field1667 = var1.readInt(); // L: 167
		this.field1665 = var1.readUnsignedByte(); // L: 168
		this.field1666 = var1.readUnsignedByte(); // L: 169
	} // L: 170

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3254(this.field1664, this.field1667, this.field1665, this.field1666); // L: 173
	} // L: 174

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "-87"
	)
	static int method3122(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class475.scriptDotWidget : class535.field5236; // L: 1373
		if (var0 == ScriptOpcodes.CC_GETX) { // L: 1374
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.x; // L: 1375
			return 1; // L: 1376
		} else if (var0 == ScriptOpcodes.CC_GETY) { // L: 1378
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.y; // L: 1379
			return 1; // L: 1380
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) { // L: 1382
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.width; // L: 1383
			return 1; // L: 1384
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) { // L: 1386
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.height; // L: 1387
			return 1; // L: 1388
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) { // L: 1390
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1391
			return 1; // L: 1392
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) { // L: 1394
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = var3.parentId; // L: 1395
			return 1; // L: 1396
		} else {
			return 2; // L: 1398
		}
	}

	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "10"
	)
	static void method3130(Buffer var0, int var1) {
		byte[] var2 = var0.array; // L: 12889
		if (Client.randomDatData == null) { // L: 12891
			Client.randomDatData = new byte[24];
		}

		class429.writeRandomDat(var2, var1, Client.randomDatData, 0, 24); // L: 12892
		class247.method4876(var0, var1); // L: 12894
	} // L: 12895
}
