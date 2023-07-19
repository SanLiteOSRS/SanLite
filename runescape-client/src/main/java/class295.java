import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
public class class295 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	public static final class295 field3214;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	public static final class295 field3206;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	public static final class295 field3207;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	public static final class295 field3208;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	public static final class295 field3210;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	public static final class295 field3217;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	public static final class295 field3211;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	public static final class295 field3212;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	public static final class295 field3218;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	public static final class295 field3213;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	public static final class295 field3215;
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "[Lum;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("st")
	@Export("FriendsChatManager_inFriendsChat")
	static boolean FriendsChatManager_inFriendsChat;

	static {
		field3214 = new class295(4); // L: 5
		field3206 = new class295(14); // L: 6
		field3207 = new class295(5); // L: 7
		field3208 = new class295(4); // L: 8
		field3210 = new class295(11); // L: 9
		field3217 = new class295(14); // L: 10
		field3211 = new class295(2); // L: 11
		field3212 = new class295(5); // L: 12
		field3218 = new class295(7); // L: 13
		field3213 = new class295(6); // L: 14
		field3215 = new class295(16); // L: 15
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "4"
	)
	class295(int var1) {
	} // L: 21

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CLol;I)C",
		garbageValue = "538388130"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 69
			if (var0 >= 192 && var0 <= 198) { // L: 70
				return 'A';
			}

			if (var0 == 199) { // L: 71
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 72
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 73
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 74
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 75
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 76
				return 'U';
			}

			if (var0 == 221) { // L: 77
				return 'Y';
			}

			if (var0 == 223) { // L: 78
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 79
				return 'a';
			}

			if (var0 == 231) { // L: 80
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 81
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) { // L: 82
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 83
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 84
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 85
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 86
				return 'y';
			}
		}

		if (var0 == 338) { // L: 88
			return 'O';
		} else if (var0 == 339) { // L: 89
			return 'o';
		} else if (var0 == 376) { // L: 90
			return 'Y';
		} else {
			return var0; // L: 91
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-29"
	)
	@Export("runIntfCloseListeners")
	static final void runIntfCloseListeners(int var0, int var1) {
		if (GrandExchangeEvent.loadInterface(var0)) { // L: 11902
			UserComparator3.runComponentCloseListeners(class179.Widget_interfaceComponents[var0], var1); // L: 11903
		}
	} // L: 11904
}
