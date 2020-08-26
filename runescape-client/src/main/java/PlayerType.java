import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ix")
@Implements("PlayerType")
public enum PlayerType implements Enumerated {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "Lix;"
	)
	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "Lix;"
	)
	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "Lix;"
	)
	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		signature = "Lix;"
	)
	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		signature = "Lix;"
	)
	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "Lix;"
	)
	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Lix;"
	)
	field3131(6, 22, false, false, true);

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lls;"
	)
	static IndexedSprite field3134;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1823451795
	)
	@Export("id")
	final int id;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1522972387
	)
	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("m")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("n")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(I)I",
		garbageValue = "385513888"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
