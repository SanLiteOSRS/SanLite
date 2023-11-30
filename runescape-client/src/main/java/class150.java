import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class150 extends class160 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1503644171
	)
	int field1674;
	@ObfuscatedName("ah")
	byte field1675;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1825811703
	)
	int field1672;
	@ObfuscatedName("ao")
	String field1673;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class150(class161 var1) {
		this.this$0 = var1;
		this.field1674 = -1; // L: 103
	} // L: 108

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "1810249387"
	)
	void vmethod3497(Buffer var1) {
		this.field1674 = var1.readUnsignedShort(); // L: 111
		this.field1675 = var1.readByte(); // L: 112
		this.field1672 = var1.readUnsignedShort(); // L: 113
		var1.readLong(); // L: 114
		this.field1673 = var1.readStringCp1252NullTerminated(); // L: 115
	} // L: 116

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgn;B)V",
		garbageValue = "-75"
	)
	void vmethod3501(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1674); // L: 119
		var2.rank = this.field1675; // L: 120
		var2.world = this.field1672; // L: 121
		var2.username = new Username(this.field1673); // L: 122
	} // L: 123

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1818675777"
	)
	static void method3281() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 329
			Login.currentLoginField = 1; // L: 330
		} else {
			Login.currentLoginField = 0; // L: 333
		}

	} // L: 335

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "2073691331"
	)
	@Export("hashString")
	public static int hashString(CharSequence var0) {
		int var1 = var0.length(); // L: 133
		int var2 = 0; // L: 134

		for (int var3 = 0; var3 < var1; ++var3) { // L: 135
			var2 = (var2 << 5) - var2 + class137.charToByteCp1252(var0.charAt(var3));
		}

		return var2; // L: 136
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIII)Z",
		garbageValue = "-851651370"
	)
	static final boolean method3283(byte[] var0, int var1, int var2) {
		boolean var3 = true; // L: 214
		Buffer var4 = new Buffer(var0); // L: 215
		int var5 = -1; // L: 216

		label68:
		while (true) {
			int var6 = var4.method9278(); // L: 218
			if (var6 == 0) { // L: 219
				return var3; // L: 250
			}

			var5 += var6; // L: 220
			int var7 = 0; // L: 221
			boolean var8 = false; // L: 222

			while (true) {
				int var9;
				while (!var8) { // L: 224
					var9 = var4.readUShortSmart(); // L: 230
					if (var9 == 0) { // L: 231
						continue label68;
					}

					var7 += var9 - 1; // L: 232
					int var10 = var7 & 63; // L: 233
					int var11 = var7 >> 6 & 63; // L: 234
					int var12 = var4.readUnsignedByte() >> 2; // L: 235
					int var13 = var11 + var1; // L: 236
					int var14 = var10 + var2; // L: 237
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) { // L: 238
						ObjectComposition var15 = WorldMapSection2.getObjectDefinition(var5); // L: 239
						if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) { // L: 240
							if (!var15.needsModelFiles()) { // L: 241
								++Client.field521; // L: 242
								var3 = false; // L: 243
							}

							var8 = true; // L: 245
						}
					}
				}

				var9 = var4.readUShortSmart(); // L: 225
				if (var9 == 0) { // L: 226
					break;
				}

				var4.readUnsignedByte(); // L: 227
			}
		}
	}
}
