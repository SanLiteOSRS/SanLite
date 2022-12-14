import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
public abstract class class152 extends Node {
	class152() {
	} // L: 49

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lqy;I)V",
		garbageValue = "468341515"
	)
	abstract void vmethod3336(Buffer var1);

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1227548281"
	)
	abstract void vmethod3337(ClanChannel var1);

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1882870143"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3632
			StructComposition.clientPreferences.method2486(!StructComposition.clientPreferences.method2412()); // L: 3633
			if (StructComposition.clientPreferences.method2412()) { // L: 3634
				KitDefinition.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3635
			} else {
				KitDefinition.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3638
			}
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3641
			StructComposition.clientPreferences.method2433();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3642
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) {
			Client.showMouseOverText = !Client.showMouseOverText; // L: 3643
		}

		if (Client.staffModLevel >= 2) { // L: 3644
			if (var0.equalsIgnoreCase("errortest")) { // L: 3645
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) { // L: 3646
				KitDefinition.worldMap.showCoord = !KitDefinition.worldMap.showCoord;
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3647
				StructComposition.clientPreferences.method2470(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3648
				StructComposition.clientPreferences.method2470(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3649
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3650
				FaceNormal.method4619();
			}
		}

		PacketBufferNode var1 = class136.getPacketBufferNode(ClientPacket.field3084, Client.packetWriter.isaacCipher); // L: 3653
		var1.packetBuffer.writeByte(var0.length() + 1); // L: 3654
		var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 3655
		Client.packetWriter.addNode(var1); // L: 3656
	} // L: 3657
}
