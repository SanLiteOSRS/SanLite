import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public class class21 {
	@ObfuscatedName("r")
	@Export("BZip2Decompressor_block")
	static int[] BZip2Decompressor_block;
	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "Llj;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("ew")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -981203113
	)
	final int field118;
	@ObfuscatedName("q")
	final String field119;

	class21(String var1) {
		this.field118 = 400; // L: 32
		this.field119 = ""; // L: 33
	} // L: 34

	class21(HttpURLConnection var1) throws IOException {
		this.field118 = var1.getResponseCode(); // L: 14
		var1.getResponseMessage(); // L: 15
		var1.getHeaderFields(); // L: 16
		StringBuilder var2 = new StringBuilder(); // L: 17
		InputStream var3 = this.field118 >= 300 ? var1.getErrorStream() : var1.getInputStream(); // L: 18
		if (var3 != null) { // L: 19
			InputStreamReader var4 = new InputStreamReader(var3); // L: 20
			BufferedReader var5 = new BufferedReader(var4); // L: 21

			String var6;
			while ((var6 = var5.readLine()) != null) { // L: 23
				var2.append(var6); // L: 24
			}

			var3.close(); // L: 26
		}

		this.field119 = var2.toString(); // L: 28
	} // L: 29

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1834327023"
	)
	public int method298() {
		return this.field118; // L: 37
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-539009770"
	)
	public String method299() {
		return this.field119;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1347791250"
	)
	public static int method302(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765); // L: 39
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459); // L: 40
		var0 = var0 + (var0 >>> 4) & 252645135; // L: 41
		var0 += var0 >>> 8; // L: 42
		var0 += var0 >>> 16; // L: 43
		return var0 & 255; // L: 44
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "238"
	)
	static final boolean method303() {
		return Client.isMenuOpen; // L: 8364
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "575130411"
	)
	@Export("selectSpell")
	static void selectSpell(int var0, int var1, int var2, int var3) {
		Widget var4 = class293.getWidgetChild(var0, var1); // L: 9426
		if (var4 != null && var4.onTargetEnter != null) { // L: 9427
			ScriptEvent var5 = new ScriptEvent(); // L: 9428
			var5.widget = var4; // L: 9429
			var5.args = var4.onTargetEnter; // L: 9430
			class17.runScriptEvent(var5); // L: 9431
		}

		Client.selectedSpellItemId = var3; // L: 9433
		Client.isSpellSelected = true; // L: 9434
		class113.selectedSpellWidget = var0; // L: 9435
		Client.selectedSpellChildIndex = var1; // L: 9436
		Coord.selectedSpellFlags = var2; // L: 9437
		class220.invalidateWidget(var4); // L: 9438
	} // L: 9439
}
