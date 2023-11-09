import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class146 extends class136 {
	@ObfuscatedName("ti")
	@ObfuscatedGetter(
		intValue = 574691456
	)
	static int field1718;
	@ObfuscatedName("fm")
	static String field1717;
	@ObfuscatedName("hh")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("fontBold12")
	static Font fontBold12;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1438657739
	)
	int field1712;
	@ObfuscatedName("e")
	String field1719;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class139 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class146(class139 var1) {
		this.this$0 = var1; // L: 323
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "1101327225"
	)
	void vmethod3349(Buffer var1) {
		this.field1712 = var1.readInt(); // L: 326
		this.field1719 = var1.readStringCp1252NullTerminated(); // L: 327
	} // L: 328

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lep;I)V",
		garbageValue = "839088249"
	)
	void vmethod3350(ClanSettings var1) {
		var1.method3182(this.field1712, this.field1719); // L: 331
	} // L: 332

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Lqs;",
		garbageValue = "1183914569"
	)
	public static class459 method3163(int var0) {
		class459 var1 = (class459)class459.DBTableType_cache.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = class459.field4882.takeFile(39, var0); // L: 25
			var1 = new class459(); // L: 26
			if (var2 != null) { // L: 27
				var1.method8431(new Buffer(var2));
			}

			var1.method8433(); // L: 28
			class459.DBTableType_cache.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}
}
