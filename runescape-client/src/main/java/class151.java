import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class151 extends class144 {
	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("o")
	String field1694;
	@ObfuscatedName("q")
	byte field1692;
	@ObfuscatedName("f")
	byte field1693;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	class151(class145 var1) {
		this.this$0 = var1; // L: 155
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "-1897546377"
	)
	void vmethod3146(Buffer var1) {
		this.field1694 = var1.readStringCp1252NullTerminatedOrNull(); // L: 158
		if (this.field1694 != null) { // L: 159
			var1.readUnsignedByte(); // L: 160
			this.field1692 = var1.readByte(); // L: 161
			this.field1693 = var1.readByte(); // L: 162
		}

	} // L: 164

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ley;I)V",
		garbageValue = "-406744366"
	)
	void vmethod3145(ClanChannel var1) {
		var1.name = this.field1694; // L: 167
		if (this.field1694 != null) { // L: 168
			var1.field1676 = this.field1692; // L: 169
			var1.field1672 = this.field1693; // L: 170
		}

	} // L: 172

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Llu;II)V",
		garbageValue = "1903177073"
	)
	static void method3144(Archive var0, int var1) {
		if (var0.field3994) { // L: 62
			if (var1 <= NetCache.field4048) { // L: 63
				throw new RuntimeException(""); // L: 64
			}

			if (var1 < NetCache.field4046) { // L: 66
				NetCache.field4046 = var1; // L: 67
			}
		} else {
			if (var1 >= NetCache.field4046) { // L: 71
				throw new RuntimeException(""); // L: 72
			}

			if (var1 > NetCache.field4048) { // L: 74
				NetCache.field4048 = var1; // L: 75
			}
		}

		if (Skills.field3568 != null) { // L: 78
			class9.method81(var0, var1); // L: 79
		} else {
			class181.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 82
			NetCache.NetCache_archives[var1] = var0; // L: 83
		}
	} // L: 80 84
}
