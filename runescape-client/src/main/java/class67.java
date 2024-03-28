import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
public class class67 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field488;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field482;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field506;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field484;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field485;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field481;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field487;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field502;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field489;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field490;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field491;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field492;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field486;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field494;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field495;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field496;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field497;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field498;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field499;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field500;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field501;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field505;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field503;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field493;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lcu;"
	)
	static final class67 field483;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("archive13")
	static Archive archive13;

	static {
		field488 = new class67(); // L: 13039
		field482 = new class67(); // L: 13040
		field506 = new class67(); // L: 13041
		field484 = new class67(); // L: 13042
		field485 = new class67(); // L: 13043
		field481 = new class67(); // L: 13044
		field487 = new class67(); // L: 13045
		field502 = new class67(); // L: 13046
		field489 = new class67(); // L: 13047
		field490 = new class67(); // L: 13048
		field491 = new class67(); // L: 13049
		field492 = new class67(); // L: 13050
		field486 = new class67(); // L: 13051
		field494 = new class67(); // L: 13052
		field495 = new class67(); // L: 13053
		field496 = new class67(); // L: 13054
		field497 = new class67(); // L: 13055
		field498 = new class67(); // L: 13056
		field499 = new class67(); // L: 13057
		field500 = new class67(); // L: 13058
		field501 = new class67(); // L: 13059
		field505 = new class67(); // L: 13060
		field503 = new class67(); // L: 13061
		field493 = new class67(); // L: 13062
		field483 = new class67(); // L: 13063
	}

	class67() {
	} // L: 13065

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-7"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = class425.getPacketBufferNode(ClientPacket.field3242, Client.packetWriter.isaacCipher); // L: 10163
		var2.packetBuffer.writeIntME(var0); // L: 10164
		var2.packetBuffer.method9246(var1); // L: 10165
		Client.packetWriter.addNode(var2); // L: 10166
	} // L: 10167

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static final void method1200() {
		PacketBufferNode var0 = class425.getPacketBufferNode(ClientPacket.field3252, Client.packetWriter.isaacCipher); // L: 12527
		Client.packetWriter.addNode(var0); // L: 12528
		Interpreter.field873 = true; // L: 12529

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 12530
			if (var1.type == 0 || var1.type == 3) { // L: 12531
				FloorUnderlayDefinition.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 12533
			WorldMapData_0.invalidateWidget(Client.meslayerContinueWidget); // L: 12534
			Client.meslayerContinueWidget = null; // L: 12535
		}

		Interpreter.field873 = false; // L: 12537
	} // L: 12538
}
