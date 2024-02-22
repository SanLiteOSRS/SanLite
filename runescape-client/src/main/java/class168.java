import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
public class class168 extends class161 {
	@ObfuscatedName("jo")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	static SpritePixels[] field1826;
	@ObfuscatedName("aq")
	String field1825;
	@ObfuscatedName("aw")
	byte field1821;
	@ObfuscatedName("al")
	byte field1820;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	class168(class162 var1) {
		this.this$0 = var1; // L: 157
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1174207862"
	)
	void vmethod3504(Buffer var1) {
		this.field1825 = var1.readStringCp1252NullTerminatedOrNull(); // L: 160
		if (this.field1825 != null) { // L: 161
			var1.readUnsignedByte(); // L: 162
			this.field1821 = var1.readByte(); // L: 163
			this.field1820 = var1.readByte(); // L: 164
		}

	} // L: 166

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "378355771"
	)
	void vmethod3509(ClanChannel var1) {
		var1.name = this.field1825; // L: 169
		if (this.field1825 != null) { // L: 170
			var1.field1806 = this.field1821; // L: 171
			var1.field1801 = this.field1820; // L: 172
		}

	} // L: 174

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "835485151"
	)
	public static void method3505() {
		class524.DBTableType_cache.clear(); // L: 67
	} // L: 68
}
