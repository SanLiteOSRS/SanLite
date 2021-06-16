import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
public enum class269 implements Enumerated
{
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	field3535(-1),
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	field3533(0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	field3534(1),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ljo;"
	)
	field3532(2);

	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -2043119815
	)
	final int field3536;

	class269(int var3) {
		this.field3536 = var3;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1154679040"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3536;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1302219293"
	)
	public static int method4992(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "405198099"
	)
	public static int method5000(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ILcf;ZI)I",
		garbageValue = "-246993316"
	)
	static int method4996(int var0, Script var1, boolean var2) {
		if (var0 != 7000 && var0 != 7005 && var0 != 7010 && var0 != 7015 && var0 != 7020 && var0 != 7025 && var0 != 7030 && var0 != 7035) {
			if (var0 != 7001 && var0 != 7002 && var0 != 7011 && var0 != 7012 && var0 != 7021 && var0 != 7022) {
				if (var0 != 7003 && var0 != 7013 && var0 != 7023) {
					if (var0 != 7006 && var0 != 7007 && var0 != 7016 && var0 != 7017 && var0 != 7026 && var0 != 7027) {
						if (var0 != 7008 && var0 != 7018 && var0 != 7028) {
							if (var0 != 7031 && var0 != 7032) {
								if (var0 == 7033) {
									--UserComparator9.Interpreter_stringStackSize;
									return 1;
								} else if (var0 != 7036 && var0 != 7037) {
									if (var0 == 7038) {
										--ChatChannel.Interpreter_intStackSize;
										return 1;
									} else if (var0 != 7004 && var0 != 7009 && var0 != 7014 && var0 != 7019 && var0 != 7024 && var0 != 7029 && var0 != 7034 && var0 != 7039) {
										return 2;
									} else {
										--ChatChannel.Interpreter_intStackSize;
										return 1;
									}
								} else {
									ChatChannel.Interpreter_intStackSize -= 2;
									return 1;
								}
							} else {
								--UserComparator9.Interpreter_stringStackSize;
								--ChatChannel.Interpreter_intStackSize;
								return 1;
							}
						} else {
							--ChatChannel.Interpreter_intStackSize;
							return 1;
						}
					} else {
						ChatChannel.Interpreter_intStackSize -= 2;
						return 1;
					}
				} else {
					ChatChannel.Interpreter_intStackSize -= 2;
					return 1;
				}
			} else {
				ChatChannel.Interpreter_intStackSize -= 3;
				return 1;
			}
		} else {
			ChatChannel.Interpreter_intStackSize -= 5;
			return 1;
		}
	}
}
