import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
public class class129 extends class132 {
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 901521841
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1147127109
	)
	int field1480;
	@ObfuscatedName("w")
	byte field1477;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1543465901
	)
	int field1475;
	@ObfuscatedName("a")
	String field1476;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Leh;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Leh;)V"
	)
	class129(class133 var1) {
		this.this$0 = var1;
		this.field1480 = -1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-1393452113"
	)
	void vmethod2839(Buffer var1) {
		var1.readUnsignedByte();
		this.field1480 = var1.readUnsignedShort();
		this.field1477 = var1.readByte();
		this.field1475 = var1.readUnsignedShort();
		var1.readLong();
		this.field1476 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-1714930149"
	)
	void vmethod2838(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1480);
		var2.rank = this.field1477;
		var2.world = this.field1475;
		var2.username = new Username(this.field1476);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Z",
		garbageValue = "-28"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3;
				break;
			}

			label85: {
				char var7 = var0.charAt(var6);
				if (var6 == 0) {
					if (var7 == '-') {
						var2 = true;
						break label85;
					}

					if (var7 == '+') {
						break label85;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') {
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') {
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') {
						var1 = false;
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var9 = -var9;
				}

				int var8 = var4 * 10 + var9;
				if (var4 != var8 / 10) {
					var1 = false;
					break;
				}

				var4 = var8;
				var3 = true;
			}

			++var6;
		}

		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "1332153952"
	)
	static int method2738(int var0, Script var1, boolean var2) {
		if (var0 != 3700 && var0 != 3701) {
			if (var0 == 3702) {
				++class14.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--class14.Interpreter_intStackSize;
			--class295.Interpreter_stringStackSize;
			return 1;
		}
	}
}
