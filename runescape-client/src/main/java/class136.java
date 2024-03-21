import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("fq")
public class class136 implements class126 {
	@ObfuscatedName("am")
	static String[] field1621;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	public static void method3140() {
		FileSystem.FileSystem_cacheFiles.clear(); // L: 46
	} // L: 47

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfj;",
		garbageValue = "-1038412911"
	)
	static class134[] method3142() {
		return new class134[]{class134.field1595, class134.field1607, class134.field1596, class134.field1613, class134.field1598, class134.field1599, class134.field1600, class134.field1601, class134.field1602, class134.field1603, class134.field1608, class134.field1605, class134.field1606, class134.field1594, class134.field1609, class134.field1604, class134.field1610}; // L: 64
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "578085812"
	)
	static float[] method3139(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4]; // L: 221

		try {
			JSONArray var3 = var0.getJSONArray(var1); // L: 223
			var2[0] = (float)var3.optDouble(0, 0.0D); // L: 224
			var2[1] = (float)var3.optDouble(1, 0.0D); // L: 225
			var2[2] = (float)var3.optDouble(2, 1.0D); // L: 226
			var2[3] = (float)var3.optDouble(3, 1.0D); // L: 227
		} catch (JSONException var4) { // L: 229
			var2[0] = 0.0F; // L: 230
			var2[1] = 0.0F; // L: 231
			var2[2] = 1.0F; // L: 232
			var2[3] = 1.0F; // L: 233
		}

		return var2; // L: 235
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-611768600"
	)
	static int method3143(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class141.field1644; // L: 1564
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) { // L: 1565
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId; // L: 1566
			return 1; // L: 1567
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) { // L: 1569
			if (var3.itemId != -1) { // L: 1570
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 1571
			}

			return 1; // L: 1572
		} else if (var0 == ScriptOpcodes.CC_GETID) { // L: 1574
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex; // L: 1575
			return 1; // L: 1576
		} else if (var0 == 1707) { // L: 1578
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6895() ? 1 : 0; // L: 1579
			return 1; // L: 1580
		} else if (var0 == 1708) { // L: 1582
			return class19.method258(var3); // L: 1583
		} else {
			return var0 == 1709 ? class371.method7024(var3) : 2; // L: 1585 1586 1588
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "0"
	)
	static void method3141(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) { // L: 3829
			int var5 = (Integer)var0.get(0); // L: 3832
			if (var5 == -1 && !Client.playingJingle) { // L: 3833
				class169.method3521(0, 0); // L: 3834
			} else if (var5 != -1 && !WorldMapManager.method4894(var5) && class30.clientPreferences.method2544() != 0) { // L: 3836
				ArrayList var6 = new ArrayList(); // L: 3837

				for (int var7 = 0; var7 < var0.size(); ++var7) { // L: 3838
					var6.add(new class333(Renderable.field2921, (Integer)var0.get(var7), 0, class30.clientPreferences.method2544(), false)); // L: 3839
				}

				if (Client.playingJingle) { // L: 3841
					class133.method3120(var6, var1, var2, var3, var4); // L: 3842
				} else {
					PacketWriter.method2891(var6, var1, var2, var3, var4, false); // L: 3845
				}
			}

		}
	} // L: 3830 3848
}
