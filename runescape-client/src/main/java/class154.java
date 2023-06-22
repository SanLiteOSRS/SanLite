import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class154 extends class158 {
	@ObfuscatedName("at")
	String field1713;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1350197681
	)
	int field1712;
	@ObfuscatedName("av")
	byte field1714;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgh;"
	)
	final class159 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgh;)V"
	)
	class154(class159 var1) {
		this.this$0 = var1;
		this.field1713 = null; // L: 55
	} // L: 59

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltz;I)V",
		garbageValue = "-986564571"
	)
	void vmethod3370(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1713 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1712 = var1.readUnsignedShort(); // L: 67
		this.field1714 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgv;I)V",
		garbageValue = "1284013379"
	)
	void vmethod3371(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1713); // L: 74
		var2.world = this.field1712; // L: 75
		var2.rank = this.field1714; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IS)Lhv;",
		garbageValue = "11573"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0); // L: 37
			var1 = new KitDefinition(); // L: 38
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0); // L: 40
			return var1; // L: 41
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ltz;[IS)[Ljava/lang/Object;",
		garbageValue = "180"
	)
	static Object[] method3274(Buffer var0, int[] var1) {
		int var2 = var0.readUShortSmart(); // L: 30
		Object[] var3 = new Object[var1.length * var2]; // L: 31

		for (int var4 = 0; var4 < var2; ++var4) { // L: 32
			for (int var5 = 0; var5 < var1.length; ++var5) { // L: 33
				int var6 = var1.length * var4 + var5; // L: 34
				class490 var7 = WorldMapRectangle.method5458(var1[var5]); // L: 35
				var3[var6] = var7.method8758(var0); // L: 36
			}
		}

		return var3; // L: 39
	}
}
