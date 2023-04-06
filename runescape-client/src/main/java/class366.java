import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
public class class366 {
	@ObfuscatedName("aj")
	static char[] field4340;
	@ObfuscatedName("al")
	static char[] field4336;
	@ObfuscatedName("ac")
	static char[] field4337;
	@ObfuscatedName("ab")
	static int[] field4339;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfi;"
	)
	static ClanSettings field4338;

	static {
		field4340 = new char[64]; // L: 7

		int var0;
		for (var0 = 0; var0 < 26; ++var0) { // L: 8
			field4340[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 9
			field4340[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 10
			field4340[var0] = (char)(var0 + 48 - 52);
		}

		field4340[62] = '+'; // L: 11
		field4340[63] = '/'; // L: 12
		field4336 = new char[64]; // L: 18

		for (var0 = 0; var0 < 26; ++var0) { // L: 19
			field4336[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 20
			field4336[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 21
			field4336[var0] = (char)(var0 + 48 - 52);
		}

		field4336[62] = '*'; // L: 22
		field4336[63] = '-'; // L: 23
		field4337 = new char[64]; // L: 29

		for (var0 = 0; var0 < 26; ++var0) { // L: 30
			field4337[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) { // L: 31
			field4337[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) { // L: 32
			field4337[var0] = (char)(var0 + 48 - 52);
		}

		field4337[62] = '-'; // L: 33
		field4337[63] = '_'; // L: 34
		field4339 = new int[128]; // L: 40

		for (var0 = 0; var0 < field4339.length; ++var0) { // L: 41
			field4339[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) { // L: 42
			field4339[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) { // L: 43
			field4339[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) { // L: 44
			field4339[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4339; // L: 45
		field4339[43] = 62; // L: 46
		var2[42] = 62; // L: 47
		int[] var1 = field4339; // L: 48
		field4339[47] = 63; // L: 49
		var1[45] = 63; // L: 50
	} // L: 51

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "681579235"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4420) { // L: 98
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0; // L: 99
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4421) { // L: 102
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0; // L: 103
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4422) { // L: 106
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0; // L: 107
		} else if (var0.length == 30000 && ByteArrayPool.field4417 < ByteArrayPool.field4413) { // L: 110
			ByteArrayPool.field4427[++ByteArrayPool.field4417 - 1] = var0; // L: 111
		} else {
			if (InterfaceParent.ByteArrayPool_arrays != null) { // L: 114
				for (int var1 = 0; var1 < class212.ByteArrayPool_alternativeSizes.length; ++var1) { // L: 115
					if (var0.length == class212.ByteArrayPool_alternativeSizes[var1] && SoundSystem.ByteArrayPool_altSizeArrayCounts[var1] < InterfaceParent.ByteArrayPool_arrays[var1].length) { // L: 116
						InterfaceParent.ByteArrayPool_arrays[var1][SoundSystem.ByteArrayPool_altSizeArrayCounts[var1]++] = var0; // L: 117
						return; // L: 118
					}
				}
			}

		}
	} // L: 100 104 108 112 122
}
