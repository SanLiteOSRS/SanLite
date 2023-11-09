import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class9 implements class369 {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	public static final class9 field30;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	public static final class9 field28;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	static final class9 field29;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	static final class9 field34;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	static final class9 field31;
	@ObfuscatedName("uy")
	@ObfuscatedGetter(
		intValue = -638132739
	)
	static int field37;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -210915551
	)
	int field27;
	@ObfuscatedName("al")
	String field33;
	@ObfuscatedName("aj")
	boolean field32;
	@ObfuscatedName("ac")
	boolean field35;

	static {
		field30 = new class9(0, "POST", true, true); // L: 6
		field28 = new class9(1, "GET", true, false); // L: 7
		field29 = new class9(2, "PUT", false, true); // L: 8
		field34 = new class9(3, "PATCH", false, true); // L: 9
		field31 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field27 = var1; // L: 17
		this.field33 = var2; // L: 18
		this.field32 = var3; // L: 19
		this.field35 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-42"
	)
	boolean method70() {
		return this.field32; // L: 24
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1108588956"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field27; // L: 37
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-164236716"
	)
	public String method79() {
		return this.field33; // L: 28
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "31"
	)
	boolean method72() {
		return this.field35; // L: 32
	}
}
