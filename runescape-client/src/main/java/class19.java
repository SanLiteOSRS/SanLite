import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public class class19 {
	@ObfuscatedName("rl")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("friendsChatManager")
	static FriendsChatManager friendsChatManager;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("titleboxSprite")
	static IndexedSprite titleboxSprite;
	@ObfuscatedName("y")
	@Export("cacheSubPaths")
	static String[] cacheSubPaths;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 585170537
	)
	static int field100;
	@ObfuscatedName("s")
	Future field99;
	@ObfuscatedName("h")
	String field98;

	class19(Future var1) {
		this.field99 = var1; // L: 10
	} // L: 11

	class19(String var1) {
		this.method266(var1); // L: 14
	} // L: 15

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "985457165"
	)
	void method266(String var1) {
		if (var1 == null) { // L: 18
			var1 = "";
		}

		this.field98 = var1;
		if (this.field99 != null) {
			this.field99.cancel(true);
			this.field99 = null; // L: 22
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2044467520"
	)
	public final String method283() {
		return this.field98;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "9139"
	)
	public boolean method268() {
		return this.field98 != null || this.field99 == null; // L: 31
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "5038"
	)
	public final boolean method269() {
		return this.method268() ? true : this.field99.isDone(); // L: 35 36
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Lx;",
		garbageValue = "-865068999"
	)
	public final class21 method270() {
		if (this.method268()) { // L: 40
			return new class21(this.field98);
		} else if (!this.method269()) {
			return null; // L: 41
		} else {
			try {
				return (class21)this.field99.get(); // L: 43
			} catch (Exception var3) { // L: 45
				String var2 = "Error retrieving REST request reply"; // L: 46
				System.err.println(var2 + "\r\n" + var3); // L: 47
				this.method266(var2);
				return new class21(var2);
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1943707241"
	)
	static void method284() {
		Tiles.Tiles_minPlane = 99; // L: 48
		Tiles.Tiles_underlays = new byte[4][104][104]; // L: 49
		Tiles.Tiles_overlays = new byte[4][104][104]; // L: 50
		AbstractUserComparator.Tiles_shapes = new byte[4][104][104]; // L: 51
		GrandExchangeOfferOwnWorldComparator.field473 = new byte[4][104][104]; // L: 52
		class17.field92 = new int[4][105][105]; // L: 53
		Tiles.field975 = new byte[4][105][105]; // L: 54
		class135.field1587 = new int[105][105]; // L: 55
		class121.Tiles_hue = new int[104]; // L: 56
		Login.Tiles_saturation = new int[104]; // L: 57
		GrandExchangeEvents.Tiles_lightness = new int[104]; // L: 58
		PcmPlayer.Tiles_hueMultiplier = new int[104]; // L: 59
		FaceNormal.field2453 = new int[104]; // L: 60
	} // L: 61

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpk;",
		garbageValue = "-36"
	)
	public static class433 method285(int var0) {
		int var1 = class431.field4649[var0]; // L: 19
		if (var1 == 1) { // L: 20
			return class433.field4659; // L: 21
		} else if (var1 == 2) { // L: 23
			return class433.field4655; // L: 24
		} else {
			return var1 == 3 ? class433.field4653 : null; // L: 26 27 29
		}
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1333042229"
	)
	static final boolean method265(int var0) {
		if (var0 < 0) { // L: 8381
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0]; // L: 8382
			if (var1 >= 2000) { // L: 8383
				var1 -= 2000;
			}

			return var1 == 1007; // L: 8384
		}
	}
}
