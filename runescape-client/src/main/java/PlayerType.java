import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3952(6, 22, false, false, true),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3953(7, 41, false, false, true),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3965(8, 42, false, false, true),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3955(9, 43, false, false, true),
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3956(10, 44, false, false, true),
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3946(11, 45, false, false, true),
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3958(12, 46, false, false, true),
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3959(13, 47, false, false, true),
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3960(14, 48, false, false, true),
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	field3961(15, 49, false, false, true);

	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -835440721
	)
	@Export("id")
	final int id;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1081419077
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("p")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("e")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3; // L: 33
		this.modIcon = var4; // L: 34
		this.isPrivileged = var6; // L: 35
		this.isUser = var7; // L: 36
	} // L: 37

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "107"
	)
	public static void method5694(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) { // L: 39
			int var4 = (var3 + var2) / 2; // L: 40
			int var5 = var2; // L: 41
			String var6 = var0[var4]; // L: 42
			var0[var4] = var0[var3]; // L: 43
			var0[var3] = var6; // L: 44
			int var7 = var1[var4]; // L: 45
			var1[var4] = var1[var3]; // L: 46
			var1[var3] = var7; // L: 47

			for (int var8 = var2; var8 < var3; ++var8) { // L: 48
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) { // L: 49
					String var9 = var0[var8]; // L: 50
					var0[var8] = var0[var5]; // L: 51
					var0[var5] = var9; // L: 52
					int var10 = var1[var8]; // L: 53
					var1[var8] = var1[var5]; // L: 54
					var1[var5++] = var10; // L: 55
				}
			}

			var0[var3] = var0[var5]; // L: 59
			var0[var5] = var6; // L: 60
			var1[var3] = var1[var5]; // L: 61
			var1[var5] = var7; // L: 62
			method5694(var0, var1, var2, var5 - 1); // L: 63
			method5694(var0, var1, var5 + 1, var3); // L: 64
		}

	} // L: 66
}
