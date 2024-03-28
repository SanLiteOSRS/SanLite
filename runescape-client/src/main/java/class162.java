import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class162 extends class144 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2112148803
	)
	int field1790;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1316051959
	)
	int field1787;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class162(class147 var1) {
		this.this$0 = var1; // L: 271
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1790 = var1.readInt(); // L: 274
		this.field1787 = var1.readInt(); // L: 275
	} // L: 276

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3268(this.field1790, this.field1787); // L: 279
	} // L: 280

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lhe;",
		garbageValue = "1186478165"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = class17.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumComposition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}
}
