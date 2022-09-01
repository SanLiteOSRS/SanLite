import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final WorldMapID field2849;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	static final WorldMapID field2846;
	@ObfuscatedName("aa")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1483153309
	)
	@Export("value")
	final int value;

	static {
		field2849 = new WorldMapID(0); // L: 4
		field2846 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lbd;I)V",
		garbageValue = "1423196275"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) { // L: 1862
			Client.isMembersWorld = var0.isMembersOnly(); // L: 1863
			boolean var1 = var0.isMembersOnly(); // L: 1864
			if (var1 != InterfaceParent.ItemComposition_inMembersWorld) { // L: 1866
				class120.method2734(); // L: 1867
				InterfaceParent.ItemComposition_inMembersWorld = var1; // L: 1868
			}
		}

		if (var0.properties != Client.worldProperties) { // L: 1872
			Archive var3 = class299.archive8; // L: 1873
			int var2 = var0.properties; // L: 1874
			if ((var2 & 536870912) != 0) { // L: 1876
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var3, "logo_deadman_mode", ""); // L: 1877
			} else if ((var2 & 1073741824) != 0) { // L: 1879
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var3, "logo_seasonal_mode", ""); // L: 1880
			} else {
				MusicPatchPcmStream.logoSprite = class150.SpriteBuffer_getIndexedSpriteByName(var3, "logo", ""); // L: 1883
			}
		}

		class12.worldHost = var0.host; // L: 1887
		Client.worldId = var0.id; // L: 1888
		Client.worldProperties = var0.properties; // L: 1889
		GroundObject.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000; // L: 1890
		FileSystem.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000; // L: 1891
		WorldMapLabelSize.currentPort = GroundObject.worldPort; // L: 1892
	} // L: 1893

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1910466699"
	)
	static final void method4919() {
		PacketBufferNode var0 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2975, Client.packetWriter.isaacCipher); // L: 11748
		Client.packetWriter.addNode(var0); // L: 11749
		Interpreter.field816 = true; // L: 11750

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11751
			if (var1.type == 0 || var1.type == 3) { // L: 11752
				class29.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11754
			class125.invalidateWidget(Client.meslayerContinueWidget); // L: 11755
			Client.meslayerContinueWidget = null; // L: 11756
		}

		Interpreter.field816 = false; // L: 11758
	} // L: 11759
}
