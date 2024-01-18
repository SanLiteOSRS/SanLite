import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oa")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -109920589
	)
	static int field4410;

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Loo;Loo;I)I",
		garbageValue = "-124811812"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1); // L: 13
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 17
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lve;",
		garbageValue = "-1454674102"
	)
	public static PrivateChatMode method7184(int var0) {
		PrivateChatMode[] var1 = class231.method4553(); // L: 20

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 21
			PrivateChatMode var3 = var1[var2]; // L: 22
			if (var0 == var3.field5317) {
				return var3; // L: 24
			}
		}

		return null; // L: 28
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IZI)Ljava/lang/String;",
		garbageValue = "-1024907484"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) { // L: 107
			int var3 = var0; // L: 109
			String var2;
			if (var1 && var0 >= 0) { // L: 112
				int var4 = 2; // L: 116

				for (int var5 = var0 / 10; var5 != 0; ++var4) { // L: 117 118 120
					var5 /= 10; // L: 119
				}

				char[] var6 = new char[var4]; // L: 122
				var6[0] = '+'; // L: 123

				for (int var7 = var4 - 1; var7 > 0; --var7) { // L: 124
					int var8 = var3; // L: 125
					var3 /= 10; // L: 126
					int var9 = var8 - var3 * 10; // L: 127
					if (var9 >= 10) { // L: 128
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48); // L: 129
					}
				}

				var2 = new String(var6); // L: 131
			} else {
				var2 = Integer.toString(var0, 10); // L: 113
			}

			return var2; // L: 133
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-314366402"
	)
	static int method7193(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) { // L: 4393
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ClanChannelMember.getWindowedMode(); // L: 4394
			return 1; // L: 4395
		} else {
			int var3;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) { // L: 4397
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4398
				if (var3 == 1 || var3 == 2) { // L: 4399
					ClanSettings.setWindowedMode(var3);
				}

				return 1; // L: 4400
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) { // L: 4402
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class93.clientPreferences.method2552(); // L: 4403
				return 1; // L: 4404
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) { // L: 4406
				if (var0 == 5310) { // L: 4413
					--UserComparator6.Interpreter_intStackSize; // L: 4414
					return 1; // L: 4415
				} else {
					return 2; // L: 4417
				}
			} else {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]; // L: 4407
				if (var3 == 1 || var3 == 2) { // L: 4408
					class93.clientPreferences.method2556(var3); // L: 4409
				}

				return 1; // L: 4411
			}
		}
	}
}
