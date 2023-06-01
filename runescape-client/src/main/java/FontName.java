import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
@Implements("FontName")
public class FontName {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	@Export("FontName_plain11")
	public static final FontName FontName_plain11;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	@Export("FontName_plain12")
	public static final FontName FontName_plain12;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	@Export("FontName_bold12")
	public static final FontName FontName_bold12;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	@Export("FontName_verdana11")
	public static final FontName FontName_verdana11;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	@Export("FontName_verdana13")
	public static final FontName FontName_verdana13;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lss;"
	)
	@Export("FontName_verdana15")
	public static final FontName FontName_verdana15;
	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	static GameBuild field4894;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "[Lty;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("al")
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
		this.name = var1; // L: 16
	} // L: 17

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "907255937"
	)
	static final int method8641(int var0, int var1) {
		if (var0 == -1) { // L: 962
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 963
			if (var1 < 2) { // L: 964
				var1 = 2;
			} else if (var1 > 126) { // L: 965
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 966
		}
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "6"
	)
	static final void method8639(boolean var0) {
		if (var0) { // L: 3140
			Client.field521 = Login.field909 ? class139.field1599 : class139.field1610; // L: 3141
		} else {
			Client.field521 = WorldMapManager.clientPreferences.method2488(Login.Login_username) ? class139.field1600 : class139.field1601; // L: 3144
		}

	} // L: 3146

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "94899185"
	)
	static final int method8640() {
		return Client.menuOptionsCount - 1; // L: 9930
	}
}
