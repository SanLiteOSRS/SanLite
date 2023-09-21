import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sq")
public class class478 implements class476 {
	@ObfuscatedName("ac")
	final Map field4822;

	public class478(Map var1) {
		this.field4822 = var1; // L: 11
	} // L: 12

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Lst;",
		garbageValue = "1"
	)
	public class475 vmethod8518() {
		return null; // L: 16
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "17"
	)
	public byte[] vmethod8509() throws UnsupportedEncodingException {
		return this.method8510().getBytes("UTF-8"); // L: 21
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1386536231"
	)
	public String method8510() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder(); // L: 25
		Iterator var2 = this.field4822.entrySet().iterator(); // L: 26

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next(); // L: 27
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8"); // L: 29
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8"); // L: 30
			var1.append(var4).append("=").append(var5).append("&"); // L: 31
		}

		if (var1.length() == 0) { // L: 34
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1); // L: 35
			var1.insert(0, "?"); // L: 36
			return var1.toString(); // L: 37
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1087819617"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1; // L: 121
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2037077846"
	)
	static void method8514(int var0, int var1, int var2, int var3) {
		Widget var4 = class33.field184.method6241(var0, var1); // L: 10149
		if (var4 != null && var4.onTargetEnter != null) { // L: 10150
			ScriptEvent var5 = new ScriptEvent(); // L: 10151
			var5.widget = var4; // L: 10152
			var5.args = var4.onTargetEnter; // L: 10153
			Interpreter.runScriptEvent(var5); // L: 10154
		}

		Client.field686 = var3; // L: 10156
		Client.isSpellSelected = true; // L: 10157
		JagexCache.field1841 = var0; // L: 10158
		Client.field585 = var1; // L: 10159
		class31.field173 = var2; // L: 10160
		ClanChannelMember.invalidateWidget(var4); // L: 10161
	} // L: 10162
}
