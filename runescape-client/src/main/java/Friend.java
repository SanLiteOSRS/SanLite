import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
@Implements("Friend")
public class Friend extends Buddy {
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "[Ltt;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("ay")
	boolean field4596;
	@ObfuscatedName("an")
	boolean field4597;

	Friend() {
	} // L: 9

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)I",
		garbageValue = "0"
	)
	@Export("compareToFriend")
	int compareToFriend(Friend var1) {
		if (super.world == Client.worldId && Client.worldId != var1.world) { // L: 12
			return -1;
		} else if (Client.worldId == var1.world && super.world != Client.worldId) { // L: 13
			return 1;
		} else if (super.world != 0 && var1.world == 0) { // L: 14
			return -1;
		} else if (var1.world != 0 && super.world == 0) { // L: 15
			return 1;
		} else if (this.field4596 && !var1.field4596) { // L: 16
			return -1;
		} else if (!this.field4596 && var1.field4596) { // L: 17
			return 1;
		} else if (this.field4597 && !var1.field4597) { // L: 18
			return -1;
		} else if (!this.field4597 && var1.field4597) { // L: 19
			return 1;
		} else {
			return super.world != 0 ? super.int2 - var1.int2 : var1.int2 - super.int2; // L: 20 21 24
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqd;I)I",
		garbageValue = "-12064581"
	)
	@Export("compareTo_user")
	public int compareTo_user(Nameable var1) {
		return this.compareToFriend((Friend)var1); // L: 29
	}

	public int compareTo(Object var1) {
		return this.compareToFriend((Friend)var1); // L: 33
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1854082060"
	)
	public static void method7788() {
		class304.midiPcmStream.clear(); // L: 63
		class304.musicPlayerStatus = 1; // L: 64
		HealthBar.musicTrackArchive = null; // L: 65
	} // L: 66

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-900876054"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0; // L: 76
		if (var0 < 0 || var0 >= 65536) { // L: 77
			var0 >>>= 16; // L: 78
			var1 += 16; // L: 79
		}

		if (var0 >= 256) { // L: 81
			var0 >>>= 8; // L: 82
			var1 += 8; // L: 83
		}

		if (var0 >= 16) { // L: 85
			var0 >>>= 4; // L: 86
			var1 += 4; // L: 87
		}

		if (var0 >= 4) { // L: 89
			var0 >>>= 2; // L: 90
			var1 += 2; // L: 91
		}

		if (var0 >= 1) { // L: 93
			var0 >>>= 1; // L: 94
			++var1; // L: 95
		}

		return var0 + var1; // L: 97
	}
}
