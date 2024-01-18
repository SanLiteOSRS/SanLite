import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class230 {
	@ObfuscatedName("ae")
	@Export("SpriteBuffer_pixels")
	static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("am")
	final int[][] field2448;
	@ObfuscatedName("ap")
	final int[][] field2451;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 593487099
	)
	int field2449;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1095654145
	)
	int field2447;
	@ObfuscatedName("aq")
	final int[] field2450;
	@ObfuscatedName("ar")
	final int[] field2452;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 391128207
	)
	final int field2453;

	class230(int var1, int var2) {
		this.field2448 = new int[var1][var2]; // L: 15
		this.field2451 = new int[var1][var2]; // L: 16
		int var3 = var2 * var1; // L: 17
		int var4 = ItemContainer.method2347(var3 / 4); // L: 18
		this.field2450 = new int[var4]; // L: 19
		this.field2452 = new int[var4]; // L: 20
		this.field2453 = var4 - 1; // L: 21
	} // L: 22

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method4510() {
		for (int var1 = 0; var1 < this.field2448.length; ++var1) { // L: 25
			for (int var2 = 0; var2 < this.field2448[var1].length; ++var2) { // L: 26
				this.field2448[var1][var2] = 0; // L: 27
				this.field2451[var1][var2] = 99999999; // L: 28
			}
		}

	} // L: 31

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "405413434"
	)
	void method4532(int var1, int var2) {
		this.field2449 = var1; // L: 34
		this.field2447 = var2; // L: 35
	} // L: 36

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "203250583"
	)
	int method4513() {
		return this.field2449; // L: 39
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-72"
	)
	int method4534() {
		return this.field2447; // L: 43
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "104"
	)
	int method4535() {
		return this.field2448.length; // L: 47
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1777947748"
	)
	int method4528() {
		return this.field2448[0].length; // L: 51
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)[[I",
		garbageValue = "5"
	)
	int[][] method4517() {
		return this.field2448; // L: 55
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "490790935"
	)
	int[][] method4518() {
		return this.field2451; // L: 59
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "832064942"
	)
	int[] method4516() {
		return this.field2450; // L: 63
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)[I",
		garbageValue = "164"
	)
	int[] method4520() {
		return this.field2452; // L: 67
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2096562467"
	)
	int method4521() {
		return this.field2453; // L: 71
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "2045050251"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3988
			class93.clientPreferences.method2577(!class93.clientPreferences.method2535()); // L: 3989
			if (class93.clientPreferences.method2535()) { // L: 3990
				GrandExchangeEvents.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3991
			} else {
				GrandExchangeEvents.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3994
			}
		}

		if (var0.startsWith("zbuf")) { // L: 3997
			boolean var1 = HealthBar.method2644(var0.substring(5).trim()) == 1; // L: 3998
			VertexNormal.client.method513(var1); // L: 3999
			Rasterizer3D.method5247(var1); // L: 4000
		}

		if (var0.equalsIgnoreCase("z")) { // L: 4002
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 4003
			class93.clientPreferences.method2555();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 4004
			Client.field628 = !Client.field628;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 4005
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 4006
			if (var0.equalsIgnoreCase("errortest")) { // L: 4007
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				GrandExchangeOfferUnitPriceComparator.worldMap.field4990 = !GrandExchangeOfferUnitPriceComparator.worldMap.field4990; // L: 4008
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 4009
				class93.clientPreferences.method2568(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 4010
				class93.clientPreferences.method2568(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 4011
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 4012
				Messages.method2849();
			}
		}

		PacketBufferNode var2 = class482.getPacketBufferNode(ClientPacket.field3243, Client.packetWriter.isaacCipher); // L: 4015
		var2.packetBuffer.writeByte(var0.length() + 1); // L: 4016
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 4017
		Client.packetWriter.addNode(var2); // L: 4018
	} // L: 4019
}
