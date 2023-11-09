import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
@Implements("LoginType")
public class LoginType {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("oldscape")
	public static final LoginType oldscape;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4986;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4988;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4994;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4987;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4990;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4991;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	static final LoginType field4992;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	public static final LoginType field4993;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1835057895
	)
	final int field4989;
	@ObfuscatedName("ab")
	final String field4995;

	static {
		oldscape = new LoginType(2, 0, "", ""); // L: 5
		field4986 = new LoginType(1, 1, "", ""); // L: 6
		field4988 = new LoginType(3, 2, "", ""); // L: 7
		field4994 = new LoginType(4, 3, "", ""); // L: 8
		field4987 = new LoginType(0, 4, "", ""); // L: 9
		field4990 = new LoginType(5, 5, "", ""); // L: 10
		field4991 = new LoginType(8, 6, "", ""); // L: 11
		field4992 = new LoginType(7, 7, "", ""); // L: 12
		field4993 = new LoginType(6, -1, "", "", true, new LoginType[]{oldscape, field4986, field4988, field4987, field4994}); // L: 13
	}

	LoginType(int var1, int var2, String var3, String var4) {
		this.field4989 = var1; // L: 18
		this.field4995 = var4; // L: 19
	} // L: 20

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;Ljava/lang/String;Z[Lsl;)V"
	)
	LoginType(int var1, int var2, String var3, String var4, boolean var5, LoginType[] var6) {
		this.field4989 = var1; // L: 23
		this.field4995 = var4; // L: 24
	} // L: 25

	public String toString() {
		return this.field4995; // L: 29
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lnr;III)Luq;",
		garbageValue = "221330493"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2); // L: 88
		boolean var3;
		if (var4 == null) { // L: 89
			var3 = false; // L: 90
		} else {
			GrandExchangeEvent.SpriteBuffer_decode(var4); // L: 93
			var3 = true; // L: 94
		}

		if (!var3) { // L: 96
			return null;
		} else {
			SpritePixels var5 = new SpritePixels(); // L: 99
			var5.width = class527.SpriteBuffer_spriteWidth; // L: 100
			var5.height = class527.SpriteBuffer_spriteHeight; // L: 101
			var5.xOffset = class527.SpriteBuffer_xOffsets[0]; // L: 102
			var5.yOffset = class527.SpriteBuffer_yOffsets[0]; // L: 103
			var5.subWidth = class496.SpriteBuffer_spriteWidths[0]; // L: 104
			var5.subHeight = BuddyRankComparator.SpriteBuffer_spriteHeights[0]; // L: 105
			int var6 = var5.subWidth * var5.subHeight; // L: 106
			byte[] var7 = class464.SpriteBuffer_pixels[0]; // L: 107
			var5.pixels = new int[var6]; // L: 108

			for (int var8 = 0; var8 < var6; ++var8) { // L: 109
				var5.pixels[var8] = class527.SpriteBuffer_spritePalette[var7[var8] & 255];
			}

			PlatformInfo.method8433(); // L: 110
			return var5; // L: 113
		}
	}
}
