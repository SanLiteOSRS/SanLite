import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("aw")
public class class20 {
	@ObfuscatedName("jr")
	@ObfuscatedGetter(
		intValue = -954261147
	)
	@Export("baseX")
	static int baseX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -508327987
	)
	final int field108;
	@ObfuscatedName("al")
	final Map field104;
	@ObfuscatedName("ak")
	final String field106;

	class20(String var1) {
		this.field108 = 400; // L: 35
		this.field104 = null; // L: 36
		this.field106 = ""; // L: 37
	} // L: 38

	class20(HttpURLConnection var1) throws IOException {
		this.field108 = var1.getResponseCode(); // L: 17
		var1.getResponseMessage(); // L: 18
		this.field104 = var1.getHeaderFields(); // L: 19
		StringBuilder var2 = new StringBuilder(); // L: 20
		InputStream var3 = this.field108 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 21
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3); // L: 23
			BufferedReader var5 = new BufferedReader(var4); // L: 24

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 26
				var2.append(var6); // L: 27
			}

			var3.close(); // L: 29
		}

		this.field106 = var2.toString(); // L: 31
	} // L: 32

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1672578717"
	)
	public int method287() {
		return this.field108; // L: 41
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "-85"
	)
	public Map method288() {
		return this.field104; // L: 45
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-21006210"
	)
	public String method289() {
		return this.field106; // L: 49
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "775264196"
	)
	public static int method296(int var0) {
		return var0 + -512; // L: 22
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1265533406"
	)
	public static void method297() {
		ParamComposition.ParamComposition_cached.clear(); // L: 60
	} // L: 61

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Date;",
		garbageValue = "572472849"
	)
	static Date method295() throws ParseException {
		SimpleDateFormat var0 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH); // L: 1234
		var0.setLenient(false); // L: 1235
		StringBuilder var1 = new StringBuilder(); // L: 1236
		String[] var2 = Login.field947; // L: 1238

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 1239
			String var4 = var2[var3]; // L: 1240
			if (var4 == null) { // L: 1242
				class19.method285("Date not valid.", "Please ensure all characters are populated.", ""); // L: 1243
				return null; // L: 1244
			}

			var1.append(var4); // L: 1246
		}

		var1.append("12"); // L: 1250
		return var0.parse(var1.toString()); // L: 1251
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-690055453"
	)
	public static void method293() {
		NPCComposition.NpcDefinition_cached.clear(); // L: 326
		NPCComposition.HitSplatDefinition_cachedFonts.clear(); // L: 327
	} // L: 328

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "1223727295"
	)
	static int method299(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) { // L: 1604
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) { // L: 1621
				var7 = var2 ? class416.scriptDotWidget : class306.field3131; // L: 1622
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 1623
				if (var4 >= 1 && var4 <= 10) { // L: 1624
					class104 var8 = new class104(var4, var7.id, var7.childIndex, var7.itemId); // L: 1627
					Interpreter.field886.add(var8); // L: 1628
					return 1; // L: 1629
				} else {
					throw new RuntimeException(); // L: 1625
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) { // L: 1631
				Interpreter.Interpreter_intStackSize -= 3; // L: 1632
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 1633
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 1634
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 1635
				if (var5 >= 1 && var5 <= 10) { // L: 1636
					class104 var6 = new class104(var5, var3, var4, class33.field184.method6240(var3).itemId); // L: 1639
					Interpreter.field886.add(var6); // L: 1640
					return 1; // L: 1641
				} else {
					throw new RuntimeException(); // L: 1637
				}
			} else {
				return 2; // L: 1643
			}
		} else if (Interpreter.field878 >= 10) { // L: 1605
			throw new RuntimeException(); // L: 1606
		} else {
			if (var0 >= 2000) { // L: 1609
				var7 = class33.field184.method6240(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 1610
			} else {
				var7 = var2 ? class416.scriptDotWidget : class306.field3131; // L: 1612
			}

			if (var7.onResize == null) { // L: 1613
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent(); // L: 1614
				var9.widget = var7; // L: 1615
				var9.args = var7.onResize; // L: 1616
				var9.field1078 = Interpreter.field878 + 1; // L: 1617
				Client.scriptEvents.addFirst(var9); // L: 1618
				return 1; // L: 1619
			}
		}
	}
}
