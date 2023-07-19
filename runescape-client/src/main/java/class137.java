import java.util.concurrent.Callable;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fs")
class class137 implements Callable {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfw;"
	)
	final class138 this$0;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	final Buffer val$p;
	// $FF: synthetic field
	final int val$version;

	@ObfuscatedSignature(
		descriptor = "(Lfw;Ltl;I)V"
	)
	class137(class138 var1, Buffer var2, int var3) {
		this.this$0 = var1;
		this.val$p = var2;
		this.val$version = var3;
	}

	public Object call() {
		this.this$0.method3139(this.val$p, this.val$version);
		return null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)[B",
		garbageValue = "0"
	)
	public static byte[] method3135(CharSequence var0) {
		int var1 = var0.length(); // L: 68
		byte[] var2 = new byte[var1]; // L: 69

		for (int var3 = 0; var3 < var1; ++var3) { // L: 70
			char var4 = var0.charAt(var3); // L: 71
			if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) { // L: 72
				var2[var3] = (byte)var4;
			} else if (var4 == 8364) { // L: 73
				var2[var3] = -128;
			} else if (var4 == 8218) { // L: 74
				var2[var3] = -126;
			} else if (var4 == 402) { // L: 75
				var2[var3] = -125;
			} else if (var4 == 8222) { // L: 76
				var2[var3] = -124;
			} else if (var4 == 8230) { // L: 77
				var2[var3] = -123;
			} else if (var4 == 8224) { // L: 78
				var2[var3] = -122;
			} else if (var4 == 8225) { // L: 79
				var2[var3] = -121;
			} else if (var4 == 710) { // L: 80
				var2[var3] = -120;
			} else if (var4 == 8240) { // L: 81
				var2[var3] = -119;
			} else if (var4 == 352) { // L: 82
				var2[var3] = -118;
			} else if (var4 == 8249) { // L: 83
				var2[var3] = -117;
			} else if (var4 == 338) { // L: 84
				var2[var3] = -116;
			} else if (var4 == 381) { // L: 85
				var2[var3] = -114;
			} else if (var4 == 8216) { // L: 86
				var2[var3] = -111;
			} else if (var4 == 8217) { // L: 87
				var2[var3] = -110;
			} else if (var4 == 8220) { // L: 88
				var2[var3] = -109;
			} else if (var4 == 8221) { // L: 89
				var2[var3] = -108;
			} else if (var4 == 8226) { // L: 90
				var2[var3] = -107;
			} else if (var4 == 8211) { // L: 91
				var2[var3] = -106;
			} else if (var4 == 8212) { // L: 92
				var2[var3] = -105;
			} else if (var4 == 732) { // L: 93
				var2[var3] = -104;
			} else if (var4 == 8482) { // L: 94
				var2[var3] = -103;
			} else if (var4 == 353) { // L: 95
				var2[var3] = -102;
			} else if (var4 == 8250) { // L: 96
				var2[var3] = -101;
			} else if (var4 == 339) { // L: 97
				var2[var3] = -100;
			} else if (var4 == 382) { // L: 98
				var2[var3] = -98;
			} else if (var4 == 376) { // L: 99
				var2[var3] = -97;
			} else {
				var2[var3] = 63; // L: 100
			}
		}

		return var2; // L: 102
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ILdr;ZI)I",
		garbageValue = "-2137705132"
	)
	static int method3137(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1590
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1607
				var7 = var2 ? Interpreter.scriptDotWidget : class184.field1907; // L: 1608
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1609
				if (var4 >= 1 && var4 <= 10) { // L: 1610
					class102 var8 = new class102(var4, var7.id, var7.childIndex, var7.itemId); // L: 1613
					Interpreter.field866.add(var8); // L: 1614
					return 1; // L: 1615
				} else {
					throw new RuntimeException(); // L: 1611
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1617
				Interpreter.Interpreter_intStackSize -= 3; // L: 1618
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1619
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1620
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1621
				if (var5 >= 1 && var5 <= 10) { // L: 1622
					class102 var6 = new class102(var5, var3, var4, Interpreter.getWidget(var3).itemId); // L: 1625
					Interpreter.field866.add(var6); // L: 1626
					return 1; // L: 1627
				} else {
					throw new RuntimeException(); // L: 1623
				}
			} else {
				return 2; // L: 1629
			}
		} else if (Interpreter.field867 >= 10) { // L: 1591
			throw new RuntimeException(); // L: 1592
		} else {
			if (var0 >= 2000) { // L: 1595
				var7 = Interpreter.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1596
			} else {
				var7 = var2 ? Interpreter.scriptDotWidget : class184.field1907; // L: 1598
			}

			if (var7.onResize == null) { // L: 1599
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1600
				var9.widget = var7; // L: 1601
				var9.args = var7.onResize; // L: 1602
				var9.field1077 = Interpreter.field867 + 1; // L: 1603
				Client.scriptEvents.addFirst(var9); // L: 1604
				return 1; // L: 1605
			}
		}
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Z",
		garbageValue = "-38"
	)
	static final boolean method3136(int var0, int var1, int var2, int var3, int var4) {
		PendingSpawn var5 = null; // L: 8347

		for (PendingSpawn var6 = (PendingSpawn)Client.pendingSpawns.last(); var6 != null; var6 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 8348 8349 8354
			if (var0 == var6.plane && var6.x == var1 && var2 == var6.y && var3 == var6.type) { // L: 8350
				var5 = var6; // L: 8351
				break;
			}
		}

		if (var5 != null) { // L: 8356
			var5.field1174 = var4; // L: 8357
			return true; // L: 8358
		} else {
			return false; // L: 8360
		}
	}
}
