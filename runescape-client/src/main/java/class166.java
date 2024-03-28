import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gk")
public class class166 extends class144 {
	@ObfuscatedName("fl")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("vo")
	@ObfuscatedSignature(
		descriptor = "Lta;"
	)
	static PlatformInfo field1810;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 6939006021290103671L
	)
	long field1811;
	@ObfuscatedName("ah")
	String field1817;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class166(class147 var1) {
		this.this$0 = var1;
		this.field1811 = -1L; // L: 194
		this.field1817 = null; // L: 195
	} // L: 197

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1811 = var1.readLong(); // L: 202
		}

		this.field1817 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3297(this.field1811, this.field1817); // L: 208
	} // L: 209
}
