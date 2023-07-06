import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class9 implements class369 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	public static final class9 field33;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	public static final class9 field36;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	static final class9 field32;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	static final class9 field30;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	static final class9 field31;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1146958359
	)
	int field34;
	@ObfuscatedName("ab")
	String field35;
	@ObfuscatedName("ak")
	boolean field37;
	@ObfuscatedName("ae")
	boolean field38;

	static {
		field33 = new class9(0, "POST", true, true); // L: 6
		field36 = new class9(1, "GET", true, false); // L: 7
		field32 = new class9(2, "PUT", false, true); // L: 8
		field30 = new class9(3, "PATCH", false, true); // L: 9
		field31 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field34 = var1; // L: 17
		this.field35 = var2; // L: 18
		this.field37 = var3; // L: 19
		this.field38 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-14"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field34; // L: 37
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-54"
	)
	boolean method70() {
		return this.field37; // L: 24
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "95"
	)
	public String method82() {
		return this.field35; // L: 28
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-29965637"
	)
	boolean method68() {
		return this.field38; // L: 32
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "36"
	)
	static void method66() {
		Login.worldSelectOpen = false; // L: 2049
		Decimator.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 2050
		Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 2051
		class13.logoSprite.drawAt(Login.xPadding + 382 - class13.logoSprite.subWidth / 2, 18); // L: 2052
	} // L: 2053
}
