import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("vy")
	@ObfuscatedGetter(
		intValue = -1640184123
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("a")
	long[] field1834;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 255214751
	)
	int field1836;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 796729565
	)
	int field1831;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 7511515696013261305L
	)
	long field1832;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 1840697763
	)
	int field1833;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -492984425
	)
	int field1830;

	public MilliClock() {
		this.field1834 = new long[10]; // L: 7
		this.field1836 = 256; // L: 15
		this.field1831 = 1; // L: 16
		this.field1833 = 0; // L: 17
		this.field1832 = UserComparator8.method2748(); // L: 18

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field1834[var1] = this.field1832; // L: 20
		}

	} // L: 22

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1222008534"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) { // L: 25
			this.field1834[var1] = 0L; // L: 26
		}

	} // L: 28

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1655799397"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field1836; // L: 31
		int var4 = this.field1831; // L: 32
		this.field1836 = 300; // L: 33
		this.field1831 = 1; // L: 34
		this.field1832 = UserComparator8.method2748(); // L: 35
		if (this.field1834[this.field1830] == 0L) { // L: 36
			this.field1836 = var3; // L: 37
			this.field1831 = var4; // L: 38
		} else if (this.field1832 > this.field1834[this.field1830]) { // L: 40
			this.field1836 = (int)((long)(var1 * 2560) / (this.field1832 - this.field1834[this.field1830]));
		}

		if (this.field1836 < 25) { // L: 41
			this.field1836 = 25;
		}

		if (this.field1836 > 256) { // L: 42
			this.field1836 = 256; // L: 43
			this.field1831 = (int)((long)var1 - (this.field1832 - this.field1834[this.field1830]) / 10L); // L: 44
		}

		if (this.field1831 > var1) { // L: 46
			this.field1831 = var1;
		}

		this.field1834[this.field1830] = this.field1832; // L: 47
		this.field1830 = (this.field1830 + 1) % 10; // L: 48
		int var5;
		if (this.field1831 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (this.field1834[var5] != 0L) { // L: 51
					this.field1834[var5] += (long)this.field1831;
				}
			}
		}

		if (this.field1831 < var2) { // L: 54
			this.field1831 = var2;
		}

		class197.method3946((long)this.field1831); // L: 55

		for (var5 = 0; this.field1833 < 256; this.field1833 += this.field1836) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field1833 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("lt")
	@ObfuscatedSignature(
		descriptor = "(Lkn;B)Z",
		garbageValue = "-125"
	)
	static final boolean method3373(Widget var0) {
		int var1 = var0.contentType; // L: 12334
		if (var1 == 205) { // L: 12335
			Client.logoutTimer = 250; // L: 12336
			return true; // L: 12337
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12339
				var2 = (var1 - 300) / 2; // L: 12340
				var3 = var1 & 1; // L: 12341
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12342
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12344
				var2 = (var1 - 314) / 2; // L: 12345
				var3 = var1 & 1; // L: 12346
				Client.playerAppearance.method5745(var2, var3 == 1); // L: 12347
			}

			if (var1 == 324) { // L: 12349
				Client.playerAppearance.method5732(0);
			}

			if (var1 == 325) { // L: 12350
				Client.playerAppearance.method5732(1);
			}

			if (var1 == 326) { // L: 12351
				PacketBufferNode var4 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3022, Client.packetWriter.isaacCipher); // L: 12353
				Client.playerAppearance.write(var4.packetBuffer); // L: 12354
				Client.packetWriter.addNode(var4); // L: 12355
				return true; // L: 12356
			} else {
				return false; // L: 12358
			}
		}
	}
}
