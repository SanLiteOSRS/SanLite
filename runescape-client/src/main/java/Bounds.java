import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
@Implements("Bounds")
public class Bounds {
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -1843320923
	)
	@Export("lowX")
	public int lowX;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1031650591
	)
	@Export("lowY")
	public int lowY;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1371710773
	)
	@Export("highX")
	public int highX;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = -179878711
	)
	@Export("highY")
	public int highY;

	public Bounds(int var1, int var2, int var3, int var4) {
		this.setLow(var1, var2);
		this.setHigh(var3, var4);
	}

	public Bounds(int var1, int var2) {
		this(0, 0, var1, var2);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "7696"
	)
	@Export("setLow")
	public void setLow(int var1, int var2) {
		this.lowX = var1;
		this.lowY = var2;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "101"
	)
	@Export("setHigh")
	public void setHigh(int var1, int var2) {
		this.highX = var1;
		this.highY = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1805672690"
	)
	public boolean method6341(int var1, int var2) {
		return var1 >= this.lowX && var1 < this.highX + this.lowX && var2 >= this.lowY && var2 < this.highY + this.lowY;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lmo;Lmo;I)V",
		garbageValue = "-1080090251"
	)
	public void method6353(Bounds var1, Bounds var2) {
		this.method6343(var1, var2);
		this.method6344(var1, var2);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lmo;Lmo;I)V",
		garbageValue = "-953724915"
	)
	void method6343(Bounds var1, Bounds var2) {
		var2.lowX = this.lowX;
		var2.highX = this.highX;
		if (this.lowX < var1.lowX) {
			var2.highX -= var1.lowX - this.lowX;
			var2.lowX = var1.lowX;
		}

		if (var2.method6345() > var1.method6345()) {
			var2.highX -= var2.method6345() - var1.method6345();
		}

		if (var2.highX < 0) {
			var2.highX = 0;
		}

	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lmo;Lmo;B)V",
		garbageValue = "107"
	)
	void method6344(Bounds var1, Bounds var2) {
		var2.lowY = this.lowY;
		var2.highY = this.highY;
		if (this.lowY < var1.lowY) {
			var2.highY -= var1.lowY - this.lowY;
			var2.lowY = var1.lowY;
		}

		if (var2.method6369() > var1.method6369()) {
			var2.highY -= var2.method6369() - var1.method6369();
		}

		if (var2.highY < 0) {
			var2.highY = 0;
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-123662248"
	)
	int method6345() {
		return this.lowX + this.highX;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "539098241"
	)
	int method6369() {
		return this.highY + this.lowY;
	}

	public String toString() {
		return null;
	}

	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-113"
	)
	static void method6370() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1277 = null;
		Client.packetWriter.field1284 = null;
		Client.packetWriter.field1285 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1275 = 0;
		Client.rebootTimer = 0;
		KeyHandler.method343();
		Client.minimapState = 0;
		Client.destinationX = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		HealthBarDefinition.localPlayer = null;

		for (var0 = 0; var0 < Client.npcs.length; ++var0) {
			NPC var1 = Client.npcs[var0];
			if (var1 != null) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		GrandExchangeOfferUnitPriceComparator.method5485();
		WorldMapData_1.updateGameState(30);

		for (var0 = 0; var0 < 100; ++var0) {
			Client.field594[var0] = true;
		}

		Frames.method4481();
	}
}
