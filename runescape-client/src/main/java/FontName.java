import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("aa")
	@Export("name")
	String name;

	static {
		FontName_plain11 = new FontName("p11_full"); // L: 7
		FontName_plain12 = new FontName("p12_full"); // L: 8
		FontName_bold12 = new FontName("b12_full"); // L: 9
		FontName_verdana11 = new FontName("verdana_11pt_regular"); // L: 10
		FontName_verdana13 = new FontName("verdana_13pt_regular"); // L: 11
		FontName_verdana15 = new FontName("verdana_15pt_regular"); // L: 12
	}

	FontName(String var1) {
		this.name = var1; // L: 20
	} // L: 21

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-56"
	)
	static void method8929(int var0) {
		class461.field4763 = var0; // L: 22
		class461.field4764 = new class461[var0]; // L: 23
		IgnoreList.field4663 = 0; // L: 24
	} // L: 25

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)[Lth;",
		garbageValue = "50"
	)
	public static FontName[] method8927() {
		return new FontName[]{FontName_verdana13, FontName_bold12, FontName_verdana15, FontName_plain11, FontName_plain12, FontName_verdana11}; // L: 16
	}
}
