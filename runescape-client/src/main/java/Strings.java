import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("cl")
	public static String field3728;
	@ObfuscatedName("ec")
	public static String field3725;
	@ObfuscatedName("ku")
	public static String field3913;
	@ObfuscatedName("kv")
	public static String field3887;
	@ObfuscatedName("kg")
	public static String field3863;

	static {
		field3728 = "Please visit the support page for assistance."; // L: 99
		field3725 = "Please visit the support page for assistance."; // L: 136
		field3913 = ""; // L: 299
		field3887 = "Page has opened in a new window."; // L: 300
		field3863 = "(Please check your popup blocker.)"; // L: 301
	} // L: 342

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "436171263"
	)
	public static int method5775(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) { // L: 72
			boolean var3 = false; // L: 73
			boolean var4 = false; // L: 74
			int var5 = 0; // L: 75
			int var6 = var0.length(); // L: 76

			for (int var7 = 0; var7 < var6; ++var7) { // L: 77
				char var8 = var0.charAt(var7); // L: 78
				if (var7 == 0) { // L: 79
					if (var8 == '-') { // L: 80
						var3 = true; // L: 81
						continue;
					}

					if (var8 == '+') { // L: 84
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0'; // L: 86
				} else if (var8 >= 'A' && var8 <= 'Z') { // L: 87
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') { // L: 88
						throw new NumberFormatException(); // L: 89
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) { // L: 90
					throw new NumberFormatException();
				}

				if (var3) { // L: 91
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10; // L: 92
				if (var9 / var1 != var5) { // L: 93
					throw new NumberFormatException();
				}

				var5 = var9; // L: 94
				var4 = true; // L: 95
			}

			if (!var4) { // L: 97
				throw new NumberFormatException();
			} else {
				return var5; // L: 98
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(Lcz;III)V",
		garbageValue = "-1228075316"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) { // L: 4428
			int var3 = class14.SequenceDefinition_get(var1).field2175; // L: 4429
			if (var3 == 1) { // L: 4430
				var0.sequenceFrame = 0; // L: 4431
				var0.sequenceFrameCycle = 0; // L: 4432
				var0.sequenceDelay = var2; // L: 4433
				var0.field1174 = 0; // L: 4434
			}

			if (var3 == 2) { // L: 4436
				var0.field1174 = 0; // L: 4437
			}
		} else if (var1 == -1 || var0.sequence == -1 || class14.SequenceDefinition_get(var1).field2168 >= class14.SequenceDefinition_get(var0.sequence).field2168) { // L: 4440
			var0.sequence = var1; // L: 4441
			var0.sequenceFrame = 0; // L: 4442
			var0.sequenceFrameCycle = 0; // L: 4443
			var0.sequenceDelay = var2; // L: 4444
			var0.field1174 = 0; // L: 4445
			var0.field1203 = var0.pathLength; // L: 4446
		}

	} // L: 4448
}
