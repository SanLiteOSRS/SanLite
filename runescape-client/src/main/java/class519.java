import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
public class class519 implements class371 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	public static final class519 field5165;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	public static final class519 field5164;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	static final class519 field5170;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	static final class519 field5166;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	static final class519 field5163;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	static final class519 field5169;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1493160685
	)
	final int field5167;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1294522359
	)
	final int field5168;

	static {
		field5165 = new class519(1, 0); // L: 8
		field5164 = new class519(5, 2); // L: 9
		field5170 = new class519(2, 5); // L: 10
		field5166 = new class519(0, 6); // L: 11
		field5163 = new class519(4, 7); // L: 12
		field5169 = new class519(3, 8); // L: 13
	}

	class519(int var1, int var2) {
		this.field5167 = var1; // L: 18
		this.field5168 = var2; // L: 19
	} // L: 20

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-664760154"
	)
	public boolean method9339() {
		return this == field5164; // L: 28
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5168; // L: 24
	}
}
