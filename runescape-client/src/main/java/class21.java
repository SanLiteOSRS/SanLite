import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("x")
public class class21 {
	@ObfuscatedName("tv")
	@ObfuscatedGetter(
		intValue = 1741723829
	)
	static int field113;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 193817147
	)
	final int field112;
	@ObfuscatedName("h")
	final String field115;

	class21(String var1) {
		this.field112 = 400;
		this.field115 = "";
	} // L: 34

	class21(HttpURLConnection var1) throws IOException {
		this.field112 = var1.getResponseCode(); // L: 14
		var1.getResponseMessage(); // L: 15
		var1.getHeaderFields(); // L: 16
		StringBuilder var2 = new StringBuilder(); // L: 17
		InputStream var3 = this.field112 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 18
		if (var3 != null) { // L: 19
			InputStreamReader var4 = new InputStreamReader(var3); // L: 20
			BufferedReader var5 = new BufferedReader(var4); // L: 21

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 23
				var2.append(var6); // L: 24
			}

			var3.close(); // L: 26
		}

		this.field115 = var2.toString();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "128"
	)
	public int method295() {
		return this.field112; // L: 37
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1930901073"
	)
	public String method292() {
		return this.field115; // L: 41
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2076161252"
	)
	static int method296(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "([BB)Lbz;",
		garbageValue = "50"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 76
		Buffer var2 = new Buffer(var0); // L: 77
		var2.offset = var2.array.length - 2; // L: 78
		int var3 = var2.readUnsignedShort(); // L: 79
		int var4 = var2.array.length - 2 - var3 - 12; // L: 80
		var2.offset = var4; // L: 81
		int var5 = var2.readInt(); // L: 82
		var1.localIntCount = var2.readUnsignedShort(); // L: 83
		var1.localStringCount = var2.readUnsignedShort(); // L: 84
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 85
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 86
		int var6 = var2.readUnsignedByte(); // L: 87
		int var7;
		int var8;
		if (var6 > 0) { // L: 88
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 89

			for (var7 = 0; var7 < var6; ++var7) { // L: 90
				var8 = var2.readUnsignedShort(); // L: 91
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? WorldMapDecoration.method4914(var8) : 1); // L: 92
				var1.switches[var7] = var9; // L: 93

				while (var8-- > 0) { // L: 94
					int var10 = var2.readInt(); // L: 95
					int var11 = var2.readInt(); // L: 96
					var9.put(new IntegerNode(var11), (long)var10); // L: 97
				}
			}
		}

		var2.offset = 0; // L: 101
		var1.field952 = var2.readStringCp1252NullTerminatedOrNull(); // L: 102
		var1.opcodes = new int[var5]; // L: 103
		var1.intOperands = new int[var5]; // L: 104
		var1.stringOperands = new String[var5]; // L: 105

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 106 107 112
			var8 = var2.readUnsignedShort(); // L: 108
			if (var8 == 3) { // L: 109
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 110
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 111
			}
		}

		return var1; // L: 114
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILbz;ZI)I",
		garbageValue = "2005202843"
	)
	static int method294(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) { // L: 2716
			if (var0 == 3702) { // L: 2721
				++Nameable.Interpreter_intStackSize; // L: 2722
				return 1; // L: 2723
			} else {
				return 2; // L: 2725
			}
		} else {
			--Nameable.Interpreter_intStackSize; // L: 2717
			--UserComparator8.Interpreter_stringStackSize; // L: 2718
			return 1; // L: 2719
		}
	}
}
