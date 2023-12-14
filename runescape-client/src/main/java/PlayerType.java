import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oc")
@Implements("PlayerType")
public enum PlayerType implements class383 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4247(6, 22, false, false, true),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4243(7, 41, false, false, true),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4249(8, 42, false, false, true),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4248(9, 43, false, false, true),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4250(10, 44, false, false, true),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4256(11, 45, false, false, true),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4253(12, 46, false, false, true),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4254(13, 47, false, false, true),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4255(14, 48, false, false, true),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4241(15, 49, false, false, true),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	field4257(16, 52, false, false, true);

	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -142166065
	)
	@Export("id")
	final int id;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 587948549
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("ai")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("aw")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 34
		this.modIcon = var4; // L: 35
		this.isPrivileged = var6;
		this.isUser = var7;
	} // L: 38

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)D",
		garbageValue = "-2021333271"
	)
	static double method6883(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D; // L: 29
		if (var3 > 0.0D && var3 < 1.0D) { // L: 30
			double var5;
			double var7;
			switch(var2) { // L: 33
			case 0:
				return var3; // L: 51
			case 1:
				return 1.0D - Math.cos(3.141592653589793D * var3 / 2.0D); // L: 44
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D); // L: 111
			case 3:
				return -(Math.cos(3.141592653589793D * var3) - 1.0D) / 2.0D; // L: 85
			case 4:
				return var3 * var3; // L: 87
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3); // L: 77
			case 6:
				return var3 < 0.5D ? 2.0D * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 2.0D) / 2.0D; // L: 83
			case 7:
				return var3 * var3 * var3; // L: 81
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D); // L: 59
			case 9:
				return var3 < 0.5D ? var3 * 4.0D * var3 * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 3.0D) / 2.0D; // L: 103
			case 10:
				return var3 * var3 * var3 * var3; // L: 101
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D); // L: 105
			case 12:
				return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 : 1.0D - Math.pow(2.0D + -2.0D * var3, 4.0D) / 2.0D; // L: 63
			case 13:
				return var3 * var3 * var3 * var3 * var3; // L: 107
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D); // L: 109
			case 15:
				return var3 < 0.5D ? var3 * var3 * var3 * 8.0D * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 5.0D) / 2.0D; // L: 99
			case 16:
				return Math.pow(2.0D, 10.0D * var3 - 10.0D); // L: 61
			case 17:
				return 1.0D - Math.pow(2.0D, -10.0D * var3); // L: 79
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, 10.0D + var3 * 20.0D) / 2.0D : (2.0D - Math.pow(2.0D, var3 * -20.0D + 10.0D)) / 2.0D; // L: 89
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D)); // L: 40
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D)); // L: 91
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var3 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(-2.0D * var3 + 2.0D, 2.0D)) + 1.0D) / 2.0D; // L: 42
			case 22:
				var5 = 1.70158D; // L: 94
				var7 = 2.70158D; // L: 95
				return var3 * var3 * 2.70158D * var3 - 1.70158D * var3 * var3; // L: 96
			case 23:
				var5 = 1.70158D; // L: 66
				var7 = 2.70158D; // L: 67
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D); // L: 68
			case 24:
				var5 = 1.70158D; // L: 72
				var7 = 2.5949095D; // L: 73
				return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (7.189819D * var3 - 2.5949095D) / 2.0D : (Math.pow(var3 * 2.0D - 2.0D, 2.0D) * (3.5949095D * (2.0D * var3 - 2.0D) + 2.5949095D) + 2.0D) / 2.0D; // L: 74
			case 25:
				var5 = 2.0943951023931953D; // L: 47
				return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin(2.0943951023931953D * (10.0D * var3 - 10.75D)); // L: 48
			case 26:
				var5 = 2.0943951023931953D; // L: 36
				return Math.pow(2.0D, -10.0D * var3) * Math.sin((var3 * 10.0D - 0.75D) * 2.0943951023931953D) + 1.0D; // L: 37
			case 27:
				var5 = 1.3962634015954636D; // L: 54
				var7 = Math.sin((20.0D * var3 - 11.125D) * 1.3962634015954636D); // L: 55
				return var3 < 0.5D ? -(Math.pow(2.0D, var3 * 20.0D - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + -20.0D * var3) * var7 / 2.0D + 1.0D; // L: 56
			default:
				return var3; // L: 113
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D; // L: 31
		}
	}
}
