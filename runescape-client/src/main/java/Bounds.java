import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1825313335
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1685027045
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -2074045623
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 377886279
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2); // L: 14
		this.setHigh(var3, var4); // L: 15
	} // L: 16

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2); // L: 10
	} // L: 11

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "14"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1; // L: 19
		this.lowY = var2; // L: 20
	} // L: 21

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "15"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1; // L: 24
		this.highY = var2; // L: 25
	} // L: 26

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-32"
	)
	public boolean method8120(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.lowY + this.highY; // L: 29
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lrb;Lrb;I)V",
		garbageValue = "1929087402"
	)
	public void method8121(Bounds var1, Bounds var2) {
		this.method8122(var1, var2); // L: 37
		this.method8123(var1, var2); // L: 38
	} // L: 39

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lrb;Lrb;I)V",
		garbageValue = "-270985515"
	)
	void method8122(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX; // L: 42
		var2.highX = this.highX; // L: 43
		if (this.lowX < var1.lowX) { // L: 44
			var2.highX -= var1.lowX - this.lowX; // L: 45
			var2.lowX = var1.lowX; // L: 46
		}

		if (var2.method8124() > var1.method8124()) { // L: 48
			var2.highX -= var2.method8124() - var1.method8124(); // L: 49
		}

		if (var2.highX < 0) { // L: 51
			var2.highX = 0;
		}

	} // L: 52

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lrb;Lrb;B)V",
		garbageValue = "32"
	)
	void method8123(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY; // L: 55
		var2.highY = this.highY; // L: 56
		if (this.lowY < var1.lowY) { // L: 57
			var2.highY -= var1.lowY - this.lowY; // L: 58
			var2.lowY = var1.lowY; // L: 59
		}

		if (var2.method8149() > var1.method8149()) { // L: 61
			var2.highY -= var2.method8149() - var1.method8149(); // L: 62
		}

		if (var2.highY < 0) { // L: 64
			var2.highY = 0;
		}

	} // L: 65

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "109"
	)
	int method8124() {
		return this.highX + this.lowX; // L: 68
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1442366153"
	)
	int method8149() {
		return this.lowY + this.highY; // L: 72
	}

	public String toString() {
		return null; // L: 33
	}

	@ObfuscatedName("nz")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)Z",
		garbageValue = "703583258"
	)
	static final boolean method8135(Widget var0) {
		int var1 = var0.contentType; // L: 12432
		if (var1 == 205) { // L: 12433
			Client.logoutTimer = 250; // L: 12434
			return true; // L: 12435
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) { // L: 12437
				var2 = (var1 - 300) / 2; // L: 12438
				var3 = var1 & 1; // L: 12439
				Client.playerAppearance.changeAppearance(var2, var3 == 1); // L: 12440
			}

			if (var1 >= 314 && var1 <= 323) { // L: 12442
				var2 = (var1 - 314) / 2; // L: 12443
				var3 = var1 & 1; // L: 12444
				Client.playerAppearance.method6065(var2, var3 == 1); // L: 12445
			}

			if (var1 == 324) {
				Client.playerAppearance.method6084(0); // L: 12447
			}

			if (var1 == 325) { // L: 12448
				Client.playerAppearance.method6084(1);
			}

			if (var1 == 326) { // L: 12449
				PacketBufferNode var4 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3168, Client.packetWriter.isaacCipher); // L: 12451
				Client.playerAppearance.write(var4.packetBuffer); // L: 12452
				Client.packetWriter.addNode(var4); // L: 12453
				return true; // L: 12454
			} else {
				return false; // L: 12456
			}
		}
	}
}
