import java.text.ParseException;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("UserComparator6")
public class UserComparator6 extends AbstractUserComparator {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	static IndexedSprite field1491;
	@ObfuscatedName("au")
	@Export("reversed")
	final boolean reversed;

	public UserComparator6(boolean var1) {
		this.reversed = var1; // L: 10
	} // L: 11

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqb;Lqb;I)I",
		garbageValue = "-110280632"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var1.world != 0 && var2.world != 0) { // L: 14
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername()); // L: 15
		} else {
			return this.compareUser(var1, var2); // L: 17
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2); // L: 21
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1944121723"
	)
	static boolean method2923() {
		Date var0;
		try {
			var0 = SpotAnimationDefinition.method3765(); // L: 1005
		} catch (ParseException var6) { // L: 1007
			WorldMapScaleHandler.method5627("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1008
			return false; // L: 1009
		}

		if (var0 == null) { // L: 1011
			return false; // L: 1012
		} else {
			boolean var4 = ModelData0.method5024(var0); // L: 1014
			Date var3 = class312.method5971(); // L: 1017
			boolean var2 = var0.after(var3); // L: 1018
			if (!var2) { // L: 1021
				PcmPlayer.method838(7); // L: 1023
				class318.setLoginResponseString("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900"); // L: 1024
				return false; // L: 1026
			} else {
				if (!var4) { // L: 1028
					class72.field906 = 8388607; // L: 1029
				} else {
					class72.field906 = (int)(var0.getTime() / 86400000L - 11745L); // L: 1032
				}

				return true; // L: 1034
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Lui;",
		garbageValue = "111"
	)
	static SpritePixels method2922() {
		SpritePixels var0 = new SpritePixels(); // L: 143
		var0.width = class529.SpriteBuffer_spriteWidth; // L: 144
		var0.height = class420.SpriteBuffer_spriteHeight; // L: 145
		var0.xOffset = class529.SpriteBuffer_xOffsets[0]; // L: 146
		var0.yOffset = class152.SpriteBuffer_yOffsets[0]; // L: 147
		var0.subWidth = HealthBarUpdate.SpriteBuffer_spriteWidths[0]; // L: 148
		var0.subHeight = SpriteMask.SpriteBuffer_spriteHeights[0]; // L: 149
		int var1 = var0.subHeight * var0.subWidth; // L: 150
		byte[] var2 = Coord.SpriteBuffer_pixels[0]; // L: 151
		var0.pixels = new int[var1]; // L: 152

		for (int var3 = 0; var3 < var1; ++var3) { // L: 153
			var0.pixels[var3] = class505.SpriteBuffer_spritePalette[var2[var3] & 255];
		}

		class529.SpriteBuffer_xOffsets = null; // L: 155
		class152.SpriteBuffer_yOffsets = null; // L: 156
		HealthBarUpdate.SpriteBuffer_spriteWidths = null; // L: 157
		SpriteMask.SpriteBuffer_spriteHeights = null; // L: 158
		class505.SpriteBuffer_spritePalette = null; // L: 159
		Coord.SpriteBuffer_pixels = null; // L: 160
		return var0; // L: 162
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-11"
	)
	static boolean method2921() {
		return (Client.drawPlayerNames & 4) != 0; // L: 5208
	}
}
