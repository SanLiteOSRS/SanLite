import java.applet.Applet;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	static Bounds field2867;
	@ObfuscatedName("sk")
	@ObfuscatedSignature(
		descriptor = "Ltz;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -403062005
	)
	final int field2863;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -790751471
	)
	final int field2864;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1602390277
	)
	final int field2865;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2863 = var1; // L: 15
		this.field2864 = var2; // L: 16
		this.field2865 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "1753026200"
	)
	boolean method5040(float var1) {
		return var1 >= (float)this.field2865; // L: 21
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/applet/Applet;Ljava/lang/String;B)V",
		garbageValue = "-85"
	)
	public static void method5041(Applet var0, String var1) {
		class31.field150 = var0; // L: 22
		if (var1 != null) { // L: 23
			class31.field148 = var1;
		}

	} // L: 24

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)[B",
		garbageValue = "-1711417810"
	)
	public static byte[] method5044(CharSequence var0) {
		int var1 = var0.length(); // L: 79
		byte[] var2 = new byte[var1]; // L: 80

		for (int var3 = 0; var3 < var1; ++var3) { // L: 81
			char var4 = var0.charAt(var3); // L: 82
			if ((var4 <= 0 || var4 >= 128) && (var4 < 160 || var4 > 255)) { // L: 83
				if (var4 == 8364) { // L: 84
					var2[var3] = -128;
				} else if (var4 == 8218) { // L: 85
					var2[var3] = -126;
				} else if (var4 == 402) { // L: 86
					var2[var3] = -125;
				} else if (var4 == 8222) { // L: 87
					var2[var3] = -124;
				} else if (var4 == 8230) { // L: 88
					var2[var3] = -123;
				} else if (var4 == 8224) { // L: 89
					var2[var3] = -122;
				} else if (var4 == 8225) { // L: 90
					var2[var3] = -121;
				} else if (var4 == 710) { // L: 91
					var2[var3] = -120;
				} else if (var4 == 8240) { // L: 92
					var2[var3] = -119;
				} else if (var4 == 352) {
					var2[var3] = -118; // L: 93
				} else if (var4 == 8249) { // L: 94
					var2[var3] = -117;
				} else if (var4 == 338) { // L: 95
					var2[var3] = -116;
				} else if (var4 == 381) { // L: 96
					var2[var3] = -114;
				} else if (var4 == 8216) { // L: 97
					var2[var3] = -111;
				} else if (var4 == 8217) {
					var2[var3] = -110;
				} else if (var4 == 8220) {
					var2[var3] = -109;
				} else if (var4 == 8221) {
					var2[var3] = -108;
				} else if (var4 == 8226) {
					var2[var3] = -107;
				} else if (var4 == 8211) {
					var2[var3] = -106;
				} else if (var4 == 8212) {
					var2[var3] = -105;
				} else if (var4 == 732) { // L: 104
					var2[var3] = -104;
				} else if (var4 == 8482) { // L: 105
					var2[var3] = -103;
				} else if (var4 == 353) { // L: 106
					var2[var3] = -102;
				} else if (var4 == 8250) { // L: 107
					var2[var3] = -101;
				} else if (var4 == 339) { // L: 108
					var2[var3] = -100;
				} else if (var4 == 382) { // L: 109
					var2[var3] = -98;
				} else if (var4 == 376) { // L: 110
					var2[var3] = -97;
				} else {
					var2[var3] = 63; // L: 111
				}
			} else {
				var2[var3] = (byte)var4;
			}
		}

		return var2; // L: 113
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1779938975"
	)
	public static final void method5043(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0; // L: 98
		ViewportMouse.ViewportMouse_y = var1; // L: 99
		ViewportMouse.ViewportMouse_isInViewport = true; // L: 100
		ViewportMouse.ViewportMouse_entityCount = 0; // L: 101
		ViewportMouse.ViewportMouse_false0 = false; // L: 102
	} // L: 103
}
