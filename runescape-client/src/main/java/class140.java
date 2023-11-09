import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class140 extends class144 {
	@ObfuscatedName("s")
	String field1627;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1156811659
	)
	int field1628;
	@ObfuscatedName("w")
	byte field1626;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Let;)V"
	)
	class140(class145 var1) {
		this.this$0 = var1;
		this.field1627 = null; // L: 55
	} // L: 59

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "1539485988"
	)
	void vmethod3074(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1627 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1628 = var1.readUnsignedShort(); // L: 67
		this.field1626 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lec;I)V",
		garbageValue = "-1270425284"
	)
	void vmethod3073(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1627); // L: 74
		var2.world = this.field1628; // L: 75
		var2.rank = this.field1626; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-487769404"
	)
	static final boolean method2968(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 235
		Buffer var4 = new Buffer(var0); // L: 236
		int var5 = -1; // L: 237

		label70:
		while (true) {
			int var6 = var4.method7881(); // L: 239
			if (var6 == 0) { // L: 240
				return var3; // L: 271
			}

			var5 += var6; // L: 241
			int var7 = 0; // L: 242
			boolean var8 = false; // L: 243

			while (true) {
				int var9;
				while (!var8) { // L: 245
					var9 = var4.readUShortSmart(); // L: 251
					if (var9 == 0) { // L: 252
						continue label70;
					}

					var7 += var9 - 1; // L: 253
					int var10 = var7 & 63; // L: 254
					int var11 = var7 >> 6 & 63; // L: 255
					int var12 = var4.readUnsignedByte() >> 2; // L: 256
					int var13 = var11 + var1; // L: 257
					int var14 = var10 + var2; // L: 258
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 259
						ObjectComposition var15 = FileSystem.getObjectDefinition(var5); // L: 260
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 261
							if (!var15.needsModelFiles()) { // L: 262
								++Client.field644; // L: 263
								var3 = false; // L: 264
							}

							var8 = true; // L: 266
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 246
				if (var9 == 0) { // L: 247
					break;
				}

				var4.readUnsignedByte(); // L: 248
			}
		}
	}
}
