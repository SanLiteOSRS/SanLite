import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
public class class122 {
	@ObfuscatedName("af")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -289941817
	)
	int field1455;
	@ObfuscatedName("al")
	float field1446;
	@ObfuscatedName("ac")
	float field1447;
	@ObfuscatedName("ab")
	float field1448;
	@ObfuscatedName("an")
	float field1449;
	@ObfuscatedName("ao")
	float field1450;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Leq;"
	)
	class122 field1451;

	class122() {
		this.field1447 = Float.MAX_VALUE; // L: 8
		this.field1448 = Float.MAX_VALUE; // L: 9
		this.field1449 = Float.MAX_VALUE; // L: 10
		this.field1450 = Float.MAX_VALUE; // L: 11
	} // L: 14

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsy;IB)V",
		garbageValue = "-50"
	)
	void method2892(Buffer var1, int var2) {
		this.field1455 = var1.readShort(); // L: 17
		this.field1446 = var1.method8626(); // L: 18
		this.field1447 = var1.method8626(); // L: 19
		this.field1448 = var1.method8626(); // L: 20
		this.field1449 = var1.method8626(); // L: 21
		this.field1450 = var1.method8626(); // L: 22
	} // L: 23

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)J",
		garbageValue = "-1933982227"
	)
	static long method2891(int var0, int var1, int var2) {
		return (long)(var2 << 16 | var0 << 8 | var1); // L: 38
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldd;",
		garbageValue = "-225905691"
	)
	static class87[] method2896() {
		return new class87[]{class87.field1070, class87.field1069, class87.field1072, class87.field1076, class87.field1071}; // L: 16
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "63"
	)
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) { // L: 1007
			var1 /= 2;
		}

		if (var2 > 192) { // L: 1008
			var1 /= 2;
		}

		if (var2 > 217) { // L: 1009
			var1 /= 2;
		}

		if (var2 > 243) { // L: 1010
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2; // L: 1011
		return var3; // L: 1012
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "-28795"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3785
			WorldMapSectionType.clientPreferences.method2432(!WorldMapSectionType.clientPreferences.method2458()); // L: 3786
			if (WorldMapSectionType.clientPreferences.method2458()) { // L: 3787
				MusicPatchNode.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3788
			} else {
				MusicPatchNode.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3791
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3794
			WorldMapSectionType.clientPreferences.method2433();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3795
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText; // L: 3796
		}

		if (Client.staffModLevel >= 2) { // L: 3797
			if (var0.equalsIgnoreCase("errortest")) { // L: 3798
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3799
				WorldMapData_1.worldMap.showCoord = !WorldMapData_1.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3800
				WorldMapSectionType.clientPreferences.method2523(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3801
				WorldMapSectionType.clientPreferences.method2523(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3802
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) {
				PendingSpawn.method2350(); // L: 3803
			}
		}

		PacketBufferNode var1 = UserComparator9.getPacketBufferNode(ClientPacket.field3097, Client.packetWriter.isaacCipher); // L: 3806
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3807
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3808
		Client.packetWriter.addNode(var1); // L: 3809
	} // L: 3810
}
