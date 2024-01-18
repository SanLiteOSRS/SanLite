import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
public class class72 {
	@ObfuscatedName("aq")
	static final BigInteger field879;
	@ObfuscatedName("ar")
	static final BigInteger field880;

	static {
		field879 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049"); // L: 20
		field880 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1390552915"
	)
	static void method2149(int var0) {
		ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 72
		if (var1 != null) {
			var1.remove(); // L: 74
		}
	} // L: 73 75

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BB)Lpv;",
		garbageValue = "-99"
	)
	public static Font method2147(byte[] var0) {
		if (var0 == null) { // L: 174
			return null;
		} else {
			Font var1 = new Font(var0, class545.SpriteBuffer_xOffsets, class388.SpriteBuffer_yOffsets, FriendsList.SpriteBuffer_spriteWidths, GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights, class113.SpriteBuffer_spritePalette, class230.SpriteBuffer_pixels); // L: 175
			class545.SpriteBuffer_xOffsets = null; // L: 177
			class388.SpriteBuffer_yOffsets = null; // L: 178
			FriendsList.SpriteBuffer_spriteWidths = null; // L: 179
			GrandExchangeOfferOwnWorldComparator.SpriteBuffer_spriteHeights = null; // L: 180
			class113.SpriteBuffer_spritePalette = null; // L: 181
			class230.SpriteBuffer_pixels = null; // L: 182
			return var1; // L: 184
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(I)Lsa;",
		garbageValue = "-293345618"
	)
	static PlatformInfo method2142() {
		return FriendSystem.field823; // L: 751
	}

	@ObfuscatedName("pp")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "4"
	)
	public static boolean method2148() {
		return Client.clickedWidget != null; // L: 12762
	}
}
