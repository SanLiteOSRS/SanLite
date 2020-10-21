import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("j")
@Implements("GrandExchangeOffer")
public class GrandExchangeOffer {
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = -2001741545
	)
	static int field87;
	@ObfuscatedName("de")
	@ObfuscatedSignature(
		signature = "Lid;"
	)
	@Export("archive8")
	static Archive archive8;
	@ObfuscatedName("gr")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		signature = "Lcu;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("f")
	@Export("state")
	byte state;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1175311391
	)
	@Export("id")
	public int id;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1620049031
	)
	@Export("unitPrice")
	public int unitPrice;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -658451115
	)
	@Export("totalQuantity")
	public int totalQuantity;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 682864265
	)
	@Export("currentQuantity")
	public int currentQuantity;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 2131508633
	)
	@Export("currentPrice")
	public int currentPrice;

	public GrandExchangeOffer() {
	}

	@ObfuscatedSignature(
		signature = "(Lkb;Z)V",
		garbageValue = "0"
	)
	public GrandExchangeOffer(Buffer var1, boolean var2) {
		this.state = var1.readByte();
		this.id = var1.readUnsignedShort();
		this.unitPrice = var1.readInt();
		this.totalQuantity = var1.readInt();
		this.currentQuantity = var1.readInt();
		this.currentPrice = var1.readInt();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-682485902"
	)
	@Export("status")
	public int status() {
		return this.state & 7;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "-1493721468"
	)
	@Export("type")
	public int type() {
		return (this.state & 8) == 8 ? 1 : 0;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-629489777"
	)
	void method189(int var1) {
		this.state &= -8;
		this.state = (byte)(this.state | var1 & 7);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-130470346"
	)
	void method206(int var1) {
		this.state &= -9;
		if (var1 == 1) {
			this.state = (byte)(this.state | 8);
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(B)[Lgg;",
		garbageValue = "-42"
	)
	public static class194[] method208() {
		return new class194[]{class194.field2356, class194.field2349, class194.field2359, class194.field2348, class194.field2352, class194.field2351, class194.field2354, class194.field2353, class194.field2355, class194.field2357};
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(ILco;ZI)I",
		garbageValue = "-253768081"
	)
	static int method198(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? MouseRecorder.field621 : Interpreter.field1122;
		if (var0 == ScriptOpcodes.CC_GETX) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETY) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETWIDTH) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETHIDE) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETLAYER) {
			Interpreter.Interpreter_intStack[++MilliClock.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		signature = "(IIIIIIIIIB)V",
		garbageValue = "0"
	)
	@Export("updatePendingSpawn")
	static final void updatePendingSpawn(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		PendingSpawn var9 = null;

		for (PendingSpawn var10 = (PendingSpawn)Client.pendingSpawns.last(); var10 != null; var10 = (PendingSpawn)Client.pendingSpawns.previous()) {
			if (var0 == var10.plane && var10.x == var1 && var2 == var10.y && var3 == var10.type) {
				var9 = var10;
				break;
			}
		}

		if (var9 == null) {
			var9 = new PendingSpawn();
			var9.plane = var0;
			var9.type = var3;
			var9.x = var1;
			var9.y = var2;
			JagexCache.method3619(var9);
			Client.pendingSpawns.addFirst(var9);
		}

		var9.id = var4;
		var9.field962 = var5;
		var9.orientation = var6;
		var9.delay = var7;
		var9.hitpoints = var8;
	}
}
